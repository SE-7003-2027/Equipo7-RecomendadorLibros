# Arquitectura

## Tecnologías

| Capa | Tecnología | Estado |
|---|---|---|
| Backend | Java 21 + Spring Boot 3.3 (Spring Web) | ✅ Implementado |
| Vista web | HTML + CSS + JavaScript servidos por Spring Boot | ✅ Implementado (Sprint 2) |
| Gestor de dependencias | Maven (wrapper incluido) | ✅ Implementado |
| Pruebas | JUnit 5 + MockMvc (Spring Boot Test) | ✅ Implementado |
| Base de datos | PostgreSQL 16 | 📋 Sprint 3 |
| Persistencia | Spring Data JPA | 📋 Sprint 3 |
| Seguridad | Spring Security | 📋 Planificado |
| Contenedores | Docker + Docker Compose | 📋 Planificado |
| Documentación de API | OpenAPI / Swagger UI | 📋 Planificado |
| CI | GitHub Actions | 📋 Planificado |

## Vista general

```
 Navegador
    │
    │  GET /              →  static/index.html + css + js
    │  GET /api/books     →  JSON
    ▼
 Spring Boot (puerto 8080)
    ├── recursos estáticos  (src/main/resources/static)
    └── BookController      (src/main/java/.../book)
            │
            └── lista en memoria  ──►  (Sprint 3) BookRepository + PostgreSQL
```

La vista **no tiene lógica de negocio**: pide el catálogo a la API y se encarga solo de filtrar y agrupar lo que recibe. Así, cuando cambiemos la lista en memoria por una base de datos, la vista no necesita modificarse.

## Estructura del repositorio

```
├── docs/wiki/                          Páginas de esta wiki
├── src/main/java/mx/equipo7/recomendador/
│   ├── RecomendadorApplication.java    Punto de entrada
│   └── book/
│       ├── Book.java                   Modelo de una obra (record)
│       └── BookController.java         API REST del catálogo
├── src/main/resources/
│   ├── application.properties          Configuración
│   └── static/                         Vista web (index.html, css/, js/)
├── src/test/java/...                   Pruebas
├── pom.xml
├── README.md
└── CONTRIBUTING.md
```

## Decisiones de diseño (Sprint 2)

- **Datos en memoria.** El catálogo está escrito directamente en `BookController`. Es intencional: la base de datos es trabajo del Sprint 3. Hay un solo lugar que reemplazar.
- **`Book` como `record`.** Es inmutable y suficiente mientras no haya persistencia. Con JPA se convertirá en entidad.
- **Vista sin dependencias nuevas.** Usamos archivos estáticos en lugar de un motor de plantillas o un framework de frontend para no complicar el arranque del proyecto. Si en un sprint posterior el frontend crece, se puede reevaluar.
- **Estatus y formato como texto.** `format` y `status` son `String` con valores fijos (ver [Modelo de datos](Modelo-de-datos)). Al llegar a JPA conviene pasarlos a `enum`.

Las decisiones importantes se registrarán como ADR en `docs/adr/` (ver [Flujo de trabajo](Flujo-de-trabajo)).
