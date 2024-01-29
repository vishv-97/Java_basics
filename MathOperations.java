package tools;

//class Calculator  // Method overloading in Java allows a class to have multiple methods with the same name but different parameter lists.
//{
//    public int add(int n1, int n2, int n3)
//    {
//        return n1+n2+n3;
//    }
//    public int add(int n1, int n2)
//    {
//        return n1+n2;
//    }
//    public double add(double n1, int n2)
//    {
//        return n1+n2;
//    }
//}
//
//
//public class Demo2 {
//    public static void main(String[] args) {
//        Calculator obj=new Calculator();
//        int r1=obj.add(4,4,4);
//        System.out.println(r1);
//    }
//}


public class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations mathObj = new MathOperations();

        // Calling the methods with different parameter lists
        System.out.println("Sum of 2 and 3: " + mathObj.add(2, 3));
        System.out.println("Sum of 2, 3, and 5: " + mathObj.add(2, 3, 5));
        System.out.println("Sum of 2.5 and 3.5: " + mathObj.add(2.5, 3.5));
        System.out.println("Concatenation of 'Hello' and ' World': " + mathObj.add("Hello", " World"));
    }
}

