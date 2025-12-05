@Product
Feature: Gestion des produits sur SwagLabs
    En tant qu utilisateur, je souhaite ajouter un produit au panier, passer la commande
  et revenir a la page d accueil afin de vérifier le processus complet d achat.

  Background: 
    Given j ouvre le navigateur avec l url swaglabs
    When  je saisi le username "<username>"
    When  je saisi le mot de passe "<password>"
    When je clique sur le boutton login

  @Product_pass
  Scenario: Ajouter un produit au panier, passer la commande et revenir a la page daccueil
    When J ajoute le produit au panier "Sauce Labs Backpack" 
    And je clique sur l icône du panier
    Then je verifie que le produit "Sauce Labs Backpack" est bien dans le panier
    When je clique sur le bouton "Checkout"
    And je saisis les informations : prenom "Rahma", nom "Louati", code postal "4000"
    And je clique sur le bouton  "Continue"
    And je clique sur le bouton    "Finish"
   Then  je verifie que le message "Thank you for your order!" s affiche
   When je clique sur le bouton     "Back Home"
    Then je me dirige vers la page dacceuil "Products"