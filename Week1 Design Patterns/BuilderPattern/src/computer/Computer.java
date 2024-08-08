package computer;

public class Computer {
    private String CPU;
    private String RAM;
    private String GPU;
    private String storage;

    private Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.GPU = builder.GPU;
        this.storage = builder.storage;
    }
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public String getGPU(){return GPU;}
    
    public String getInfo(){
        return String.format("CPU: %s%nRAM: %s%nStorage: %s%nGraphics Card: %s%n",
        CPU, RAM, storage, GPU);
    }


    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;
        
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}