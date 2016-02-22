import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PDFReadExample
{
	public static void main(String args[])
	{
		try {
				PdfReader pdfReader = new PdfReader("/home/anshul/Downloads/ishare.pdf");
				int pages = pdfReader.getNumberOfPages();
				for(int i=1; i<=pages; i++)
				{
					String pageContent = PdfTextExtractor.getTextFromPage(pdfReader, i);
					System.out.println("Content on Page "+ i + ": " + pageContent);

				}
				pdfReader.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}
}