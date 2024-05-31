import java.util.Scanner;

public class KieuDuLieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n ");
        int n = sc.nextInt();
        int s=0,s2 = 1,s3 = 1,s4 = 0;
        for (int i = 0; i < n; i++) {
            s = s+i;
            s2 =s2+ 2*i;
            s3=s3+ s3*i;
        }
        System.out.println("s= "+s);
        System.out.println("s2= "+s2);
        System.out.println("s3= "+s3);
    }
}
