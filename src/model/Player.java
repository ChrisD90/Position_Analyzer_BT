package model;

import control.Analyzer_TestData;

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
		Analyzer_TestData calc = new Analyzer_TestData(values);
		positions = calc.run();
	}
}
