<h1 align="center">Resumen y Organización del Repositorio DDSI-Seminario-2</h1>
<h2 align="center">1-Miembros del grupo</h2>
<h5 align="left">Jose Manuel Aranda Gutiérrez</h5>
<h5 align="left">Gabriel Vico Arboledas</h5>
<h5 align="left">Pablo Gervilla Miranda</h5>
<h5 align="left">Rubén Gázquez Gallardo</h5>
<h5 align="left">Gonzalo Sanz Guerrero</h5>

<h2 align="center">2-Organización del repositorio</h2>
<p>En este apartado os explicaremos la organización del repositorio y de los archivos que podemos encontrar de cada directorio.</p>

<h3 align="center">2.1-scr</h3>
<p>El directorio src está destinado al almacenamiento de todos los códigos utilizados a la hora del desarrollo del WAF. Como podemos observar, a su vez este directorio contiene 3 directorios más. Al directorio App le dedicaremos su propia sección.</p>


<h3 align="left-center">2.2-src/App</h3>
<p>Este directorio es de gran importancia dentro del proyecto ya que en él disponemos del WAF tanto el front end como el back end, el cual se podrá encontrar dentro del directorio src en el directorio app. Además de esto, en este directorio podremos encontrar el Dockerfile encargado de generar el docker que almacenará nuestro WAF y el script (script.sh) que nos permitirá al encender el docker iniciar automáticamente el WAF sin necesidad de nuestra intervención.</p>


<h3 align="center">2.3-.gitignore</h3>
<p>Nuestro .gitignore está configurado con el objetivo de la comodidad de nuestro equipo de cara al desarrollo, ya que es el encargado de que en el github no se almacenen los archivos temporales generados por el WAF, evitando así el almacenamiento de elementos innecesarios y la facilidad a la hora de la comprensión del proyecto y su estructura.</p>


<h3 align="center">2.4-README.md</h3>
<p>Es el fichero que usted está leyendo en este mismo instante, cuya función es la de documentar el repositorio y explicar la correcta instalación y ejecución del proyecto.</p>

<h2 align="left">3-Instalación y preparación de utilidades</h2>
<p>Para el correcto funcionamiento de este proyecto deberemos instalar determinadas herramientas las cuales explicaremos a continuación.</p>

<h3 align="left">3.1-Instalación de git</h3>
<h4 align="left">ubuntu</h4>
<ol>
  <li>sudo apt update</li>
  <li>sudo apt install git</li>
  <li>git --version</li>
</ol>

<h4 align="left">Windows</h4>
<ol>
  <li>https://git-scm.com/download/win</li>
  <li>Instalamos la Versión de Windows que dispongamos</li>
  <li>Ejecutamos el instalador con los valores que deseemos no olvidando de marcar la opción de Git from command line and also from 3ed-party software, ya que si no              deberemos de añadir manualmente la variable de git por medio de modificar las variables de entorno(PATH) manualmente</li>
  <li>Abrimos la power shell y ejecutamos el comando: git --version para comprobar la correcta instalación.</li>
</ol>

<h3 align="left">3.2-Clonación de repositorio de git</h3>
<ol>
  <li>Creamos un directorio donde vayamos a bajar el repositorio y abrimos la powershell en ese directorio</li>
  <li>Ejecutamos el comando: 
	git clone https://github.com/Arzenin/DDSI-Seminario-2</li>
</ol>

<h3 align="left">3.3-Instalación de Docker</h3>

<h4 align="left">Ubuntu</h4>
<ol>
  <li>sudo apt update</li>
  <li>sudo apt install apt-transport-https ca-certificates curl	software-properties-common</li>
  <li>curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg</li>
  <li>echo "deb [arch=amd64 signed-by=/usr/share/keyrings/docker-archive-keyring.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null</li>
  <li>Una vez instaladas estas dependencias de nuevo ejecutaremos:sudo apt update</li>
  <li>sudo apt install docker-ce docker-ce-cli containerd.io</li>
  <li>Comprobamos la correcta instalación con:docker --version</li>
</ol>

