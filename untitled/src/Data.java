public class Data {
    private String Merk;
    private String Nama;
    private String Jumlah;
    private String Jarak;


    public Data() {
    }

    public Data(String merk, String nama, String jumlah, String jarak, String hasil) {
        Merk = merk;
        Nama = nama;
        Jumlah = jumlah;
        Jarak = jarak;

    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String merk) {
        Merk = merk;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getJumlah() {
        return Jumlah;
    }

    public void setJumlah(String jumlah) {
        Jumlah = jumlah;
    }

    public String getJarak() {
        return Jarak;
    }

    public void setJarak(String jarak) {
        Jarak = jarak;
    }




}
