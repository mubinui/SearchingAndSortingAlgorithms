import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a [] = new int[x];

        for(int i=0; i<a.length; i++){
            // array inputs
            a[i] = sc.nextInt();

        }
        System.out.println("The Element you are looking for is => ");
        int Search = sc.nextInt();
        int the_element_idx = binarySearch(a,Search,0,a.length-1);
        if (the_element_idx!=-2){
            System.out.println("The Element is found => "+a[the_element_idx]);
        }
        else {
            System.out.println("Sorry Not found ");
        }
    }
    public static int binarySearch(int [] array, int elem, int l , int r ) {

        if (l <= r) {
            int m = (l+r)/2;
            System.out.println("mid=>"+m);
            if (array[m]==elem){
                return m;
            }
            else {
                if(array[m]<elem){
                    System.out.println(array[m] +"->");
                    return binarySearch(array,elem,m+1,r);
                }
                else{

                    return binarySearch(array,elem,l,m-1);
                }
            }

        } else {
            return -2;
        }
    }
}
