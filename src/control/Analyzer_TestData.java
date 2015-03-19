package control;

public class Analyzer_TestData {

	// contains players values
	double[] values;

	String string;

	private int innenVerteidiger;
	private int aussenVerteidiger;
	private int zentralesMittelfeld;
	private int aeusresMittelfeld;
	private int stuermer;

	public Analyzer_TestData(double[] values) {
		this.values = values;
	}

	public String run() {

		// Yo-Yo IR1
		evalEndurance();

		// Kindermanntest
		evalSpeed();

		// Kopfball/Sprungkraft
		evalJump();

		// Pass-kurz
		evalPassesShort();

		// Pass-weit
		evalPassesLong();

		// Flanken
		evalFlanks();

		// Zweikampf
		evalDuell();

		// Spielverst.
		evalTactics();

		// Dribbling
		evalBallQuali();

		// Torschuss
		evalSoohting();

		int best = Math.max(
				innenVerteidiger,
				Math.max(
						aussenVerteidiger,
						Math.max(zentralesMittelfeld,
								Math.max(aeusresMittelfeld, stuermer))));
		System.out.println(best);

		double innenVerteidiger_Prozent = (innenVerteidiger * 100) / best;
		double aussenVerteidiger_Prozent = (aussenVerteidiger * 100) / best;
		double zentralesMittelfeld_Prozent = (zentralesMittelfeld * 100) / best;
		double aeusresMittelfeld_Prozent = (aeusresMittelfeld * 100) / best;
		double stuermer_Prozent = (stuermer * 100) / best;

		string = "Ausgehend von den Testdaten eigenet sich dieser Spieler für die folgenden Positionen:\n\nInnenverteidiger: 	" + innenVerteidiger + " - "
				+ innenVerteidiger_Prozent + "%" + "\nAußenverteidiger: 	"
				+ aussenVerteidiger + " - " + aussenVerteidiger_Prozent + "%"
				+ "\nzentrales Mittelfeld: 	" + zentralesMittelfeld + " - "
				+ zentralesMittelfeld_Prozent + "%" + "\näußeres Mittelfeld: 	"
				+ aeusresMittelfeld + " - " + aeusresMittelfeld_Prozent + "%"
				+ "\nStürmer: 		" + stuermer + " - " + stuermer_Prozent + "%" +"\n\nAnmerkung: diese Werte sind Richtwerte und keine fixe Zuordnung!!";

		System.out.println(string);
		
		return string;
	}

	private void evalEndurance() {
		double m = values[0];
		System.out.println("Ausdauer - Distanz:		" + m);

		// TODO

	}

	private void evalSpeed() {
		// Zeit der Abschnitte auf 1m
		double t_1mAntritt = values[1] / 5;
		double t_1mBeschl = values[2] / 10;
		double t_1mGrundschn = values[3] / 30;

		System.out.println("Antritt auf 1m: 		" + t_1mAntritt);
		System.out.println("Beschleunigung auf 1m: 		" + t_1mBeschl);
		System.out.println("Grundschnelligkeit auf 1m: 	" + t_1mGrundschn);

		if (t_1mAntritt > t_1mBeschl && t_1mAntritt > t_1mGrundschn) {
			innenVerteidiger += 3;
			aussenVerteidiger += 3;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 2;
			stuermer += 2;
		} else if (t_1mBeschl > t_1mAntritt && t_1mBeschl > t_1mGrundschn) {
			innenVerteidiger += 2;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 3;
			stuermer += 2;
		} else if (t_1mGrundschn > t_1mAntritt && t_1mGrundschn > t_1mBeschl) {
			innenVerteidiger += 2;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 2;
			stuermer += 3;
		}
	}

	private void evalJump() {
		double x = values[4];

		System.out.println("Sprunghöhe:			" + x);

		if (x >= 0.2) {
			// TODO
		}
	}

