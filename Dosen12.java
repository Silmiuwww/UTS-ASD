public class Dosen12 {
    String NIDN;
    String nama;
    String prodi;
    String email;
    int tahunMasuk;

    public Dosen12(String NIDN, String nama, String email, String prodi, int tahunMasuk) {
        this.NIDN = NIDN;
        this.nama = nama;
        this.email = email;
        this.prodi = prodi;
        this.tahunMasuk = tahunMasuk;
    }

    public void tampilDosen() {
        int tahunSekarang = 2025;
        int masaKerja = tahunSekarang - tahunMasuk;

        System.out.println("NIDN      : " + NIDN);
        System.out.println("Nama      : " + nama);
        System.out.println("Email     : " + email);
        System.out.println("Prodi     : " + prodi);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }

    static void search(Dosen12[] dosenList, String nidn) {
        boolean ditemukan = false;
        for (int i = 0; i < dosenList.length; i++) {
            if (dosenList[i] != null && dosenList[i].NIDN.equalsIgnoreCase(nidn)) {
                dosenList[i].tampilDosen();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dosen tidak ditemukan.");
       }
   }

   public int getMasaKerja() {
    int tahunSekarang = 2025;
    return tahunSekarang - tahunMasuk;
   }
}
