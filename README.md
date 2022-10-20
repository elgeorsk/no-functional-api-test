# Project Instructions

### Project : Testing the CRUD Operations and performance of List of Users

Given an API which has details about Users of an Organization. In this project, we are going to use [REQRES - Test your front-ent against a real API](https://reqres.in/).
Test CRUD operations of this API using Postman and automate using Rest Assured and validate the response. Check the performance of an API using Jmeter.

The following requirements should be met:
* [x] Send a GET request using Postman to API and check list of users.
* [x] Validate the Status codes generated for the above requests.
* [x] Sending a POST request using Postman to API to add user and check the response.
* [x] Write automation script for POST Request using Rest Assured.
* [x] Generate console logs using Log4j.
* [x] Validate the Response.
* [ ] Check the above web services performance using JMeter.
* [ ] Do Load Testing.
* [ ] Do Stress Testing..
* [ ] Do Spike Testing.

## Introduction

This project is part of [Simplilearn - Automation Testing Masters Program](https://www.simplilearn.com/automation-testing-masters-program-certification-training-course) and it has to deal with test and monitor the applications through Non-functional and API Testing.


### Dependencies
* [Java 11](https://openjdk.java.net/projects/jdk/11/)
* [Maven](https://maven.apache.org/download.cgi)
* [Postman](https://www.postman.com/)
* [JMeter](https://jmeter.apache.org/)

## Getting Started

### How to execute the tests
> mvn clean test

### Postman collection

Postman collection is located under postman folder. The json file can be imported in the postman where the GET/POST requests can be executed.

### JMeter