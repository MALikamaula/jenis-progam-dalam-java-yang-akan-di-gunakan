
public class Data {
    private int nilai;
    private String deskripsi;

    // Konstruktor
    public Data(int nilai, String deskripsi) {
        this.nilai = nilai;
        this.deskripsi = deskripsi;
    }

    // Getter dan Setter untuk nilai
    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    // Getter dan Setter untuk deskripsi
    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek data1 dari kelas Data
        Data data1 = new Data(10, "Ini adalah data pertama");

        // Menampilkan nilai dan deskripsi dari data1
        System.out.println("Nilai data1: " + data1.getNilai());
        System.out.println("Deskripsi data1: " + data1.getDeskripsi());

        // Mengubah nilai dan deskripsi dari data1
        data1.setNilai(20);
        data1.setDeskripsi("Ini adalah data pertama yang sudah diubah");

        // Menampilkan nilai dan deskripsi dari data1 setelah diubah
        System.out.println("Nilai data1 setelah diubah: " + data1.getNilai());
        System.out.println("Deskripsi data1 setelah diubah: " + data1.getDeskripsi());
    }
}
 