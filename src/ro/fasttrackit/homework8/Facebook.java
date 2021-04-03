package ro.fasttrackit.homework8;

public class Facebook implements AdvertisingPlatform {
    private final String person;

    public Facebook(String person) {
        this.person = person;
    }

    @Override
    public void advertise(String message) {
        System.out.println("Posting Advertise " + message + " on " + person + " facebook page!");
    }
}
