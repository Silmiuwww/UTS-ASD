import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen12 data = new DataDosen12(100);
        int pilihan;

        do {
            System.out.println("\n=== Menu Sistem Data Dosen ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Urutkan berdasarkan NIDN (Ascending)");
            System.out.println("4. Cari berdasarkan Nama");
            System.out.println("5. Urutkan berdasarkan Masa Kerja (Descending)1");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIDN        : ");
                    String nidn = input.nextLine();
                    System.out.print("Nama        : ");
                    String nama = input.nextLine();
                    System.out.print("Email       : ");
                    String email = input.nextLine();
                    System.out.print("Program Studi: ");
                    String prodi = input.nextLine();
                    System.out.print("Tahun Masuk : ");
                    int tahun = input.nextInt(); input.nextLine();
                    Dosen12 d = new Dosen12(nidn, nama, email, prodi, tahun);
                    data.tambah(d);
                    break;
                case 2:
                    data.tampilSemua();
                    break;
                case 3:
                    data.urutkanByNIDN();
                    data.tampilSemua();
                    break;
                case 4:
                    System.out.print("Masukkan nama dosen: ");
                    String cariNama = input.nextLine();
                    data.cariByNama(cariNama);
                    break;
                case 5:
                    data.urutkanByMasaKerja();
                    data.tampilSemua();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

   }
}
