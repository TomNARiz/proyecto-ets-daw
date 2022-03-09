# Proyecto ETS 1º DAW
## Índice
- [Diagrama de Casos de Uso](#id4)
- [Casos de Uso](#id5)
- [Diagrama de Clases](#id1)
- [Clases](#id2)
- [Cardinalidades](#id3)

# Diagrama de Casos de Uso <a name="id4"></a>

![image](https://user-images.githubusercontent.com/90792144/156357057-56b2bef3-5d2d-4a94-9328-02f6caa585da.png)

## Actores


| Actor | Admin |
| ------------- | ------------- |
| Descripción | Centraliza toda la aplicación. |
| Características | Administra la aplicación. |
| Relaciones | Usuario. |
| Referencias | Ver Solicitud, Añadir Tienda, Añadir Lugar, Añadir Evento, Eliminar Lugar, Eliminar Evento, Eliminar Tienda, Hacer Reseña, Modificar Lugar, Modificar Tienda, Modificar Evento. |
| Notas | --- | 
| Autor  | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera |
| Fecha | 02/03/2022 | 
  
  
  
| Actor | Usuario | 
| Descripción | No tiene ningún tipo de poder fuera de solicitar algo al administrador. |
| Características | --- |
| Relaciones | Administrador |
| Referencias| Ver Tienda, Ver Lugar, Ver Usuario, Ver Evento, Eliminar Reseña, Ver Reseñas, Solicitar adición. |
| Notas | Los usuarios deberán identificarse previamente. |
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera |
| Fecha | 02/03/2022 |
  

## Casos de Uso <a name="id5"></a>

| Caso de Uso | Ver Tienda |
| ------------- | ------------- |
| Fuentes | --- | 
| Actor | Usuario |
| Descripción | Se consulta una tienda |
| Flujo Básico | --- |
| Pre-Condiciones | Identificarse |
| Post-Condiciones | --- |
| Requerimientos | --- |
| Notas | --- | 
| Autor Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera 
| Fecha 02/03/2022 
  
___
  
| Caso de Uso |  Ver Lugar |  
| ------------- | ------------- |
|Fuentes | --- |
| Actor | Usuario | 
| Descripción | Se consulta un lugar | 
| Flujo Básico | --- |
| Pre-Condiciones | Identificarse | 
| Post-Condiciones | --- |
| Requerimientos | --- |
| Notas | --- |
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera |
| Fecha | 02/03/2022 |
  
___
  
|Caso de Uso | Ver Usuario | 
| ------------- | ------------- |
| Fuentes | --- | 
| Actor | Usuario | 
| Descripción | Ver el perfil de un usuario |
| Flujo Básico | --- |
| Pre-Condiciones | Identificarse | 
| Post-Condiciones | --- | 
| Requerimientos | --- |
| Notas | --- | 
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera |
| Fecha | 02/03/2022 |
  
___
  
| Caso de Uso | Ver Evento | 
| ------------- | ------------- |
| Fuentes | --- |
| Actor | Usuario | 
| Descripción | Consultar un evento | 
| Flujo Básico | --- |
| Pre-Condiciones | Identificarse | 
| Post-Condiciones | --- |
| Requerimientos | --- | 
| Notas | --- |
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera | 
| Fecha | 02/03/2022 |
  
___
  
| Caso de Uso | Hacer Reseña | 
| ------------- | ------------- |
| Fuentes | --- |
| Actor | Usuario, Admin | 
| Descripción | Valorizan un evento, usuario, tienda o lugar. |
| Flujo Básico | --- |
| Pre-Condiciones | El usuario debe identificarse previamente | 
| Post-Condiciones | --- |
| Requerimientos | --- | 
| Notas | --- |
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera | 
| Fecha | 02/03/2022 |
  
___
  
| Caso de Uso | Eliminar Reseña | 
| ------------- | ------------- |
| Fuentes | --- |
| Actor | Usuario |
| Descripción | Elimina una reseña realizada previamente |
| Flujo Básico | --- |
| Pre-Condiciones | Identificarse | 
| Post-Condiciones | --- |
| Requerimientos | --- |
| Notas | --- |
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera |
| Fecha | 02/03/2022 | 
  
___
  
| Caso de Uso | Ver reseñas |
| ------------- | ------------- |
| Fuentes | --- | 
| Actor | Usuario |
| Descripción | Consulta reseñas de un evento, usuario, tienda o lugar. | 
| Flujo Básico | --- |
| Pre-Condiciones | Identificarse 
| Post-Condiciones | --- |
| Requerimientos | --- | 
| Notas | --- |
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera | 
| Fecha | 02/03/2022 |
  
___
  
| Casos de Uso | Solicitar Adición |
| ------------- | ------------- |
| Fuentes | --- |
| Actor | Usuario | 
| Descripción | Solicita que añadan un lugar, tienda o evento a la aplicación. |
| Flujo Básico | --- |
| Pre-Condiciones | Identificarse | 
| Post-Condiciones | --- |
| Requerimientos | --- | 
| Notas | --- |
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera |  
| Fecha | 02/03/2022 |
  
___
  
| Casos de Uso | Ver solicitud |  
| ------------- | ------------- |
| Fuentes | --- | 
| Actor | Admin | 
| Descripción | Mira las solicitudes hechas por los usuarios para añadir una tienda, lugar o evento. | 
| Flujo Básico | --- | 
| Pre-Condiciones | --- | 
| Post-Condiciones | --- | 
| Requerimientos | --- | 
| Notas | --- | 
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera | 
| Fecha | 02/03/2022 | 
  
___
  
| Casos de Uso | Añadir Tienda | 
| ------------- | ------------- |
| Fuentes | --- |  
| Actor | Admin |  
| Descripción | Añade una tienda a la aplicación | 
| Flujo Básico | --- |  
| Pre-Condiciones | --- | 
| Post-Condiciones | --- | 
| Requerimientos | --- | 
| Notas | --- | 
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera |  
| Fecha | 02/03/2022 | 
  
___
  
| Casos de Uso | Añadir Lugar |  
| ------------- | ------------- |
| Fuentes | --- | 
| Actor | Admin | 
| Descripción | Añade un lugar a la aplicación | 
| Flujo Básico | --- | 
| Pre-Condiciones | --- | 
| Post-Condiciones | --- | 
| Requerimientos | --- | 
| Notas | --- | 
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera |  
| Fecha | 02/03/2022 | 
  
___
  
| Casos de Uso | Añadir Evento | 
| ------------- | ------------- |
| Fuentes | --- | 
| Actor | Admin |  
| Descripción | Añade un evento a la aplicación |  
| Flujo Básico | --- | 
| Pre-Condiciones | --- | 
| Post-Condiciones | --- | 
| Requerimientos | --- | 
| Notas | --- | 
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera | 
| Fecha | 02/03/2022 | 
  
___
  
| Casos de Uso | Eliminar Lugar |  
| ------------- | ------------- |
| Fuentes | --- | 
| Actor | Admin | 
| Descripción | Elimina un lugar de la aplicación | 
| Flujo Básico | --- | 
| Pre-Condiciones | --- | 
| Post-Condiciones | --- | 
| Requerimientos | --- | 
| Notas | --- |  
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera | 
| Fecha | 02/03/2022 |  
  
___
  
| Casos de Uso | Eliminar Evento |  
| ------------- | ------------- |
| Fuentes | --- |  
| Actor | Admin | 
| Descripción | Elimina un evento de la aplicación |  
| Flujo Básico | --- | 
| Pre-Condiciones | --- | 
| Post-Condiciones | --- | 
| Requerimientos | --- | 
| Notas | --- | 
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera | 
| Fecha | 02/03/2022 | 
  
___
  
| Casos de Uso | Eliminar Tienda | 
| ------------- | ------------- |
| Fuentes | --- | 
| Actor | Admin | 
| Descripción | Elimina una tienda de la aplicación | 
| Flujo Básico | --- | 
| Pre-Condiciones | --- |  
| Post-Condiciones | --- | 
| Requerimientos | --- | 
| Notas | --- | 
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera | 
| Fecha | 02/03/2022 | 
  
___
  
| Casos de Uso | Modificar Lugar |  
| ------------- | ------------- |
| Fuentes | --- | 
| Actor | Admin | 
| Descripción | Modifica un lugar de la apicación | 
| Flujo Básico | --- | 
| Pre-Condiciones | --- | 
| Post-Condiciones | --- | 
| Requerimientos | --- | 
| Notas | --- | 
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera | 
| Fecha | 02/03/2022 | 
  
___
  
| Casos de Uso | Modificar Evento |  
| ------------- | ------------- |
| Fuentes | --- | 
| Actor | Admin | 
| Descripción | Modifica un evento de la aplicación |  
| Flujo Básico | --- | 
| Pre-Condiciones | --- | 
| Post-Condiciones | --- | 
| Requerimientos | --- | 
| Notas | --- | 
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera | 
| Fecha | 02/03/2022 | 

___
  
| Casos de Uso | Modificar Tienda | 
| ------------- | ------------- |
| Fuentes | --- | 
| Actor | Admin |  
| Descripción | Modifica una tienda de la aplicación | 
| Flujo Básico | --- | 
| Pre-Condiciones | --- | 
| Post-Condiciones | --- | 
| Requerimientos | --- | 
| Notas | --- | 
| Autor | Tomás Nahuel Antela Rizzo & Victor Manuel Cabrera | 
| Fecha | 02/03/2022 | 

___



# Diagrama de Clases <a name="id1"></a>

![image](https://user-images.githubusercontent.com/90792144/156356475-409f1710-4e57-4978-b672-f7d86c9f2e6e.png)

## Clases <a name="id2"></a>

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

## Cardinalidades <a name="id3"></a>


 ### Usuario-Tienda: 
 Un usuario puede consultar 1 o N tiendas, mientras que cada tienda puede ser consultada por 1 o N usuarios.

 ### Usuario-Evento: 
 Un usuario puede consultar 1 o N eventos, mientras que cada evento puede ser consultado por 1 o N usuarios.

 ### Usuario-Lugares: 
 Un usuario puede consultar 1 o N lugares, mientras que cada lugares puede ser consultado por 1 o N usuarios.

 ### Usuario-Resenia: 
 Un usuario puede no realizar ninguna reseña o hacer varias reseñas. Mientras que una reseña puede ser no realizada o realizada por varios usuarios.

 ### Tienda-Resenia: 
 Una tienda puede realizar 0 o N reseñas, y una tienda puede tener 0 o N reseñas.

 ### Tienda-Localizacion: 
 Una tienda puede tener una o varias localizaciones. Mientras que estas localizaciones (locales) solo pueden pertenecer a una sola tienda.

 ### Tienda-Horario: 
 Una tienda puede tener uno o varios horarios, pero estos horarios solo pertenecen a esta tienda.

 ### Tienda-Evento: 
 Una tienda puede no realizar ningún evento o hacer todos los que quiera, pero estos eventos solo pueden pertenecer a dicha tienda.
	
 ### Evento-Localizacion: 
 Un evento puede tener varias localizaciones, y esas localizaciones pueden tener varios eventos en el mismo lugar.

 ### Evento-Resenia: 
 Un evento puede tener ninguna o varias reseñas.

### Evento-Horario: 
 Un evento puede tener uno o varios horarios pero estos horarios solo pertenecen a dicho evento.


###  Evento-Lugares: 
Un evento se puede realizar en un lugar o en varios, pero para hacer estos eventos en esos lugares, los lugares tienen que tener asignado el evento correspondiente.

### Lugares-Localización: 
 Cada lugar tiene una sola localización.

### Lugares-Horario: 
Un lugar puede tener varios horarios, pero estos horarios solo pertenecen a este lugar.

###  Lugares-Resenia: 
Un lugar puede tener 0 o N reseñas, y se pueden realizar 0 o N reseñas a lugares.
