package Abstraction;

public class TumbuhanTest {

    public static void main(String[] args) {
        Tumbuhan beringin = new PohonBeringin("Beringin");
        Tumbuhan jambu = new PohonJambu("Jambu");

        beringin.info();
        beringin.tumbuh();

        System.out.println();

        jambu.info();
        jambu.tumbuh();
    }
}