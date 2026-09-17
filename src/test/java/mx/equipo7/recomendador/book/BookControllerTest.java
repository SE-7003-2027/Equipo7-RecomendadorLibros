package mx.equipo7.recomendador.book;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Pruebas de la capa web del catálogo de obras.
 *
 * <p>Usa {@code @WebMvcTest} para cargar únicamente el contexto web
 * (sin base de datos ni otros beans), manteniendo las pruebas rápidas.
 */
@WebMvcTest(BookController.class)
class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void listAll_debeResponderOk() throws Exception {
        mockMvc.perform(get("/api/books"))
                .andExpect(status().isOk());
    }

    @Test
    void listAll_debeRetornarJson() throws Exception {
        mockMvc.perform(get("/api/books"))
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

    @Test
    void listAll_debeRetornarAlMenosUnElemento() throws Exception {
        mockMvc.perform(get("/api/books"))
                .andExpect(jsonPath("$.length()").value(org.hamcrest.Matchers.greaterThan(0)));
    }

    @Test
    void listAll_primerElementoTieneTitulo() throws Exception {
        mockMvc.perform(get("/api/books"))
                .andExpect(jsonPath("$[0].title").isString())
                .andExpect(jsonPath("$[0].author").isString())
                .andExpect(jsonPath("$[0].genre").isString())
                .andExpect(jsonPath("$[0].format").isString());
    }
}
