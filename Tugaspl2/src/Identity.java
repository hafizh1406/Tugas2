 public class Identity {
    public static void main(String[] args) {
        VIP vipKiller = new VIP("John Doe", "Brazil", "1980-1990", "10", "20", "Dikenal karena metode brutal", true);

        vipKiller.print();

        vipKiller.print("Dikenal sebagai pembunuh berantai yang sangat cerdik.");

        //overload dengan parameter boolean
        vipKiller.print(true);
        vipKiller.print(false);
    }
}

