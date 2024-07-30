package document;

public class WordDoc implements Docs{
	private String txt;

    @Override
    public void read() {
        System.out.println("Opening Word document...");
    }

    @Override
    public void close() {
        System.out.println("Closing Word document...");
    }

    @Override
    public void save() {
        System.out.println("Saving Word document with content: " + txt);
    }

    @Override
    public void write(String txt) {
        this.txt = txt;
        System.out.println("Writing into document: " + txt);
    }
}
