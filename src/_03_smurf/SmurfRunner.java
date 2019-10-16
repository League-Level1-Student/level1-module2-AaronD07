package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("Handy");
	Smurf papa = new Smurf("Papa Smurf");
	Smurf smurfette = new Smurf("Smurfette");
	handy.eat();
	String name1 = handy.getName();
	System.out.println(name1);
	String name2 = papa.getName();
	System.out.println(name2);
	String hat1 = papa.getHatColor();
	System.out.println(hat1);
	String gender1 = papa.isGirlOrBoy();
	System.out.println(gender1);
	
	String name3 = smurfette.getName();
	System.out.println(name3);
	
	String hat2 = smurfette.getHatColor();
	System.out.println(hat2);
	
	String gender2 = smurfette.isGirlOrBoy();
	System.out.println(gender2);
	
}
}
