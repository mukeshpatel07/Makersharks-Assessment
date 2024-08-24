**🚀 Makersharks Supplier Search API**


**📝 Overview**

A powerful Spring Boot API enabling buyers to search manufacturers by location, business nature, and manufacturing processes.


**⚙️ Prerequisites**

JDK 17
Maven
MySQL


**🚀 Getting Started**


**Clone the Repository:**

bash

git clone https://github.com/your-username/makersharks-supplier-search-api.git

cd makersharks-supplier-search-api


**Configure Database:**

Update src/main/resources/application.properties with your MySQL credentials:

properties

spring.application.name=supplier-search-api

spring.datasource.url=jdbc:mysql://localhost:3306/student

spring.datasource.username=root

spring.datasource.password=root

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

spring.jpa.properties.hibernate.format_sql=true



**Build and Run the Application:**



**📡 API Usage**

Test the API using Postman:

Endpoint:

http://localhost:8080/api/supplier/query

Example JSON Body:

json

{
  "location": "India",
  
  "natureOfBusiness": "SMALL_SCALE",
  
  "manufacturingProcess": "PRINTING_3D",
  
  "page": 0,
  
  "size": 10
}
