package Abstraction;

public class PohonJambu extends Tumbuhan {

    public PohonJambu(String nama) {
        super(nama);
    }

    @Override
    public void tumbuh() {
        System.out.println(nama + " tumbuh dengan buah manis yang lezat.");
    }
}
