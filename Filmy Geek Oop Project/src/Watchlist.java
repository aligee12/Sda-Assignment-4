import java.util.ArrayList;
import java.util.List;
public class Watchlist {
    private int userID;
    private List<Movie> movies = new ArrayList<>();
    private boolean isPublic;

    public Watchlist(int userID, List<Movie> movies, boolean isPublic) {
        this.userID = userID;
        this.movies = movies;
        this.isPublic = isPublic;
    }

    public Watchlist() {
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("Movie " + movie.getTitle() + " added to watchlist.");
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
        System.out.println("Movie " + movie.getTitle() + " removed from watchlist.");
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }
}
