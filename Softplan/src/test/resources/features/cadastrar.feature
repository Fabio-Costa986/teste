#Author: fcosta_zo@yahoo.com.br


Feature: Cadastro formulario
  Eu como usuario quero fazer cadastro no formulario

  Background: acessar url
  	Given que eu esteja no formulario "http://localhost:8080/usuarios"
  
  Scenario: Cadastrar
    
    When preencher os campos obrigatorios
    Then cadastro efetuado
    

 