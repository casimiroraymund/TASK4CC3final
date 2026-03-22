import java.util.List;

public class Main {
    public static void main(String[] args) {

        HardwareRepository repo = new HardwareRepository();
        List<Hardware> hardwareList = repo.getAllHardware();

        System.out.println("=== HARDWARE MASTERLIST ===");
        System.out.printf("%-5s %-20s %-15s %-15s%n", "ID", "Brand", "Type", "Spec");
        System.out.println("----------------------------------------------------");

        for (Hardware h : hardwareList) {
            System.out.println(h);
        }

        int total16GBLaptops = 0;
        int total32GBLaptops = 0;
        int total50MPPhones = 0;

        int total48MPPhones = 0;
        int total16MPPhones = 0;

        for (Hardware h : hardwareList) {
            if (h instanceof Laptop) {
                Laptop laptop = (Laptop) h;
                if (laptop.getSpec() == 16) total16GBLaptops++;
                if (laptop.getSpec() == 32) total32GBLaptops++;
            }
            else if (h instanceof Phone) {
                Phone phone = (Phone) h;
                if (phone.getSpec() == 50) total50MPPhones++;
                if (phone.getSpec() == 48) total48MPPhones++;
                if (phone.getSpec() == 16) total16MPPhones++;
            }
        }

        System.out.println("\n=== LAPTOP AND PHONE INVENTORY ===");
        System.out.println("Total 16GB Laptops: " + total16GBLaptops);
        System.out.println("Total 32GB Laptops: " + total32GBLaptops);
        System.out.println("Total 50MP Phones: " + total50MPPhones);
        System.out.println("Total 48MP Phones: " + total48MPPhones);
        System.out.println("Total 16MP Phones: " + total16MPPhones);
    }
}
