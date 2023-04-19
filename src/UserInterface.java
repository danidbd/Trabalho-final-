import java.util.Scanner;

public class UserInterface {
    private RecyclingMachine machine;

    public UserInterface(RecyclingMachine machine) {
        this.machine = machine;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) à Máquina de Reciclagem!");
        System.out.println("Por favor, escolha o tipo de material que deseja reciclar:");
        System.out.println("1 - Papel");
        System.out.println("2 - Plástico");
        System.out.println("3 - Vidro");
        System.out.println("4 - Metal");

        int choice = scanner.nextInt();
        double pricePerKilo = machine.getPricePerKilo();

        switch (choice) {
            case 1:
                pricePerKilo *= 0.9;
                break;
            case 2:
                pricePerKilo *= 0.8;
                break;
            case 3:
                pricePerKilo *= 0.7;
                break;
            case 4:
                pricePerKilo *= 0.6;
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        System.out.println("Por favor, informe o peso do material em quilos:");
        double weight = scanner.nextDouble();

        double moneyEarned = machine.calculateMoneyEarned(weight);
        System.out.printf("Você ganhou R$ %.2f pela reciclagem desse material.%n", moneyEarned);
    }
}