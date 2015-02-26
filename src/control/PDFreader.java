package control;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;

import view.Progress_Bar_Window;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PDFreader {

	String path;
	PdfReader reader;

	public PDFreader(String dataPath) {
		path = dataPath;
	}

	public void readPDF() {

		int a = 1;

		// RUND UM EXCEL
		// Erstellt Excel Datei
		HSSFWorkbook datei = new HSSFWorkbook();
		// Erstellt Datenblatt in Excel Datei, Name Sheet in die Klammer
		Sheet blatt = datei.createSheet();

		// VARIABLEN VON INSTAT
		String aktionenProSpiel = null;
		String erfolgreicheAktionenProSpiel = null;
		String namePDF = null;
		String schüsseProSpiel = null;
		String schüsseAufDasTor = null;
		String fouls = null;
		String foulsGegenIhn = null;
		String pässe = null;
		String pässePräzise = null;
		String zweikämpfe = null;
		String zweikämpfeGewonnen = null;
		String abgefangene = null;
		String abgefangeneInHälfteGegner = null;
		String ballverlust = null;
		String ballverlustEigeneHälfte = null;

		// KOPFZEILE ANLEGEN
		Cell nameKopf = blatt.createRow(0).createCell(0);
		Cell aktionenProSpielKopf = blatt.createRow(0).createCell(1);
		Cell erfolgreicheAktionenProSpielKopf = blatt.createRow(0)
				.createCell(2);
		Cell schüsseKopf = blatt.createRow(0).createCell(3);
		Cell schüsseTorKopf = blatt.createRow(0).createCell(4);
		Cell foulsKopf = blatt.createRow(0).createCell(5);
		Cell foulsGegenIhnKopf = blatt.createRow(0).createCell(6);
		Cell pässeKopf = blatt.createRow(0).createCell(7);
		Cell pässePräziseKopf = blatt.createRow(0).createCell(8);
		Cell zweikämpfeKopf = blatt.createRow(0).createCell(9);
		Cell zweikämpfeGewonnenKopf = blatt.createRow(0).createCell(10);
		Cell abgefangeneKopf = blatt.createRow(0).createCell(11);
		Cell abgefangeneInHälfteGegnerKopf = blatt.createRow(0).createCell(12);
		Cell ballverlustKopf = blatt.createRow(0).createCell(13);
		Cell ballverlustEigeneHälfteKopf = blatt.createRow(0).createCell(14);

		// ZELLEN KOPFZEILE BENENNNEN
		nameKopf.setCellValue("Name");
		aktionenProSpielKopf.setCellValue("Aktionen");
		erfolgreicheAktionenProSpielKopf.setCellValue("erfolgreiche Aktionen");
		schüsseKopf.setCellValue("Schüsse");
		schüsseTorKopf.setCellValue("Schüsse Tor");
		foulsKopf.setCellValue("Fouls");
		foulsGegenIhnKopf.setCellValue("Fouls gegen ihn");
		pässeKopf.setCellValue("Pässe");
		pässePräziseKopf.setCellValue("Präzise Pässe");
		zweikämpfeKopf.setCellValue("Zweikämpfe");
		zweikämpfeGewonnenKopf.setCellValue("Gewonnene Zweikämpfe");
		abgefangeneKopf.setCellValue("abgefangene");
		abgefangeneInHälfteGegnerKopf
				.setCellValue("in Häfte Gegner abgefangen");
		ballverlustKopf.setCellValue("Ballverlust");
		ballverlustEigeneHälfteKopf.setCellValue("Ballverlust eigene Hälfte");

		try {
			reader = new PdfReader(path);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		int numberOfPages = reader.getNumberOfPages();

		for (int i = 2; i <= numberOfPages; i++) {

			// Variable ErfolgreicheAktionenProSpiel einlesen
			try {
				erfolgreicheAktionenProSpiel = PdfTextExtractor
						.getTextFromPage(reader, i).substring(
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("erfolgreiche") + 18,
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("%") - 3);

				aktionenProSpiel = PdfTextExtractor.getTextFromPage(reader, i)
						.substring(
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("erfolgreiche") + 13,
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("erfolgreiche") + 16);

				namePDF = PdfTextExtractor.getTextFromPage(reader, i)
						.substring(
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf(".") + 1,
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("#") - 1);

				schüsseProSpiel = PdfTextExtractor.getTextFromPage(reader, i)
						.substring(
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("Tor") + 3,
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("Tor") + 6);

				schüsseAufDasTor = PdfTextExtractor.getTextFromPage(reader, i)
						.substring(
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("Tor") + 7,
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("Tor") + 9);

				fouls = PdfTextExtractor.getTextFromPage(reader, i).substring(
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"ihn") + 3,
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"ihn") + 6);

				foulsGegenIhn = PdfTextExtractor.getTextFromPage(reader, i)
						.substring(
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("ihn") + 7,
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("ihn") + 9);

				pässe = PdfTextExtractor.getTextFromPage(reader, i).substring(
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"ise") + 3,
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"ise") + 7);

				pässePräzise = PdfTextExtractor.getTextFromPage(reader, i)
						.substring(
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("ise") + 8,
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("ise") + 12);

				zweikämpfeGewonnen = PdfTextExtractor
						.getTextFromPage(reader, i).substring(
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("gewonnene") + 13,
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("gewonnene") + 17);

				abgefangene = PdfTextExtractor.getTextFromPage(reader, i)
						.substring(
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("fte") + 3,
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("fte") + 6);

				ballverlust = PdfTextExtractor.getTextFromPage(reader, i)
						.substring(
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("Ballverlust") + 32,
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("Ballverlust") + 34);

				ballverlustEigeneHälfte = PdfTextExtractor.getTextFromPage(
						reader, i).substring(
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"Ballverlust") + 35,
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"Ballverlust") + 38);

				abgefangeneInHälfteGegner = PdfTextExtractor.getTextFromPage(
						reader, i).substring(
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"fte") + 7,
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"fte") + 9);

				zweikämpfe = PdfTextExtractor.getTextFromPage(reader, i)
						.substring(
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("gewonnene") + 9,
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("gewonnene") + 12);
			} catch (IOException e) {

				e.printStackTrace();
			}

			// ZEllEN ANLEGEN
			Cell name = blatt.createRow(a).createCell(0); // Name
			Cell cell1 = blatt.createRow(a).createCell(1); // Aktionen pro Spiel
			Cell cell2 = blatt.createRow(a).createCell(2); // erfolgreiche
															// Aktionen pro
															// Spiel
			Cell cell3 = blatt.createRow(a).createCell(3); // Schüsse
			Cell cell4 = blatt.createRow(a).createCell(4); // Schüsse aufs Tor
			Cell cell5 = blatt.createRow(a).createCell(5); // Fouls
			Cell cell6 = blatt.createRow(a).createCell(6); // Fouls gegen Ihn
			Cell cell7 = blatt.createRow(a).createCell(7); // Pässe
			Cell cell8 = blatt.createRow(a).createCell(8); // Pässe präzise
			Cell cell9 = blatt.createRow(a).createCell(9); // Zweikämpfe
			Cell cell10 = blatt.createRow(a).createCell(10); // gewonne
																// Zweikämpfe
			Cell cell11 = blatt.createRow(a).createCell(11); // abgefangene
																// Bälle
			Cell cell12 = blatt.createRow(a).createCell(12); // in gegnerischer
																// Hälfte
																// abgefangene
																// Bälle
			Cell cell13 = blatt.createRow(a).createCell(13); // Ballverlust
			Cell cell14 = blatt.createRow(a).createCell(14); // Ballverlust in
																// der eigenen
																// Hälfte
			Cell cell15 = blatt.createRow(a).createCell(15); // noch offen
			Cell cell16 = blatt.createRow(a).createCell(16);
			// ZELLEN WERTE ZUWEISEN
			name.setCellValue(namePDF.trim());
			cell1.setCellValue(aktionenProSpiel);
			cell2.setCellValue(erfolgreicheAktionenProSpiel);

			cell13.setCellValue(ballverlust);
			cell14.setCellValue(ballverlustEigeneHälfte);

			if (schüsseProSpiel.trim().equals("-")) {
				cell3.setCellValue(0);
			} else
				cell3.setCellValue(schüsseProSpiel);

			if (schüsseAufDasTor.trim().equals("-")) {
				cell4.setCellValue(0);
			} else
				cell4.setCellValue(schüsseAufDasTor);

			if (fouls.trim().equals("-")) {
				cell5.setCellValue(0);
			} else
				cell5.setCellValue(fouls);

			if (foulsGegenIhn.trim().equals("-")) {
				cell6.setCellValue(0);
			} else
				cell6.setCellValue(foulsGegenIhn);

			if (pässe.trim().contains("/")) {
				cell7.setCellValue(pässe.substring(0, 2));
			} else
				cell7.setCellValue(pässe);

			if (pässePräzise.trim().contains("/")) {
				cell8.setCellValue(pässePräzise.substring(1,
						pässePräzise.length()));

			} else if (pässe.length() > 1) {
				cell8.setCellValue(pässePräzise);
			} else
				cell8.setCellValue(pässePräzise.substring(0, pässePräzise
						.trim().length() - 1));

			if (zweikämpfe.trim().equals("-")) {
				cell9.setCellValue(0);
			} else
				cell9.setCellValue(zweikämpfe);

			if (zweikämpfeGewonnen.trim().equals("-")) {
				cell10.setCellValue(0);
			} else if (zweikämpfeGewonnen.trim().contains("/")) {
				cell10.setCellValue(zweikämpfeGewonnen.substring(1,
						zweikämpfeGewonnen.length()));
			} else if (zweikämpfe.length() == 2) {
				cell10.setCellValue(zweikämpfeGewonnen);
			} else
				cell10.setCellValue(zweikämpfeGewonnen.substring(0,
						zweikämpfeGewonnen.length() - 1));
			if (abgefangene.trim().equals("-")) {
				cell11.setCellValue(0);
			} else
				cell11.setCellValue(abgefangene);

			if (abgefangeneInHälfteGegner.trim().equals("-")) {
				cell12.setCellValue(0);
			} else
				cell12.setCellValue(abgefangeneInHälfteGegner);

			// COUNTER UM 1 ERHÖHEN
			a++;

			// AUTOSIZE
			blatt.autoSizeColumn(0);
			blatt.autoSizeColumn(1);
			blatt.autoSizeColumn(2);
			blatt.autoSizeColumn(3);
			blatt.autoSizeColumn(4);
			blatt.autoSizeColumn(5);
			blatt.autoSizeColumn(6);
			blatt.autoSizeColumn(7);

		}

		try {
			FileOutputStream exceloutput = new FileOutputStream(
					"DatenWolfsburg.xls");
			datei.write(exceloutput);
			// TO-DO: new Window with Data
			// Window with Algorithm and Details from Data
			System.out.println("FERTIG");

		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
