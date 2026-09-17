package mx.equipo7.recomendador;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Verifica que el contexto de Spring se carga correctamente.
 *
 * <p>Si esta prueba falla, existe un error de configuración que impide
 * que la aplicación arranque.
 */
@SpringBootTest
class RecomendadorApplicationTests {

    @Test
    void contextLoads() {
        // Si Spring no puede levantar el contexto, esta prueba falla automáticamente.
    }
}
