import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Premiere implements Watchable {
    private int premiereID;
    private Date pDate;
    private String pTime;
    private float duration;
    private List<LiveComment> liveComments;

    public Premiere(int premiereID, Date pDate, String pTime, float duration) {
        this.premiereID = premiereID;
        this.pDate = pDate;
        this.pTime = pTime;
        this.duration = duration;
        this.liveComments = new ArrayList<>();
    }

    @Override
    public void play() {
        System.out.println("Playing premiere: " + premiereID);
    }

    @Override
    public void pause() {
        System.out.println("Pausing premiere: " + premiereID);
    }

    @Override
    public void stop() {
        System.out.println("Stopping premiere: " + premiereID);
    }
    public void addComment(LiveComment comment) {
        liveComments.add(comment);
        System.out.println("Comment added to premiere: " + comment.getText());
    }

    public void createPremiere() {
        System.out.println("Premiere created: " + premiereID);
    }

    public void cancelPremiere() {
        System.out.println("Premiere canceled: " + premiereID);
    }

    public void updatePremiereDetails() {
        System.out.println("Premiere details updated: " + premiereID);
    }

    public void getPremiereDetails() {
        System.out.println("Premiere details for: " + premiereID);
    }

    // Getters and setters
    public int getPremiereID() { return premiereID; }
    public void setLiveComments(List<LiveComment> liveComments) { this.liveComments = liveComments; }
}
