# API REST para CRUD de Cursos

Este proyecto es una API REST que realiza un CRUD (Crear, Leer, Actualizar, Eliminar) de cursos.

## Configuración

1. Clonar este repositorio en tu máquina local.


## Requisitos

1. Java
2. Maven

## Uso

1. Ejecuta el comando `mvn spring-boot:run` para iniciar la aplicación.
2. Accede a `http://localhost:8080` en tu navegador o utiliza una herramienta como Postman para interactuar con la API.

## Endpoints

- `GET /`: Obtiene todos los cursos.
- `GET /cursos/{codigo}`: Obtiene un curso por su codigo.
- `POST /`: Crea un nuevo curso.
- `PUT /{codigo}/{duracion}`: Actualiza un curso existente.
- `DELETE /{codigo}`: Elimina un curso existente.
