package clinic.programming.training;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	String s = "Hi";
	int i = switch(s) {
	case "Hi" -> 5;
	case "Vy" -> 7;
	default -> 1;
	};
	System.out.println (i);
    }
}
