public class VIP extends DataCSV {
    public boolean SerialKiller;

    public VIP(String Name, String Country, String YearActive, String ProvenVictims, String PosibbleVictims, String Notes, boolean SerialKiller) {
        super(Name, Country, YearActive, ProvenVictims, PosibbleVictims, Notes);
        this.SerialKiller = SerialKiller;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Pembunuhan yang terjadi pada periode 1960++ ");
    }

    public void print(String additionalInfo) {
        super.print();
        System.out.println("Pembunuhan yang terjadi pada periode 1960++ ");
        System.out.println("Informasi Tambahan: " + additionalInfo);
    }

    public void print(boolean detailed) {
        if (detailed) {
            System.out.println("=== DETAIL PEMBUNUH ===");
            System.out.println("Nama: " + getName());
            System.out.println("Negara: " + getCountry());
            System.out.println("Tahun Aktif: " + getYearActive());
            System.out.println("Korban yang Ditemukan: " + getProvenVictims());
            System.out.println("Perkiraan Jumlah Korban: " + getPosibbleVictims());
            System.out.println("Catatan: " + getNotes());
            System.out.println("Status Serial Killer: " + (SerialKiller ? "Ya" : "Tidak"));
        } else {
            print();
        }
    }
}