public class Main {
    public static void main(String[] args) {
        RecyclingMachine machine = new RecyclingMachine(5.0); // Defina o preço por quilo aqui
        UserInterface ui = new UserInterface(machine);
        ui.start();
    }
}