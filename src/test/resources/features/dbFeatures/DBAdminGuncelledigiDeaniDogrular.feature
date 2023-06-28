@db
Feature: Admin can add dean


  Scenario: Dean  databasede kayit edilebilmismi
    Given send the query to database with dean username
    Then validate  dean is registered

