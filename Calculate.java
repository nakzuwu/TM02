package TUgas;

public class Calculate {
    public int getAngka1() {
        return Angka1;
    }

    public void setAngka1(int angka1) {
        Angka1 = angka1;
    }

    public int getAngka2() {
        return Angka2;
    }

    public void setAngka2(int angka2) {
        Angka2 = angka2;
    }

    private int Angka1;
    private int Angka2;

    public static void addAllNumber(int s, int k) {
        int total = s+k ;
        System.out.println("Total penjumlahan: " + total);
    }
    public void multiplyNumber(int a, int b) {
        int total2 = a*b ;
        System.out.println("Total Perkalian: " + total2);
    }
}
