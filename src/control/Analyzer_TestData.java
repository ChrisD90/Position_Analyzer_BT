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

		int sum = innenVerteidiger + aussenVerteidiger + zentralesMittelfeld + aeusresMittelfeld + stuermer;
		System.out.println(sum);

		double innenVerteidiger_Prozent = (innenVerteidiger * 100) / sum;
		double aussenVerteidiger_Prozent = (aussenVerteidiger * 100) / sum;
		double zentralesMittelfeld_Prozent = (zentralesMittelfeld * 100) / sum;
		double aeusresMittelfeld_Prozent = (aeusresMittelfeld * 100) / sum;
		double stuermer_Prozent = (stuermer * 100) / sum;

		string = "Ausgehend von den Testdaten eigenet sich dieser Spieler für die folgenden Positionen:\n\nInnenverteidiger: 	"
				+ innenVerteidiger
				+ " - "
				+ innenVerteidiger_Prozent
				+ "%"
				+ "\nAußenverteidiger: 	"
				+ aussenVerteidiger
				+ " - "
				+ aussenVerteidiger_Prozent
				+ "%"
				+ "\nzentrales Mittelfeld: 	"
				+ zentralesMittelfeld
				+ " - "
				+ zentralesMittelfeld_Prozent
				+ "%"
				+ "\näußeres Mittelfeld: 	"
				+ aeusresMittelfeld
				+ " - "
				+ aeusresMittelfeld_Prozent
				+ "%"
				+ "\nStürmer: 		"
				+ stuermer
				+ " - "
				+ stuermer_Prozent
				+ "%"
				+ "\n\nAnmerkung: diese Werte sind Richtwerte und keine fixe Zuordnung!!";

		System.out.println(string);

		return string;
	}

	private void evalEndurance() {
		double m = values[0];
		System.out.println("Ausdauer - Distanz:		" + m);

		// TODO

	}

	/**
	 * evaluates the speed capabilities by
	 * comparing them to each other
	 */
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
			aussenVerteidiger += 3;
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

	/**
	 * not integrated yet
	 */
	private void evalJump() {
		double x = values[4];

		System.out.println("Sprunghöhe:			" + x);

		if (x >= 0.2) {
			// TODO
		}
	}

	/**
	 * evaluates the test values
	 */
	private void evalPassesShort() {
		int x = (int) values[5];
		System.out.println("Kurze Pässe - total:		" + x);

		if (x > 7) {
			innenVerteidiger += 2;
			// aussenVerteidiger += 1;
			zentralesMittelfeld += 3;
			// aeusresMittelfeld += 1;
			// stuermer += 1;
		} else if (x > 3 && x >= 7) {
			innenVerteidiger += 2;
			// aussenVerteidiger += 1;
			zentralesMittelfeld += 2;
			// aeusresMittelfeld += 1;
			// stuermer += 1;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}
	}

	/**
	 * the more long passes are complete the more you
	 * can assigne a player to the position of the
	 * cantral midfielders
	 */
	private void evalPassesLong() {
		int x = (int) values[6];
		System.out.println("Weite Pässe - total:		" + x);

		if (x > 7) {
			// innenVerteidiger += 1;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 3;
			aeusresMittelfeld += 2;
			// stuermer += 1;
		} else if (x > 3 && x <= 7) {
			// innenVerteidiger += 1;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 2;
			aeusresMittelfeld += 2;
			// stuermer += 1;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}
	}

	/**
	 *  used by external midfielders
	 * and external defenders
	 */
	private void evalFlanks() {
		int x = (int) values[7];
		System.out.println("Flanken - total:		" + x);

		if (x > 7) {
			// innenVerteidiger += 1;
			aussenVerteidiger += 2;
			// zentralesMittelfeld += 1;
			aeusresMittelfeld += 3;
			// stuermer += 1;
		} else if (x > 3 && x <= 7) {
			// innenVerteidiger += 1;
			aussenVerteidiger += 2;
			// zentralesMittelfeld += 1;
			aeusresMittelfeld += 2;
			// stuermer += 1;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}
	}

	/**
	 * makes the diffrence between offensiv
	 * and defesinv players
	 */
	private void evalDuell() {
		// Offensive
		int y = (int) values[8];
		System.out.println("Off. Zweikämpfe - gewonnen:	" + y);

		if (y > 7) {
			// innenVerteidiger += 1;
			aussenVerteidiger += 2;
			// zentralesMittelfeld += 1;
			aeusresMittelfeld += 2;
			stuermer += 3;
		} else if (y > 3 && y <= 7) {
			// innenVerteidiger += 1;
			aussenVerteidiger += 2;
			// zentralesMittelfeld += 1;
			aeusresMittelfeld += 2;
			stuermer += 2;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}

		// Defensive
		int x = (int) values[9];
		System.out.println("Def. Zweikämpfe - gewonnen:	" + x);

		if (x > 7) {
			innenVerteidiger += 3;
			aussenVerteidiger += 2;
			// zentralesMittelfeld += 1;
			// aeusresMittelfeld += 1;
			// stuermer += 1;
		} else if (x > 3 && x <= 7) {
			innenVerteidiger += 2;
			aussenVerteidiger += 2;
			// zentralesMittelfeld += 1;
			// aeusresMittelfeld += 1;
			// stuermer += 1;
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

	/**
	 * central midfielders and central defenders
	 * need very good skills
	 */
	private void evalTactics() {
		int x = (int) values[10];
		System.out.println("Spielverständnis:		" + x);

		switch (x) {
		case 3:
			innenVerteidiger += 2;
			// aussenVerteidiger += 1;
			zentralesMittelfeld += 3;
			// aeusresMittelfeld += 1;
			// stuermer += 1;
		case 2:
			innenVerteidiger += 2;
			// aussenVerteidiger += 1;
			zentralesMittelfeld += 2;
			// aeusresMittelfeld += 1;
			// stuermer += 1;
		case 1:
			innenVerteidiger += 2;
			// aussenVerteidiger += 1;
			// zentralesMittelfeld += 1;
			// aeusresMittelfeld += 1;
			// stuermer += 1;
		}
	}

	/**
	 * important for forwards and external players
	 */
	private void evalBallQuali() {
		int x = (int) values[11];
		System.out.println("Punkte Dribbling:		" + x);

		if (x > 7) {
			// innenVerteidiger += 1;
			aussenVerteidiger += 2;
			// zentralesMittelfeld += 1;
			aeusresMittelfeld += 2;
			stuermer += 3;
		} else if (x > 3 && x <= 7) {
			// innenVerteidiger += 1;
			aussenVerteidiger += 2;
			// zentralesMittelfeld += 1;
			aeusresMittelfeld += 2;
			stuermer += 2;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}
	}

	/**
	 * forwards and central midfielders
	 */
	private void evalSoohting() {
		int count = (int) values[12];
		//int speed = (int) values[13];
		int foot = (int) values[14];

		System.out.println("Torschuss - Treffer:		" + count);

		if (count > 5) {
			// innenVerteidiger += 1;
			// aussenVerteidiger += 1;
			zentralesMittelfeld += 2;
			// aeusresMittelfeld += 1;
			stuermer += 3;
		} else if (count > 2 && count <= 5) {
			// innenVerteidiger += 1;
			// aussenVerteidiger += 1;
			zentralesMittelfeld += 2;
			// aeusresMittelfeld += 1;
			stuermer += 2;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}

		if (foot == 3) {
			stuermer += 1;
		}
	}

}
