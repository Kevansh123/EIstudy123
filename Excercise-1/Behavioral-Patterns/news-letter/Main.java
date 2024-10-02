public class Main {
    public static void main(String[] args) {
        // Create a newsletter
        Newsletter newsletter = new Newsletter();

        // Create subscribers
        Subscriber sub1 = new Subscriber("Alice");
        Subscriber sub2 = new Subscriber("Bob");

        // Add subscribers to the newsletter
        newsletter.addSubscriber(sub1);
        newsletter.addSubscriber(sub2);

        // Publish a newsletter
        newsletter.publishNewsletter("Newsletter #1");

        // Bob unsubscribes
        newsletter.removeSubscriber(sub2);

        // Publish another newsletter
        newsletter.publishNewsletter("Newsletter #2");
    }
}
