# Crisis Management System: Crisis Management Office (CMO)

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

This is a school project for the module CZ3003 Software System and Analysis.
This project is done as one of the four subsystems in a simulated job scope.

Project Completion Date: 14 Nov 2017

![Screenshot](https://github.com/chrismaltais/Crisis-Management-System-CMO/blob/master/screenshots/Analyst%20%232.png?raw=true)

## Access

**Username & Password**: analyst

**Username & Password**: general

## Table of Contents
0. [Team](#team)
1. [Development Environment](#development-environment)
2. [To Run](#to-run)
3. [Working with other subsystems](#working-with-other-subsystems)
4. [Java Packages](#java-packages)
5. [Project Properties](#project-properties)
6. [Features to Implement](#features-to-implement)
---------------------------
## Team 
Team: SSP2 CMO (AY17/18)(Semester 1)

Members:
* Marathe Ajinkya Avinash
* Ong Hock Leng
* Chris Maltais
* Lim Dong Li, Tony
* Rohaizad Bin Noordin
* Tham Jue Dong Gabriel
* Tan Han Jenn Zacharias
-----------------------------
## Development Environment
**IDE**: Eclipse Java EE IDE for Web Developers (Version: Oxygen.1a Release (4.7.1a))

**Java Versions**: Java SE 8 (Recently released Java SE 9 had issues with our project); 1.8.0_144

**Plugins**: STS (Spring Tool Suite)

Additional Notes:
1. Project is built with Maven. Please ensure maven updates the dependencies. (Shortcut key = Alt + F5)
2. Tomcat installation is *not* required. Spring Boot utilizes embedded Tomcat.
3. To run with a different port, add `server.port=xxxx` to `/src/main/resources/application.properties`.
-----------------------------
## To run 
Run cmo.Application as a Spring Boot application.

Ensure that all Maven dependencies are updated before running.

### Working with other subsystems 
##### Setup instructions:
1. **API's** (`src/main/java/cmo.myapi`):
  - Change the IP address to point to the API service for all the java files under cmo.myapi folder.
  - CMOEFClient.java is to communicate with EF's API service
    - IP address in line 15 should point to the EF system
  - CMOPMOClient.java is to communicate with PMO's API service
    - IP address in line 15 should point to the PMO system
    
2. **Chat** (`src/main/webapp/resources/js/chat`)
  - main.js is to communicate with EF's chat server
    - IP address in line 25 should point to the EF system
  - mainageneral.js is to communicate with PMO's chat server
    - IP address in line 25 should point to the PMO system
    
----------------------------------------------------------------------------------------------------------------------
## Java Packages 
Explanation of what each package contains and their functions.
### 1) cmo 

1.1: `Application.java`
  - Entry point of program. Runs main here.
  
1.2: `Test.java`
  - Dummy data is found here. Uses CommandLineRunner to run code before launch of program is completed.
  
### 2) cmo.api 

2.1: `CMO911ApiController.java`, `CMOEFApiController.java`, `CMOPMOApiController.java`
  - APIs for 911, EF and PMO to access CMO's services.

### 3) cmo.chat

3.1: `ChatController.java`
  - Provides mapping to access chat functions

3.2: `ChatMessage.java`
  - POJO entity for chat messaging

3.3: `WebSocketConfig.java`, `WebSocketEventListener.java`
  - Configures WebSocket service for messaging
  
### 4) cmo.controller

4.1: `DecoratorController.java`
  - Used by sitemesh for building GUI

4.2: `FormController.java`
  - Provides post mapping to save entities from GUI

4.3: `HomeController.java`
  - Main controller class for serving GUI

4.4: `loginController.java`
  - Used for security access

4.5: `MailboxController.java`
  - Populates mailboxes with appropriate entities from DB.
  - Fetches single entity when requested through AJAX from GUI.

4.6: `MapController.java`
  - Serves map.jsp
  
### 5) cmo.entities

5.1: `ApprovalReport.java`, `CallReport.java`, `EFOrder.java`, `FeedbackReport.java`, `Proposal.java`, `Report.java`
  - POJO entities saved in DB
  
5.2 `ApprovalReportDTO.java`
  - Data Transfer Object for ApprovalReport when communicating with PMO.
  - Uses Base64 encoded String to represent Byte[]

5.3: `ApprovalReportConverter.java`
  - Provides static methods for convert between ApprovalReport and ApprovalReportDTO.
  
### 6) cmo.frontend.dao

6.1: `FEDAO.java`
  - FE stands for Front-End.
  - All are interfaces to provide front-end services to access DB data.
  
### 7) cmo.frontend.dao.implement

7.1: `FEDAO.java`
  - Implemented classes for cmo.frontend.dao interfaces.

### 8) cmo.login
8.1: `loginDAO.java`
  - Access Control
  
### 9) cmo.myapi
9.1: `CMOEFClient.java`
  - Provides CMO service to send data to EF.

9.2: `CMOPMOClient.java`
  - Provides CMO service to send data to PMO.
  
### 10) cmo.pdf
10.1: `PDFConverter.java`
  - Provides interface for using pdf converting service.

10.2: `PDFConverterApprovalReport.java`
  - Implements service for PDFConverter.java

### 11) cmo.repository

11.1: `Repository.java`
  - Interfaces for JPA (Hibernate).
  - Contain services to access DB.
  
### 12) cmo.webconfig
12.1: `WebConfig.java`
  - Bean declaration for using WebSiteMeshFilter.java

12.2: `WebSiteMeshFilter.java`
  - Responsible for selecting dashboard and pages to build GUI

---------------------------------------------------
## Project properties 
File: `src/main/resources/application.properties`
  - Configuration properties for Spring Boot.
  
------
## Features to Implement
- [ ] Login Security using [Spring Security](https://projects.spring.io/spring-security/) (no security was added for demo purposes)
- [ ] Autocomplete for forms using Crisis ID as Key value in DB
- [ ] "View on Map" button not currently working for certain pages - need to fix
- [ ] Rather than radius surrounding each point when displayed on the map, implement [Graham's scan](https://en.wikipedia.org/wiki/Graham_scan) algorithm to create a convex hull between crisis points, reducing the area needed to deploy EF and cleanup.
