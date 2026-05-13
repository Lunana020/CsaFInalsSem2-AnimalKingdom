import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalController controller = new AnimalController();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("--- Welcome to the Virtual Animal Kingdom ---");

        while (running) {
            System.out.println("\n1. Add Mammal  2. Add Bird  3. Add Reptile  4. View All  5. Exit");
            System.out.print("Select an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    controller.addMammal("Lion", 5, "Savanna", "Golden");
                    System.out.println("Lion added!");
                    break;
                case "2":
                    controller.addBird("Eagle", 3, "Mountains", 2.1);
                    System.out.println("Eagle added!");
                    break;
                case "3":
                    controller.addReptile("Cobra", 2, "Desert", true);
                    System.out.println("Cobra added!");
                    break;
                case "4":
                    System.out.println("\n--- Current Animals ---");
                    for (Animal a : controller.getAllAnimals()) {
                        System.out.println(a);
                        System.out.println(" > " + a.move());
                        System.out.println(" > " + a.makeSound());
                    }
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        System.out.println("Goodbye!");
        scanner.close();
    }
}