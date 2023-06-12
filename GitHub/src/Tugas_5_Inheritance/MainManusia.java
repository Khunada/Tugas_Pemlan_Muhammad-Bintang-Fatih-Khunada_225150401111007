package Tugas_5_Inheritance;

import java.time.LocalDate;
public class MainManusia {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Ritzu", "111", true, true);
        System.out.println(manusia1.toString());
        System.out.println("===========================================" );

        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("165150300111100", 4.0, "Salma Angin", "2222", false, false);
        System.out.println(mahasiswa1.toString());
        System.out.println("===========================================" );

        Pekerja pekerja1 = new Pekerja(1000.0, LocalDate.of(2016, 3, 2), 4, "Apip", "111", true, true);
        System.out.println(pekerja1.toString());
        System.out.println("===========================================" );

        Manager manager1 = new Manager("HRD", 1000.0, LocalDate.of(2017, 1, 2), 3, "Udin Petot", "111", true, true);
        System.out.println(manager1.toString());
        System.out.println("===========================================" );
    }
}
