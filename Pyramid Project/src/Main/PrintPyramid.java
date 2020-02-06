package Main;

public class PrintPyramid {

    public void printPyramid(int rows) {
        int value = 1;
        for(int i = 1; i <= (rows * 2 - 1); i++) {
            System.out.printf("%5d", value);
            if (i < rows) {
                value *= 2;
            } else value /= 2;
        }
    }


}
