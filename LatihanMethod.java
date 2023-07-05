package TUgas;

public class LatihanMethod {
    public static void main(String[] args) {
        Calculate p = new Calculate();
        p.setAngka1(8);
        p.setAngka2(9);
        int s = p.getAngka1();
        int k = p.getAngka2();
        p.addAllNumber(s,k);
        p.multiplyNumber(p.getAngka1(),p.getAngka2());
    }
}