package Tugas_6_ArrayList;

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private boolean status; // true=Menikah ; false=Lajang
    
  
    public Mahasiswa(String nama, String jurusan, boolean status) {
      this.nama = nama;
      this.jurusan = jurusan;
      this.status = status;
    }
    
    public void setNama(String nama) {
      this.nama = nama;
    }
    public String getNama() {
      return this.nama;
    }
    public void setJurusan(String jurusan) {
      this.jurusan = jurusan;
    }
    public String getJurusan() {
      return this.jurusan;
    }
    public void setStatus(boolean status) {
      this.status = status;
    }
    public boolean getStatus() {
      return this.status;
    }
    
  }