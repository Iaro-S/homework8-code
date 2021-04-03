package ro.fasttrackit.homework8;

public class AdvertiseMain {
    public static void main(String[] args) {
        String[] advertisement = {
                "This is a cool advert for BMW. ",
                "The road text actually looks like a road.",
                "Clever!"
        };
        ContactPage contactPage = new ContactPage(advertisement);

        contactPage.adevertiseMessage(new Email("person1@fasttrackit.ro"));
        contactPage.adevertiseMessage(new Facebook("Popescu Mihai"));
        contactPage.adevertiseMessage(new Print("Decebal","Bihoreanul"));
    }
}

