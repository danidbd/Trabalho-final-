public class RecyclingMachine {
    private double pricePerKilo;

    public RecyclingMachine(double pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    public double getPricePerKilo() {
        return pricePerKilo;
    }

    public void setPricePerKilo(double pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    public double calculateMoneyEarned(double weight) {
        return pricePerKilo * weight;
    }
}
