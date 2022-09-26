package Kegiatan_2;

import java.util.*;

public class Drivers {
    static Scanner xy = new Scanner(System.in);
    static String nim;
    static boolean isBalik = true;
    public static void main(String[] args) throws Exception {
        Menu();
    }

    public static void Menu() throws Exception{
            try{
                while (isBalik){
                    System.out.print("Masukkan Nim Anda: ");
                    nim = xy.next();
                    if(nim.length() < 15) {
                        throw new Exception("Nim Anda Kurang Dari 15 Angka Silahkan Coba Lagi");
                    }
                }
                System.out.println("Nim Telah Di Input");
//            }catch(Error e){
//                }else if(nim.length() > 15){
//                    System.out.print("Nim Anda Lebih Dari 15 Angka Silahkan Coba Lagi");
//                    System.out.println();
//                }else if (!nim.contains("10370311")){
//                    System.out.println("Nim Harus terdapat 10370311");
//                }
            }finally {
                isBalik = false;
            }
        }




    }

