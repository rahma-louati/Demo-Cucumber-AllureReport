@loginOutline
Feature: Je souhaite tester l application swaglabs avec plusieurs comptes

  Scenario Outline: Je souhaite tester l application swaglabs avec plusieurs comptes
    Given j ouvre le navigateur avec l url swaglabs
    When  je saisi le username "<username>"
    When  je saisi le mot de passe "<password>"
    When je clique sur le boutton login

    Examples: 
      | username                | password     |
      | standard_user11         | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce | 
    