import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t++++++++++++++++++++++++++++++++++++");
        System.out.println("\t  Welcome to Filmy Geek Filmy Geek");
        System.out.println("\t++++++++++++++++++++++++++++++++++++\n");
        // Create Admin
        Admin admin = new Admin(1, "Admin1", "admin1@example.com", "password123", true);
        admin.login();

        // Create Viewer
        Viewer viewer = new Viewer(2, "Viewer1", "viewer1@example.com", "password456", false);
        viewer.login();
        viewer.register();

        // Admin adds a Movie
        Movie movie = new Movie("M001", "Inception", "A mind-bending thriller", "Sci-Fi", new Date(), "Christopher Nolan");
        admin.addMovie(movie);

        // Viewer adds Movie to Watchlist
        viewer.addMovieToWatchlist(movie);

        // Viewer logs out and logs in
        viewer.logout();
        viewer.login();

        // Viewer subscribes to a Subscription Plan
        Subscription subscription = new Subscription(1, "Premium", 9.99f, 100);
        subscription.subscribeUser(viewer);

        // Admin schedules a Premiere
        Premiere premiere = new Premiere(1, new Date(), "18:00", 2.5f);
        admin.schedulePremiere(premiere);

        // Viewer adds a Friend
        Viewer friend = new Viewer(3, "Friend1", "friend1@example.com", "password789", false);
        viewer.addFriend(friend);

        // Viewer comments on the Premiere
        LiveComment comment = new LiveComment(1, viewer.getID(), premiere.getPremiereID(), "Excited for this!", new Date());
        comment.post();
        premiere.addComment(comment);

        // Admin removes the Movie
        admin.removeMovie(movie);

        // Viewer downgrades Subscription
        subscription.unsubscribeUser(viewer);

        // Viewer removes Movie from Watchlist
        viewer.removeMovieFromWatchlist(movie);

        // Admin logs out
        admin.login();
    }
}
