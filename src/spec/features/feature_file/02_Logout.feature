@logout
Feature: contrôle de la fonctionnalité du bouton "logout"
  je veux tester la déconnexion depuis page Products

  Background: 
    Given j ouvre le navigateur avec l url swaglabs
    When  je saisi le username "<username>"
    When  je saisi le mot de passe "<password>"
    When je clique sur le boutton login

  @logout_pass
  Scenario: je veux tester la deconnexion depuis page Products
    When je clique sur le bouton menu
    When je clique sur le bouton logout
    Then je verifie que la page de connexion saffiche avec le texte "Password for all users:"

  @logout_non_pass
  Scenario: je veux tester la connexion depuis page Products
    Then je me dirige vers la page dacceuil "Products"