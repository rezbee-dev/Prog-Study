package ch1;

public class ex4 {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3");
        System.out.println("1\t1\t1");
        int num = 1;

        for(int i=2; i<5; i++) {
            for(int j=0; j<3; j++) {
                num *= i;
                System.out.print(num + "\t");
            }
            System.out.println();
            num = 1;
        }
    }
}
