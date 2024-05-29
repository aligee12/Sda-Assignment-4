import java.util.HashMap;
import java.util.Map;

public class SingletonMovieRepository {
    private static SingletonMovieRepository instance;
    private Map<String, Movie> movieMap;

    private SingletonMovieRepository() {
        movieMap = new HashMap<>();
    }

    public static synchronized SingletonMovieRepository getInstance() {
        if (instance == null) {
            instance = new SingletonMovieRepository();
        }
        return instance;
    }

    public void addMovie(Movie movie) {
        if (!movieMap.containsKey(movie.getMovieID())) {
            movieMap.put(movie.getMovieID(), movie);
            System.out.println("Movie added to repository: " + movie.getTitle());
        }
    }

    public void removeMovie(String movieID) {
        if (movieMap.containsKey(movieID)) {
            movieMap.remove(movieID);
            System.out.println("Movie removed from repository: " + movieID);
        }
    }

    public Movie getMovie(String movieID) {
        return movieMap.get(movieID);
    }
}
