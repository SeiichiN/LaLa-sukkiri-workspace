package main;

public class Main3 {

	public static void main(String[] args) {
		
		Hero h1 = new Hero();
		h1.name = "ミナト";
		Hero h2 = h1;
		h2.name = "アサカ";
		System.out.println(h1.name);
		System.out.println(h2.name);

	}

}
