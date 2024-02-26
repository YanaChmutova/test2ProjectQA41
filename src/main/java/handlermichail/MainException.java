package handlermichail;

public class MainException {

    public static void main(String[] args) {
        try {
            validateInput("text");
            System.out.println("text");
        } catch (InvalidInputException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }

        try {
            validateInput("");
            System.out.println("empty");
        } catch (InvalidInputException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
        try {
            validateInput("text2");
            System.out.println("text2");
        } catch (InvalidInputException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
        finally {
            System.out.println("* This is the finally block.");
        }
    }

    public static void validateInput(String input) throws InvalidInputException {
        if (input == null || input.isEmpty()) {
            throw new InvalidInputException("Input cannot be null or empty");
        }
    }

}
