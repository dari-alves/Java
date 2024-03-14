public class HelloWorld {
    public static void main(String[] args) {
        // Data Types
        int numInt = 10;
        double numDouble = 3.14;
        float numFloat = 3.14f;
        long numLong = 87835254454L;
        String stringType = "Java";
        boolean booleanType = true;

        // if - else 
        if(numInt == 11) {
            // sysout
            System.out.println("IF - 10");
        } else if (numInt == 12) {
            System.out.println("IF - 12");
        } else {
            System.out.println("ELSE");
        }

        // While
        int initialValue = 0;
        while (initialValue < 3) {
            System.out.println("The initial value is less than 3");
            System.out.println(initialValue);
            initialValue++;
        }
        System.out.println("Outside the 'while loop'");

        // For
        System.out.println("Initial FOR");
        for (int i = 0; i < 4; i++) {
            System.out.println("Value: " + i);
        }
        System.out.println("Final FOR");
    }
}