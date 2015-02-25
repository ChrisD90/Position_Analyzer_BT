package model;

import control.Calculator;

public class Player {

	int [] values;
	public String positions;
	
	public Player(int[] values) {
		this.values = values;
	}
	
	public void printValues(int[] values) {
		for(int i = 0; i<values.length+1; i++) {
			System.out.println(values[i]);
		}
	}
	
	public void calcPos() {
		Calculator calc = new Calculator(values);
		positions = calc.run();
	}
}
