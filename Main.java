import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalController controller = new AnimalController();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- ANIMAL KINGDOM SYSTEM ---");
            System.out.println("1. Add Mammal | 2. Add Bird | 3. Add Reptile | 4. View Zoo | 5. Exit");
            System.out.print("Choice: ");
            String choice = sc.nextLine();

            if (choice.equals("5")) break;
            if (choice.equals("4")) {
                System.out.println("\n--- Zoo Inhabitants ---");
                if (controller.getAllAnimals().isEmpty()) System.out.println("No animals yet!");
                for (Animal a : controller.getAllAnimals()) {
                    System.out.println(a.toString() + " | Sound: " + a.makeSound());
                }
                continue;
            }

            try {
                System.out.print("Name: "); String name = sc.nextLine();
                System.out.print("Age: "); int age = Integer.parseInt(sc.nextLine());
                System.out.print("Habitat: "); String hab = sc.nextLine();

                switch (choice) {
                    case "1":
                        System.out.print("Fur Color: "); String fur = sc.nextLine();
                        System.out.print("Domesticated (t/f): "); boolean dom = Boolean.parseBoolean(sc.nextLine());
                        controller.addMammal(name, age, hab, fur, dom);
                        break;
                    case "2":
                        System.out.print("Wingspan: "); double wing = Double.parseDouble(sc.nextLine());
                        System.out.print("Can fly (t/f): "); boolean fly = Boolean.parseBoolean(sc.nextLine());
                        controller.addBird(name, age, hab, wing, fly);
                        break;
                    case "3":
                        System.out.print("Scale Type: "); String scales = sc.nextLine();
                        System.out.print("Cold Blooded (t/f): "); boolean cold = Boolean.parseBoolean(sc.nextLine());
                        controller.addReptile(name, age, hab, scales, cold);
                        break;
                }
                System.out.println("Added successfully!");
            } catch (Exception e) {
                System.out.println("Error in input. Try again.");
            }
        }
        sc.close();
    }
}