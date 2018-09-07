import java.io.IOException;

public class Dosen {

    private String nama;
    private int kode;

    public Dosen(String nama, int kode) {
        this.nama = nama;
        this.kode = kode;
    }

    public static void main(String[] args) throws IOException { }

    @Override
    public String toString() {
        return "Mahasiswa{}";
    }

    public String getNama() {
        return nama;
    }

    public int getNpm() {
        return kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(int npm) { this.kode = npm; }

}
