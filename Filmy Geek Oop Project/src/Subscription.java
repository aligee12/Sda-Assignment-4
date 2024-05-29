public class Subscription {
    private int subID;
    private String subName;
    private float price;
    private int maxFans;

    public Subscription(int subID, String subName, float price, int maxFans) {
        this.subID = subID;
        this.subName = subName;
        this.price = price;
        this.maxFans = maxFans;
    }

    public void subscribeUser(Viewer user) {
        if (!user.isSubscriptionStatus()) {
            user.upgradeSubscription();
            System.out.println("User subscribed: " + user.getName());
        }
    }

    public void unsubscribeUser(Viewer user) {
        if (user.isSubscriptionStatus()) {
            user.downgradeSubscription();
            System.out.println("User unsubscribed: " + user.getName());
        }
    }

    public void getSubscriptionStatus(Viewer user) {
        System.out.println("Subscription status for " + user.name + ": " + user.subscriptionStatus);
    }

    public void removeSubscription(Viewer user) {
        unsubscribeUser(user);
    }

    public String getSubName() {
        return subName;
    }
}
