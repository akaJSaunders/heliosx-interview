# HeliosX-interview

Submission by: Juliano Saunders (me@jsaunders.dev) Feel free to contact for more information

## Problem

Expose APIs to enable a frontend MvP to ask a customer questions and check the eligiblity of a user to recieve a product.

## Solution
Java Spring Boot Application that allows for:

- Exposes consultation questions, the valid answers and the correct answer
- Exposes creation of a consultation for a user and whether it is eligible for product
- Exposes OpenApi v3 documentation on http://localhost:8080/swagger-ui/index.html#/


## Instructions
1. **Clone the repository:**

   ```git clone git@github.com:akaJSaunders/heliosx-interview.git```

2. **Open project in IDE of choice:**

   Import the project to the IDE of choice by selecting the cloned repository directory.

3. **Build and Run:**

   Once the project is imported, build the project by clicking on the build option in your IDE. Then, run the application by executing the main method or running the specific test files.

4. **Make calls to the API w/ Postman or another tool of choice**

    I have provided in the repo a postman_collection.json that if imported to postman will allow to hit the endpoints.

5. **Open API v3 Swagger

    Once the application is running go to the following url: http://localhost:8080/swagger-ui/index.html#/

## Improvements