package repository;

import org.apache.commons.lang3.ArrayUtils;
import ru.netology.domain.MovieItem;

public class MovieRepository {
    private MovieItem[] movies;

    public MovieItem findById(int id) {
        for (MovieItem item : movies) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void removeById(int id) {
        movies = ArrayUtils.removeElement(movies, findById(id));
    }

    public void save(MovieItem item) {
        movies = ArrayUtils.add(movies, item);
    }

    public MovieItem[] findAll() {
        return movies;
    }

    public void removeAll() {
        movies = new MovieItem[0];
    }
}