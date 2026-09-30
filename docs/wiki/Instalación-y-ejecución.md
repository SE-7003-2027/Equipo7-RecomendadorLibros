# Instalación y ejecución

## Requisitos

- **Java 21** (JDK)
- **Git**

Maven no hace falta instalarlo: el repositorio incluye el *wrapper* (`mvnw`). Docker y PostgreSQL **todavía no son necesarios**, porque los datos viven en memoria.

## Pasos

1. Clona el repositorio:

   ```bash
   git clone https://github.com/SE-7003-2027/Equipo7-RecomendadorLibros.git
   cd Equipo7-RecomendadorLibros
   ```

2. Levanta la aplicación:

   ```bash
   ./mvnw spring-boot:run
   ```

   En Windows con PowerShell o CMD: `.\mvnw.cmd spring-boot:run`

3. Abre en el navegador:

   | URL | Qué encuentras |
   |---|---|
   | <http://localhost:8080> | La [vista web](Vista-web) |
   | <http://localhost:8080/api/books> | El JSON del catálogo ([API REST](API-REST)) |

## Correr las pruebas

```bash
./mvnw test
```

Corre las pruebas antes de abrir un Pull Request (ver [Flujo de trabajo](Flujo-de-trabajo)).

## Problemas frecuentes

| Síntoma | Causa probable | Solución |
|---|---|---|
| `Port 8080 was already in use` | Otro proceso usa el puerto | Cierra ese proceso o cambia `server.port` en `src/main/resources/application.properties` |
| `invalid target release: 21` | El JDK activo es anterior a 21 | Instala JDK 21 y revisa `java -version` |
| La vista muestra "No pudimos cargar el catálogo" | La app no está corriendo o falló al arrancar | Revisa la terminal donde ejecutaste `spring-boot:run` |
