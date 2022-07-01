
@tag
Feature: Abertura conta  pessoa fisica
  

  @tag1
  Scenario Outline: Preencher formulario de abertura de conta PF
   Given que acesse a Url "https://www.original.com.br/"
   When selecionar o botao abrir nova conta 
   And selecione o  botao abrir conta pf
   And preencho o campo nome "<nome>"
   And preencho o campo celular "<celular>"
   And preencho o campo email "<Email>"
   And preencho o campo cpf "<CPF>"
   And seleciono o botao quero ser cliente
   Then realizo validacao de envio dos dados

Examples:   
    
      | nome        | celular       | Email                              |CPF           |
      |Sophie Nicole|(86) 2972-4402 |sophie_daconceicao@leanclean.com.br |005.350.402-02|
      
