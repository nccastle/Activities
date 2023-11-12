public class ExampleArray {

    //index starts with 0 and length start with 1
    public static String[] oneDimension = {"1","2","3","4","5"};
    public static String[][] twoDimension = {{"1","2","3","4","5"},{"6","7","8","9","0"}};

    public static String[][][] threeDimension = {{{"1", "2"}, {"3", "4"}}, {{"5", "6"}, {"7", "8"}}, {{"9", "0"}, {"tito", "noel"}}};

    public static void main(String[] args) {

        System.out.println("One Dimension: " + oneDimension[1]);

        System.out.println("Two Dimension: " + twoDimension[0][3]);

        System.out.println("Three Dimension: " + threeDimension[1][1][1]);

    }

}
