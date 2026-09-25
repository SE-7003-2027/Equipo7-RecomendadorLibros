# Roadmap de sprints

El proyecto se desarrolla en **6 sprints**.

| Sprint | Enfoque | Estado |
|---|---|---|
| 1 | README y CONTRIBUTING | ✅ Completado (la wiki quedó pendiente y pasó al Sprint 2) |
| 2 | Proyecto base, API en memoria, vista con skeletons y wiki | 🚧 En curso |
| 3 | Base de datos (PostgreSQL + Spring Data JPA) | 📋 Planificado |
| 4 | Por definir | ⏳ |
| 5 | Por definir | ⏳ |
| 6 | Por definir | ⏳ |

## Sprint 1

- README con descripción, equipo, features y stack
- CONTRIBUTING con flujo de ramas, commits y PRs

## Sprint 2 (actual)

- [x] Inicializar Spring Boot + Maven con Java 21
- [x] Endpoint `GET /api/books` con datos en memoria
- [x] Pruebas de la capa web
- [x] Campo de **estatus de publicación** en el modelo
- [x] Vista web para explorar el catálogo, con skeletons y colores agradables
- [x] Wiki del proyecto

## Sprint 3 (siguiente)

- [ ] Reemplazar la lista en memoria por `BookRepository` + PostgreSQL
- [ ] Convertir `Book` en entidad JPA
- [ ] Pasar `format` y `status` a `enum`

## Backlog general

Tomado de la lista de features del README; se asignará a sprints conforme el equipo los planifique:

- [ ] Perfil de preferencias (autores, géneros, formatos favoritos)
- [ ] Catálogo con disponibilidad en México (editorial, formato, idioma)
- [ ] Motor de recomendaciones a partir de las preferencias
- [ ] Filtrado y organización de resultados por autor, género y estatus **desde el servidor**
- [ ] Búsqueda por título, autor o género **desde el servidor**
- [ ] Seguridad, Docker, Swagger UI y CI
