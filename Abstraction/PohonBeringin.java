package Abstraction;

public class PohonBeringin extends Tumbuhan {

    public PohonBeringin(String nama) {
        super(nama);
    }

    @Override
    public void tumbuh() {
        System.out.println(nama + " tumbuh dengan akar gantung dan cabang yang besar.");
    }
}
