public class Hardware {
    private int id;
    private String brand;
    private int spec;
    private String type;

    public Hardware(int id, String brand, int spec, String type) {
        this.id = id;
        this.brand = brand;
        this.spec = spec;
        this.type = type;
    }

    public int getId() { return id; }
    public String getBrand() { return brand; }
    public int getSpec() { return spec; }
    public String getType() { return type; }

    public String getSpecDisplay() {
        return String.valueOf(spec);
    }

    @Override
    public String toString() {
        return String.format("%-5d %-20s %-15s %-15s",
                id, brand, getType(), getSpecDisplay());
    }
}