import java.util.HashSet;
import java.util.Scanner;

public class PhoneLookupTool {

    public static void main(String[] args) {

        HashSet<String> phoneNumbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // números de teléfono de ejemplo
        phoneNumbers.add("123456789");
        phoneNumbers.add("987654321");
        phoneNumbers.add("555666777");
        phoneNumbers.add("111222333");

        while (true) {
            System.out.println("\nherramienta de búsqueda de teléfonos");
            System.out.println("1. buscar número de teléfono");
            System.out.println("2. agregar número de teléfono");
            System.out.println("3. salir");
            System.out.print("elige una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // limpiar el salto de línea

            if (option == 1) {
                System.out.print("ingresa el número a buscar: ");
                String number = scanner.nextLine();

                if (phoneNumbers.contains(number)) {
                    System.out.println("número encontrado ✅");
                } else {
                    System.out.println("número no encontrado ❌");
                }

            } else if (option == 2) {
                System.out.print("ingresa el nuevo número: ");
                String newNumber = scanner.nextLine();
                phoneNumbers.add(newNumber);
                System.out.println("número agregado correctamente ✔");

            } else if (option == 3) {
                System.out.println("hasta luego 👋");
                break;

            } else {
                System.out.println("opción inválida ❌");
            }
        }

        scanner.close();
    }
}
