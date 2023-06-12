package Tugas_6_ArrayList;

public class MainMahasiswa {
    public static void main(String[] args) {
  
      // Lakukan modifikasi data tambah mahasiswa 
      DataMahasiswa.tambahMahasiswa("Adam Kipli", "Teknologi Informasi", false);
      DataMahasiswa.tambahMahasiswa("Sutris Sumanto", "Teknik Informatika", true);
      DataMahasiswa.tambahMahasiswa("Siti Markonah", "Sistem Informasi", false);
  
      // Method tampilkanData
      DataMahasiswa.tampilkanData();
      
      // Method cariMahasiswa (jika data ada)
      System.out.println("============== Cari Mahasiswa ==============");
      Mahasiswa m1 = DataMahasiswa.cariMahasiswa("Adam Kipli");
      if (m1 != null) {
        System.out.println("Data mahasiswa atas nama " + m1.getNama() + " ditemukan.");
      } else {
        System.out.println("Data mahasiswa tidak ditemukan.");
      }
  
      // Method cariMahasiswa (jika data tidak ada)
      System.out.println("\n");
      System.out.println("============== Cari Mahasiswa ==============");
      Mahasiswa m2 = DataMahasiswa.cariMahasiswa("Didik Mulyadi");
      if (m2 != null) {
        System.out.println("Data mahasiswa atas nama " + m2.getNama() + " ditemukan.");
      } else {
        System.out.println("Data mahasiswa tidak ditemukan.");
      }
      
      // Method tampilkanMahasiswa (sebelum diupdate)
      System.out.println("\n");
      System.out.println("============= Sebelum diupdate =============");
      DataMahasiswa.tampilkanMahasiswa(m1);
      
      // Method tampilkanMahasiswa (setelah diupdate)
      DataMahasiswa.updateMahasiswa("Adam Kipli", "Magister Ilmu Komputer", true);
      System.out.println("============= Setelah diupdate =============");
      DataMahasiswa.tampilkanMahasiswa(m1);
    }
  }