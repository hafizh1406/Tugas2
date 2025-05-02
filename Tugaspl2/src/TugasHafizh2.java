
import java.io.BufferedReader;
import java.io.FileReader;

public class TugasHafizh2 {
    public static void main(String[] args) {

        String namaFile = "serial_killers.csv";
        DataCSV[] listCriminas = new DataCSV[99999];

        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            String line = "";
            br.readLine(); // Skip first line
            int idx = 0;

            while ((line = br.readLine()) != null) {
                String[] file = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");;
                DataCSV data = new DataCSV();
                if(file.length <6 ){
                    System.out.println(",");
                    continue;
                }
                data.Name = file[0];
                data.Country = file[1];
                data.YearActive = file[2];
                data.ProvenVictims = file[3];
                data.PosibbleVictims = file[4];
                data.Notes = file[5];

                listCriminas[idx] = data;
                data.print();
                idx++;
            }
            System.out.println("<<================================================================================================>>");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for(DataCSV data  : listCriminas){
            if (data != null && data.Country.equalsIgnoreCase("")) {
                data.print();
            }
        }
        System.out.println("<<================================================================================================>>");

    }
}