# WebstaurantStore SDET Automation Project

This README file outlines the SDET (Software Development Engineer in Test) automation project developed for WebstaurantStore. This project was built using Java 11 and Selenium and incorporates object-oriented programming concepts, Singleton design pattern, and Page Object Model.

## About the Project

### Key Components

- **Java 11:** The project uses the Java programming language.
- **Selenium:** Selenium is used to automate control of web pages.
- **OOP Concepts:** Object-oriented programming principles form the foundation of the project.
- **Singleton Design Pattern:** The Singleton design pattern is used to ensure that the WebDriver object is created only once.
- **Page Object Model:** Page objects are separated using separate classes to represent web pages.
- **Cucumber:** Scenarios are written in Gherkin language, and the Cucumber-BDD framework is used.

### Reporting

- **Reporting:** Cucumber reports provide detailed results of the tests.
- **Screenshots:** Screenshots are taken in case of test failures and added to the report.

### Configuration

- **Configuration File:** The `configuration.properties` file stores constant values, and URL and browser type can be changed from here.

### Test Management

- **Failed Test Runner:** There is a mechanism to rerun failed tests.

## Running the Project

After cloning the project code to your local development environment, you can run the tests by following these steps:

1. Use the following command to clone the project git clone https://github.com/batuuu77/Webstaurant_
2. Open the `configuration.properties` file and configure the and browser type if needed.
3. Use the following command to run the project `mvn verify
4. If it is needed to run on another browser (ei. Firefox), use this command: mvn verify -Dbrowser=firefox



