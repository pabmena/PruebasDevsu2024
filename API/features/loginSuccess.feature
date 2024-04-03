Feature: Inicio de sesión exitoso

  Scenario: Usuario y Password Correcto en Login
    Given url 'https://api.demoblaze.com/login'
    And request { username: 'testUser030', password: 'testPass030' }
    When method post
    Then status 200
    And match response contains 'Auth_token:'
