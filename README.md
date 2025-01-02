
# How to Run this Project

### This Project is made using React (Frontend) and Spring Boot, Spring Data JPA, REST (Backend) by connecting it with PostgreSQL Database.


## Clone the Project
```bash
git clone https://github.com/mejkp-07/JobPortal_Using-SpringBoot_SprindDataJPA_REST_React.git 
```

 ## Run the Spring Boot Backend in an IDE
 Open the Backend Spring Boot project (backend-Spring_Boot) in Intellij IDEA and run main() to run the server on http://localhost:8080

 ## Run the React Frontend (On CMD Terminal)
 ```bash
cd JobPortal_Using-SpringBoot_SprindDataJPA_REST_React
```

```bash
cd frontend-React
```
```bash
npm install
```

```bash
npm start
```
 ## View Project in Browser
```bash
http://localhost:3000
```
## PostgreSQL Configuration
Make Sure you have all this:-
```bash
DATABASE - jdbc:postgresql://localhost:5432/telusko
username - postgres
password - Jay*729852#
```
If not change the Configuration accordingly in ***application.properties*** file in your backend.
### Important Note

If you have any problem in running fronend (npm start) then there must be conflict between the packages you have installed. To resove it you can run:-
```bash
npm audit fix
```
```bash
npm audit fix --force
```

