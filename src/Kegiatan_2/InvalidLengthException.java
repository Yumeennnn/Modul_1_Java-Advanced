package Kegiatan_2;

public class InvalidLengthException extends Exception {
    private int length;
    private String message;

    public InvalidLengthException(int length, String message) {
        this.length = length;
        this.message = message;
    }

    public int getAmount() {
        return this.length;
    }

    public String getMessage() {
        return this.message;
    }
}
