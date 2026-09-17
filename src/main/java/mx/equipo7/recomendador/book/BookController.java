package mx.equipo7.recomendador.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controlador REST para el catálogo de obras.
 *
 * <p><b>Estado actual (Sprint 2 Demo):</b> los datos están en memoria.
 * En un sprint posterior se reemplazará la lista hardcodeada por un repositorio
 * JPA conectado a PostgreSQL.
 */
@RestController
@RequestMapping("/api/books")
public class BookController {

    // TODO (Sprint 3): reemplazar por BookRepository inyectado via constructor
    private final List<Book> catalog = List.of(
            new Book(1L, "El nombre del viento",      "Patrick Rothfuss",  "Fantasía",  "BOOK"),
            new Book(2L, "Akira",                      "Katsuhiro Otomo",   "Ciencia ficción", "MANGA"),
            new Book(3L, "Watchmen",                   "Alan Moore",        "Superhéroes", "COMIC"),
            new Book(4L, "Dune",                       "Frank Herbert",     "Ciencia ficción", "BOOK"),
            new Book(5L, "Berserk",                    "Kentaro Miura",     "Fantasía oscura",  "MANGA"),
            new Book(6L, "Saga",                       "Brian K. Vaughan",  "Ciencia ficción", "COMIC"),
            new Book(7L, "La sombra del viento",       "Carlos Ruiz Zafón", "Misterio",  "BOOK"),
            new Book(8L, "Fullmetal Alchemist",        "Hiromu Arakawa",    "Acción",    "MANGA")
    );

    /**
     * Devuelve el catálogo completo de obras.
     *
     * @return lista de todas las obras disponibles
     */
    @GetMapping
    public List<Book> listAll() {
        return catalog;
    }
}
