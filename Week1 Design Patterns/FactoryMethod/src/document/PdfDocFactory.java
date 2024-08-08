package document;

public class PdfDocFactory extends DocFactory {
    @Override
    public Docs createDocument() {
        return new PdfDoc();
    }
}