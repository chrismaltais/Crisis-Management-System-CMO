package cmo.pdf;

public interface PDFConverter<T extends Object> {
	
	// input entity object with pdf byte data. returns location.
	public String convertToPdf(T o);
	
	// Convert file to base64 encoded String
	public T convertToByteArray(T object, String filepath);

}
