package manager;

import org.apache.commons.lang3.ArrayUtils;
import ru.netology.domain.MovieItem;
import repository.MovieRepository;

    public class MovieManager {
        static final int DEFAULT_FEED_SIZE = 10;
        private final MovieRepository repository;

        public MovieManager(MovieRepository repository) {
            this.repository = repository;
        }

        public void add(MovieItem item) {
            repository.save(item);
        }

        public MovieItem[] get(int number) {
            var items = get();

            if (number > 0) {
                items = ArrayUtils.subarray(items, 0, number);
            }
            return items;
        }

        public MovieItem[] get() {
            var items = ArrayUtils.clone(repository.findAll());

            ArrayUtils.reverse(items);
            items = ArrayUtils.subarray(items, 0, DEFAULT_FEED_SIZE);

            return items;
        }

        public void removeById(int id) {
            repository.removeById(id);
        }
    }


