package Interface;

public class Mobil implements Kendaraan, Mesin {
    private String merk;
    private int kecepatan;
    private int bahanBakar;

    public Mobil(String merk) {
        this.merk = merk;
        this.kecepatan = 0;
        this.bahanBakar = 0;
    }

    // Implementasi Mesin
    @Override
    public void nyalakanMesin() {
        if (bahanBakar > 0) {
            System.out.println("Mesin " + merk + " dinyalakan.");
        } else {
            System.out.println("Bahan bakar habis, tidak bisa menyalakan mesin.");
        }
    }

    @Override
    public void matikanMesin() {
        System.out.println("Mesin " + merk + " dimatikan.");
        kecepatan = 0;
    }

    @Override
    public void isiBahanBakar(int liter) {
        bahanBakar += liter;
        System.out.println("Mengisi " + liter + " liter bensin. Total: " + bahanBakar + " liter.");
    }

    @Override
    public int getSisaBahanBakar() {
        return bahanBakar;
    }

    // Implementasi Kendaraan
    @Override
    public void berjalan() {
        if (bahanBakar > 0) {
            kecepatan = 60;
            bahanBakar--;
            System.out.println(merk + " berjalan dengan kecepatan " + kecepatan + " km/jam.");
        } else {
            System.out.println("Tidak bisa berjalan, bahan bakar habis.");
        }
    }

    @Override
    public void berhenti() {
        kecepatan = 0;
        System.out.println(merk + " berhenti.");
    }

    @Override
    public void belok(String arah) {
        System.out.println(merk + " belok ke arah " + arah + ".");
    }

    @Override
    public int getKecepatan() {
        return kecepatan;
    }
}