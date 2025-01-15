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
        <li><a href="#run-application">Run the application</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
  </ol>
</details>


# E-commerce Application

<!-- ABOUT THE PROJECT -->
## About The Project

***This is a side project to emulate E-commerce webpage, where you can browse, add, modify, search and purchase any kinds of products!***

![Product Name Screen Shot][product-screenshot]


This project consists of
* [Frontend React application](https://github.com/kyddaniel/springboot-e-commerce-frontend)
* Springboot application as backend to handle the data and communications between database
* Postgres SQL database


### Built With

This backend side is built with

* [![React][SpringBoot-image]][SpringBoot-url]



<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

This application uses ```PostgreSQL``` as database, you may first **[download](https://www.postgresql.org/download/)** the database if you haven't installed it


### Installation

To start the frontend side of the application, please follow the below steps

1. Clone the repo
   ```sh
   https://github.com/kyddaniel/SpringBoot_E-Commerce.git
   ```
2. Open pom.xml and install the Maven Repositories


3. Change git remote url to avoid accidental pushes to base project
   ```sh
   git remote set-url origin github_username/repo_name
   git remote -v # confirm the changes
   ```

### Configure the connection to your local PostgreSQL database
1. In ```src/main/resources/application.properties```, please configure the following to your database name
   
   ```sh
   spring.datasource.url=jdbc:postgresql://localhost:5432/<your-database-name>
   ```

### Run application
<a id="run-application"></a>

To run the application
1. Start this application
2. Start the [frontend side application](https://github.com/kyddaniel/springboot-e-commerce-frontend) with
   ```sh
   npm run dev
   ```
3. Done! You can now browse the application in
   ```sh
   http://localhost:5173/
   ```



<!-- USAGE EXAMPLES -->
## Usage



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[product-screenshot]: src/main/resources/screenshot.png
[SpringBoot-image]: https://img.shields.io/badge/SpringBoot-20232A?style=for-the-badge&logo=springboot&logoColor=6DB33F
[SpringBoot-url]: https://spring.io/projects/spring-boot