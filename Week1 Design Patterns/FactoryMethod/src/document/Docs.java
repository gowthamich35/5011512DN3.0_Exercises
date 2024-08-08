package document;

public interface Docs {
    void read();
    void close();
    void save();
    void write(String txt);
}