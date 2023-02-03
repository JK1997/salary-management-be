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

[![Product Name Screen Shot][product-screenshot]](http://localhost:4200/)

## Salary Management App - FE

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 15.1.1.

_You may refer to this [document](src/assets/GDS%20SWE%20Challenge.pdf) for further information about the requirements
on
how to develop this project._


<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

This section should list any major frameworks/libraries used to bootstrap your project. Leave any add-ons/plugins for
the acknowledgements section. Here are a few examples.

* [![Spring Boot][Spring-boot-img]][spring-boot-url]
* [![Angular][Angular.io]][Angular-url]
* [![Bootstrap][Bootstrap.com]][Bootstrap-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->

## Getting Started

Please follow the instructions below on setting up this project locally.

### Prerequisites

This is an example of how to list things you need to use the software and how to install them.

* npm
  ```sh
  npm install -g @angular/cli
  ```
* Install Angular MUI
  ```sh
  ng add @angular/material
  ```

### Installation

Please installing and setting up your app.

1. Clone the repo
   ```sh
   git clone https://github.com/Ong-Jun-Kai/salary-management-fe

   ```
2. Use cmd and cd to the project path. Run `ng serve`. Navigate to `http://localhost:4200/`. The application will
   automatically reload if you
   change any of the source files.


3. Login credentials

  * Username: JunKai
  * Password: dummy

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->

## Usage

Following is the demonstration on how to use the app:

![Upload File][upload-file-img]

* You can start using the app by uploading a csv file with the employee and salary records.

_Please use attached [csv file](src/assets/employee.csv) for your convenience._

==========================================================================================

![Filter Salary][filter-salary-img]

* You can filter the table by inserting salary range which accept in number format only

==========================================================================================

![Sorting][sorting-img]

* You can click the table header's arrow to sort the records in ascending or descending order

==========================================================================================

![Update and Delete][update-delete-img]

* You are able to update and delete the records. A confirmation message will prompt out if you click the delete button.

==========================================================================================

![Pagination][pagination-img]

* You can sort the items per page to be displayed using the pagination below the table

==========================================================================================

![Add record][add-img]

* You may add a record by clicking the ADD button which will route to a record inserting page

==========================================================================================

![Save record][save-records-img]

* Updating a record - there will be existing record bind to the input field
* Adding a record - there will be empty record in the form

_Please be reminded that you need to pass the input validation in order to save the records._


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ROADMAP -->


<!-- IMPROVEMENTS -->

## Improvements

There are several User Stories that I did not accomplish such as User Story 4 & 5.

I would like to enhance this project in the future such as following:

1. Implement more unit testing using jUnit
2. Improve the UI be more mobile responsive and user-friendly
3. Salary range validation
4. Add a back button in employee page
5. Organise the files in better structure
6. Better error handling for REST

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->

## Contact

If you have a better suggestion or further comments on this project, please do not hesitate to contact me in person or
via the channels below.
Don't forget to give the project a star! Thanks again!

Jun Kai - [@my_LinkedIn](https://www.linkedin.com/in/jun-kai-ong-1b222518b) - ongjunkai@ecquaria.com

Project Link: [https://github.com/Ong-Jun-Kai/salary-management-fe](https://github.com/Ong-Jun-Kai/salary-management-fe)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->

## Acknowledgments

List of resources that I find helpful and would like to give credit to. 
* [Angular Bootstrap](https://valor-software.com/ngx-bootstrap/old/6.2.0/#/documentation#getting-started)
* [Angular Material](https://material.angular.io/guide/getting-started)
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

[product-screenshot]: src/assets/images/homePage.png

[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white

[Next-url]: https://nextjs.org/

[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB

[React-url]: https://reactjs.org/

[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D

[Vue-url]: https://vuejs.org/

[Spring-boot-img]: src/assets/images/spring-boot.png

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

[filter-salary-img]: src/assets/images/filterSalary.PNG

[upload-file-img]: src/assets/images/uploadFile.PNG

[save-records-img]: src/assets/images/saveRecords.PNG

[sorting-img]: src/assets/images/sorting.PNG

[update-delete-img]: src/assets/images/update&delete.PNG

[pagination-img]: src/assets/images/pagination.PNG

[add-img]: src/assets/images/add.PNG
