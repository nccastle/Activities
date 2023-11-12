public class ExampleSwitchCase {

    public static void main(String[] args) {

        String value = "c";

        switch (value){
            case "a":
                System.out.println("Hello I'm A");
                break;
            case "b":
                System.out.println("Hello I'm B");
                break;
            case "c":
                System.out.println("Hello I'm C");
                break;
            default:
                System.out.println("Hello I'm Default");
                break;
        }

    }

}
