# API REST

URL base en local: `http://localhost:8080`

## Endpoints

| Método | Ruta | Descripción |
|---|---|---|
| GET | `/api/books` | Lista el catálogo completo de obras |

## GET /api/books

Devuelve todas las obras. Por ahora no acepta filtros ni paginación: el filtrado y la agrupación se hacen en la [vista web](Vista-web).

**Respuesta** — `200 OK`, `application/json`

```json
[
  {
    "id": 2,
    "title": "Akira",
    "author": "Katsuhiro Otomo",
    "genre": "Ciencia ficción",
    "format": "MANGA",
    "status": "COMPLETED"
  }
]
```

Los valores posibles de `format` y `status` están en [Modelo de datos](Modelo-de-datos).

**Probarlo:**

```bash
curl http://localhost:8080/api/books
```

## Pendiente

- Filtros por autor, género y estatus en el servidor
- Endpoint de recomendaciones a partir de preferencias
- Documentación interactiva con OpenAPI / Swagger UI
