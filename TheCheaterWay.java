import java.lang.reflect.*;

public class TheCheaterWay {
	public static void main(String[] args) throws Exception {
		System.out.println("\nROOM 1");
		Class room1Class = Class.forName("Room1");
		Object room1Instance = room1Class.newInstance();
		
		System.out.println("ROOM 2");
		Class room2Class = Class.forName("Room2");
		Object room2Instance = room2Class.newInstance();
		
		Field r2_wordFound = room2Class.getDeclaredField("wordFound");
		r2_wordFound.setAccessible(true);
		r2_wordFound.set(room2Instance, true);
		
		System.out.println("\nROOM 3");
		Class room3Class = Class.forName("Room3");
		Object room3Instance = room3Class.newInstance();
		
		Field r3_wordFound = room3Class.getDeclaredField("wordFound");
		r3_wordFound.setAccessible(true);
		r3_wordFound.set(room3Instance, true);
		
		System.out.println("\nROOM 4");
		Class room4Class = Class.forName("Room4");
		Object room4Instance = room4Class.newInstance();
		
		Field r4_wordFound = room4Class.getDeclaredField("wordFound");
		r4_wordFound.setAccessible(true);
		r4_wordFound.set(room4Instance, true);
		
		System.out.println("\nROOM 5");
		Class room5Class = Class.forName("Room5");
        Constructor constr = room5Class.getDeclaredConstructor();
        constr.setAccessible(true);
        constr.newInstance(null);
		Object room5Instance = constr.newInstance();
		
	
		Method r5_passphrase = room5Class.getDeclaredMethod("passphrase",  String.class, String.class, String.class);
		r5_passphrase.setAccessible(true);
		r5_passphrase.invoke(room5Instance, "Ala", "Ka", "Zam");
		
	}
	
}
