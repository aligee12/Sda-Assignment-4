import java.util.Date;

public class LiveComment {
    private int commentID;
    private int userID;
    private int premiereID;
    private String text;
    private Date commentDateTime;

    public LiveComment(int commentID, int userID, int premiereID, String text, Date commentDateTime) {
        this.commentID = commentID;
        this.userID = userID;
        this.premiereID = premiereID;
        this.text = text;
        this.commentDateTime = commentDateTime;
    }

    public void post() {
        // Post comment implementation
        System.out.println("Comment posted: " + text);
    }

    public void delete() {
        // Delete comment implementation
        System.out.println("Comment deleted: " + text);
    }

    public String getText() {
        return text;
    }
}
