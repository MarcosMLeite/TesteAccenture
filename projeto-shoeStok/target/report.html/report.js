$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("stock.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Ana Paula"
    }
  ],
  "line": 3,
  "name": "Colocar na sacola um produto",
  "description": "\r\nEu como usuario quero pesquisar um sapato",
  "id": "colocar-na-sacola-um-produto",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 14,
  "name": "Entra no site e pesquisar sapatos e colocar na sacola e depois excluilo da sacola",
  "description": "",
  "id": "colocar-na-sacola-um-produto;entra-no-site-e-pesquisar-sapatos-e-colocar-na-sacola-e-depois-excluilo-da-sacola",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@executa"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "acesso site \"https://www.shoestock.com.br\"",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "pesquiso \"sapato\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "coloco na sacola",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "excluo da sacola",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.shoestock.com.br",
      "offset": 13
    }
  ],
  "location": "Steps.acesso_site(String)"
});
formatter.result({
  "duration": 5237095200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sapato",
      "offset": 10
    }
  ],
  "location": "Steps.pesquiso(String)"
});
formatter.result({
  "duration": 18839265300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.coloco_na_sacola()"
});
formatter.result({
  "duration": 4069450000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.excluo_da_sacola()"
});
formatter.result({
  "duration": 5877683600,
  "status": "passed"
});
});