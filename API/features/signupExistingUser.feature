Feature: Intentar Registarr un Usuario ya Existente

  Scenario: Intentar Crear un Usuario ya Existente
    Given url 'https://api.demoblaze.com/signup'
    And request { username: 'testUser', password: 'testPass' }
    When method post
    Then status 200
    And match response == { errorMessage: 'This user already exist.' }
