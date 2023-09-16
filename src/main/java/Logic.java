import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Logic {
    private LocalDate birthdate = LocalDate.parse("1993-08-09") ;
    private LocalDate today = LocalDate.parse("2023-08-09");

    private LocalDate yearsOld18 = birthdate.plusYears(18);

    private LocalDate startsWorking = yearsOld18.plusMonths(1);

    private LocalDate retiringAgeMan = birthdate.plusYears(65);
    private LocalDate retiringAgeWoman = birthdate.plusYears(60);

    private LocalDate contribution = LocalDate.parse("0000-01-01");

    public void print() {
        Period period = Period.between(startsWorking, today);

        System.out.println(period.getYears() + "-" + period.getMonths() + "-" + period.getDays());

        System.out.println(startsWorking.getYear() + "-" + startsWorking.getMonthValue());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos anios de aportes desea agregar?");
        contribution = contribution.plusYears(scanner.nextLong());
        System.out.println(contribution);
        System.out.println("Cuantos meses de aportes desea agregar?");
        contribution = contribution.plusMonths(scanner.nextLong());
        System.out.println("Usted aporto: ");
        //ver si getYear sin -1 esta correcto
        System.out.print(Integer.valueOf(contribution.getYear()) + " anios y" +
                " " + (Integer.valueOf(contribution.getMonthValue()) - 1) + " meses");




        //funciona...
        //que informacion util puedo obtener?
    }

}
