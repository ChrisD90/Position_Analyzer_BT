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
		String sch�sseProSpiel = null;
		String sch�sseAufDasTor = null;
		String fouls = null;
		String foulsGegenIhn = null;
		String p�sse = null;
		String p�ssePr�zise = null;
		String zweik�mpfe = null;
		String zweik�mpfeGewonnen = null;
		String abgefangene = null;
		String abgefangeneInH�lfteGegner = null;
		String ballverlust = null;
		String ballverlustEigeneH�lfte = null;

		// KOPFZEILE ANLEGEN
		Cell nameKopf = blatt.createRow(0).createCell(0);
		Cell aktionenProSpielKopf = blatt.createRow(0).createCell(1);
		Cell erfolgreicheAktionenProSpielKopf = blatt.createRow(0)
				.createCell(2);
		Cell sch�sseKopf = blatt.createRow(0).createCell(3);
		Cell sch�sseTorKopf = blatt.createRow(0).createCell(4);
		Cell foulsKopf = blatt.createRow(0).createCell(5);
		Cell foulsGegenIhnKopf = blatt.createRow(0).createCell(6);
		Cell p�sseKopf = blatt.createRow(0).createCell(7);
		Cell p�ssePr�ziseKopf = blatt.createRow(0).createCell(8);
		Cell zweik�mpfeKopf = blatt.createRow(0).createCell(9);
		Cell zweik�mpfeGewonnenKopf = blatt.createRow(0).createCell(10);
		Cell abgefangeneKopf = blatt.createRow(0).createCell(11);
		Cell abgefangeneInH�lfteGegnerKopf = blatt.createRow(0).createCell(12);
		Cell ballverlustKopf = blatt.createRow(0).createCell(13);
		Cell ballverlustEigeneH�lfteKopf = blatt.createRow(0).createCell(14);

		// ZELLEN KOPFZEILE BENENNNEN
		nameKopf.setCellValue("Name");
		aktionenProSpielKopf.setCellValue("Aktionen");
		erfolgreicheAktionenProSpielKopf.setCellValue("erfolgreiche Aktionen");
		sch�sseKopf.setCellValue("Sch�sse");
		sch�sseTorKopf.setCellValue("Sch�sse Tor");
		foulsKopf.setCellValue("Fouls");
		foulsGegenIhnKopf.setCellValue("Fouls gegen ihn");
		p�sseKopf.setCellValue("P�sse");
		p�ssePr�ziseKopf.setCellValue("Pr�zise P�sse");
		zweik�mpfeKopf.setCellValue("Zweik�mpfe");
		zweik�mpfeGewonnenKopf.setCellValue("Gewonnene Zweik�mpfe");
		abgefangeneKopf.setCellValue("abgefangene");
		abgefangeneInH�lfteGegnerKopf
				.setCellValue("in H�fte Gegner abgefangen");
		ballverlustKopf.setCellValue("Ballverlust");
		ballverlustEigeneH�lfteKopf.setCellValue("Ballverlust eigene H�lfte");

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

				sch�sseProSpiel = PdfTextExtractor.getTextFromPage(reader, i)
						.substring(
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("Tor") + 3,
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("Tor") + 6);

				sch�sseAufDasTor = PdfTextExtractor.getTextFromPage(reader, i)
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

				p�sse = PdfTextExtractor.getTextFromPage(reader, i).substring(
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"ise") + 3,
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"ise") + 7);

				p�ssePr�zise = PdfTextExtractor.getTextFromPage(reader, i)
						.substring(
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("ise") + 8,
								PdfTextExtractor.getTextFromPage(reader, i)
										.indexOf("ise") + 12);

				zweik�mpfeGewonnen = PdfTextExtractor
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

				ballverlustEigeneH�lfte = PdfTextExtractor.getTextFromPage(
						reader, i).substring(
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"Ballverlust") + 35,
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"Ballverlust") + 38);

				abgefangeneInH�lfteGegner = PdfTextExtractor.getTextFromPage(
						reader, i).substring(
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"fte") + 7,
						PdfTextExtractor.getTextFromPage(reader, i).indexOf(
								"fte") + 9);

				zweik�mpfe = PdfTextExtractor.getTextFromPage(reader, i)
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
			Cell cell3 = blatt.createRow(a).createCell(3); // Sch�sse
			Cell cell4 = blatt.createRow(a).createCell(4); // Sch�sse aufs Tor
			Cell cell5 = blatt.createRow(a).createCell(5); // Fouls
			Cell cell6 = blatt.createRow(a).createCell(6); // Fouls gegen Ihn
			Cell cell7 = blatt.createRow(a).createCell(7); // P�sse
			Cell cell8 = blatt.createRow(a).createCell(8); // P�sse pr�zise
			Cell cell9 = blatt.createRow(a).createCell(9); // Zweik�mpfe
			Cell cell10 = blatt.createRow(a).createCell(10); // gewonne
																// Zweik�mpfe
			Cell cell11 = blatt.createRow(a).createCell(11); // abgefangene
																// B�lle
			Cell cell12 = blatt.createRow(a).createCell(12); // in gegnerischer
																// H�lfte
																// abgefangene
																// B�lle
			Cell cell13 = blatt.createRow(a).createCell(13); // Ballverlust
			Cell cell14 = blatt.createRow(a).createCell(14); // Ballverlust in
																// der eigenen
																// H�lfte
			Cell cell15 = blatt.createRow(a).createCell(15); // noch offen
			Cell cell16 = blatt.createRow(a).createCell(16);
			// ZELLEN WERTE ZUWEISEN
			name.setCellValue(namePDF.trim());
			cell1.setCellValue(aktionenProSpiel);
			cell2.setCellValue(erfolgreicheAktionenProSpiel);

			cell13.setCellValue(ballverlust);
			cell14.setCellValue(ballverlustEigeneH�lfte);

			if (sch�sseProSpiel.trim().equals("-")) {
				cell3.setCellValue(0);
			} else
				cell3.setCellValue(sch�sseProSpiel);

			if (sch�sseAufDasTor.trim().equals("-")) {
				cell4.setCellValue(0);
			} else
				cell4.setCellValue(sch�sseAufDasTor);

			if (fouls.trim().equals("-")) {
				cell5.setCellValue(0);
			} else
				cell5.setCellValue(fouls);

			if (foulsGegenIhn.trim().equals("-")) {
				cell6.setCellValue(0);
			} else
				cell6.setCellValue(foulsGegenIhn);

			if (p�sse.trim().contains("/")) {
				cell7.setCellValue(p�sse.substring(0, 2));
			} else
				cell7.setCellValue(p�sse);

			if (p�ssePr�zise.trim().contains("/")) {
				cell8.setCellValue(p�ssePr�zise.substring(1,
						p�ssePr�zise.length()));

			} else if (p�sse.length() > 1) {
				cell8.setCellValue(p�ssePr�zise);
			} else
				cell8.setCellValue(p�ssePr�zise.substring(0, p�ssePr�zise
						.trim().length() - 1));

			if (zweik�mpfe.trim().equals("-")) {
				cell9.setCellValue(0);
			} else
				cell9.setCellValue(zweik�mpfe);

			if (zweik�mpfeGewonnen.trim().equals("-")) {
				cell10.setCellValue(0);
			} else if (zweik�mpfeGewonnen.trim().contains("/")) {
				cell10.setCellValue(zweik�mpfeGewonnen.substring(1,
						zweik�mpfeGewonnen.length()));
			} else if (zweik�mpfe.length() == 2) {
				cell10.setCellValue(zweik�mpfeGewonnen);
			} else
				cell10.setCellValue(zweik�mpfeGewonnen.substring(0,
						zweik�mpfeGewonnen.length() - 1));
			if (abgefangene.trim().equals("-")) {
				cell11.setCellValue(0);
			} else
				cell11.setCellValue(abgefangene);

			if (abgefangeneInH�lfteGegner.trim().equals("-")) {
				cell12.setCellValue(0);
			} else
				cell12.setCellValue(abgefangeneInH�lfteGegner);

			// COUNTER UM 1 ERH�HEN
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
