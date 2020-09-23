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
        
		int value = 0;
		
		if(args[0] == "-") {
			for(int i = 1; i < args.length; i++)
				value -= args[i];
		}
		
		else {
			for(int i = 0; i < args.length; i++)
				value += args[i];
		}
		
		return value;
    }
}
