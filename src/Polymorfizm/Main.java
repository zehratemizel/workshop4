package Polymorfizm;

public class Main {
    public static void main(String[] args) {
        // Sekil tipindeki bir referans oluşturuluyor ve alt sınıfların nesneleri atanıyor
        Figure figure1 = new Rectangle();
        Figure figure2 = new Circle();

        figure1.ciz(); // Dikdörtgen çiziliyor...
        figure2.ciz(); // Daire çiziliyor...
    }
}