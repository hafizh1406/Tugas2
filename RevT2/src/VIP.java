public class VIP extends DataCSV {
    private boolean serialKiller;

    public VIP(String name, String country, String yearActive, String provenVictims, String possibleVictims, String notes, boolean serialKiller) {
        super(name, country, yearActive, provenVictims, possibleVictims, notes);
        this.serialKiller = serialKiller;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Pembunuhan yang terjadi pada periode 1960++");
    }

    // Overload print dengan parameter String untuk informasi tambahan
    public void print(String additionalInfo) {
        super.print();
        System.out.println("Pembunuhan yang terjadi pada periode 1960++");
        System.out.println("Informasi Tambahan: " + additionalInfo);
    }

    // Overload print dengan parameter boolean untuk detail atau default
    public void print(boolean detailed) {
        if (detailed) {
            System.out.println("=== DETAIL PEMBUNUH ===");
            System.out.println("Nama: " + getName());
            System.out.println("Negara: " + getCountry());
            System.out.println("Tahun Aktif: " + getYearActive());
            System.out.println("Korban yang Ditemukan: " + getProvenVictims());
            System.out.println("Perkiraan Jumlah Korban: " + getPossibleVictims());
            System.out.println("Catatan: " + getNotes());
            System.out.println("Status Serial Killer: " + (serialKiller ? "Ya" : "Tidak"));
        } else {
            print();
        }
    }
}
