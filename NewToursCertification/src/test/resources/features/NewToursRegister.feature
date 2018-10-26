#Author: dcristobalbautista@hotmail.com
Feature: New Tours Register
  As a traveler
  I want to register into the new tours page 
  to be able to reserve a flight

  @Register
  Scenario Outline: Register on New Tours
    Given that Diego wants to register on New Tours
    When he enters all of the next personal information
      | firstName   | lastName   | phone   | email   | address1   | address2   | city   | state   | postalCode   | userName   | country   | password   | confirmPassword   |
      | <firstName> | <lastName> | <phone> | <email> | <address1> | <address2> | <city> | <state> | <postalCode> | <userName> | <country> | <password> | <confirmPassword> |
    Then he should see a note with his "<userName>"

    Examples: 
      | firstName | lastName  | phone   | email                    | address1       | address2         | city     | state        | postalCode | userName       | country  | password    | confirmPassword |
   #   | Diego     | Bautista  | 2345812 | diego.bautista@gmail.com | Cra. 56A 51-81 | Apto 223         | Medellin | Antioquia    |            | diego.bautista | COLOMBIA | casemiro123 | casemiro123     |
      | Pacho     | Rodriguez |  121231 | pacho.alfonso@gmail.com  | Cll. 52A 31-41 | Apto 312 Torre 5 | Bogota   | Cundinamarca |            |                | COLOMBIA | casemiro123 | casemiro123     |
