package com.tecnology.develop.model;

public class Customer {

	private String name;
	private int age;

	public int ageDifference(final Customer other) {
		return age - other.age;
	}

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(name);
		builder.append(", ");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

}