<h4 align="left">Windows</h4>
<ol>
  <li>Nos dirigiremos al siguiente enlace y descargamos la versión correspondiente a nuestro sistema: https://www.docker.com/products/docker-desktop/</li>
  <li>Ejecutamos el instalador con los valores por defecto, ya que en esta ocasión se añadirá esta variable automáticamente a PATH</li>
  <li>Reiniciamos el ordenador</li>
  <li>Abrimos la Powershell y ejecutamos docker --version para comprobar la correcta instalación</li>
</ol>

<h3 align="left">3.4-Instalación ZeroTier</h3>
Previo a esto deberemos de crearnos una cuenta en https://www.zerotier.com/

<h4 align="left">Ubuntu</h4>
<ol>
  <li>sudo apt update</li>
  <li>sudo apt install curl</li>
  <li>curl -s https://install.zerotier.com | sudo bash</li>
</ol>

<h4 align="left">Windows</h4>
<ol>
  <li>Nos dirigimos a https://www.zerotier.com/download/ y descargamos el correspondiente ejecutable.</li>
  <li>Ejecutamos el ejecutable y dejamos los valores por defecto.</li>
  <li>Ejecutamos la aplicación</li>
  <li>En el apartado de iconos de la bandeja del sistema(la flecha en la barra de tareas que podemos desplegar). Se encuentra ZeroTier</li>
</ol>

<h3 align="left">3.5-Generar una red virtual en ZeroTier</h3>

<ol>
  <li>Nos dirigimos a https://www.zerotier.com/</li>
  <li>Iniciaremos sesión y tras esto pulsaremos en Create a Network</li>
  <li>Deberemos añadir a los dispositivos a la red, para ello copiamos el network ID</li>
  <li>Añadimos la red:</li>
</ol>

<h4 align="left">Ubuntu</h4>
sudo zerotier-cli join <ID_de_Red>
	
<h4 align="left">Windows</h4>
Click sobre el icono de zeroTier de la barra de tareas (Aplicaciones en segundo plano) y join new network, copiamos el network id en el campo correspondiente.

<h3 align="left">3.6-Instalación del docker de MYSQL2</h3>
<h4 align="left">Cualquier sistema con docker instalado</h4>
<ol>
  <li>Abrimos la terminal</li>
  <li>docker pull mysql</li>
</ol>
	
<h3 align="left">3.7-Instalación del WAF</h3>
<h4 align="left">Ubuntu:</h4>
<ol>
  <li>sudo apt update</li>
  <li>sudo apt install nodejs npm</li>
  <li>node -v</li>
  <li>npm -v</li>
  <li>curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.38.0/install.sh | bash</li>
  <li>source ~/.bashrc</li>
  <li>source ~/.zshrc</li>
  <li>npm install stable</li>
  <li>Verificaremos la instalación por medio de ejecutar node -v y npm -v</li>
</ol>
	
<h4 align="left">Windows</h4>
<ol>
  <li>Nos dirigimos a la web de https://nodejs.org/en y descargamos el instalador</li>
  <li>Verificamos la instalación con los comandos node –version 
y node –version, en caso de que estos fallen se deberá a que no se han añadido correctamente a la variable paths en caso de ser así se deberá de añadir manualmente</li>
  <li>Instalamos expo por medio de npm install -g expo-cli en la terminal</li>
  <li>Nos dirigimos al directorio de /src/app en caso de no tenerlo clonado lo descargamos.</li>
  <li>npm install para asegurar que tenemos todas las dependencias, esto debería de instalar también Mysql2</li>
</ol>


 
<h2 align="left">4-Tutorial de Ejecución</h2>
<h3 align="left">4.1-Introducción</h3>
Antes de empezar queremos detacar que este proyecto tiene tres fromas de ejecutarse y no todas las herramientas descargadas no son necesarias para todas las versiones, únicamente para la versión más completa de estas ejecuciones siendo la tercera del listado que os mencionaremos más adelante, dicho esto cabe destacar que también es la que lleva más pasos para poder realizar. Dicho esto os dejamos un listado de las diferentes ejecuciones del WAP posibles.
<ol>
  <li>WAF en el sistema y BD en docker</li>
  <li>WAF en el sistema y BD en docker con ZeroTier</li>
  <li>WAF en el docker y BD en docker con ZeroTier</li>
</ol>

