public class Admin extends Person {
    private boolean isActive;

    public Admin(int ID, String name, String email, String password, boolean isActive) {
        super(ID, name, email, password);
        this.isActive = isActive;
    }

    @Override
    public void login() {
        System.out.println("Admin logged in: " + this.name);
    }

    // Use MovieRepository to add a movie
    public void addMovie(Movie movie) {
        SingletonMovieRepository.getInstance().addMovie(movie);
        System.out.println("Movie added: " + movie.getTitle());
    }

    // Use MovieRepository to remove a movie
    public void removeMovie(Movie movie) {
        SingletonMovieRepository.getInstance().removeMovie(movie.getMovieID());
        System.out.println("Movie removed: " + movie.getTitle());
    }

    public void addSubscriptionPlan(Subscription subscription) {
        System.out.println("Subscription plan added: " + subscription.getSubName());
    }

    public void removeSubscriptionPlan(Subscription subscription) {
        System.out.println("Subscription plan removed: " + subscription.getSubName());
    }

    public void schedulePremiere(Premiere premiere) {
        System.out.println("Premiere scheduled: " + premiere.getPremiereID());
    }

    // Getters and setters
    public boolean isActive() { return isActive; }
    public void setActive(boolean isActive) { this.isActive = isActive; }
}
