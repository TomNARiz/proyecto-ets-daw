## Proyecto ETS 1º DAW

![image](https://user-images.githubusercontent.com/90792144/156356475-409f1710-4e57-4978-b672-f7d86c9f2e6e.png)


<h1> Diagrama de Clases </h1>

<h2> Clases </h2>

<p>-Usuario   </br>
-Tienda       </br>
-Eventos      </br>
-Lugares      </br>
-Localizacion </br>
-Horario      </br>
-Resenia      </br>
</p>

<p>
  Usuario:</br>
   &nbsp;&nbsp;&nbsp;&nbsp;-nombre: String</br>
	 &nbsp;&nbsp;&nbsp;&nbsp;-apellido: String</br>
	 &nbsp;&nbsp;&nbsp;&nbsp;-nomUsuario: String</br>
	 &nbsp;&nbsp;&nbsp;&nbsp;-codUsuario: String</br>
	 &nbsp;&nbsp;&nbsp;&nbsp;-listaFav: List</br>
   
  Tienda:</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-nombre: String</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-tipo: String</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-descripcion: String</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-localización: Localización</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-horario: Horario</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-resenia: Resenia</br>
  
  Eventos:</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-lugares: Lugares</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-tienda: Tienda</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-horario: Horario</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-promocion: String</br>

Lugares:</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-nombre: String</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-tipo: String</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-entrada: Double</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-descripcion: String</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-localizacion: Localizacion</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-horario: Horrio</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-resenia: Resenia</br>

Localizacion:</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-direccion: String</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-ciudad: String</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-provincia: String</br>

Horario:</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-apertura: Time</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-cierre: Time</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-diaLaborables: Date</br>

Resenia:</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-resenia: String</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-valoracion: Byte</br>
	&nbsp;&nbsp;&nbsp;&nbsp;-fecha: Date</br>
</p>

<h2>Cardinalidades</h2>

<p>
&nbsp;&nbsp;&nbsp;&nbsp; Usuario-Tienda: Un usuario puede consultar 1 o N tiendas, mientras que cada tienda puede ser consultada por 1 o N usuarios.</br>

&nbsp;&nbsp;&nbsp;&nbsp; Usuario-Evento: Un usuario puede consultar 1 o N eventos, mientras que cada evento puede ser consultado por 1 o N usuarios.</br>

&nbsp;&nbsp;&nbsp;&nbsp; Usuario-Lugares: Un usuario puede consultar 1 o N lugares, mientras que cada lugares puede ser consultado por 1 o N usuarios.</br>

&nbsp;&nbsp;&nbsp;&nbsp; Usuario-Resenia: Un usuario puede no realizar ninguna reseña o hacer varias reseñas. Mientras que una reseña puede ser no realizada o realizada por varios usuarios.</br>

&nbsp;&nbsp;&nbsp;&nbsp; Tienda-Resenia: Una tienda puede realizar 0 o N reseñas, y una tienda puede tener 0 o N reseñas.</br>

&nbsp;&nbsp;&nbsp;&nbsp; Tienda-Localizacion: Una tienda puede tener una o varias localizaciones. Mientras que estas localizaciones (locales) solo pueden pertenecer a una sola tienda.</br>

&nbsp;&nbsp;&nbsp;&nbsp; Tienda-Horario: Una tienda puede tener uno o varios horarios, pero estos horarios solo pertenecen a esta tienda.</br>

&nbsp;&nbsp;&nbsp;&nbsp; Tienda-Evento: Una tienda puede no realizar ningún evento o hacer todos los que quiera, pero estos eventos solo pueden pertenecer a dicha tienda.</br>
	
&nbsp;&nbsp;&nbsp;&nbsp; Evento-Localizacion: Un evento puede tener varias localizaciones, y esas localizaciones pueden tener varios eventos en el mismo lugar.</br>

&nbsp;&nbsp;&nbsp;&nbsp; Evento-Resenia: Un evento puede tener ninguna o varias reseñas.</br>

&nbsp;&nbsp;&nbsp;&nbsp; Evento-Horario: Un evento puede tener uno o varios horarios pero estos horarios solo pertenecen a dicho evento.</br>
</p>

&nbsp;&nbsp;&nbsp;&nbsp; Evento-Lugares: Un evento se puede realizar en un lugar o en varios, pero para hacer estos eventos en esos lugares, los lugares tienen que tener asignado el evento correspondiente.</br>

&nbsp;&nbsp;&nbsp;&nbsp; Lugares-Localización: Cada lugar tiene una sola localización.</br>

&nbsp;&nbsp;&nbsp;&nbsp; Lugares-Horario: Un lugar puede tener varios horarios, pero estos horarios solo pertenecen a este lugar.</br>

&nbsp;&nbsp;&nbsp;&nbsp; Lugares-Resenia: Un lugar puede tener 0 o N reseñas, y se pueden realizar 0 o N reseñas a lugares.</br>

<h1> Diagrama de Casos de Uso </h1>

![image](https://user-images.githubusercontent.com/90792144/156357057-56b2bef3-5d2d-4a94-9328-02f6caa585da.png)

<h2> Actores </h2>

<p>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Admin</br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Centraliza toda la aplicación.</br>
  Características &nbsp;&nbsp;&nbsp;&nbsp; Administra la aplicación.</br>
  Relaciones &nbsp;&nbsp;&nbsp;&nbsp; Usuario.</br>
  Referencias &nbsp;&nbsp;&nbsp;&nbsp; Ver Solicitud, Añadir Tienda, Añadir Lugar, Añadir Evento, Eliminar Lugar, Eliminar Evento, Eliminar Tienda, Hacer Reseña, Modificar Lugar, Modificar Tienda, Modificar Evento.</br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  </br>
  
  <b>Actor &nbsp;&nbsp;&nbsp;&nbsp; Usuario </b> </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; No tiene ningún tipo de poder fuera de solicitar algo al administrador. </br>
  Características &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Relaciones &nbsp;&nbsp;&nbsp;&nbsp; Administrador </br>
  Referencias &nbsp;&nbsp;&nbsp;&nbsp; Ver Tienda, Ver Lugar, Ver Usuario, Ver Evento, Eliminar Reseña, Ver Reseñas, Solicitar adición. </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; Los usuarios deberán identificarse previamente. </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  </p>

<h2> Casos de Uso </h2>
<p>
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Ver Tienda</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Usuario </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Se consulta una tienda </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; Identificarse </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Ver Lugar</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Usuario </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Se consulta un lugar </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; Identificarse </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Ver Usuario</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Usuario </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Ver el perfil de un usuario </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; Identificarse </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Ver Evento</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Usuario </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Consultar un evento </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; Identificarse </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Hacer Reseña</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Usuario, Admin </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Valorizan un evento, usuario, tienda o lugar.
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; El usuario debe identificarse previamente </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Eliminar Reseña</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Usuario </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Elimina una reseña realizada previamente </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; Identificarse </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Ver reseñas</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Usuario </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Consulta reseñas de un evento, usuario, tienda o lugar. </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; Identificarse </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Solicitar Adición </b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Usuario </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Solicita que añadan un lugar, tienda o evento a la aplicación. </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; Identificarse </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Ver solicitud</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Admin </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Mira las solicitudes hechas por los usuarios para añadir una tienda, lugar o evento. </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Añadir Tienda</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Admin </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Añade una tienda a la aplicación</br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Añadir Lugar</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Admin </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Añade un lugar a la aplicación </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Añadir Evento</b> </br>
 Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Admin </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Añade un evento a la aplicación </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Eliminar Lugr</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Admin </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Elimina un lugar de la aplicación</br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Eliminar Evento</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Admin </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Elimina un evento de la aplicación </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Eliminar Tienda</b> </br>
 Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Admin </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Elimina una tienda de la aplicación </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Modificar Lugar</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Admin </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Modifica un lugar de la apicación </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Modificar Evento</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Admin </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Modifica un evento de la aplicación </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
  
  <hr>
  
  
  <b> Casos de Uso &nbsp;&nbsp;&nbsp;&nbsp; Modificar Tienda</b> </br>
  Fuentes &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Actor &nbsp;&nbsp;&nbsp;&nbsp; Admin </br>
  Descripción &nbsp;&nbsp;&nbsp;&nbsp; Modifica una tienda de la aplicación </br>
  Flujo Básico &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Pre-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Post-Condiciones &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Requerimientos &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Notas &nbsp;&nbsp;&nbsp;&nbsp; --- </br>
  Autor &nbsp;&nbsp;&nbsp;&nbsp; Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera </br>
  Fecha &nbsp;&nbsp;&nbsp;&nbsp; 02/03/2022 </br>
