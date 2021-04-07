package ro.fasttrackit.homework8.credit;

public class CreditMain {
    public static void main(String[] args) {
        BankAccount account = new Ing();
        System.out.println("Tranzactii banca ING ");
        System.out.println("Suma depusa: " + account.depune(-1300.50));
        System.out.println("Suma retrasa: " + account.retrage(675.35));
        System.out.println("Soldul final: " + account.sold());

        BankAccount account1 = new Brd();
        System.out.println("Tranzactii banca BRD ");
        System.out.println("Suma depusa: " + account1.depune(700));
        System.out.println("Suma retrasa: " + account1.retrage(800));
        System.out.println("Soldul final: " + account1.sold());

        BankAccount account2 = new Bt();
        System.out.println("Tranzactii banca BT ");
        System.out.println("Suma depusa: " + account2.depune(1500));
        System.out.println("Suma retrasa: " + account2.retrage(850));
        System.out.println("Soldul final: " + account2.sold());
    }
}
