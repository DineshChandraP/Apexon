# Project 1: MailJet API Tools 
Developed a serverless GCP Cloud Function to automate user profile data processing and upload to MailJet sub-accounts via API integration.
## Table of Contents
- [User Stories](#UserStories)
- [Stakeholders](#Stakeholders)
- [Problems and Challenges](#Problems/Challenges)
- [Role](#Role)
## UserStories.
- As a marketer, I want to see updated user profiles in MailJet sub-accounts after processing, so that I can target my campaigns effectively.
- As a Application owner, I want to monitor the Cloud Function's performance and logs by receiving an email everyday once the upload of CSV file is completed, so that I can ensure it runs smoothly.
## Stakeholders.
Gudsis Team: Upload the CSV file extracted from Success Factors HR application.
Marketing Team: Uses MailJet for campaigns and relies on accurate user data.
Product Owners: Ensure that the solution meets business requirements and user needs.
## Problems/Challenges.
**Data Validation:**
Ensuring the CSV file is correctly formatted and contains all required fields.
Handling missing or malformed data gracefully.
**API Integration:**
Understanding and implementing MailJet's API for uploading data to sub-accounts.
Managing authentication and rate limits with the MailJet API.
**Testing and Deployment:**
Setting up CI/CD pipelines for smooth deployment and rollback.
## Role
Developed GCP Cloud Functions to automate Excel file parsing and Mailjet API integration. 
Developed a second GCP Cloud Function to clean up the inactive user data with the help of multi-threading. 
Created GCP Pub-Sub topic and Configured GCP Cloud Scheduler to trigger the second GCP Cloud Function. 
Successfully automated profile data uploads with secure processing and comprehensive monitoring. 

# Project 2: Solvay MFT File Sync to Acquia server
Developed a GCP Cloud Function to securely upload user data from Excel files to a Drupal server via SFTP with PPK authentication. 

## Table of Contents
- [User Stories](#UserStories.)
- [Stakeholders](#Stakeholders.)
- [Problems and Challenges](#Problems/Challenges.)
- [Role](#Role.)
## UserStories.
As a System Administrator, I want to ensure that the upload process is secure to protect sensitive user information.
As a User, I want to receive a confirmation or error message after my upload so that I know if it was successful.
## Stakeholders.
Gudsis Team: Upload the CSV file extracted from Success Factors HR application.
System Administrators: Monitor the serverless environment and ensure uptime and performance.
Product Owners: Ensure that the solution meets business requirements and user needs.
## Problems/Challenges.
File Header Placement Issues: Gudsis team may upload unsupported CSV file formats or with different headedr position..
Connection Reliability: Network issues that could disrupt the SFTP upload process.
Data Validation: Challenges in validating and cleaning data extracted from CSV files.
Error Reporting: Providing clear and actionable error messages to Application owner and Support Team when issues occur.
## Role.
Designed and developed a GCP Cloud Function to securely upload data to a Drupal server using SFTP. 
Implemented data validation and error handling to ensure accuracy during file transfers. 
Streamlined deployments by configuring GitHub CI/CD pipelines. 
Delivered a secure and automated solution for regular data uploads, improving system reliability and security. 

# Project 3: 

## Table of Contents
- [User Stories](#UserStories..)
- [Stakeholders](#Stakeholders..)
- [Problems and Challenges](#Problems/Challenges..)
- [Role](#Role..)
## UserStories..
## Stakeholders..
## Problems/Challenges..
## Role..

# Project 4: 

## Table of Contents
- [User Stories](#UserStories...)
- [Stakeholders](#Stakeholders...)
- [Problems and Challenges](#Problems/Challenges...)
- [Role](#Role...)
## UserStories...
## Stakeholders...
## Problems/Challenges...
## Role...

# Project 5: 

## Table of Contents
- [User Stories](#UserStories....)
- [Stakeholders](#Stakeholders....)
- [Problems and Challenges](#Problems/Challenges....)
- [Role](#Role....)
## UserStories....
## Stakeholders....
## Problems/Challenges....
## Role....

# Project 6: 

## Table of Contents
- [User Stories](#UserStories.....)
- [Stakeholders](#Stakeholders.....)
- [Problems and Challenges](#Problems/Challenges.....)
- [Role](#Role.....)
## UserStories.....
## Stakeholders.....
## Problems/Challenges.....
## Role.....
