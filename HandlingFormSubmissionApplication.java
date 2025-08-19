/*Mohammed Hamdan
COP 3330C-33777
07/20/2025
This springboot application uses the MVC architecture in combination with Maven for dependency mgmt. and Thymeleaf
as the template engine for server-side rendering. Maven handles building the project and resolving dependencies like
Spring Boot and Thymeleaf, and packaging the application as a runnable .jar. When the user navigates to /greeting,
a GET request is sent to the controller and creates a new greeting object and adds it to the model. The view (HTML form)
rendered by Thymeleaf uses this model object to bind input fields using th:object, allowing dynamic interaction
between HTML and Java. When the user submits the form, (POST request), Spring automatically binds the input values
top a new greeting object using @Modelattribute. The controller then passes this object to the result view, or
result.html. Thymeleaf renders this final page by accessing and displaying the objects properties.
 */



package com.example.handlingformsubmission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HandlingFormSubmissionApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandlingFormSubmissionApplication.class, args);
    }

}