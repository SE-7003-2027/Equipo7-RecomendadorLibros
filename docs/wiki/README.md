# Wiki del proyecto

Esta carpeta contiene las páginas de la wiki. Se versionan aquí para que los cambios pasen por Pull Request; después se publican en la wiki de GitHub.

## Publicar en la wiki de GitHub

GitHub guarda la wiki en un repositorio aparte. Un integrante con permisos de escritura debe:

1. Entrar a la pestaña **Wiki** del repositorio y crear la primera página (cualquier contenido). Esto es necesario una sola vez para que GitHub cree el repositorio de la wiki.
2. Clonar la wiki:

   ```bash
   git clone https://github.com/SE-7003-2027/Equipo7-RecomendadorLibros.wiki.git
   ```

3. Copiar las páginas (todo excepto este `README.md`) y subirlas:

   ```bash
   cp docs/wiki/*.md Equipo7-RecomendadorLibros.wiki/
   rm Equipo7-RecomendadorLibros.wiki/README.md
   cd Equipo7-RecomendadorLibros.wiki
   git add .
   git commit -m "docs: publicar wiki del Sprint 2"
   git push
   ```

## Convenciones

- El nombre del archivo es el título de la página; los guiones se muestran como espacios.
- `Home.md` es la portada, `_Sidebar.md` el menú lateral.
- Los enlaces entre páginas usan el nombre del archivo sin `.md`: `[Arquitectura](Arquitectura)`.
- Al agregar una página, añádela también a `Home.md` y a `_Sidebar.md`.
