# Spring & REST
Setting up a basic webapp using Spring MVC
## Feature Task

#### lab 11
Setup Spring Initializr to create a new application with Web and Postgres dependecies.

Created a `"hello world"` route at `/hello`

Created a `/capitalize/` route to return capitalized response in what ever the path variable is

#### lab 12

Creating an `Album` model which has:
*  `title`, `artist`, `songCount`, `length`, and an `imageUrl`

Allowing users to see and add albums to the site

#### lab 13

Creating a Song model which has:
* `title`, `length`, `trackNumber`, `album`

Creating Spring integration testing

## Class Description

1. HelloWorldController.java - route that returns "hello world"
2. CapitalizeController.java - route that capitalizes the string after whatever is inputted after `/capitalize/`
3. Album.java - model entity class for Album class
4. AlbumContoller.java - route controller for model Album
5. Song.java - model entity class for Song Class
6. SongController.java - route controller for model Song

## Setting Up
* clone repository
    * ensure the following dependencies are installed:

         `dependencies {
    	compile 'org.springframework.boot:spring-boot-starter-data-jpa'
    	implementation('org.springframework.boot:spring-boot-starter-thymeleaf')
    	implementation('org.springframework.boot:spring-boot-starter-web')
    	runtimeOnly('org.postgresql:postgresql')
    	testImplementation('org.springframework.boot:spring-boot-starter-test')
        }`
* From your console, connect to PostgreSQL
    * Create `album_app` database
    * Connect to `album_app` database
* Run `PracticeSpringApplication`
* Go to localhost: 8080 from a browser to view client side server
* **Prior to building and running Spring application be sure to uncomment `spring.jpa.hibernate.ddl-auto=create` within the application.properties to initialize table schema. After initializing once, be sure to comment back in or delete to avoid dropping existing table.**



