package computer;

public class BuilderPaattern {
    public static void main(String[] args) throws Exception {
        Computer pc = new Computer.Builder()
            .setCPU("Intel i7")
            .setGPU("GT370")
            .setRAM("16 GB")
            .setStorage("500GB")
            .build();
        System.out.println(pc.getInfo());
    }
}
