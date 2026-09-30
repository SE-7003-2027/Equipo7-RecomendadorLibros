# Flujo de trabajo

Resumen de cómo trabajamos. La guía completa está en [`CONTRIBUTING.md`](https://github.com/SE-7003-2027/Equipo7-RecomendadorLibros/blob/main/CONTRIBUTING.md); si algo difiere, manda ese archivo.

## Pasos

1. Toma o crea un issue.
2. Crea una rama a partir de `main` (nunca se trabaja directo en `main`).
3. Haz commits pequeños y descriptivos.
4. Rebasa tu rama con `main`.
5. Abre un PR con la plantilla y pide revisión.
6. Atiende los comentarios hasta que lo aprueben.
7. Mergea a `main`.

## Ramas

| Tipo | Formato | Ejemplo |
|---|---|---|
| Feature | `feature/nombre-de-la-tarea` | `feature/filtro-por-estatus-publicacion` |
| Bug | `bugfix/descripcion-del-bug` | `bugfix/duplicados-en-catalogo` |
| Documentación | `docs/descripcion` | `docs/wiki-inicial` |

## Commits (Conventional Commits, en español e imperativo)

| Prefijo | Uso |
|---|---|
| `feat:` | Funcionalidad nueva |
| `fix:` | Corrección de un bug |
| `docs:` | Documentación |
| `test:` | Pruebas |
| `refactor:` | Cambio interno sin alterar comportamiento |
| `chore:` | Configuración, dependencias, mantenimiento |

Ejemplo: `feat: agregar filtro de recomendaciones por género`

## Antes de abrir un PR

- `./mvnw test` pasa.
- La rama está limpia y rebasada con `main`.
- El PR se enfoca en un solo bug o feature y vincula su issue.
- README y wiki actualizados si el cambio lo requiere.

## Revisión

- Todo PR necesita **al menos una aprobación**.
- **Request changes:** rompe pruebas o el sistema, o no está rebasado con `main`.
- **Comment:** typos, estilo, documentación menor o ajustes mínimos de UI; se puede mergear sin resolverlos.

## Cómo actualizar esta wiki

Las páginas viven en `docs/wiki/` dentro del repositorio, así que los cambios pasan por Pull Request como cualquier otro. Usa una rama `docs/...`. Después de mergear, se copian a la wiki de GitHub (ver `docs/wiki/README.md`).
