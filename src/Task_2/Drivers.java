package Task_2;

import java.util.*;

public class Drivers {
    static Scanner xy = new Scanner(System.in);
    static String nim;
    static boolean isBalik = true;

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){
        while (isBalik){
            try {
                System.out.print("Masukkan Nim Anda: ");
                nim = xy.next();
                if (nim.length() < 15) {
                    throw new Exception("Nim Anda Kurang Dari 15 Angka Silahkan Coba Lagi");
                } else if (nim.length() > 15) {
                    throw new Exception("Nim Anda Lebih Dari 15 Angka Silahkan Coba Lagi");
                } else if (!nim.contains("10370311")) {
                    throw new Exception("Nim Anda Harus Terdapat 10370311");
                } else {
                    isBalik = false;
                }
                System.out.println("Nim Telah Di Input");
            } catch (Exception e) {
                System.out.println(e);
                System.out.print("\n");
            }
        }
    }
}


