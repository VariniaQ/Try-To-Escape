package com.enums;

public enum MenuOptions {
	PLAY("Jugar"), EXIT("Salir");

	private String name;
	
	MenuOptions(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
