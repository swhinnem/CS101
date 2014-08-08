import java.util.Scanner;

public class Silly {
    public static void main(String[] args) {
        int i = 7;
        int j = 5;

        System.out.println("7+5=");
        System.out.println(i + j);

        int k = 9;
        int l = 4;

        System.out.println("9/4=");
        System.out.println(k / l);

        int m = 9;
        double n = 4;

        System.out.println("9/4=");
        System.out.println(m / n);

        int o = 6;
        boolean p = true;

        // System.out.println("6 + true=");
        // System.out.println(o + p); !error

        int q = 10;
        int r = 7;

        float s = ((float)q)/r;

        System.out.println(s);


        Scanner in = new Scanner(System.in);

        String word = "";
        while ( !word.equals("stop") ) {
            System.out.println("Enter a word");
            word = in.nextLine();
        }

        int t1 = 7;
        int t2 = 2;
        System.out.println( t1 > t2 );

    }
}

/*

while (boolean) {
    stuff;
}

while (i < 10) {
    stuff;
    i += 1;
    // runs 10 times
}

homework: make tic tac toe


*/