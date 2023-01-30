package com.salary.management.salarymanagementwebapp.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
    static String[] HEADERs = { "Id", "Username", "Login", "TargetDate", "isDone" };

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

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            for (CSVRecord csvRecord : csvRecords) {
                Employee employee = new Employee(
                        csvRecord.get("Id"),
                        csvRecord.get("Username"),
                        csvRecord.get("Login"),
                        dateFormat.parse(csvRecord.get("TargetDate")),
                        Boolean.parseBoolean(csvRecord.get("isDone"))
                );

                employees.add(employee);
            }

            return employees;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException("fail to parse date format: " + e.getMessage());
        }
    }

    //TODO new validation functions
}
