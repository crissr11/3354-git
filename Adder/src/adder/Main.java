package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
			System.err.println("Please provide only integers to add");
        }
		catch (Exception e) {
			System.err.println("Invalid character value");
		}
    }

    private static int addArguments(String[] args) {
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1]) + Integer.valueOf(args[3]) + Integer.valueOf(args[4]);
    }
}
