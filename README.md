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
