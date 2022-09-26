package Kegiatan_2;



public class Main {
    public static void main(String[] args) {
        Exception_Test ic = new Exception_Test(2,7);
        try {
            ic.checkStringLength("longer than the maximum length");
        }
        catch(InvalidLengthException e) {
            e.printStackTrace();
        }
    }
}


