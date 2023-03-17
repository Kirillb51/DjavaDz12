package ru.netology.domain;

public class MovieItem {

    private final int id;
    private final String title;
    private final Genre genre;

    public MovieItem(int id, String title, Genre genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }
}
