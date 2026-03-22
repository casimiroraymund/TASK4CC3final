import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HardwareRepository {

    private static final String DB_URL = "jdbc:sqlite:C:\\Users\\kench\\Downloads\\Task4.db";

    public List<Hardware> getAllHardware() {

        List<Hardware> hardwareList = new ArrayList<>();

        String sql = "SELECT ID as id, BRAND as brand, SPEC as spec, TYPE as type FROM tbl_hardware";

        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                int id = rs.getInt("id");
                String brand = rs.getString("brand");
                int spec = rs.getInt("spec");
                String type = rs.getString("type");

                if (type.equalsIgnoreCase("Laptop")) {
                    hardwareList.add(new Laptop(id, brand, spec));
                }
                else if (type.equalsIgnoreCase("Phone")) {
                    hardwareList.add(new Phone(id, brand, spec));
                }
            }
            while (rs.next()) {

                int id = rs.getInt("id");
                String brand = rs.getString("brand");
                int spec = rs.getInt("spec");
                String type = rs.getString("type");

                if (type.equalsIgnoreCase("Laptop")) {
                    hardwareList.add(new Laptop(id, brand, spec));
                } else if (type.equalsIgnoreCase("Phone")) {
                    hardwareList.add(new Phone(id, brand, spec));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return hardwareList;
    }
}