import java.util.Arrays;
import java.util.List;

/**
 * This class helps validate the transaction amount and category
 */
public class InputValidation {
    private static final List<String> VALID_CATEGORIES = Arrays.asList("food", "travel", "bills", "entertainment", "other");
    
    /**
     * Validates whether the input amount is between 0 and 1000 or not
     * 
     * @param amount the transaction amount to validate
     * @return true if the amount is greater than 0 and less than 1000
     */
    public static boolean isValidAmount(double amount) {
      return amount > 0 && amount < 1000;
    }

    /**
     * Validates whether the input category matches the given categories ("food", "travel", "bills", "entertainment", "other")
     * 
     * @param category
     * @return true if the input category matches the given categories
     */
    public static boolean isValidCategory(String category) {
      return VALID_CATEGORIES.contains(category.toLowerCase());
    }
}