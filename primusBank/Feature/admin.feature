@tag
Feature: Admin Login
  I want to use this template to check Admin Login Feature

  @tag1
  Scenario: Check Admin Login with valid data
    Given I open browser with url "http://primusbank.qedgetech.com/userdetails.aspx" 
    Then I should see login page
    When I enter username as "Admin"
    And I enter password as "Admin"
    And i click login
    Then I should see admin module
    When i click logout
    Then I should see login page
    When I close browser
    
     @tag2
  Scenario: Check Admin Login with invalid data
    Given I open browser with url "http://primusbank.qedgetech.com/userdetails.aspx" 
    Then I should see login page
    When I enter username as "Admin"
    And I enter password as "xzy"
    And i click login
    Then I should see massage
    When I close browser
    
     @tag3
	 Scenario Outline: Check creation of new branch with valid data
    Given I open browser with url "http://primusbank.qedgetech.com/userdetails.aspx" 
    Then I should see login page
    When I enter username as "Admin"
    And I enter password as "Admin"
    And i click login
    Then I should see admin module
    When I select branches
    And I select new branch
    And I entered input in textboxes and click submit "<BranchName>" "<Adress>" "<City>" "<zipcode>" "<Country>"
     Then I should see massage
    When i click logout
    Then I should see login page
    When I close browser
    
    	Examples: 
      | BranchName | Adress | City |  zipcode |  Country |
      | PrimusBank | AbidsMainRoad | Hyderabad | 50024 | INDIA |
      
      
      
     @tag4
	 Scenario Outline: Check creation of new branch with invalid data
    Given I open browser with url "http://primusbank.qedgetech.com/userdetails.aspx" 
    Then I should see login page
    When I enter username as "Admin"
    And I enter password as "Admin"
    And i click login
    Then I should see admin module
    When I select branches
    And I select new branch
    And I entered input in textboxes and click submit "<BranchName>" "<Adress>" "<City>" "<zipcode>" "<Country>"
     Then I should see massage
    When i click logout
    Then I should see login page
    When I close browser
    
    	Examples: 
      | BranchName | Adress | City |  zipcode |  Country |
      | PrimusBank | AbidsMainRoad | Hyderabad | 50024 | INDIA |
      

      
     @tag5
	 Scenario Outline: Check creation of new role with valid data
    Given I open browser with url "http://primusbank.qedgetech.com/userdetails.aspx" 
    Then I should see login page
    When I enter username as "Admin"
    And I enter password as "Admin"
    And i click login
    Then I should see admin module
    When I select role
    And I select new role
    And I entered input in textboxes and click submit of role "<RoleName>" "<Role Desc>" "<SelectRoleType>"
     Then I should see massage
    When i click logout
    Then I should see login page
    When I close browser
    
    	Examples: 
      | RoleName | Role Desc | SelectRoleType |
      | Employee | this role is applicable for new employee | E |
      
      
        @tag6
	 Scenario Outline: Check creation of new role with invalid data
    Given I open browser with url "http://primusbank.qedgetech.com/userdetails.aspx" 
    Then I should see login page
    When I enter username as "Admin"
    And I enter password as "Admin"
    And i click login
    Then I should see admin module
    When I select role
    And I select new role
    And I entered input in textboxes and click submit of role "<RoleName>" "<Role Desc>" "<SelectRoleType>"
     Then I should see massage
    When i click logout
    Then I should see login page
    When I close browser
    
    	Examples: 
      | RoleName | Role Desc | SelectRoleType |
      | Employee | this role is applicable for new employee | E |
     