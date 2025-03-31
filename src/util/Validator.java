package util;

public class Validator {
    public static boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidFloat(String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidBoolean(String input) {
        return "true".equalsIgnoreCase(input) || "false".equalsIgnoreCase(input);
    }

    public static boolean isValidString(String input, int min, int max) {
        if (input == null) return false;
        String trimmed = input.trim();
        return !trimmed.isEmpty() && trimmed.length() >= min && trimmed.length() <= max;
    }

    public static boolean isValidEmail(String input) {
        if (input == null) return false;
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return input.matches(emailRegex);
    }

    public static boolean isValidPhone(String input) {
        if (input == null) return false;
        String phoneRegex = "^(03|05|07|08|09)[0-9]{8}$";
        return input.matches(phoneRegex);
    }
}