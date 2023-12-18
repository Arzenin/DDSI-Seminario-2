<h1 align="center">Resumen y Organización del Repositorio DDSI-Seminario-2</h1>
<h3 align="center">1-Miembros del grupo</h3>
<h5 align="left">Jose Manuel Aranda Gutiérrez</h5>
<h5 align="left">Gabriel Vico Arboledas</h5>
<h5 align="left">Pablo Gervilla Miranda</h5>
<h5 align="left">Rubén Gázquez Gallardo</h5>
<h5 align="left">Gonzalo Sanz Guerrero</h5>

<h3 align="center">2-Organización del repositorio</h3>
<p>En este apartado os explicaremos la organización del repositorio y de los archivos que podemos encontrar de cada directorio.</p>

<h3 align="center">2.1-scr</h3>
<p>El directorio src está destinado al almacenamiento de todos los códigos utilizados a la hora del desarrollo del WAF. Como podemos observar, a su vez este directorio contiene 3 directorios más. Al directorio App le dedicaremos su propia sección.</p>


<h3 align="left-center">2.2-src/App</h3>
<p>Este directorio es de gran importancia dentro del proyecto ya que en él disponemos del WAF tanto el front end como el back end, el cual se podrá encontrar dentro del directorio src en el directorio app. Además de esto, en este directorio podremos encontrar el Dockerfile encargado de generar el docker que almacenará nuestro WAF y el script (script.sh) que nos permitirá al encender el docker iniciar automáticamente el WAF sin necesidad de nuestra intervención.</p>


<h3 align="center">2.3-.gitignore</h3>
<p>Nuestro .gitignore está configurado con el objetivo de la comodidad de nuestro equipo de cara al desarrollo, ya que es el encargado de que en el github no se almacenen los archivos temporales generados por el WAF, evitando así el almacenamiento de elementos innecesarios y la facilidad a la hora de la comprensión del proyecto y su estructura.</p>


<h3 align="center">2.4-README.md</h3>
<p>Es el fichero que usted está leyendo en este mismo instante, cuya función es la de documentar el repositorio y explicar la correcta instalación y ejecución del proyecto.</p>


<h3 align="center">Instalación de utilidades</h3>
<p>Para el correcto funcionamiento de este proyecto deberemos instalar determinadas herramientas las cuales explicaremos a continuación.</p>

<h3 align="left">Instalación de git</h3>
<h4 align="left">ubuntu</h4>
<ol>
  <li>sudo apt update</li>
  <li>sudo apt install git</li>
  <li>git --version</li>
</ol>

<h4 align="left">Windows</h4>
<ol>
  <li></li>
  <li></li>
  <li></li>
</ol>


<h4 align="left">Windows</h4>
<ol>
  <li>https://git-scm.com/download/win</li>
  <li>Instalamos la Versión de Windows que dispongamos</li>
  <li>Ejecutamos el instalador con los valores que deseemos no olvidando de marcar la opción de Git from command line and also from 3ed-party software, ya que si no              deberemos de añadir manualmente la variable de git por medio de modificar las variables de entorno(PATH) manualmente</li>
</ol>
