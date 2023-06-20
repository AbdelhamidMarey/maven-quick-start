package clinic.programming.training;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
    
    public int countWords(String s) {
	String[] sAr = StringUtils.split(s, " ");
	return sAr == null ? 0 : sAr.length;
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
	String s2 = "I am the king";
	System.out.println(app.countWords(s2));
    }
}
