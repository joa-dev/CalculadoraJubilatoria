import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Logic {
    private LocalDate birthdate = LocalDate.parse("1993-08-09");
    private LocalDate today = LocalDate.parse("2023-08-09");

    private LocalDate yearsOld18 = birthdate.plusYears(18);

    private LocalDate startsWorking = yearsOld18.plusMonths(1);

    public void print() {
        Period period = Period.between(startsWorking, today);

        System.out.println(period.getYears() + "-" + period.getMonths() + "-" + period.getDays());

        System.out.println(startsWorking.getYear() + "-" + startsWorking.getMonthValue());

    }

}
