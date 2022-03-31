package ua.lviv.iot.Squeezer;

public class Main {

    public static void main(String[] args) {
        Squeezer fSq = new Squeezer();
        Squeezer sSq = new Squeezer("magenta", 120.0, 3.5);
        Squeezer tSq = new Squeezer("indigo", 1.0, 0.001, "Gotabaya Rhadjapaxa", 1.0, "Sri lanka", 1);
        System.out.println(fSq);
        System.out.println(sSq);
        System.out.println(tSq);
        System.out.println();
        System.out.println(Squeezer.getBrand());
    }
}
