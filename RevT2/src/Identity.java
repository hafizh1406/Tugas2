public class Identity {
    public static void main(String[] args) {
        // Membuat objek VIP dengan data pembunuh berantai
        VIP vipKiller = new VIP("John Doe", "Brazil", "1980-1990", "10", "20", "Dikenal karena metode brutal", true);

        // Memanggil metode print() tanpa parameter
        vipKiller.print();

        // Memanggil metode print() dengan parameter string (informasi tambahan)
        vipKiller.print("Dikenal sebagai pembunuh berantai yang sangat cerdik.");

        // Memanggil metode print() dengan parameter boolean, menampilkan detail jika true
        vipKiller.print(true);

        // Memanggil metode print() dengan parameter boolean, hanya memanggil print() biasa jika false
        vipKiller.print(false);
    }
}

