# **Employee Birthday Wishes Email System** 🎉🎂📧

## **Project Overview** 🌐

The **Employee Birthday Wishes Email System** automatically sends personalized birthday wishes to employees. It enhances employee engagement by acknowledging special occasions. Built with a **microservices architecture**, the system ensures scalability, reliability, and ease of maintenance, including email scheduling and an admin service for monitoring.

---

## **Features** ✨

-  **Employee Management** 👤📋: Manage employee details (names, emails, birthdays).
- **Birthday Notification Scheduling** 🎂⏰: Schedule automatic email notifications for birthdays.
- **Personalized Email Templates** ✍️📧: Customize emails with personalized messages.
- **Email Sending Service** 📤📨: Timely delivery of birthday wishes via email.
- **Real-time Notifications** 🔔📲: Alert HR/Admin of any email failures.
- **Email Logs Management** 🗂️: Track email delivery status and logs.
- **Admin Service** 🧑‍💼: Fetch upcoming birthdays and email logs from the Email Service.
- **Swagger Integration** 📜📂: API documentation and testing.

---

## **Architecture** 🏗️

The **Employee Birthday Wishes Email System** is designed as a **Microservices Architecture** with the following modules:

- **Employee Service** 🧑‍💼: Manages employee data, including CRUD operations for employee details.
- **Email Service with Scheduler** 📧⏰: Sends birthday wishes emails and includes scheduling logic to trigger birthday emails at the right time.
- **Admin Service** 🖥️🔔: Fetches upcoming-birthdays and email-logs from the Email Service.
---

## **Technologies Used** 💻🔧

- **Java** ☕️: Primary programming language.
- **Spring Boot** 🌱: Framework for building the microservices.
- **Spring Data JPA** 📊: Simplifies database interactions using JPA.
- **Hibernate** 🔄: ORM framework for database operations.
- **Lombok** 📜: Reduces boilerplate code with annotations.
- **SLF4J** 📖: Logging facade for better logging practices.
- **MySQL** 🗄️: Relational database for storing employee data and email logs.
- **Spring Email** 📧: Handles email sending functionalities.
- **Swagger** 📜: Provides API documentation and testing interface.
- **Postman** 🔑: For API endpoint validation and testing.

---

## **Getting Started** 🚀

### **Prerequisites** 🛠️

Ensure you have the following installed:

- **Java JDK 11 or later**: [Download here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) & **Java JDK 17 :** [Download here](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) or from [OpenJDK](https://openjdk.java.net/).
- **Postman**: [Download here](https://www.postman.com/downloads/).
- **Eclipse IDE** or your preferred IDE: [Download Eclipse](https://www.eclipse.org/downloads/packages/release/2023-09/r).

### **Installation** 🛠️

1. **Clone the repository**:
   ```bash
   git clone https://github.com/thevishalchothe/birthday-email-system.git

2. **Navigate to the project folder**:

    ```bash
    cd birthday-email-system
    ```

3. **Import the project into your IDE**:
   - Open Eclipse or your preferred IDE.
   - Import the project as a Maven project.

4. **Set up MySQL database**:
   - Create a new database in MySQL:

     ```sql
     CREATE DATABASE employee_birthday_system;
     ```

   - Configure database settings in `application.properties` or `application.yml`.

5. **Run the application**:
   - Start the Spring Boot application by running the `BirthdayEmailSystemApplication.java` class.

6. **Access Swagger UI**:
   - Navigate to `http://localhost:8080/swagger-ui.html` for API documentation and testing.

## API Endpoints 📡

Here are the key API endpoints:

### Employee Service 👤:
- **POST /api/employee**: Add a new employee.
- **GET /api/employee/{id}**: Retrieve employee details by ID.
- **PUT /api/employee/{id}**: Update employee details.
- **DELETE /api/employee/{id}**: Remove an employee.

### Scheduler Service ⏰:
- **GET /api/scheduler/run**: Manually trigger the scheduler to check for upcoming birthdays.

### Email Service 📧:
- **POST /api/email/send**: Send a test email manually.
- **GET /api/email/logs**: View email sending logs.

## Contributing 💡

We welcome contributions to the **Employee Birthday Wishes Email System!** Here's how you can contribute:

1. Fork the repository and create a new branch.
2. Implement your feature or fix a bug.
3. Commit your changes and submit a pull request.

For issue reports, provide as many details as possible to help resolve them quickly.

For assistance or inquiries, feel free to contact me at [vishalchothe134@gmail.com](mailto:vishalchothe134@gmail.com).

---

## **License** 📜

Using an open-source license promotes professional software development, encouraging collaboration and contributions from the community.  
See the [LICENSE](https://github.com/thevishalchothe) file for more information.

---

## **Thank You and Best Regards!** 🙏🎉

