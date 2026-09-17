package mx.equipo7.recomendador.book;

/**
 * Representa una obra del catálogo (libro, cómic o manga).
 *
 * <p>Esta clase es temporal: no tiene persistencia en base de datos todavía.
 * En un sprint posterior se añadirá Spring Data JPA y se mapeará a PostgreSQL.
 *
 * <p>Campos mínimos para el Sprint 2 Demo:
 * <ul>
 *   <li>{@code id}     – identificador único</li>
 *   <li>{@code title}  – título de la obra</li>
 *   <li>{@code author} – nombre del autor o autora</li>
 *   <li>{@code genre}  – género principal (ej. "Fantasía", "Romance", "Shonen")</li>
 *   <li>{@code format} – formato de la obra: BOOK, COMIC, MANGA</li>
 * </ul>
 */
public record Book(
        Long id,
        String title,
        String author,
        String genre,
        String format
) {}
