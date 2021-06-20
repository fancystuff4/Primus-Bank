@tag
Feature: Admin Login
  I want to use this template to check Admin Login Feature

  @tag1
  Scenario: Check customer Login with valid data
    Given I open browser with url "http://primusbank.qedgetech.com/userdetails.aspx" 
    Then I should see login page
    When I select user branch "ATS123"
    When I enter username as "Customer"
    And I enter password as "Customer"
    And i click login
    Then I should see admin module
    When i click logout
    Then I should see login page
    When I close browser
    
     @tag2
  Scenario: Check customer Login with invalid data
    Given I open browser with url "http://primusbank.qedgetech.com/userdetails.aspx" 
    Then I should see login page
    When I select user branch "ATS123"
    When I enter username as "Customer"
    And I enter password as "xzy"
    And i click login
    Then I should see massage
    When I close browser