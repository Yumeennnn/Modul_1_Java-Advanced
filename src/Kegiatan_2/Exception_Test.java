package Kegiatan_2;

public class Exception_Test {
    private int minLength;
    private int maxLength;

    public Exception_Test(int minLength, int maxLength) {
        this.minLength=minLength;
        this.maxLength=maxLength;
    }

    public void checkStringLength(String strInput) throws InvalidLengthException {
        int strLength = strInput.length();
        if (strLength < minLength) {
            throw new InvalidLengthException(strLength, "Input should have minimum "+minLength+" characters");
        }
        else if (strLength > maxLength){
            throw new InvalidLengthException(strLength, "Input should have maximum "+maxLength+" character");
        }
    }
}
