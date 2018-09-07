import java.io.IOException;

public class Mahasiswa {

    private String nama;
    private int npm;

    public Mahasiswa(String nama, int npm) {
        this.nama = nama;
        this.npm = npm;
    }

    public static void main(String[] args) throws IOException {

    }

    @Override
    public String toString() {
        return "Mahasiswa{}";
    }

    public String getNama() {
        return nama;
    }

    public int getNpm() {
        return npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(int npm) {
        this.npm = npm;
    }

}


