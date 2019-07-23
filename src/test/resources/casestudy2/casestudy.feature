Feature: Signin functions
  This files describes the signin functionality
Scenario Outline: Signin
 Given open the browser
 Then give <username>
 Then giving <password>
 And click login

 Examples:
  |username   | password    |
  | lalitha   | password123 |