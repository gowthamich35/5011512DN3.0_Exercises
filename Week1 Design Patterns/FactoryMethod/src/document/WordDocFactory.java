package document;

public class WordDocFactory extends DocFactory {
    @Override
    public Docs createDocument() {
        return new WordDoc();
    }
}