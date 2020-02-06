package com.mkcodes.classes_objects_access_control_constructors_getters_setters;

public class Ball {

	// Properties (or instance variables)
	private String colour;
	private String name;
	private int bounceRate;
	private int capacity;

	public Ball(String colour, String name, int capacity, int bounceRate) {
		this.colour = colour;
		this.name = name;
		this.capacity = capacity;
		this.bounceRate = bounceRate;
	}

	// Behaviours
	public void bounce() {
		System.out.println("Bouncing...");
	}

	public void deflate() {
		System.out.println("Deflating...");
	}

	public void inflate() {
		System.out.println("Inflating...");
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBounceRate() {
		return bounceRate;
	}

	public void setBounceRate(int bounceRate) {
		this.bounceRate = bounceRate;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
