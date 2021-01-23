package com.tz.prototypePattern;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		Game game = new Game();
		game.setId(1);
		game.setName("Over Watch");
		game.setMembership(new MemberShip());
		
		Game game2 = game.clone();
		Game g3 =new Game(game);
		System.out.println(game);
		System.out.println(game2);
		System.out.println(g3);
		

	}

}
