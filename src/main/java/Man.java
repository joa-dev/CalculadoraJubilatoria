import java.time.LocalDate;

public class Man extends Person {
    final private byte retirementAge;
    final private LocalDate retirementDate;

    public Man(LocalDate birthdate) {
        super(birthdate);
        this.retirementAge = 65;
        this.retirementDate = birthdate.plusYears(retirementAge);
    }
}
