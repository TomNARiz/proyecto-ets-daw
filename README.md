# Proyecto ETS 1º DAW

![image](https://user-images.githubusercontent.com/90792144/156356475-409f1710-4e57-4978-b672-f7d86c9f2e6e.png)

# Diagrama de Clases

## Clases

- Usuario  
- Tienda 
- Eventos   
- Lugares   
- Localizacion 
- Horario      
- Resenia      



### Usuario:
-	nombre: String
- 	apellido: String
-	nomUsuario: String
-	codUsuario: String
-	listaFav: List
   
### Tienda:
-	nombre: String
-	tipo: String
-	descripcion: String
-	localización: Localización
-	horario: Horario
-	resenia: Resenia
  
### Eventos:
-	lugares: Lugares
-	tienda: Tienda
-	horario: Horario
-	promocion: String

### Lugares:
-	nombre: String
-	tipo: String
-	entrada: Double
-	descripcion: String
-	localizacion: Localizacion
-	horario: Horrio
-	resenia: Resenia

### Localizacion:
-	direccion: String
-	ciudad: String
-	provincia: String

### Horario:
-	apertura: Time
-	cierre: Time
-	diaLaborables: Date
### Resenia:
-	resenia: String
-	valoracion: Byte
-	fecha: Date

## Cardinalidades


 Usuario-Tienda: Un usuario puede consultar 1 o N tiendas, mientras que cada tienda puede ser consultada por 1 o N usuarios.

 Usuario-Evento: Un usuario puede consultar 1 o N eventos, mientras que cada evento puede ser consultado por 1 o N usuarios.

 Usuario-Lugares: Un usuario puede consultar 1 o N lugares, mientras que cada lugares puede ser consultado por 1 o N usuarios.

 Usuario-Resenia: Un usuario puede no realizar ninguna reseña o hacer varias reseñas. Mientras que una reseña puede ser no realizada o realizada por varios usuarios.

 Tienda-Resenia: Una tienda puede realizar 0 o N reseñas, y una tienda puede tener 0 o N reseñas.

 Tienda-Localizacion: Una tienda puede tener una o varias localizaciones. Mientras que estas localizaciones (locales) solo pueden pertenecer a una sola tienda.

 Tienda-Horario: Una tienda puede tener uno o varios horarios, pero estos horarios solo pertenecen a esta tienda.

 Tienda-Evento: Una tienda puede no realizar ningún evento o hacer todos los que quiera, pero estos eventos solo pueden pertenecer a dicha tienda.
	
 Evento-Localizacion: Un evento puede tener varias localizaciones, y esas localizaciones pueden tener varios eventos en el mismo lugar.

 Evento-Resenia: Un evento puede tener ninguna o varias reseñas.

 Evento-Horario: Un evento puede tener uno o varios horarios pero estos horarios solo pertenecen a dicho evento.


 Evento-Lugares: Un evento se puede realizar en un lugar o en varios, pero para hacer estos eventos en esos lugares, los lugares tienen que tener asignado el evento correspondiente.

 Lugares-Localización: Cada lugar tiene una sola localización.

 Lugares-Horario: Un lugar puede tener varios horarios, pero estos horarios solo pertenecen a este lugar.

 Lugares-Resenia: Un lugar puede tener 0 o N reseñas, y se pueden realizar 0 o N reseñas a lugares.

# Diagrama de Casos de UsO

![image](https://user-images.githubusercontent.com/90792144/156357057-56b2bef3-5d2d-4a94-9328-02f6caa585da.png)
## Actores


|  Actor| Admin|
  Descripción Centraliza toda la aplicación.
  Características Administra la aplicación.
  Relaciones Usuario.
  Referencias Ver Solicitud, Añadir Tienda, Añadir Lugar, Añadir Evento, Eliminar Lugar, Eliminar Evento, Eliminar Tienda, Hacer Reseña, Modificar Lugar, Modificar Tienda, Modificar Evento.
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  <b>Actor Usuario </b> 
  Descripción No tiene ningún tipo de poder fuera de solicitar algo al administrador. 
  Características --- 
  Relaciones Administrador 
  Referencias Ver Tienda, Ver Lugar, Ver Usuario, Ver Evento, Eliminar Reseña, Ver Reseñas, Solicitar adición. 
  Notas Los usuarios deberán identificarse previamente. 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  

<h2> Casos de Uso </h2>

  <b> Casos de Uso Ver Tienda</b> 
  Fuentes --- 
  Actor Usuario 
  Descripción Se consulta una tienda 
  Flujo Básico --- 
  Pre-Condiciones Identificarse 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  <b> Casos de Uso Ver Lugar</b> 
  Fuentes --- 
  Actor Usuario 
  Descripción Se consulta un lugar 
  Flujo Básico --- 
  Pre-Condiciones Identificarse 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Ver Usuario</b> 
  Fuentes --- 
  Actor Usuario 
  Descripción Ver el perfil de un usuario 
  Flujo Básico --- 
  Pre-Condiciones Identificarse 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Ver Evento</b> 
  Fuentes --- 
  Actor Usuario 
  Descripción Consultar un evento 
  Flujo Básico --- 
  Pre-Condiciones Identificarse 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Hacer Reseña</b> 
  Fuentes --- 
  Actor Usuario, Admin 
  Descripción Valorizan un evento, usuario, tienda o lugar.
  Flujo Básico --- 
  Pre-Condiciones El usuario debe identificarse previamente 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Eliminar Reseña</b> 
  Fuentes --- 
  Actor Usuario 
  Descripción Elimina una reseña realizada previamente 
  Flujo Básico --- 
  Pre-Condiciones Identificarse 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Ver reseñas</b> 
  Fuentes --- 
  Actor Usuario 
  Descripción Consulta reseñas de un evento, usuario, tienda o lugar. 
  Flujo Básico --- 
  Pre-Condiciones Identificarse 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Solicitar Adición </b> 
  Fuentes --- 
  Actor Usuario 
  Descripción Solicita que añadan un lugar, tienda o evento a la aplicación. 
  Flujo Básico --- 
  Pre-Condiciones Identificarse 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Ver solicitud</b> 
  Fuentes --- 
  Actor Admin 
  Descripción Mira las solicitudes hechas por los usuarios para añadir una tienda, lugar o evento. 
  Flujo Básico --- 
  Pre-Condiciones --- 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Añadir Tienda</b> 
  Fuentes --- 
  Actor Admin 
  Descripción Añade una tienda a la aplicación
  Flujo Básico --- 
  Pre-Condiciones --- 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Añadir Lugar</b> 
  Fuentes --- 
  Actor Admin 
  Descripción Añade un lugar a la aplicación 
  Flujo Básico --- 
  Pre-Condiciones --- 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Añadir Evento</b> 
 Fuentes --- 
  Actor Admin 
  Descripción Añade un evento a la aplicación 
  Flujo Básico --- 
  Pre-Condiciones --- 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Eliminar Lugr</b> 
  Fuentes --- 
  Actor Admin 
  Descripción Elimina un lugar de la aplicación
  Flujo Básico --- 
  Pre-Condiciones --- 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Eliminar Evento</b> 
  Fuentes --- 
  Actor Admin 
  Descripción Elimina un evento de la aplicación 
  Flujo Básico --- 
  Pre-Condiciones --- 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Eliminar Tienda</b> 
 Fuentes --- 
  Actor Admin 
  Descripción Elimina una tienda de la aplicación 
  Flujo Básico --- 
  Pre-Condiciones --- 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Modificar Lugar</b> 
  Fuentes --- 
  Actor Admin 
  Descripción Modifica un lugar de la apicación 
  Flujo Básico --- 
  Pre-Condiciones --- 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Modificar Evento</b> 
  Fuentes --- 
  Actor Admin 
  Descripción Modifica un evento de la aplicación 
  Flujo Básico --- 
  Pre-Condiciones --- 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
  
  
  
  
  <b> Casos de Uso Modificar Tienda</b> 
  Fuentes --- 
  Actor Admin 
  Descripción Modifica una tienda de la aplicación 
  Flujo Básico --- 
  Pre-Condiciones --- 
  Post-Condiciones --- 
  Requerimientos --- 
  Notas --- 
  Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
  Fecha 02/03/2022 
