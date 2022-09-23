package Kegiatan_2;

import java.util.*;

public class Drivers {
    public static void main(String[] args) {
    boolean isBalik = true;
    Scanner xy = new Scanner(System.in);
    String nim ;
    while (isBalik){
        System.out.print("Masukkan Nim Anda: ");
        nim = xy.next();

        if(nim.length() < 15){
            System.out.print("Coba");
            System.out.println();
        }else if(nim.length() > 15){
            System.out.print("Turu");
            System.out.println();
        }else if(!nim.contains("10370311")){
            System.out.println("Nim Harus terdapat 10370311");
        }else{
            isBalik = false;
        }
//        break;

    }
        System.out.println("Nim Telah Di Input");

    }

}
