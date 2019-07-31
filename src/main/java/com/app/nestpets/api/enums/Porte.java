package com.app.nestpets.api.enums;

/**
 * @author jp
 *
 */
public enum Porte {
	
	P("Pequeno"), M("Médio"), G("Grande");
	
	private String value;
	
	
	private Porte(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
