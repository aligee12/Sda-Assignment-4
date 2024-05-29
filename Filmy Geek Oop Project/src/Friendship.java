public class Friendship {
    private int friendshipID;
    private int user1ID;
    private int user2ID;
    private boolean status;

    public Friendship(int user1ID, int user2ID, boolean status) {
        this.user1ID = user1ID;
        this.user2ID = user2ID;
        this.status = status;
    }

    public Friendship(int friendshipID, int user1ID, int user2ID, boolean status) {
        this.friendshipID = friendshipID;
        this.user1ID = user1ID;
        this.user2ID = user2ID;
        this.status = status;
    }

    public void sendRequest() {
        status = false;
        System.out.println("Friend request sent from " + user1ID + " to " + user2ID);
    }

    public void acceptRequest() {
        status = true;
        System.out.println("Friend request from " + user1ID + " to " + user2ID + " accepted.");
    }

    public void rejectRequest() {
        status = false;
        System.out.println("Friend request from " + user1ID + " to " + user2ID + " rejected.");
    }

    public void removeFriendship() {
        System.out.println("Friendship between " + user1ID + " and " + user2ID + " removed.");
    }

    public int getUser2ID() {
        return user2ID;
    }
}
