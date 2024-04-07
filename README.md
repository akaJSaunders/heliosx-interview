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

5. **Open API v3 Swagger**

    Once the application is running go to the following url: http://localhost:8080/swagger-ui/index.html#/

## Improvements
These are the things that if given more time, I would have tried to add:
- **Add integration tests**: I added basic unit testing for each of the classes, but I am not testing the endpoint and how the 
classes are called together.

- **Dont expose correct answers**: We don't want to expose the correct answers for each question to the frontend. Risk that users could exploit that to get products that they shouldn't have access to.

- **Add endpoint for consultation eligibility**: Rather than storing the eligibility on the consultation, I was originally 
thinking of a `api/v1/consultation/:id/eligiblity` endpoint. My thoughts were that criteria for eligibility might change,
so calculating it on the spot when endpoint is called might make more sense.

- **Add database integration**: We are creating a consultation, so it would make sense to store it in a database for persistence. 
For a simple questionnaire I might use a non-relational database like MongoDB, where I could save the consultation json.
The structure of questions and answers may change. 

- **Add dockerfile**: So that as the project gets more complicated and more dependencies are added, anyone can easily run this
application on any machine.