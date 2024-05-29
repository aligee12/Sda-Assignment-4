import java.util.ArrayList;
import java.util.List;
public class Viewer extends Person {
    public boolean subscriptionStatus;
    private List<Friendship> friendList = new ArrayList<>();
    private Watchlist watchlist = new Watchlist();

    public Viewer(int ID, String name, String email, String password, boolean subscriptionStatus) {
        super(ID, name, email, password);
        this.subscriptionStatus = subscriptionStatus;
    }
    @Override
    public void login() {
        System.out.println("Viewer logged in: " + this.name);
    }
    public void register() {
        // Registration implementation
        System.out.println(name + " registered successfully.");
    }

    public void logout() {
        // Logout implementation
        System.out.println(name + " logged out.");
    }

    public void upgradeSubscription() {
        subscriptionStatus = true;
        System.out.println(name + " upgraded subscription.");
    }

    public void downgradeSubscription() {
        subscriptionStatus = false;
        System.out.println(name + " downgraded subscription.");
    }
    public boolean isSubscriptionStatus() { return subscriptionStatus; }
    public void setSubscriptionStatus(boolean subscriptionStatus) { this.subscriptionStatus = subscriptionStatus; }
    public void addMovieToWatchlist(Movie movie) {
        watchlist.addMovie(movie);
        System.out.println("Movie " + movie.getTitle() + " added to watchlist.");
    }

    public void removeMovieFromWatchlist(Movie movie) {
        watchlist.removeMovie(movie);
        System.out.println("Movie " + movie.getTitle() + " removed from watchlist.");
    }

    public void addFriend(Viewer friend) {
        friendList.add(new Friendship(this.ID, friend.ID, true));
        System.out.println(name + " added " + friend.name + " as a friend.");
    }

    public void removeFriend(Viewer friend) {
        friendList.removeIf(f -> f.getUser2ID() == friend.ID);
        System.out.println(name + " removed " + friend.name + " from friends.");
    }
}
