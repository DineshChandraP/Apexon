# Project 1: MailJet API Tools 
Developed a serverless GCP Cloud Function to automate user profile data processing and upload to MailJet sub-accounts via API integration.
## Table of Contents
- [User Stories](#UserStories)
- [Stakeholders](#Stakeholders)
- [Problems and Challenges](#Problems/Challenges)
- [Role](#Role)
## UserStories
- As a marketer, I want to see updated user profiles in MailJet sub-accounts after processing, so that I can target my campaigns effectively.
- As a Application owner, I want to monitor the Cloud Function's performance and logs by receiving an email everyday once the upload of CSV file is completed, so that I can ensure it runs smoothly.
## Stakeholders
- Gudsis Team: Upload the CSV file extracted from Success Factors HR application.
- Marketing Team: Uses MailJet for campaigns and relies on accurate user data.
- Product Owners: Ensure that the solution meets business requirements and user needs.
## Problems/Challenges
**Data Validation:**
- Ensuring the CSV file is correctly formatted and contains all required fields.
- Handling missing or malformed data gracefully.
**API Integration:**
- Understanding and implementing MailJet's API for uploading data to sub-accounts.
- Managing authentication and rate limits with the MailJet API.
**Testing and Deployment:**
- Setting up CI/CD pipelines for smooth deployment and rollback.
## Role
- Developed GCP Cloud Functions to automate Excel file parsing and Mailjet API integration. 
- Developed a second GCP Cloud Function to clean up the inactive user data with the help of multi-threading. 
- Created GCP Pub-Sub topic and Configured GCP Cloud Scheduler to trigger the second GCP Cloud Function. 
- Successfully automated profile data uploads with secure processing and comprehensive monitoring. 

# Project 2: Solvay MFT File Sync to Acquia server
Developed a GCP Cloud Function to securely upload user data from Excel files to a Drupal server via SFTP with PPK authentication. 

## Table of Contents
- [User Stories](#UserStories.)
- [Stakeholders](#Stakeholders.)
- [Problems and Challenges](#Problems/Challenges.)
- [Role](#Role.)
## UserStories.
- As a System Administrator, I want to ensure that the upload process is secure to protect sensitive user information.
- As a User, I want to receive a confirmation or error message after my upload so that I know if it was successful.
## Stakeholders.
- Gudsis Team: Upload the CSV file extracted from Success Factors HR application.
- System Administrators: Monitor the serverless environment and ensure uptime and performance.
- Product Owners: Ensure that the solution meets business requirements and user needs.
## Problems/Challenges.
- File Header Placement Issues: Gudsis team may upload unsupported CSV file formats or with different headedr position..
- Connection Reliability: Network issues that could disrupt the SFTP upload process.
- Data Validation: Challenges in validating and cleaning data extracted from CSV files.
- Error Reporting: Providing clear and actionable error messages to Application owner and Support Team when issues occur.
## Role.
- Designed and developed a GCP Cloud Function to securely upload data to a Drupal server using SFTP. 
- Implemented data validation and error handling to ensure accuracy during file transfers. 
- Streamlined deployments by configuring GitHub CI/CD pipelines. 
- Delivered a secure and automated solution for regular data uploads, improving system reliability and security. 

# Project 3: GPC Delta Scheduler 
Developed a system to read product data from a Product database and transmit it to an Acquia server for publishing products info to Solvay.com website. 
## Table of Contents
- [User Stories](#UserStories..)
- [Stakeholders](#Stakeholders..)
- [Problems and Challenges](#Problems/Challenges..)
- [Role](#Role..)
## UserStories..
Product Managers: Overseeing product data accuracy and availability on the website.
Developers: Responsible for building and maintaining the data transmission system.
System Administrators: Managing server infrastructure and ensuring security.
## Stakeholders..
- As a Product Manager, I want to ensure that all product data is accurately transmitted to the Acquia server, so that it is available on the Solvay.com website.
## Problems/Challenges..
- Data Mapping: Ensuring the product data structure in the database matches the requirements of the Acquia server.
- API Integration: Handling authentication, error responses, and data formatting when interfacing with the Acquia server API.
## Role..
- Implemented data access layers using Spring Data JPA for database interactions. 
- Developed service components for data processing and transformation. 
- Built RESTful APIs for communication between systems, ensuring error handling and logging. 
- Delivered a scalable solution for data synchronization, enhancing operational efficiency and data accuracy

# Project 4: GPC Endpoint  
Developed a web application that provides a RESTful API for external applications to retrieve product and market data. 
## Table of Contents
- [User Stories](#UserStories...)
- [Stakeholders](#Stakeholders...)
- [Problems and Challenges](#Problems/Challenges...)
- [Role](#Role...)
## UserStories...
## Stakeholders...
## Problems/Challenges...
## Role...
- Created RESTful APIs to enable external applications to query product data and download documents. 
- Integrated Sinequa and Documentum services to fetch the product info along with relevant Documents. 
- Delivered a user-friendly interface which provides the information on available endpoints which facilitate seamless Product data access and document downloads which can be integrated with Client applications.

# Project 5: Global Product Catalog
Developed a comprehensive web application to manage products and market data, allowing admin teams to efficiently update and maintain data which is later published for end-users.
## Table of Contents
- [User Stories](#UserStories....)
- [Stakeholders](#Stakeholders....)
- [Problems and Challenges](#Problems/Challenges....)
- [Role](#Role....)
## UserStories....
## Stakeholders....
## Problems/Challenges....
## Role....
- Developed the backend using Spring Boot for managing product, market, and chemical categories. 
- Configured HTTPS protocol and handled SSL Certificate creation/import on Tomcat server. 
- Successfully delivered a web application enabling effective data management for the admin team. 
- Configured Jenkins CI-CD to ease the development and release operations.
- 
# Project 6: Loftware Job failure & Service Monitoring Email Alerts 
Automated email alerts, improving system monitoring and reducing downtime. 
## Table of Contents
- [User Stories](#UserStories.....)
- [Stakeholders](#Stakeholders.....)
- [Problems and Challenges](#Problems/Challenges.....)
- [Role](#Role.....)
## UserStories.....
## Stakeholders.....
## Problems/Challenges.....
## Role.....
- Developed an automated email alert system to notify teams of job failures in the Loftware labeling application. 
- Developed an email alert system to notify when the application service on the deployed server is down or not in running state. 
- Designed and integrated the system to capture error logs and send detailed email notifications, improving real-time monitoring and response. 
- Configured customizable email templates to include relevant error details, ensuring clarity and actionable insights for the development team. 
- Collaborated with stakeholders and operations teams to test and fine-tune the notification system for accuracy and reliability.
  
# Project 7: Deployment and Maintenence IUCLID, Chesar, QSAR and Contrattech Applications- Support  
Handled deployment of IUCLID, Chesar, QSAR and Contrattech Applications. 
## Table of Contents
- [User Stories](#UserStories......)
- [Stakeholders](#Stakeholders......)
- [Problems and Challenges](#Problems/Challenges......)
- [Role](#Role......)
## UserStories......
## Stakeholders......
## Problems/Challenges......
## Role......
- Managed the deployment of the IUCLID application on the Glassfish server, ensuring seamless installation and configuration tailored to the client’s specific environment. 
- Led deployment of Chesar and Contrattech on Apache Tomcat, including server setup, war file deployment, and SSL configuration. 
