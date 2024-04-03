Feature: Crear un Nuevo Usuario

  Scenario: Crear un Nuevo Usuario Exitosamente
    Given url 'https://api.demoblaze.com/signup'
    And request { username: 'testUser035', password: 'testPass035' }
    When method post
    Then status 200
    * def responseClean = response.replace(/\s/g, '')
    And match responseClean == '""'
