package control;

public class Analyzer_TestData {

	//contains players values
	double[] values;
	
	private int innenVerteidiger;
	private int aussenVerteidiger;
	private int zentralesMittelfeld;
	private int aeusresMittelfeld;
	private int stuermer;
	
	public Analyzer_TestData(double[] values) {
		this.values = values;
	}
	
	public String run() {
		
		//Pass-Weit
		if(values[6] >= 4 && values [6] < 8) {
			zentralesMittelfeld += 2;
			innenVerteidiger += 1;
			aeusresMittelfeld += 1;
		} else if(values[6] >= 8) {
			zentralesMittelfeld += 3;	
		} else {
			stuermer += 1;
			aussenVerteidiger += 1;
		}
		
		//Flanken
		if(values[7] >= 4 && values [7] < 8) {
			aussenVerteidiger +=1;
			aeusresMittelfeld +=2;
		} else if(values[7] >= 8) {
			aussenVerteidiger += 2;
			aeusresMittelfeld += 3;
		} else {
			innenVerteidiger += 1;
			stuermer += 1;
			zentralesMittelfeld += 1;
		}
		
		//Zweikampf off.
		if(values[8] <= 5) {
			zentralesMittelfeld += 1;
			innenVerteidiger += 1;
		} else if(values[8] > 5) {
			stuermer += 3;
			aeusresMittelfeld += 2;
			aussenVerteidiger += 1;			
		}
		
		//Zweikamf def.
		if(values[8] <= 5) {
			stuermer += 1;
			aeusresMittelfeld += 1;
			zentralesMittelfeld += 1;
		} else if(values[8] > 5) {
			innenVerteidiger += 3;	
			aussenVerteidiger += 2;
		}
		
		//Spielverst.
		
		String string ="";
		
		//DO CALCULATIONS AND APPEND POSSIBLE POSITIONS to string SUCH AS: MF, ZM, ST
		string = "MF";
		
		
		return string;
	}
}
