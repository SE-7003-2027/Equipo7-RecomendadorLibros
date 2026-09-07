# Guía de contribución

Esta guía explica cómo trabajamos en este repositorio: cómo reportar issues, cómo nombrar ramas y commits, y cómo abrir y revisar Pull Requests.

## Flujo de trabajo general

1. Toma o crea un issue en el tablero del proyecto.
2. Crea una rama a partir de `main`.
3. Trabaja, haz commits pequeños y descriptivos.
4. Rebasa tu rama con `main`.
5. Abre un PR usando la plantilla y pide revisión.
6. Atiende los comentarios del revisor hasta que aprueben el PR.
7. Mergea a `main`.

## Estrategia de ramas

Nunca trabajamos directamente sobre `main`. Todo el desarrollo va en una rama aparte:

- **Features:** `feature/nombre-de-la-tarea`
- **Bugs:** `bugfix/descripcion-del-bug`
- **Documentación:** `docs/descripcion`

Ejemplos: `feature/filtro-por-estatus-publicacion`, `bugfix/duplicados-en-catalogo`

## Convención de commits

Usamos *Conventional Commits*:

- `feat:` para una funcionalidad nueva
- `fix:` para la corrección de un bug
- `docs:` para actualizaciones de documentación
- `test:` para agregar o modificar pruebas
- `refactor:` para cambios internos que no alteran el comportamiento
- `chore:` para configuración, dependencias y tareas de mantenimiento

Ejemplo: `feat: agregar filtro de recomendaciones por género`

Escribe el mensaje en imperativo y en español, describiendo qué hace el commit, no qué archivos toca.

## Antes de crear un issue

Verifica que no exista ya un issue similar. Si no existe, usa la plantilla que corresponda (bug, feature o documentación).

### Si es un bug

- Describe los pasos para reproducirlo
- Incluye la versión o rama sobre la que estás trabajando
- Indica el comportamiento esperado y el que ocurre en realidad
- Si puedes, agrega capturas de pantalla o el log del error

### Si es un feature o mejora

- Describe tu idea detalladamente
- Explica qué problema resuelve o qué aporta al usuario
- Si puedes, incluye los archivos o módulos que se modificarían
- Si aplica, agrega capturas o bocetos de cómo quedaría el sistema resultante

### Si es documentación

- Cita los archivos con documentación desactualizada
- Explica dónde se necesitan las actualizaciones

## Antes de abrir un PR

Como *requester* (quien abre el PR):

- Ten una rama limpia, con solo los commits necesarios, en un orden que ayude al revisor a entender los cambios
- Revisa que las pruebas pasen (`./mvnw test`) y que la funcionalidad sea correcta antes de abrir el PR
- Agrega pruebas que el revisor pueda replicar
- Rebasa tu rama con `main`
- Enfoca el PR a un solo bug/feature; si hay cambios extra, ponlos en su propio commit (o en otro PR)
- Vincula el issue que resuelve el PR
- Actualiza documentos como el README si es necesario

## Revisión de código

Como revisor:

- Verifica que el sistema funcione tal cual lo describe el requester
- Verifica que las pruebas existentes pasen
- Verifica que la rama esté limpia y rebasada con `main`
- Responde rápido a nuevos cambios para no bloquear al requester
- Si propones un cambio de algoritmo o diseño, indica fuentes, pros y contras, y ejemplifica la idea
- Deja comentarios claros

Todo PR requiere al menos una aprobación antes de mergearse.

### Tipos de revisión

- **Request changes:** el PR no se puede mergear hasta resolver esos cambios (rompe pruebas, rompe el sistema, o no está rebasado con `main`)
- **Comment:** el PR se puede mergear sin resolver los cambios propuestos (typos, estilo de código, documentación menor, ajustes mínimos de UI)


## Decisiones de arquitectura

Los cambios importantes de diseño se documentan como ADR en `docs/adr/`.