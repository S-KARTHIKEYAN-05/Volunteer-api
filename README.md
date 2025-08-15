# Volunteer API (Spring Boot)

A simple Spring Boot REST API for managing volunteer registrations.  
Users can register with **Name, Gmail, Branch, Year**, and choose a **Section** to volunteer in.  
**Frontend: To be implemented.**

---

## 🚀 Features
- Register a volunteer with:
  - Name
  - Gmail
  - Branch (e.g., CSE, ECE, ME)
  - Year (1st, 2nd, 3rd, 4th)
  - Section (e.g., Technical, Cultural, Logistics)
- View list of registered volunteers
- Basic Spring Security configuration
- RESTful API design

---

## 🛠 Tech Stack
Java 17+, Spring Boot, Spring Web, Spring Security, Maven, H2 Database *(or any supported DB)*

---

## 📂 Project Structure
volunteer-api/
 ├── src/
 │   ├── main/
 │   │   ├── java/
 │   │   │   └── com/
 │   │   │       └── example/
 │   │   │           └── karthik/
 │   │   │               └── volunteer_api/
 │   │   │                   ├── model/
 │   │   │                   │   └── Volunteer.java
 │   │   │                   ├── controller/
 │   │   │                   │   └── VolunteerController.java
 │   │   │                   └── config/
 │   │   │                       └── SecurityConfig.java
 │   │   └── resources/
 │   │       ├── application.properties
 │   │       ├── static/                  # (optional - for frontend assets)
 │   │       └── templates/               # (optional - for HTML templates)
 │   └── test/
 │       └── java/                         # Unit tests
 ├── pom.xml
 └── README.md
