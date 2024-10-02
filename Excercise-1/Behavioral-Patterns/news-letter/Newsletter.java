import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(String newsletter);
}

// Subscriber class
class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String newsletter) {
        System.out.println(name + " received newsletter: " + newsletter);
    }
}

// Subject (Newsletter)
class Newsletter {
    private List<Observer> subscribers = new ArrayList<>();
    private String latestNewsletter;

    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    public void publishNewsletter(String newsletter) {
        this.latestNewsletter = newsletter;
        notifyAllSubscribers();
    }

    private void notifyAllSubscribers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(latestNewsletter);
        }
    }
}
