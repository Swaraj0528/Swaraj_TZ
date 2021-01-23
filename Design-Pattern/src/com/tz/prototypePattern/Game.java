package com.tz.prototypePattern;

public class Game implements Cloneable {

	private int id;
	private String name;
	private MemberShip membership;

	@Override
	protected Game clone() throws CloneNotSupportedException {
		Game game = (Game) super.clone();
		game.setMembership(new MemberShip());
		return game;
	}
	

	/**
	 * @param id
	 * @param name
	 * @param membership
	 */
	public Game(Game game) {
		super();
		this.id = game.id;
		this.name = game.name;
		this.membership = new MemberShip();
	}


	/**
	 * 
	 */
	public Game() {
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", membership=" + getMembership() + "]";
	}

	public MemberShip getMembership() {
		return membership;
	}

	public void setMembership(MemberShip membership) {
		this.membership = membership;
	}

}
