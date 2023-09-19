import java.time.LocalDate;

public class Woman extends Person {
    final private byte retirementAge;
    final private LocalDate retirementDate;
    final private byte children;

    public Woman(LocalDate birthdate, byte children) {
        super(birthdate);
        this.retirementAge = 60;
        this.children = children;
        this.retirementDate = birthdate.plusYears(retirementAge);
    }
}
