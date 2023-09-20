/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Lenov
 */
public class latihanArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] namaArray = {1, 3, 5, 7, 9};
        System.out.print("masukkan username/password/nama :");
        String str = in.nextLine();
        String[] splitString=str.split("/+");
        System.out.println(splitString[0]);
        System.out.println(splitString[1]);
        System.out.println(splitString[2]);

        
    }
}
