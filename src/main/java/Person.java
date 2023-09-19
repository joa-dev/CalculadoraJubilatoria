import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {
    final private LocalDate birthdate;
    //final private LocalDate retirementDate;
    private LocalDate contribution;


    public Person(LocalDate birthdate) {
        this.birthdate = birthdate;
        this.contribution = LocalDate.parse("0000-01-01");
    }

    public void addContribution() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("Cuantos anios de aportes desea agregar? (X para salir)");
            contribution = contribution.plusYears(scanner.nextLong());
            System.out.println("Cuantos meses de aportes desea agregar?");
            contribution = contribution.plusMonths(scanner.nextLong());
            System.out.println("Usted aporto: ");
            System.out.print(Integer.valueOf(contribution.getYear()) + " anios y" +
                    " " + (Integer.valueOf(contribution.getMonthValue()) - 1) + " meses");
            System.out.println();
            i++;
        }
    }

    public LocalDate getContribution() {
        return contribution;
    }
    //funciona
    //hacer funcion, usted aporto X anios, le falta Y para llegar a jubilarse

    public Period howMuchContributionNeededToRetirement() {
        return Period.between(this.contribution, LocalDate.parse("0030-01-01"));
    }
}
