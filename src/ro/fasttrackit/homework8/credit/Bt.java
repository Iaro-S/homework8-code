package ro.fasttrackit.homework8.credit;

public class Bt implements BankAccount {
    double depus;
    double retras;

    public double sold() {
        return depus - retras;
    }

    @Override
    public double depune(double suma) {
        if (suma > 0) {
            return depus += suma;
        } else {
            return 0;
        }
    }

    @Override
    public double retrage(double suma) {
        return retras += suma;
    }
}