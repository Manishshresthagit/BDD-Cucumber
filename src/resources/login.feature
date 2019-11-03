@Login
Feature: login

  Background: 
    Given launch british airways url "https://britishairways.com"

  Scenario: British airways login

  Scenario Outline: British airways login with  valid/ invalid credentails
    When enter the login id <loginId>
    Then enter password for login <password>
    And click Login
    And check for the <status>

    Examples: 
      | loginId             | password    | status  |
      | manishb | v1n0thm@l@r | success |
      | malar.cse@gmail.com | kjsahdkjsa  | Fail    |
