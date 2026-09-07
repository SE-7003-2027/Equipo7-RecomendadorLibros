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

🚧 En fase de diseño de requerimientos y definición de arquitectura.

## Equipo

- [Tapia Anrubio Irving Axel] | [425019526]
- [Torres Nava Hazel] | [N. Cuenta]
- [Ortíz Vásquez Gustavo Angel] | [N. Cuenta]
- [Paredes Gónzalez Emiliano Sebastián] | [N. Cuenta]
- [Pineda Cantú Pablo] | [N. Cuenta]

## Features (en desarrollo)

Se van marcando conforme se completan.

- [ ] Perfil de preferencias (autores, géneros, formatos favoritos)
- [ ] Catálogo de obras con disponibilidad en México (editorial, formato, idioma)
- [ ] Motor de recomendaciones a partir de las preferencias seleccionadas
- [ ] Filtrado y organización de resultados por autor, género y estatus de publicación
- [ ] Búsqueda por título, autor o género
- [ ] *(agregar más features conforme se definan)*

## Stack

*Propuesta inicial*

| Capa | Tecnología |
|---|---|
| Backend | Java 21 + Spring Boot 3 (Spring Web, Spring Data JPA, Spring Security) |
| Base de datos | PostgreSQL 16 |
| Frontend | por definir |
| Gestor de dependencias | Maven |
| Pruebas | JUnit 5 + Mockito |
| Contenedores | Docker + Docker Compose |
| Documentación de API | OpenAPI / Swagger UI |
| CI | GitHub Actions |

## Cómo ejecutar el proyecto desde cero

Esta sección hay que mantenerla al corriente conforme agreguemos herramientas, variables de entorno o pasos nuevos.

### Requisitos previos

- Java 21 (JDK)
- Maven 3.9+ (o el wrapper `./mvnw` )
- Docker y Docker Compose (para levantar la base de datos)
- Git

### Pasos

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/SE-7003-2027/[nombre-del-repo].git
   cd [nombre-del-repo]
   ```

2. Configurar las variables de entorno. Copiar el archivo de ejemplo y llenarlo:

   ```bash
   cp .env.example .env
   ```

3. Levantar la base de datos:

   ```bash
   docker compose up -d
   ```

4. Instalar dependencias:

   ```bash
   ./mvnw install
   ```

5. Levantar el proyecto:

   ```bash
   ./mvnw spring-boot:run
   ```

La aplicación queda disponible en `http://localhost:8080`.

### Correr las pruebas

```bash
./mvnw test
```

## Documentación adicional

| Documento | Ubicación |
|---|---|
| Guía de estilo | `docs/guia-de-estilo.md` |
| Decisiones de arquitectura (ADRs) | `docs/adr/` |
| Guía de contribución | `CONTRIBUTING.md` |
