/**
 * Created by pwnd on 29/5/2017.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] a = new int[4];
        for (int i = 0; i < a.length; i++){
            System.out.println("Ingrese valor: ");
            a[i] = in.nextInt();
        }

        boolean r = Guia1.binarySearchRecursive(a, 3, 0,a.length-1); ;

        System.out.println("Coso: "+ r);
    }

}