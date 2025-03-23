Feature: Home page
  Scenario: Home page elements validation
    Given User on the home page
    Then User should see the sign in button
    And Home page title should be "Flight Expert: Book Flight Tickets, Hotels & Visa Online"
    And Flight button should be displayed
    And Flight button should be clickable
    And Hotel button should be displayed
    And Hotel button should be clickable
    And Visa button should be displayed
    And Visa button should be clickable
    And eSim button should be displayed
    And eSim button should be clickable
    And One way radio button should be displayed
    And One way radio button should be selected by default
    And One way radio button should be clickable
    And Round trip radio button should be displayed
    And Round trip radio button should be clickable
    And Multi city radio button should be displayed
    And Regular fares radio button should be displayed
    And Regular fares radio button should be clickable
    And Student fares radio button should be displayed
    And Student fares radio button should be clickable
    And Seaman fares radio button should be displayed
    And Seaman fares radio button should be clickable

  Scenario: Checking all links in the footer section
    Given User on the home page
#    Then Hover to the footer section
    Then Checking all links under About section
    And Checking all links under Help section
