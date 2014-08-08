public class BinaryConverter {

    public static void main(String[] args) {

        String binaryString = args[0];

        int decimal = 0;

        for (int i = binaryString.length(); i > 0 ; i--) {

            char c = binaryString.charAt(binaryString.length() - i);

            if (c == '1') {
                decimal += Math.pow(2, i - 1);
            }

        }

        System.out.println(args[0]);
        System.out.println(decimal);
    }
}