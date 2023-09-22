import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.util.Scanner;

public class Person {
    final private LocalDate birthdate;
    final private LocalDate startsWorking;
    private LocalDate contribution;


    public Person(LocalDate birthdate) {
        this.birthdate = birthdate;
        this.contribution = LocalDate.parse("0000-01-01");
        this.startsWorking = birthdate.plusYears(18).plusMonths(1).minusDays(birthdate.getDayOfMonth() - 1);
    }


    public void addContribution() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("Cuantos anios de aportes desea agregar? (X para salir)");
            contribution = contribution.plusYears(scanner.nextLong());
            System.out.println("Cuantos meses de aportes desea agregar?");
            contribution = i == 0 ? contribution.plusMonths(scanner.nextLong() - 1) : contribution.plusMonths(scanner.nextLong());
            System.out.println("Usted aporto: ");
            if (contribution.getMonthValue() == 12) {
                System.out.print(Integer.valueOf(contribution.getYear() + 1) + " anios");
            } else {
                System.out.print(Integer.valueOf(contribution.getYear()) + " anios y" +
                        " " + (Integer.valueOf(contribution.getMonthValue())) + " meses");
            }
            System.out.println();

            i++;
        }
    }

    public void addContribution(long yearsToAdd) {
        contribution = contribution.plusYears(yearsToAdd);
    }

    public LocalDate getContribution() {
        return contribution;
    }

    public String howMuchContributionNeededToRetirement() {
        Period period = Period.between(this.contribution, LocalDate.parse("0030-01-01"));

        System.out.println("Empieza a aportar: " + startsWorking.toString());

        if (contribution.getMonthValue() == 12 && period.getMonths() == 1) {
            return "Usted tiene " + (contribution.getYear() + 1) + " anios de aportes y " + "\n"
                    + "le faltan " + period.getYears() + " anios de aportes.";
        } else {
            return "Usted tiene " + contribution.getYear() + " anios de aportes y " + contribution.getMonthValue() + " meses de aportes" + "\n"
                    + "le faltan " + period.getYears() + " anios de aportes y " + (period.getMonths() - 1) + " meses de aportes.";
        }
    }
}









        /*public void addContribution() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("Cuantos anios de aportes desea agregar? (X para salir)");
            contributionYM = contributionYM.plusYears(scanner.nextLong());
            System.out.println("Cuantos meses de aportes desea agregar?");
            contributionYM = i == 0 ? contributionYM.plusMonths(scanner.nextLong() - 1) : contributionYM.plusMonths(scanner.nextLong());
            //contribution = contribution.plusMonths(scanner.nextLong());
            System.out.println("Usted aporto: ");
            if (contributionYM.getMonthValue() == 12) {
                System.out.print(Integer.valueOf(contributionYM.getYear() + 1) + " anios");
            } else {
                System.out.print(Integer.valueOf(contributionYM.getYear()) + " anios y" +
                        " " + (Integer.valueOf(contributionYM.getMonthValue())) + " meses");
                //}
                System.out.println();

                i++;
            }
        }
    }*/