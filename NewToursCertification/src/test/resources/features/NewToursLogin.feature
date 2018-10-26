#Author: dcristobalbautista@hotmail.com
Feature: New Tours Login
  As a New Tours customer
  I want to login into the New Tours web page
	to search for a flight
	
  @Login
  Scenario: Login into New Tours web page
    Given that Diego wants to enters into the New Tours page
    When he logins into the page with his credentials
      | username           | password    |
      | cristobal.bautista | casemiro123 |
    Then he should see in the screen the flight search window
