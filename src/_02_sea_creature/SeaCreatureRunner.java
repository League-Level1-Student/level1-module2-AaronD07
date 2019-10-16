package _02_sea_creature;

import javax.swing.JOptionPane;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("Spongebob");
	spongebob.eat();
	spongebob.laugh();
	SeaCreature squidward = new SeaCreature("Squidward");
	SeaCreature patrick = new SeaCreature("Patrick");
	squidward.eat();
	patrick.eat();
	squidward.laugh();
	String name2 = squidward.getName();
	patrick.laugh();
	String name = patrick.getName();
	JOptionPane.showMessageDialog(null, name);
	JOptionPane.showMessageDialog(null, name2);
	
}
}
