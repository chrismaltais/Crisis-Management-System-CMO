package cmo.pdf;

public interface PDFConverter {
	
	// input entity object with pdf byte data. returns location.
	public String convertToPdf(Object o);
	
	// input pdf file's location. returns as byte.
	public byte[] convertToByte(String filepath);

}
