
Add an object:

![angular-11-spring-boot-mongodb-example-crud-create-tutorial](angular-11-spring-boot-mongodb-example-crud-create-tutorial.png)

Retrieve all objects:

![angular-11-spring-boot-mongodb-example-crud-retrieve-all-tutorial](angular-11-spring-boot-mongodb-example-crud-retrieve-all-tutorial.png)

Click on **Edit** button to go to a Tutorial page:

![angular-11-spring-boot-mongodb-example-crud-retrieve-one-tutorial](angular-11-spring-boot-mongodb-example-crud-retrieve-one-tutorial.png)

On this Page, you can:

- change status to *Published* using **Publish** button
- delete the Tutorial using **Delete** button
- update the Tutorial details with **Update** button

![angular-11-spring-boot-mongodb-example-crud-update-tutorial](angular-11-spring-boot-mongodb-example-crud-update-tutorial.png)

Search Tutorials by title:

![angular-11-spring-boot-mongodb-example-crud-search-tutorial](angular-11-spring-boot-mongodb-example-crud-search-tutorial.png)

## Angular 11, Spring Boot & MongoDB Architecture
This is the application architecture we will build:

![angular-11-spring-boot-mongodb-example-crud-architecture](angular-11-spring-boot-mongodb-example-crud-architecture.png)

- Spring Boot exports REST Apis using Spring Web MVC & interacts with MongoDB Database using Spring Data MongoDB.
- Angular 111 Client sends HTTP Requests and retrieve HTTP Responses using axios, shows data on the components. We also use Angular Router for navigating to pages.
