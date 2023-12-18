<h1 align="center">Resumen y Organización del Repositorio DDSI-Seminario-2</h1>
<h3 align="center">1-Miembros del grupo</h3>
<h5 align="left">Jose Manuel Aranda Gutiérrez</h5>
<h5 align="left">Gabriel Vico Arboledas</h5>
<h5 align="left">Pablo Gervilla Miranda</h5>
<h5 align="left">Rubén Gázquez Gallardo</h5>
<h5 align="left">Gonzalo Sanz Guerrero</h5>
<h3 align="center">2-Organización del repositorio</h3>
En este apartado os explicaremos la organización del repositorio y de los archivos que podemos encontrar de cada directorio
<h3 align="center">2.1-scr</h3>
El directorio src esta destinado al almacenamiento de todos lo códigos utilizados a la hora del desarrollo del WAF, como podemos observar a su vez este directorio contiene 3 directorios más, al directorio App le dedicaremos su propia sección.

Con respecto a los otros 2, estan destinados a la comprobación del correcto funcionamiento de la base de datos en el docker o en el sistema donde queramos ejecutarla, para ello tenemos el directorio Scripts in Mysql el cual contiene un script en sql destinado a la correcta creación de las tablas dentro de la base de datos.Para finalizar el directorio Scripts in Java contiene los escripts necesarios para la correcta conexión de un código externo ejecutado en Java con la base de datos, al igual que en seminario uno, este código se hizo pensando el uso del driver de JDBC, con lo cual será necesario su correcta instalación y direccionamiento de host para su correcto funcionamiento.

<h3 align="left-center">2.2-src/App</h3>
Este directorio es de gran importancia dentro del proyecto ya que en el disponemos del WAF tanto el front end, como el back end, el cual se podrá encontrar dentro del directorio src en el directorio app, además de esto en este directorio podremos encontrar el Dockerfile encargado de generar el docker que almacenara nuestro WAF y el script (script.sh) que nos permitirá al encender el docker inciar automáticamente el WAF sin necesidad de nuestra intervención.

Nuestro motivo para almacenar el Dockerfile dentro del proyecto junto al script dentro de la raíz del proyecto en vez de en un directorio es el hecho de que no existan rutas relativas que puedan evitar el correcto funcionamiento del mismo, facilitando así la instalación y ejecución del proyecto.

<h3 align="center">2.3-.gitignore</h3>
Nuestro .gitignore esta configurado con el objetivo de la comodidad de nuestro equipo de cara al desarrollo, ya que es el encargado de que en el github no se almacenen los archivos temporales generados por el WAF evitando así el almacenamiento de elementos inecesarios y la facilidad a la hora de la comprensión del proyecto y su estructura.

<h3 align="center">2.4-README.md</h3>
Es el fichero que usted esta leyendo en este mismo instante, cuya función es la de documentar el repositorio y explicar la correcta instalación y ejecución del proyecto

<h3 align="center">Instalación de utilidades</h3>
Para el correcto funcionamiento de este proyecto deberemos de instalar determinadas herramientas las cuales explicaremos a continuación
<h3 align="left">Instalación de git</h3>
