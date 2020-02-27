package org.apache.pdfbox.spring.boot;

import org.apache.pdfbox.tools.PrintPDF;

public class PrintPFDWithJava {
	
	public static void main(String[] args) throws Exception {
		
		// pdf文件全路经
		String pdfPath = "d://word.pdf";

		// --silentPrint：静默打印
		PrintPDF.main(new String[] { "-silentPrint", pdfPath });
	}
	
}