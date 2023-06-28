@UI
Feature: Admin can add dean
Background:
  Given User login as an admin
  Then User validate that he is on the admin management page
  And User click admin menu button
  And User click dean management button

  Scenario: Admin can add dean
    And User enters name in the name textbox
    And surname degeri girilirUser enters surname in the name textbox
    And User enters birthplace in the surname textbox
    And User chose gender in the radio button
    And User enters date of birth in the date of birth textbox
    And User enters phone number in the phone textbox
    And User enters ssn number in the ssn textbox
    And User enters username in the username textbox
    And User enters password in the password textbox
    Then User clicksubmit button
    Then validate dean is registered
