import javax.xml.crypto.Data;

public class DataCSV {
    public String Name;
    public String Country;
    public String YearActive;
    public String ProvenVictims;
    public String PosibbleVictims;
    public String Notes;

    public DataCSV() {

    }

    public DataCSV(String Name, String Country, String YearActive, String ProvenVictims, String PosibbleVictims, String Notes) {

        this.Name = Name;
        this.Country = Country;
        this.YearActive = YearActive;
        this.ProvenVictims = ProvenVictims;
        this.PosibbleVictims = PosibbleVictims;
        this.Notes = Notes;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getCountry(){
        return Country;
    }
    public void setCountry(String country) {
        this.Country = country;
    }
    public String getYearActive(){
        return YearActive;
    }
    public void setYearActive(String YearActive){
        this.YearActive = YearActive;
    }
    public String getProvenVictims(){
        return ProvenVictims;
    }
    public void setProvenVictims(String provenVictims) {
        this.ProvenVictims = provenVictims;
    }
    public String getPosibbleVictims() {
        return PosibbleVictims;
    }
    public void setPosibbleVictims(String posibbleVictims) {
       this.PosibbleVictims = posibbleVictims;
    }
    public String getNotes() {
        return Notes;
    }
    public void setNotes(String notes) {
       this.Notes = notes;
    }

    public void print(){
        System.out.println(" ");
        System.out.println("<==IDENTITAS PEMBUNUH==>");
        System.out.println("Nama = " + Name);
        System.out.println("Negara = " + Country);
        System.out.println("Tahun Aktif = " + YearActive);
        System.out.println("Korban Yang Ditemukan = " + ProvenVictims);
        System.out.println("Perkiraan Jumlah Korban = " + PosibbleVictims);
        System.out.println("Catatan = " + Notes);


    }


}

