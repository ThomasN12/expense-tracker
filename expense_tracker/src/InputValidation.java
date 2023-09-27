import java.util.Arrays;
import java.util.List;

public class InputValidation {
    private static final List<String> VALID_CATEGORIES = Arrays.asList("food", "travel", "bills", "entertainment", "other");
    public static boolean isValidAmount(double amount) {
      return amount > 0 && amount < 1000;
    }

    public static boolean isValidCategory(String category) {
      return VALID_CATEGORIES.contains(category.toLowerCase());
    }
}