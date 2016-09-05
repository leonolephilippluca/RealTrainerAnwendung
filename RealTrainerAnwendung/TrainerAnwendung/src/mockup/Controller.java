package mockup;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	
	public static List<Trainer> trainerlist = new ArrayList();
	
	public static void newTrainer(int Id, String name, int age, int experience){
		
		Trainer t = new Trainer(Id, name, age, experience);
		trainerlist.add(t);
	
	}
	
	
}
