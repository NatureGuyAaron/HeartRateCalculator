import java.time.LocalDate;
import java.time.Period;

public class heartRates {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public heartRates(String firstName, String lastName, int birthYear, int birthMonth, int birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }
public void user()
{

}
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }

    public int calculateMaximumHeartRate() {
        int age = calculateAge();
        return 220 - age;
    }

    public String calculateTargetHeartRateRange() {
        int maximumHeartRate = calculateMaximumHeartRate();
        int lowerRange = (int) (maximumHeartRate * 0.5);
        int upperRange = (int) (maximumHeartRate * 0.85);
        return lowerRange + " - " + upperRange;
    }

    public static void main(String[] args) {
        // Prompt for user input
        String firstName = "John";
        String lastName = "Doe";
        int birthYear = 1990;
        int birthMonth = 5;
        int birthDay = 15;

        // Create a HeartRates object
        heartRates person = new heartRates(firstName, lastName, birthYear, birthMonth, birthDay);

        // Print person's information
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Date of Birth: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());

        // Calculate and print age, maximum heart rate, and target heart rate range
        int age = person.calculateAge();
        int maxHeartRate = person.calculateMaximumHeartRate();
        String targetHeartRateRange = person.calculateTargetHeartRateRange();

        System.out.println("Age: " + age);
        System.out.println("Maximum Heart Rate: " + maxHeartRate);
        System.out.println("Target Heart Rate Range: " + targetHeartRateRange);
    }
}



