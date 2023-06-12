package Tugas_5_Inheritance;

public class Manusia {
    private String nama;
    private boolean jenisKelamin = false;
    private String nik;
    private boolean menikah = false;

    public Manusia(String nama,String nik, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan(){
        if(menikah){
            if(jenisKelamin){
                return 25;
            } else {
                return 20;
            }
        } else{
            return 15;
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String toString(){
        if(jenisKelamin){
            return "Nama          : " + nama + "\nNIK           : " + nik + "\nJenis Kelamin : Laki Laki\nPendapatan    : " + getPendapatan();
        } else{
            return "Nama          : " + nama + "\nNIK           : " + nik + "\nJenis Kelamin : Perempuan\nPendapatan    : " + getPendapatan();
        }
    }
}
