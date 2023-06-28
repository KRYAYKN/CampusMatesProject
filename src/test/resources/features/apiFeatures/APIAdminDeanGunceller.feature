@api
Feature: Admin can add dean


  Scenario: Dean post action
    Given User send post request for creating dean
    Then validate dean creation response
Scenario: Dean put action
  Given user send put request for dean
  Then validate dean update response
  Scenario: Dean get action
    Given user send get request for updated dean
    Then validate updated dean
    Scenario: Dean delete action
      Given user send delete request for deleting updated dean
      Then validate deleted dean
