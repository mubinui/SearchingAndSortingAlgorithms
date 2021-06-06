import java.util.Scanner;

public class BubbleSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int [] a = new int[x];

        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        bubbleSort_A(a);
        System.out.println("After Sorting ->");
        System.out.println();

        for (int i:a) {
            System.out.print(i+"->");

        }
    }


    public static void bubbleSort_A(int [] a){

        for(int i = 0; i<a.length-1; i++){
            for (int j = 0; j <a.length-1-i; j++) {
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }

        }

    }

}
