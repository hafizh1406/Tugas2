 public class DataCSV {
        private String name;
        private String country;
        private String yearActive;
        private String provenVictims;
        private String possibleVictims;
        private String notes;

        public DataCSV() {}

        public DataCSV(String name, String country, String yearActive, String provenVictims, String possibleVictims, String notes) {
            this.name = name;
            this.country = country;
            this.yearActive = yearActive;
            this.provenVictims = provenVictims;
            this.possibleVictims = possibleVictims;
            this.notes = notes;
        }

        public String getName() {
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getCountry(){
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getYearActive(){
            return yearActive;
        }

        public void setYearActive(String yearActive){
            this.yearActive = yearActive;
        }

        public String getProvenVictims(){
            return provenVictims;
        }

        public void setProvenVictims(String provenVictims) {
            this.provenVictims = provenVictims;
        }

        public String getPossibleVictims() {
            return possibleVictims;
        }

        public void setPossibleVictims(String possibleVictims) {
            this.possibleVictims = possibleVictims;
        }

        public String getNotes() {
            return notes;
        }

        public void setNotes(String notes) {
            this.notes = notes;
        }

        public void print(){
            System.out.println();
            System.out.println("<==IDENTITAS PEMBUNUH==>");
            System.out.println("Nama = " + name);
            System.out.println("Negara = " + country);
            System.out.println("Tahun Aktif = " + yearActive);
            System.out.println("Korban Yang Ditemukan = " + provenVictims);
            System.out.println("Perkiraan Jumlah Korban = " + possibleVictims);
            System.out.println("Catatan = " + notes);
        }
    }



