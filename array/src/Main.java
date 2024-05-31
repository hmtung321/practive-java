import java.util.Scanner;


public class Main {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void sxTang(int x[]){
        for (int i = 0; i < x.length; i++){
            int temp = i;
            for (int j = i + 1; j < x.length; j++){
                if (x[j] < x[temp]){
                    temp = j;
                }
            }
            swap(x[i],x[temp]);
        }
    }
    static void inMang(int x[]){
        for (int i = 0; i < x.length; i++){
            System.out.print(" Mang "+x[i]);
        }
    }
    public static void main(String[] args) {
        int mang1[];
        double mang2[];
        int s = 0,max = 0,min = 0;

        mang1 = new int[10];
        mang2 = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mang1.length; i++) {
            System.out.println("Enter manger " + (i) + ": ");
                mang1[i] = sc.nextInt();
        }
        for (int i = 0; i < mang2.length; i++) {
            System.out.println("Enter manger " + (i) + ": ");
            mang2[i] = Math.random();
        }
        inMang(mang1);
        for (int i = 0; i < mang1.length; i++) {
            s= s+mang1[i];
        }
        System.out.println("S = "+s);
        for (int i = 0; i < mang1.length; i++) {
            if (mang1[i] > max) {
                max = mang1[i];
            }
        }
        mang1[1]= min;
        for (int i = 0; i < mang1.length; i++) {
            if (mang1[i] < min) {
                min = mang1[i];
            }
        }
        sxTang(mang1);
        for (int i = 0; i < mang1.length; i++) {
            System.out.println("manger "+ mang1[i]);
        }

    }
}