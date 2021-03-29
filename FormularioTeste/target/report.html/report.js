$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("form.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: marcos.leite21@gmail.com"
    }
  ],
  "line": 3,
  "name": "Preencher todos os Formularios",
  "description": "Eu como cliente quero enviar uma proposta",
  "id": "preencher-todos-os-formularios",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@executa"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Validar msg de enviar formulario",
  "description": "",
  "id": "preencher-todos-os-formularios;validar-msg-de-enviar-formulario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Que acesse o site \"http://sampleapp.tricentis.com/101/app.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Preencho todos os formularios",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Formulario enviado com sucesso",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://sampleapp.tricentis.com/101/app.php",
      "offset": 19
    }
  ],
  "location": "FormularioTeste.que_acesse_o_site(String)"
});
formatter.result({
  "duration": 5186995600,
  "status": "passed"
});
formatter.match({
  "location": "FormularioTeste.preencho_todos_os_formularios()"
});
formatter.result({
  "duration": 36737997400,
  "status": "passed"
});
formatter.match({
  "location": "FormularioTeste.formulario_enviado_com_sucesso()"
});
formatter.result({
  "duration": 10445608200,
  "status": "passed"
});
});