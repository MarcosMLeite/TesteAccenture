#Author: Ana Paula

Feature: Colocar na sacola um produto

Eu como usuario quero pesquisar um sapato

  Scenario: Entra no site e pesquisar sapatos e colocar na sacola 
    Given acesso site "https://www.shoestock.com.br"
    When pesquiso "sapato"
    Then coloco  o sapato na sacola
    

@executa
  Scenario: Entra no site e pesquisar sapatos e colocar na sacola e depois excluilo da sacola
    Given acesso site "https://www.shoestock.com.br"
    And pesquiso "sapato"
    When coloco na sacola
    Then excluo da sacola