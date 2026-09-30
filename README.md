# 📚 Recomendador de Libros, Cómics y Manga

Sistema de recomendación de lecturas disponibles en México, basado en las preferencias del usuario.

**Equipo 7**

Repositorio: [https://github.com/SE-7003-2027/Equipo7-RecomendadorLibros](https://github.com/SE-7003-2027/Equipo7-RecomendadorLibros)

[Qué es esto](#qué-es-este-proyecto) · [Equipo 7](#equipo) · [Features](#features-en-desarrollo) · [Stack](#stack) · [Cómo ejecutarlo](#cómo-ejecutar-el-proyecto-desde-cero) · [Docs](#documentación-adicional)

---

## Qué es este proyecto

Una aplicación que recomienda libros, cómics y manga **disponibles en México** a partir de las preferencias de cada usuario. El usuario selecciona sus gustos (autores, géneros) y el sistema le devuelve recomendaciones organizadas por:

- **Autor**
- **Género**
- **Estatus de publicación** (en publicación, finalizado, en pausa, cancelado)

El proyecto apenas está arrancando, así que la mayoría de los features de abajo siguen en desarrollo. Este README se va a ir actualizando conforme avancemos, para que siempre refleje el estado real del proyecto.

## Estado del proyecto

Para este avance inicial del Sprint 2, inicializamos el proyecto usando Spring Boot y Maven, configurados con Java 21.

Hasta ahora armamos una API REST mínima. Por el momento solo existe el endpoint `GET /api/books`. Como todavía no conectamos la base de datos, los libros están guardados directamente en memoria como datos de prueba. Cada obra incluye formato y estatus de publicación.

También agregamos una **vista web** en `http://localhost:8080` para explorar el catálogo: filtros por formato y estatus, búsqueda, agrupación por autor, género o estatus, y skeletons de carga. La documentación del proyecto está en la carpeta [`docs/wiki`](docs/wiki/Home.md).

Hicimos algunas pruebas básicas para asegurarnos de que la aplicación levanta bien, que el endpoint responde correctamente y que la vista se sirve. Todavía nos falta agregar varias partes importantes del sistema, como el motor de recomendaciones real y la capa de persistencia (Sprint 3).

## Equipo

- Axel Tapia 
- Hazel Torres
- Gustavo Ortíz
- Emiliano Paredes
- Pablo Pineda

## Features (en desarrollo)

Se van marcando conforme se completan.

- [ ] Perfil de preferencias (autores, géneros, formatos favoritos)
- [ ] Catálogo de obras con disponibilidad en México (editorial, formato, idioma)
- [ ] Motor de recomendaciones a partir de las preferencias seleccionadas
- [ ] Filtrado y organización de resultados por autor, género y estatus de publicación
- [ ] Búsqueda por título, autor o género
- [ ] *(agregar más features conforme se definan)*

## Stack

| Capa | Tecnología | Estado |
|---|---|---|
| Backend | Java 21 + Spring Boot 3 (Spring Web) | ✅ Implementado |
| Base de datos | PostgreSQL 16 | 📋 Planificado |
| Persistencia | Spring Data JPA | 📋 Planificado |
| Seguridad | Spring Security | 📋 Planificado |
| Frontend | HTML + CSS + JavaScript servidos por Spring Boot (vista básica) | ✅ Implementado (Sprint 2) |
| Gestor de dependencias | Maven | ✅ Implementado |
| Pruebas | JUnit 5 + Mockito | ✅ Implementado |
| Contenedores | Docker + Docker Compose | 📋 Planificado |
| Documentación de API | OpenAPI / Swagger UI | 📋 Planificado |
| CI | GitHub Actions | 📋 Planificado |

## Cómo ejecutar el proyecto desde cero

Esta sección refleja únicamente lo que está implementado. Se actualizará conforme agreguemos base de datos, Docker y otras herramientas.

### Requisitos previos

- Java 21 (JDK)
- Git

> Docker y PostgreSQL **no son necesarios todavía**. Por ahora la aplicación usa datos en memoria.

### Pasos

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/SE-7003-2027/Equipo7-RecomendadorLibros.git
   cd Equipo7-RecomendadorLibros
   ```

2. Levantar la aplicación:

   ```bash
   ./mvnw spring-boot:run
   ```

La aplicación queda disponible en `http://localhost:8080`, donde se abre la vista web del catálogo.

### Endpoints disponibles

| Método | Ruta | Descripción |
|---|---|---|
| GET | `/api/books` | Lista el catálogo completo de obras |

### Correr las pruebas

```bash
./mvnw test
```

## Documentación adicional

| Documento | Ubicación | Estado |
|---|---|---|
| Guía de contribución | `CONTRIBUTING.md` | ✅ Disponible |
| Wiki del proyecto | [`docs/wiki/`](docs/wiki/Home.md) | ✅ Disponible |
| Guía de estilo | `docs/guia-de-estilo.md` | 📋 Pendiente |
| Decisiones de arquitectura (ADRs) | `docs/adr/` | 📋 Pendiente |
