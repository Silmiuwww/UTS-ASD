public class DataDosen12 {
    Dosen12[] listDosen;
    int jumlah;

    public DataDosen12(int kapasitas) {
        listDosen = new Dosen12[kapasitas];
        jumlah = 0;
    }

    public void tambah(Dosen12 d) {
        if (jumlah < listDosen.length) {
            listDosen[jumlah++] = d;
        } else {
            System.out.println("Kapasitas penuh.");
        }
    }

    public void tampilSemua() {
        if (jumlah == 0) {
            System.out.println("Belum ada data dosen.");
        } else {
            for (int i = 0; i < jumlah; i++) {
                listDosen[i].tampilDosen();
                System.out.println("---------------------------");
            }
        }
    }

    // Bubble Sort 
    public void urutkanByNIDN() {
        for (int i = 0; i < jumlah - 1; i++) {
            for (int j = 0; j < jumlah - i - 1; j++) {
                if (listDosen[j].NIDN.compareTo(listDosen[j + 1].NIDN) > 0) {
                    Dosen12 temp = listDosen[j];
                    listDosen[j] = listDosen[j + 1];
                    listDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data diurutkan berdasarkan NIDN (Ascending).");
    }

    // Linear Search 
    public void cariByNama(String namaCari) {
        boolean ditemukan = false;
        for (int i = 0; i < jumlah; i++) {
            if (listDosen[i].nama.equalsIgnoreCase(namaCari)) {
                listDosen[i].tampilDosen();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dosen tidak ditemukan.");
        }
    }

    // Selection Sort 
    public void urutkanByMasaKerja() {
        for (int i = 0; i < jumlah - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < jumlah; j++) {
                if (listDosen[j].getMasaKerja() > listDosen[maxIdx].getMasaKerja()) {
                    maxIdx = j;
                }
            }
            Dosen12 temp = listDosen[i];
            listDosen[i] = listDosen[maxIdx];
            listDosen[maxIdx] = temp;
        }
        System.out.println("Data diurutkan berdasarkan masa kerja (Descending).");
   }
}
