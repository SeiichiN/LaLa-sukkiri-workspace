package main;

public class Main2 {

	public static void main(String[] args) {
		
		Cleric c = new Cleric();
		c.name = "アサカ";
		c.selfAid();
		int kaihuku = c.pray(4);
		System.out.println
		  (c.name + "のmpは" + kaihuku + "回復した");
	}

}
