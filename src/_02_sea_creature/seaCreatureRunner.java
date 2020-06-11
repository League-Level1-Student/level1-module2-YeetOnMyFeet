package _02_sea_creature;

public class seaCreatureRunner {
public static void main(String[] args) {
	
	SeaCreature Spongebob = new SeaCreature("jon");
	Spongebob.eat();
	Spongebob.laugh();
	System.out.println(Spongebob.getName());
	SeaCreature Patrick = new SeaCreature("Patrick");
	Patrick.eat();
	Patrick.laugh();
	System.out.println(Patrick.getName());
}
}
