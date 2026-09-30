# Modelo de datos

Por ahora existe una sola entidad, **Book**, que representa cualquier obra del catálogo: libro, cómic o manga. Está definida en `src/main/java/mx/equipo7/recomendador/book/Book.java`.

## Campos

| Campo | Tipo | Descripción | Ejemplo |
|---|---|---|---|
| `id` | `Long` | Identificador único | `1` |
| `title` | `String` | Título de la obra | `"Akira"` |
| `author` | `String` | Autor o autora | `"Katsuhiro Otomo"` |
| `genre` | `String` | Género principal | `"Ciencia ficción"` |
| `format` | `String` | Formato de la obra | `"MANGA"` |
| `status` | `String` | Estatus de publicación | `"COMPLETED"` |

## Valores de `format`

| Valor | Se muestra como |
|---|---|
| `BOOK` | Libro |
| `COMIC` | Cómic |
| `MANGA` | Manga |

## Valores de `status`

| Valor | Se muestra como | Significado |
|---|---|---|
| `ONGOING` | En publicación | La obra sigue publicándose |
| `COMPLETED` | Finalizado | La obra terminó |
| `HIATUS` | En pausa | Publicación detenida temporalmente |
| `CANCELLED` | Cancelado | La publicación se canceló |

Estos cuatro valores corresponden a los estatus de publicación del README. Si se agrega uno nuevo hay que actualizarlo en `Book.java`, en la vista (`static/js/app.js`) y en esta página.

## Datos de demostración

| # | Título | Autor | Género | Formato | Estatus |
|---|---|---|---|---|---|
| 1 | El nombre del viento | Patrick Rothfuss | Fantasía | BOOK | ONGOING |
| 2 | Akira | Katsuhiro Otomo | Ciencia ficción | MANGA | COMPLETED |
| 3 | Watchmen | Alan Moore | Superhéroes | COMIC | COMPLETED |
| 4 | Dune | Frank Herbert | Ciencia ficción | BOOK | COMPLETED |
| 5 | Berserk | Kentaro Miura | Fantasía oscura | MANGA | ONGOING |
| 6 | Saga | Brian K. Vaughan | Ciencia ficción | COMIC | HIATUS |
| 7 | La sombra del viento | Carlos Ruiz Zafón | Misterio | BOOK | COMPLETED |
| 8 | Fullmetal Alchemist | Hiromu Arakawa | Acción | MANGA | COMPLETED |

> Estos datos son de prueba y viven en memoria. No hay obras con estatus `CANCELLED` todavía.

## Lo que falta (próximos sprints)

Campos que el README ya contempla pero aún no existen en el modelo: editorial, idioma y disponibilidad en México. También faltan las entidades de **usuario** y **preferencias**, necesarias para el motor de recomendaciones.
