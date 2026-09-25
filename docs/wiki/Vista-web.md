# Vista web

Una interfaz sencilla para explorar el catálogo. Se abre en <http://localhost:8080> cuando la aplicación está corriendo (ver [Instalación y ejecución](Instalación-y-ejecución)).

No es la interfaz final: su objetivo en el Sprint 2 es que el equipo pueda **ver los datos de prueba** de forma clara.

## Qué se puede hacer

| Control | Función |
|---|---|
| **Buscar** | Filtra por título, autor o género. Ignora mayúsculas y acentos |
| **Formato** | Muestra todos, o solo libros, cómics o manga |
| **Estatus** | Filtra por estatus de publicación |
| **Agrupar por** | Organiza las tarjetas por género (por defecto), autor, estatus, o sin agrupar |

Cada tarjeta muestra título, autor, género y dos etiquetas de color: formato y estatus. El borde superior de la tarjeta también cambia según el formato.

## Skeletons de carga

Mientras el catálogo se descarga, la vista muestra tarjetas "fantasma" con un efecto de brillo en lugar de una pantalla en blanco. Cuando llegan los datos se reemplazan por las tarjetas reales.

Con datos en memoria la respuesta es casi instantánea, así que la vista mantiene los skeletons **al menos 600 ms** (`MIN_SKELETON_MS` en `static/js/app.js`) para que se alcancen a ver. Cuando conectemos la base de datos ese valor se puede bajar o eliminar.

Si el usuario tiene activada la opción de *reducir movimiento* en su sistema, el brillo animado se desactiva.

## Otros estados

- **Sin resultados:** aparece un mensaje cuando los filtros no coinciden con ninguna obra.
- **Error:** si la API no responde, se muestra un mensaje con un botón **Reintentar**.

## Diseño

- Paleta cálida (crema, verde azulado y coral), con **modo oscuro automático** según la configuración del sistema.
- Adaptable a celular, tablet y escritorio.
- Colores por formato — Libro: verde azulado · Cómic: naranja · Manga: violeta.
- Colores por estatus — En publicación: verde · Finalizado: azul · En pausa: ámbar · Cancelado: rojo.
- Los colores están definidos como variables CSS al inicio de `static/css/styles.css`, así que cambiar la paleta es editar un solo bloque.

## Archivos

```
src/main/resources/static/
├── index.html      Estructura de la página
├── css/styles.css  Estilos, paleta y skeletons
└── js/app.js       Carga de datos, filtros, agrupación y render
```

Los datos se insertan en la página con `textContent`, no con `innerHTML`, para evitar inyección de HTML cuando el catálogo venga de una base de datos.

## Limitaciones actuales

- El filtrado y la agrupación se hacen en el navegador sobre el catálogo completo. Con pocas obras funciona bien; con un catálogo grande habrá que moverlo al servidor.
- No hay perfil de usuario ni recomendaciones personalizadas todavía: la vista solo muestra el catálogo.
