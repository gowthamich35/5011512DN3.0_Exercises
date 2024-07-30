package document;

public class XlsDocFactory extends DocFactory {
    @Override
    public Docs createDocument() {
        return new XlsDoc();
    }
}