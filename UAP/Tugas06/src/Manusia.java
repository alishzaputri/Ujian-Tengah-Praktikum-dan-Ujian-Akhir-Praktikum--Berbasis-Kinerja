// Nama: ALISHZA PUTRI RAHMADINA
// NIM: 215150700111013

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;
    private double tunjangan;
    private double pendapatan;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String gender(){
        if (isJenisKelamin() == true){
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }

    public double getTunjangan() {
        if (isMenikah() == true) {
            if (isJenisKelamin() == true) {
                return 25;
            } else return 20;
        } else return 15;
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    @Override
    public String toString() {
        return String.format("Nama          : " + getNama() +
                            "\nNIK           : " + getNIK() +
                            "\nJenis Kelamin : " + gender() +
                            "\nPendapatan    : " + getPendapatan() + "$" + "\n");
    }
}
