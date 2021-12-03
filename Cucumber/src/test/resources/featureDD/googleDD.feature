Feature: Google Page

  Scenario Outline: Verify Google Page
    Given User Opens <browser> test
    Then Verify Page

    Examples: 
      | browser |
      | firefox |