<h3 align="left">4.2-WAF en el sistema y BD en docker</h3>
<ol>
  <li>Abrimos la terminal y ejecutamos docker run -d --name seminario2 -e MYSQL_ROOT_PASSWORD=sem2 -e MYSQL_DATABASE=seminario2 -p 3306:3306 mysql
</li>
  <li>Deberemos de asegurarnos de tener en el archivo src/App/src/api.js el correcto host para realizar la conexión en este caso sería o bien la ip de nuestro sistema o bien localhost en el apartado host de dbconfig</li>
  <li>En el mismo directorio que el backend (archivo api.js) ejecutaremos: 
node api.js
</li>
  <li>En la raíz del proyecto expo start</li>
  <li>Tras esto abrimos un navegador y en buscador buscaremos localhost:19006, ya que la aplicación se ejecuta en el puerto 19006.</li>
  <li>Reseteamos la base de datos para tenerla generada y ya podríamos acceder a la aplicación</li>
</ol>

<h3 align="left">4.3-WAF en el sistema y BD en docker con ZeroTier</h3>
<ol>
  <li>Iniciamos la aplicación de ZeroTier</li>
  <li>Iniciamos sesión en  https://www.zerotier.com/</li>
  <li>Accedemos a la red que hemos generado y conectado a nuestro dispositivo previamente (Apartado 3.5)</li>
  <li>Nos dirigiremos al apartado Auth? y concederemos el acceso a la ip del dispositivo que se aloje el WAF y del dispositivo sobre el que nos queramos conectar</li>
  <li>Apuntaremos la IP del dispositivo que ejecute el WAF y en el archivo /src/App/src cambiaremos el apartado host de dbconfig la IP que hemos apuntado</li>
  <li>Generamos un docker con la imagen de mysql por medio del comando:
docker run -d --name seminario2 -e MYSQL_ROOT_PASSWORD=sem2 -e MYSQL_DATABASE=seminario2 -p 3306:3306 mysql
</li>
  <li>En el mismo directorio que el backend (archivo api.js) ejecutaremos: 
node api.js
</li>
  <li>En la raíz del proyecto expo start</li>
  <li>Tras esto abrimos un navegador y en buscador buscaremos localhost:19006, ya que la aplicación se ejecuta en el puerto 19006, en caso de ver la base de datos desde otro dispositivo deberemos de utilizar la IP de la máquina en la que se ejecute el WAF.</li>
  <li>Reseteamos la base de datos para tenerla generada y ya podríamos acceder a la aplicación</li>
</ol>

<h3 align="left">4.4-WAF en el docker y BD en docker con ZeroTier</h3>
Este es el tipo de ejecución que consideramos el más completo a la par que el más largo y complejo de ejecutar:
<ol>
  <li>Iniciamos la aplicación de ZeroTier</li>
  <li>Iniciamos sesión en  https://www.zerotier.com/</li>
  <li>Accedemos a la red que hemos generado y conectado a nuestro dispositivo previamente (Apartado 3.5)</li>
  <li>Nos dirigiremos al apartado Auth? y concederemos el acceso a la ip del dispositivo que se aloje el WAF y del dispositivo sobre el que nos queramos conectar</li>
  <li>Apuntaremos la IP del dispositivo que ejecute el WAF y en el archivo /src/App/src cambiaremos el apartado host de dbconfig la IP que hemos apuntado</li>
<li>Abrimos la terminal y ejecutamos docker run -d --name seminario2 -e MYSQL_ROOT_PASSWORD=sem2 -e MYSQL_DATABASE=seminario2 -p 3306:3306 mysql
</li>
  <li>Nos dirigimos a la raíz del proyecto es decir al directorio App</li>
  <li>Ejecutaremos el comando docker build -t ddsi para generar la imagen del docker</li>
  <li>Ejecutamos el comando docker run -p 19006:19006 -p 19000:19000 -p 19001:19001 -p 19002:19002 -p 5050:5050 -p 3000:3000 --name
 App --network mi_red -it ddsi
</li>
  <li>Tras esto abrimos un navegador y en buscador buscaremos localhost:19006, ya que la aplicación se ejecuta en el puerto 19006, en caso de ver la base de datos desde otro dispositivo deberemos de utilizar la IP de la máquina en la que se ejecute el WAF</li>
  <li>Reseteamos la base de datos para tenerla generada y ya podríamos acceder a la aplicación</li>
</ol>
