import java.time.LocalDate;
import java.util.Scanner;

public class Woman extends Person {
    final private byte retirementAge;
    final private LocalDate retirementDate;
    private long children;

    public Woman(LocalDate birthdate) {
        super(birthdate);
        this.retirementAge = 60;
        this.retirementDate = birthdate.plusYears(retirementAge);
    }

    public void addChildren() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar numero de hijos");
        this.children = scanner.nextLong();
        super.addContribution(children);
        System.out.println(getContribution());
    }
}
