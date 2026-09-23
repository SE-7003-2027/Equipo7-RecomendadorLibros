package mx.equipo7.recomendador.book;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
     * Devuelve el catálogo, permitiendo filtrar opcionalmente por autor o género.
     */
    @GetMapping
    public List<Book> listAll(
            @RequestParam(required = false) String author,
            @RequestParam(required = false) String genre) {
        
        return catalog.stream()
                .filter(b -> author == null || b.author().equalsIgnoreCase(author))
                .filter(b -> genre == null || b.genre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    /**
     * Devuelve una obra específica por su ID.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable Long id) {
        return catalog.stream()
                .filter(b -> b.id().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
