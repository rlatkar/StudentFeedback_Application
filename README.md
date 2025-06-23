
## Student Feedback Web Application
----------------------------------
This is a full-stack web application built with Spring Boot (Java) and Angular to collect and manage feedback from prospective students about their university visit. The app features a user-friendly Angular frontend form to gather feedback, which is then processed by the Spring Boot backend and stored in an in-memory H2 database for persistence.

## Technologies Used
--------------------
- **Frontend:** Angular
- **Backend:** Spring Boot (Java)
- **Database:** H2 (in-memory)
- **Build Tools:** Maven (for backend), npm (for frontend)

## Prerequisites
----------------
Before running the app, ensure the following are installed:
# For Backend
- Java 17+
- Maven

# For Frontend
- Node.js
- npm (comes with Node.js)
- Angular CLI (`npm install -g @angular/cli`)



## Setup Instructions
---------------------
1. Clone the Repository
git clone https://github.com/rlatkar/StudentFeedback_Application.git



3. Run the Backend
cd studentfeedback-app
mvn clean install
mvn spring-boot:run

The backend will start at: http://localhost:8181

You can access the H2 console at:
H2 Console (optional): http://localhost:8181/h2-console
JDBC URL: jdbc:h2:mem:testdb
User: sa
Password: (leave blank)


3. Run the Frontend (Angular)
cd studentfeedback-app/studentfeedback-web
npm install
ng serve

The frontend will be served at: http://localhost:4200/

Make sure the backend is running before launching the Angular frontend for seamless integration.


## Features
-----------
Submit student survey data through a web form.
Validate inputs and store them in an in-memory database.
View submitted feedback entries.
RESTful APIs to fetch and post survey responses.

## Notes
--------
The H2 database is in-memory and will reset on every restart.
