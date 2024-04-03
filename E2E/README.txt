Prueba Automatizada de E2E (End-to-End)

Descripción:

Este proyecto es una prueba automatizada de extremo a extremo (E2E) utilizando Selenium WebDriver para automatizar las interacciones del usuario en el sitio web de DemoBlaze. La prueba simula el proceso de compra de dos productos: un teléfono móvil (Samsung galaxy s6) y una laptop (Sony vaio i5).

Herramientas Utilizadas:

Selenium WebDriver
WebDriverWait
ChromeDriver
Java 11
Visual Studio Code

Configuración del Proyecto:

Descarga e instala Java JDK 11 o superior.
Descarga e instala Visual Studio Code.
Descarga el controlador de Chrome WebDriver y colócalo en la ruta ./drivers/chromedriver.exe.
Clona este repositorio en tu máquina local.

Ejecución de la Prueba:

Abre el proyecto en Visual Studio Code.
Asegúrate de tener todas las dependencias necesarias configuradas en tu entorno.
Ejecuta la clase TestE2E.java.
La prueba automatizada navegará por el sitio web de DemoBlaze, agregará productos al carrito, completará el formulario de compra y verificará la confirmación de la compra.

Para ejecutar la prueba desde la línea de comandos, puedes utilizar el siguiente comando:

```bash
java -classpath "ruta/a/lib/*:ruta/a/bin" TestE2E // Reemplaza "ruta/a/lib/*" por la ruta de las dependencias y "ruta/a/bin" por la ruta de las clases compiladas.

Consideraciones Adicionales:

La prueba está diseñada para ejecutarse en un entorno local y podría necesitar ajustes para ejecutarse en otros entornos.
Asegúrate de tener una conexión a Internet estable durante la ejecución de la prueba.
Es posible que necesites ajustar los tiempos de espera en las esperas implícitas y explícitas según la velocidad de carga del sitio web y las características de tu entorno de ejecución.

Contribuciones y Mejoras:

Si deseas contribuir con mejoras o correcciones a esta prueba automatizada, siéntete libre de bifurcar este repositorio y enviar una solicitud de extracción con tus cambios.

Autor:

[Ing. (QA) Pablo Ariel Menardi]

Nota:

Este archivo Readme.txt proporciona una descripción general de la prueba automatizada de E2E y su configuración. Asegúrate de consultar los archivos de código fuente y comentarios en el código para obtener detalles adicionales sobre la implementación de la prueba.