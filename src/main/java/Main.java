import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese fecha nacimiento (formato YYYY-MM-DD)");
        LocalDate birthdate = LocalDate.parse(scanner.nextLine());

        System.out.println();
        System.out.println("Ingrese sexo M o F");
        String sex = scanner.nextLine();
        if (sex.toLowerCase().equals("m")) {
            Man hombre = new Man(birthdate);
            hombre.addContribution();
        } else if (sex.toLowerCase().equals("f")) {

        }
    }
}
