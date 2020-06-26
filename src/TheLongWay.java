import java.lang.reflect.*;
import static java.lang.System.out;


public class TheLongWay {
	public static void main(String[] args) throws Exception {
		System.out.println("\nROOM 1");
		Class room1Class = Class.forName("Room1");
		Object room1Instance = room1Class.newInstance();
		
		System.out.println("ROOM 2");
		Class room2Class = Class.forName("Room2");
		Object room2Instance = room2Class.newInstance();
	
		Method r2_swim = room2Class.getDeclaredMethod("swim");
		r2_swim.invoke(room2Instance);
		
		Method r2_takeSword = room2Class.getDeclaredMethod("takeSword");
		r2_takeSword.invoke(room2Instance);
		
		Method r2_look = room2Class.getDeclaredMethod("look");
		r2_look.invoke(room2Instance);
		
		Method r2_dig = room2Class.getDeclaredMethod("dig");
		r2_dig.setAccessible(true);
		r2_dig.invoke(room2Instance);
		
		// " You dig up the grave and find a skeleton holding a scroll.  It contains 3 words but 2 are unreadable.  The remaining word says 'Zam' "
		
		System.out.println("\nROOM 3");
		Class room3Class = Class.forName("Room3");
		Object room3Instance = room3Class.newInstance();
		
		/*
		Method r3_attack = room3Class.getDeclaredMethod("attack");
		r3_attack.setAccessible(true);
		r3_attack.invoke(room3Instance);
		*/
		
		Method r3_look = room3Class.getDeclaredMethod("look");
		r3_look.invoke(room3Instance);
		
		Method r3_openChest = room3Class.getDeclaredMethod("openChest");
		r3_openChest.invoke(room3Instance);
		
		// " A page is ear-marked and the word 'Ala' written in blood. "
		
		System.out.println("\nROOM 4");
		Class room4Class = Class.forName("Room4");
		Object room4Instance = room4Class.newInstance();
		
		Method r4_look = room4Class.getDeclaredMethod("look");
		r4_look.invoke(room4Instance);
		
		Method r4_answer = room4Class.getDeclaredMethod("answer", int.class);
		r4_answer.invoke(room4Instance, 200754);
		
		// " A low voice reverberates the word 'Ka' and fades away. You may now access secret Room5 "
		
		System.out.println("\nROOM 5");
		Class room5Class = Class.forName("Room5");
        Constructor<?> constr = room5Class.getDeclaredConstructor();
        constr.setAccessible(true);
        constr.newInstance(null);
		Object room5Instance = constr.newInstance();
        
		Method r5_look = room5Class.getDeclaredMethod("look");
		r5_look.setAccessible(true);
		r5_look.invoke(room5Instance);
		
		/*
		Method r5_attack = room5Class.getDeclaredMethod("attack");
		r5_attack.setAccessible(true);
		r5_attack.invoke(room5Instance);
		*/
		
		Method r5_passphrase = room5Class.getDeclaredMethod("passphrase",  String.class, String.class, String.class);
		r5_passphrase.setAccessible(true);
		r5_passphrase.invoke(room5Instance, "Ala", "Ka", "Zam");
		
		// " That is correct.  The dragon allows you to pass and you escape... Congratulations on your 10pts. "
	}
}
