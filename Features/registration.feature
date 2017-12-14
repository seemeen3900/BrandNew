@register
Feature: registering a new user

In order to become a site member
As a site visitor
I want to go to registration page, enter first name, last name, phone, email, address, user name and password to register

Scenario: positive - register one user

Given user  visit newtours homepage
When user click on register link
And user enter userName, password, confirm password, and click submit
Then user recieves a confirmation
And user closes the browser 