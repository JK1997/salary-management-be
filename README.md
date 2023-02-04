<a name="readme-top"></a>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage and Demonstration</a></li>
    <li><a href="#improvements">Improvements</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->

## About The Project

[![Salary Management App - BE][product-screenshot]](http://localhost:8080/h2-console)

## Salary Management App - BE

This project was generated with [Spring Boot](https://start.spring.io/) version 2.7.7 with Java 17.

_You may refer to this [document](src/assets/GDS%20SWE%20Challenge.pdf) for further information about the requirements
on
how to develop this project._


<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

The following is the major frameworks / libraries used to bootstrap this project.

* [![Spring Boot][Spring-boot-img]][spring-boot-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->

## Getting Started

Please follow the instructions below on setting up this project locally.

### Prerequisites

Please ensure that you run both FE and BE applications concurrently.

[https://github.com/Ong-Jun-Kai/salary-management-fe](https://github.com/Ong-Jun-Kai/salary-management-fe)

[https://github.com/Ong-Jun-Kai/salary-management-be](https://github.com/Ong-Jun-Kai/salary-management-be)

### Installation

Please installing and setting up your app with the following steps:

1. Clone the repo
   ```sh
   git clone https://github.com/Ong-Jun-Kai/salary-management-be

   ```

2. Run the application using an IDE. Navigate to [http://localhost:8080/h2-console](http://localhost:8080/h2-console).


3. Login credentials of H2 console is:

[![Salary Management App - BE][h2-login]](http://localhost:8080/h2-console)

* JDBC URL: jdbc:h2:~/data/test
* Username: sa
* Password: password

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->

## Usage / Demonstration

### H2 DB Console

This section describes how to use the main features of this app:

![SQL Statement][sql-statement-img]

* You may execute the query in h2 console

==========================================================================================

### JWT API: _http://localhost:8080/authenticate_

![JWT API][api-jwt-img]

* In order to visualize the API through Postman, you need to send a post request to authenticate for a JWT token.
* Headers key and value:

  1. Origin: http://localhost:4200
  2. Content-Type: application/json

==========================================================================================

### GET All Employees API: http://localhost:8080/jpa/users/employees?minSalary=1&maxSalary=99999&pageNumber=&pageSize=&sort=asc&sortActive=id

![GET All Employees API][get-all-employees-api-img]

* You can get a list of employees returned using this API
* Headers key and value:

  1. Origin: http://localhost:4200
  2. Authorization: Bearer + [COPY THE JWT TOKEN TO HERE]
  
==========================================================================================

### File Upload API: _http://localhost:8080/jpa/users/upload_

![File Upload API][file-upload-api-img]

* You can either do the file upload using Postman or via the UI button.
* If you are using Postman, please select the form-data with file type in order to upload a csv file 
* Headers key and value:

    1. Origin: http://localhost:4200
    2. Authorization: Bearer + [COPY THE JWT TOKEN TO HERE]

==========================================================================================


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- IMPROVEMENTS -->

## Improvements

There are several User Stories that I did not accomplish such as User Story 4 & 5.

I would like to enhance this project in the future such as following:

1. Implement more unit testing using jUnit
2. Salary range validation
3. Organise the files in better structure
4. Better error handling for REST

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->

## Contact

If you have a better suggestion or further comments on this project, please do not hesitate to contact me in person or
via the channels below.
Don't forget to give the project a star! Thanks again!

Jun Kai - [@my_LinkedIn](https://www.linkedin.com/in/jun-kai-ong-1b222518b) - ongjunkai@ecquaria.com

Project Link: [https://github.com/Ong-Jun-Kai/salary-management-be](https://github.com/Ong-Jun-Kai/salary-management-be)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->

## Acknowledgments

List of resources that I find helpful and would like to give credit to.

* [Question regarding Spring Boot](https://www.baeldung.com/)
* [Angular University](https://blog.angular-university.io/angular-file-upload/)
* [Udemy tutorial](https://ecquaria.udemy.com/course/full-stack-application-development-with-spring-boot-and-angular/learn/lecture/12537586#overview)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge

[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors

[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge

[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members

[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge

[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers

[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge

[issues-url]: https://github.com/othneildrew/Best-README-Template/issues

[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge

[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555

[linkedin-url]: https://linkedin.com/in/othneildrew

[product-screenshot]: src/main/resources/images/h2Console.png

[h2-login]: src/main/resources/images/h2Login.png

[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white

[Next-url]: https://nextjs.org/

[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB

[React-url]: https://reactjs.org/

[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D

[Vue-url]: https://vuejs.org/

[Spring-boot-img]: src/main/resources/images/spring-boot.png

[spring-boot-url]: https://spring.io/projects/spring-boot

[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white

[Angular-url]: https://angular.io/

[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00

[Svelte-url]: https://svelte.dev/

[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white

[Laravel-url]: https://laravel.com

[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white

[Bootstrap-url]: https://getbootstrap.com

[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white

[JQuery-url]: https://jquery.com

[sql-statement-img]: src/main/resources/images/sqlStatement.png

[api-jwt-img]: src/main/resources/images/api-JWT.png

[get-all-employees-api-img]: src/main/resources/images/get-all-employees-api.png

[file-upload-api-img]: src/main/resources/images/fileUpload-api.png
