#Author: marcos.leite21@gmail.com
@executa
Feature: Preencher todos os Formularios 
  Eu como cliente quero enviar uma proposta
  
  Scenario: Validar msg de enviar formulario
    Given Que acesse o site "http://sampleapp.tricentis.com/101/app.php"
    When Preencho todos os formularios
    Then Formulario enviado com sucesso