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

		// Zweikampf off.
		evalDuellOffensive();

		// Zweikamf def.
		evalDuellsDefensive();

		// Spielverst.
		evalTactics();

		// Dribbling
		evalBallQuali();

		// Torschuss
		evalSoohting();

		string = "Innenverteidiger: " + innenVerteidiger
				+ "\nAußenverteidiger: " + aussenVerteidiger
				+ "\nzentrales Mittelfeld: " + zentralesMittelfeld
				+ "\näußeres Mittelfeld: " + aeusresMittelfeld + "\nStürmer: "
				+ stuermer;

		return string;
	}

	private void evalEndurance() {
		double m = values[0];
		// TODO

	}

	private void evalSpeed() {
		// Zeit der Abschnitte auf 1m
		double t_1mAntritt = values[1] / 5;
		double t_1mBeschl = values[2] / 10;
		double t_1mGrundschn = values[3] / 30;

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
		if (values[4] >= 0.2) {
			// TODO
		}
	}

	private void evalPassesShort() {
		int x = (int) values[5];

		if (values[5] >= 7) {
			// TODO
		}
	}

	private void evalPassesLong() {
		int x = (int) values[6];

		if (x >= 7) {
			innenVerteidiger += 1;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 3;
			aeusresMittelfeld += 2;
			stuermer += 1;
		} else if (x >= 3 && x < 7) {
			innenVerteidiger += 1;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 2;
			aeusresMittelfeld += 2;
			stuermer += 1;
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

		if (x >= 7) {
			innenVerteidiger += 1;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 3;
			stuermer += 1;
		} else if (x >= 3 && x < 7) {
			innenVerteidiger += 1;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 2;
			stuermer += 1;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}
	}

	private void evalDuellOffensive() {
		int x = (int) values[8];

		if (x >= 7) {
			innenVerteidiger += 1;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 2;
			stuermer += 3;
		} else if (x >= 3 && x < 7) {
			innenVerteidiger += 1;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 1;
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

	private void evalDuellsDefensive() {
		int x = (int) values[9];

		if (x >= 7) {
			innenVerteidiger += 3;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		} else if (x >= 3 && x < 7) {
			innenVerteidiger += 2;
			aussenVerteidiger += 2;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}

	}

	private void evalTactics() {
		int x = (int) values[10];

		switch (x) {
		case 3:
			innenVerteidiger += 2;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 3;
			aeusresMittelfeld += 1;
			stuermer += 1;
		case 2:
			innenVerteidiger += 2;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 2;
			aeusresMittelfeld += 1;
			stuermer += 1;
		case 1:
			innenVerteidiger += 2;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
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
		// TODO
		if (count >= 33) {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 2;
			aeusresMittelfeld += 1;
			stuermer += 3;
		} else if (count > 21 && count < 33) {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 2;
			aeusresMittelfeld += 1;
			stuermer += 2;
		} else {
			innenVerteidiger += 1;
			aussenVerteidiger += 1;
			zentralesMittelfeld += 1;
			aeusresMittelfeld += 1;
			stuermer += 1;
		}
	}

}
