package model;

import control.Analyzer_TestData;

public class Player {

	double [] values;
	public String positions;
	
	public Player(double[] values2) {
		this.values = values2;
	}
	
	public void printValues(double[] values2) {
		for(int i = 0; i<values2.length+1; i++) {
			System.out.println(values2[i]);
		}
	}
	
	public void calcPos() {
		Analyzer_TestData calc = new Analyzer_TestData(values);
		positions = calc.run();
	}
}
