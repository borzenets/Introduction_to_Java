public class Laptop {
    private final String vendor;
    private final String model;
    private final String cpu;
    private Integer ram;
    private Integer rom;
    private String os;
    private final String color;

    public Laptop(String vendor,
                  String model,
                  String cpu,
                  Integer ram,
                  Integer rom,
                  String os,
                  String color){
        this.vendor = vendor;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.rom = rom;
        this.os = os;
        this.color = color;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public String getCpu() {
        return cpu;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getRom() {
        return rom;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    public String getInfo(){
        return String.format("%s - %s, CPU: %s, ОЗУ: %d Гб, ЖД: %d Гб, ОС: %s, цвет: %s.",
                vendor, model, cpu, ram, rom, os, color);
    }
}