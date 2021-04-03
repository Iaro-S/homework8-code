package ro.fasttrackit.homework8.advertise;

public class Print implements AdvertisingPlatform {
    private final String address;
    private final String newspaper;

    public Print(String address, String newspaper) {
        this.address = address;
        this.newspaper = newspaper;
    }

    @Override
    public void advertise(String message) {
        System.out.println("Message " + message + "was printed on billboard on " + address);
        System.out.println("Message " + message + "was printed in newspaper " + newspaper);
    }
}
