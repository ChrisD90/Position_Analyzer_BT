package control;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser {

	JFileChooser chooser;
	
	public FileChooser() {

		chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"PDF Files", "pdf");
		chooser.setFileFilter(filter);
		chooser.showOpenDialog(chooser);
		
		//System.out.println(chooser.getSelectedFile().getAbsolutePath());
	}

	public String dataPath() {
		return chooser.getSelectedFile().getAbsolutePath();
	}
}
