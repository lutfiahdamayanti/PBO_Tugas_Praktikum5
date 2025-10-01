package Abstraction;

public abstract class Tumbuhan {
    protected String nama;

    public Tumbuhan(String nama) {
        this.nama = nama;
    }

    // Method abstrak
    public abstract void tumbuh();
    
    public void info() {
        System.out.println("Nama tumbuhan: " + nama);
    }
}
