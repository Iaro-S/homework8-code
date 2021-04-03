package ro.fasttrackit.homework8;

public class Email implements AdvertisingPlatform {
    private final String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void advertise(String message) {
        System.out.println("Sending advertising: " + message + " to " + email);
    }
}
