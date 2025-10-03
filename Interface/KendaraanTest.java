package Interface;

public class KendaraanTest{

    public static void main(String[] args) {
        Mobil avanza = new Mobil("Toyota Avanza");

        avanza.isiBahanBakar(5);
        avanza.nyalakanMesin();

        avanza.berjalan();
        avanza.belok("kiri");
        avanza.berhenti();

        System.out.println("Sisa bahan bakar: " + avanza.getSisaBahanBakar() + " liter");
        avanza.matikanMesin();
    }
}
