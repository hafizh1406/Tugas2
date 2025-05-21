import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class TugasHafizh2 {
    public static void main(String[] args) {
        String namaFile = "serial_killers.csv";
        ArrayList<DataCSV> listCriminas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            String line;
            // Skip header CSV
            br.readLine();

            while ((line = br.readLine()) != null) {
                // Split CSV by comma, but ignore commas inside quotes
                String[] file = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                if (file.length < 6) {
                    System.out.println("Data tidak lengkap pada baris: " + line);
                    continue;
                }

                DataCSV data = new DataCSV();
                data.setName(file[0].trim().replaceAll("^\"|\"$", ""));
                data.setCountry(file[1].trim().replaceAll("^\"|\"$", ""));
                data.setYearActive(file[2].trim().replaceAll("^\"|\"$", ""));
                data.setProvenVictims(file[3].trim().replaceAll("^\"|\"$", ""));
                data.setPossibleVictims(file[4].trim().replaceAll("^\"|\"$", ""));
                data.setNotes(file[5].trim().replaceAll("^\"|\"$", ""));

                listCriminas.add(data);

                // Cetak data langsung setelah dimasukkan
                data.print();
            }
            System.out.println("<<================================================================================================>>");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Cetak data dengan kondisi country kosong (jika ada)
        for (DataCSV data : listCriminas) {
            if (data != null && data.getCountry().isEmpty()) {
                data.print();
            }
        }
        System.out.println("<<================================================================================================>>");
    }
}
