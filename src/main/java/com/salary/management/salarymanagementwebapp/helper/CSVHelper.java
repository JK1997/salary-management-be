package com.salary.management.salarymanagementwebapp.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.salary.management.salarymanagementwebapp.employee.Employee;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

public class CSVHelper {
    public static String TYPE = "text/csv";

    public static boolean hasCSVFormat(MultipartFile file) {

        if (!TYPE.equals(file.getContentType())) {
            return false;
        }

        return true;
    }

    public static List<Employee> csvToEmployees(InputStream is) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
             CSVParser csvParser = new CSVParser(fileReader,
                     CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

            List<Employee> employees = new ArrayList<Employee>();

            Iterable<CSVRecord> csvRecords = csvParser.getRecords();


            for (CSVRecord csvRecord : csvRecords) {

                if(checkIfCommentExist(csvRecord)) continue;
                if(checkIsEmpty(csvRecord)) continue;
                checkSalaryValue(csvRecord);

                Employee employee = new Employee(
                        csvRecord.get("Id"),
                        csvRecord.get("Login"),
                        csvRecord.get("Name"),
                        new BigDecimal(csvRecord.get("salary"))
                );
                employees.add(employee);
            }
            return employees;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }

    //TODO new validation functions
    public static void checkSalaryValue(CSVRecord csvRecord){
        try{
            double salary = Double.parseDouble(csvRecord.get(3));
            if (salary < 0.0){
                throw new IllegalArgumentException("salary is less than 0.0");
            }
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("The salary format is invalid.");
        }
    }

    public static boolean checkIfCommentExist(CSVRecord csvRecord){
        String id = csvRecord.get(0);
        String login = csvRecord.get(1);
        String name = csvRecord.get(2);

        if (id.startsWith("#") || login.startsWith("#") || name.startsWith("#")){
            return true;
        }
        return false;
    }

    public static boolean checkIsEmpty(CSVRecord csvRecord){
        String id = csvRecord.get(0);
        String login = csvRecord.get(1);
        String name = csvRecord.get(2);

        if (id.isEmpty() || login.isEmpty() || name.isEmpty()){
            return true;
        }
        return false;
    }
}
