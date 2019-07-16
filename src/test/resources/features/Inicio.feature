Feature: Como potencial cliente
         yo quiero ver informacion una pagina
         asi no tengo que llamarlos para saber de que se trata

  @WEB @MOBILE @Smoke 
  Scenario: El cliente inicia en la busqueda de un wikipedia en google
  Given El cliente esta en la pagina de google
  When El cliente busca Wikipedia
  Then El cliente observa la informacion relevante sobre crowdar


  @WEB @MOBILE @Smoke
  Scenario: El cliente inicia en la busqueda de un wikipedia en google
    Given El cliente esta en la pagina de google
    When El cliente busca Wikipedia
    Then El cliente observa la informacion relevante sobre crowdar