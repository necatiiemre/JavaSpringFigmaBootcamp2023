import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> baseStrings = List.of("emre","özdemir","not contain","emre"," ");
		
		List<String> lastStrings = baseStrings.stream().filter(string -> !string.isEmpty()).map(string -> string.toUpperCase()).filter(string -> string.contains("E")).sorted(Comparator.reverseOrder()).distinct().toList();
		lastStrings.forEach(x -> System.out.println(x));
	}

}
