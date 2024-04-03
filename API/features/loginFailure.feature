Feature: Login con credenciales incorrectas

  Scenario: Usuario y Password Incorrecto en Login
    Given url 'https://api.demoblaze.com/login'
    And request { username: 'wrongUser', password: 'wrongPass' }
    When method post
    Then status 200
    And match response == { errorMessage: 'User does not exist.' }