	private void evalPassesShort() {
		int x = (int) values[5];
		System.out.println("Kurze Pässe - total:		" + x);

		if (x > 7) {
			innenVerteidiger += 2;
			//aussenVerteidiger += 1;
			zentralesMittelfeld += 3;
			//aeusresMittelfeld += 1;
			//stuermer += 1;
		} else if(x > 3 && x >= 7) {
			innenVerteidiger += 2;
			//aussenVerteidiger += 1;
			zentralesMittelfeld += 2;
			//aeusresMittelfeld += 1;
			//stuermer += 1;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}
	}

	private void evalPassesLong() {
		int x = (int) values[6];
		System.out.println("Weite Pässe - total:		" + x);

		if (x > 7) {
			//innenVerteidiger += 1;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 3;
			aeusresMittelfeld += 2;
			//stuermer += 1;
		} else if (x > 3 && x <= 7) {
			//innenVerteidiger += 1;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 2;
			aeusresMittelfeld += 2;
			//stuermer += 1;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}
	}

	private void evalFlanks() {
		int x = (int) values[7];
		System.out.println("Flanken - total:		" + x);

		if (x > 7) {
			//innenVerteidiger += 1;
			aussenVerteidiger += 2;
			//zentralesMittelfeld += 1;
			aeusresMittelfeld += 3;
			//stuermer += 1;
		} else if (x > 3 && x <= 7) {
			//innenVerteidiger += 1;
			aussenVerteidiger += 2;
			//zentralesMittelfeld += 1;
			aeusresMittelfeld += 2;
			//stuermer += 1;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}
	}

	private void evalDuell() {

		// Defensive
		int x = (int) values[9];
		System.out.println("Def. Zweikämpfe - gewonnen:	" + x);

		if (x > 7) {
			innenVerteidiger += 3;
			aussenVerteidiger += 2;
			//zentralesMittelfeld += 1;
			//aeusresMittelfeld += 1;
			//stuermer += 1;
		} else if (x > 3 && x <= 7) {
			innenVerteidiger += 2;
			aussenVerteidiger += 2;
			//zentralesMittelfeld += 1;
			//aeusresMittelfeld += 1;
			//stuermer += 1;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}

		// Offensive
		int y = (int) values[8];
		System.out.println("Off. Zweikämpfe - gewonnen:	" + y);

		if (x > 7) {
			//innenVerteidiger += 1;
			aussenVerteidiger += 2;
			//zentralesMittelfeld += 1;
			aeusresMittelfeld += 2;
			stuermer += 3;
		} else if (x > 3 && x <= 7) {
			//innenVerteidiger += 1;
			aussenVerteidiger += 2;
			//zentralesMittelfeld += 1;
			aeusresMittelfeld += 2;
			stuermer += 2;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}

		// Comparison
		if (x > y) {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
		} else if (y > x) {
			aeusresMittelfeld += 1;
			stuermer += 1;
		} else {
			zentralesMittelfeld += 1;
		}
	}

	private void evalTactics() {
		int x = (int) values[10];
		System.out.println("Spielverständnis:		" + x);

		switch (x) {
		case 3:
			innenVerteidiger += 2;
			//aussenVerteidiger += 1;
			zentralesMittelfeld += 3;
			//aeusresMittelfeld += 1;
			//stuermer += 1;
		case 2:
			innenVerteidiger += 2;
			//aussenVerteidiger += 1;
			zentralesMittelfeld += 2;
			//aeusresMittelfeld += 1;
			//stuermer += 1;
		case 1:
			innenVerteidiger += 2;
			//aussenVerteidiger += 1;
			//zentralesMittelfeld += 1;
			//aeusresMittelfeld += 1;
			//stuermer += 1;
		}
	}

	private void evalBallQuali() {
		double time5m = values[11];
		double time10m = values[12];
		double time30m = values[13];
		double time60m = values[14];

		double time5to10m = time10m - time5m;
		double time10to30m = time30m - time5to10m;
		double time30to60m = time60m - time10to30m;

		double time1m_Agility = (time5m + time10to30m) / 25;
		double time1m_Dribbling = time5to10m / 5;
		double time1m_WithBall = time30to60m / 30;

		// TODO
	}

	private void evalSoohting() {
		int count = (int) values[15];
		int speed = (int) values[16];
		int foot = (int) values[17];

		System.out.println("Torschuss - Treffer:		" + count);

		if (count > 33) {
			//innenVerteidiger += 1;
			//aussenVerteidiger += 1;
			zentralesMittelfeld += 2;
			//aeusresMittelfeld += 1;
			stuermer += 3;
		} else if (count > 21 && count <= 33) {
			//innenVerteidiger += 1;
			//aussenVerteidiger += 1;
			zentralesMittelfeld += 2;
			//aeusresMittelfeld += 1;
			stuermer += 2;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}
		
		if(foot == 3) {
			stuermer += 1;
		}
	}

}
