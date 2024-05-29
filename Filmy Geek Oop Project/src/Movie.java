import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie implements Watchable {
    private String movieID;
    private String title;
    private String description;
    private String genre;
    private Date releaseDate;
    private String director;
    private List<String> actors;
    private List<LiveComment> comments;

    public Movie(String movieID, String title, String description, String genre, Date releaseDate, String director) {
        this.movieID = movieID;
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        this.actors = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    @Override
    public void play() {
        System.out.println("Playing movie: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Pausing movie: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopping movie: " + title);
    }

    public void getDetails() {
        System.out.println("Movie details: " + title + ", directed by " + director);
    }

    public void addComment(LiveComment comment) {
        comments.add(comment);
    }

    public void removeComment(LiveComment comment) {
        comments.remove(comment);
    }

    // Getters and setters
    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getActors() {
        return actors;
    }
}

