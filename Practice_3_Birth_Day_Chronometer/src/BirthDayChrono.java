import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class BirthDayChrono {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Birthday Greeting Program--------");
		System.out.println("Enter your birthday and time (e.g 2000-08-21 18:18):");
		String birthdayDataTime = sc.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime birthday = LocalDateTime.parse(birthdayDataTime, formatter);

		LocalDateTime today = LocalDateTime.now();
		LocalDateTime thisYearBirthday = LocalDateTime.of(today.getYear(), birthday.getMonth(),
				birthday.getDayOfMonth(), birthday.getHour(), birthday.getMinute());

		if (birthday.getMonthValue() == today.getMonthValue() && birthday.getDayOfMonth() == today.getDayOfMonth()) {
			System.out.println("Congratulations on your birthday today ");
		} else {
			if (today.isAfter(thisYearBirthday)) {
				LocalDateTime nextYearBirthday = thisYearBirthday.plusYears(1);
				Period diff = Period.between(today.toLocalDate(), nextYearBirthday.toLocalDate());
				System.out.printf("\n %d Month and %d days until your birthday ", diff.getMonths(), diff.getDays());
			} else {
				Period diff = Period.between(today.toLocalDate(), thisYearBirthday.toLocalDate());
				System.out.printf("\n %d Months and %d days until your birthday ", diff.getMonths(), diff.getDays());
			}

		}
		sc.close();
	}

}
