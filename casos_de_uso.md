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
| ------------- | ------------- |
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

