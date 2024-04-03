Documentación del Ejercicio de Pruebas de API

Descripción General

Esta documentación abarca el ejercicio de pruebas de API para la funcionalidad de registro (signup) e inicio de sesión (login) proporcionada por el sitio web https://www.demoblaze.com/. Las pruebas están automatizadas utilizando el marco de trabajo Karate, enfocándose en servicios RESTful para verificar los procesos de registro e inicio de sesión con éxito.

Pre-requisitos

Java 8 o superior
Maven
Framework Karate

Instalación

Instalación de Java: Asegúrate de que el JDK de Java 8 (o más reciente) esté instalado y correctamente configurado en tu sistema. Verifica la instalación ejecutando java -version en tu línea de comandos o terminal.

Configuración de Maven: Maven es necesario para manejar las dependencias del proyecto y ejecutar las pruebas. Las instrucciones de instalación se pueden encontrar en la página oficial de Maven.

Ejecución de las Pruebas
Para ejecutar las pruebas, sigue estos pasos:

Clonar el Repositorio: Clona el repositorio del proyecto desde GitHub o cualquier otro sistema de control de versiones utilizado.
Ejecutar las Pruebas: Navega al directorio del proyecto y ejecuta el siguiente comando en tu terminal:

bash
Copy code
java -jar karate-1.4.1.jar features/
Este comando iniciará la ejecución de las pruebas utilizando Karate.

Estructura del Proyecto

Carpeta features: Contiene los archivos .feature de Karate, donde se definen los escenarios de prueba en un lenguaje Gherkin legible.
Carpeta karate-1.4.1.: Archivo de configuración para las pruebas de Karate.

Casos de Prueba

Registro de Usuario (signup)
URL del Servicio: https://api.demoblaze.com/signup
Escenario Exitoso: Verifica que un nuevo usuario pueda registrarse correctamente.
Escenario de Usuario Existente: Verifica que el sistema impida el registro de un usuario que ya existe.

Inicio de Sesión (login)
URL del Servicio: https://api.demoblaze.com/login
Escenario Exitoso: Verifica que un usuario pueda iniciar sesión con credenciales válidas.
Escenario de Credenciales Incorrectas: Verifica que el sistema impida el inicio de sesión con una contraseña incorrecta.

Informe de Pruebas

Después de la ejecución de las pruebas, se genera un informe HTML que se puede encontrar en la carpeta target/karate-reports: comando en visual studio code (bash):
start C:/PruebasDevsu2024/API/target/karate-reports/karate-summary.html
Este informe ofrece una visión detallada de los resultados de las pruebas.