package ro.fasttrackit.homework8.advertise;

public class ContactPage {
    private final String[] message;

    public ContactPage(String[] message) {
        this.message = message;
    }

    public void adevertiseMessage(AdvertisingPlatform platform) {
        for (String msg : message) {
            platform.advertise(msg);
        }
    }
}
