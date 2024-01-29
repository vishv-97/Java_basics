public class Hello {
    public static void main(String[] args) {
        int a = 18;
        int b = 10;
        int result = a * b;
        System.out.println(result);
        System.out.println(4 + 7);

        int ab = 39;
        ab += 2;
        System.out.println(ab);

        int ab1 = 39;
        ab1 -= 2;
        System.out.println(ab1);

        int num = 7;
        num++;   //shortcut for incrementing 1 number, all these operation can be performed in sub, multi and disvision also //
        //num++ -> works as post increment//
        //++num -> works as pre increment//
        System.out.println(num);

        int t = 10;
        if(t>15)
            System.out.println("Yes it got passed");
        else
            System.out.println("It got failed");

        int t1 = 10;
        int t2 = 20;
        if(t1>t2)
            System.out.println("T1 is greater than t2");
        else
            System.out.println("T1 is less than t2");

        int t3 = 30;
        int t4 = 20;
        if(t3>t4) {   //If more statements of print then do curly braces//
            System.out.println("T3 is greater than t4");
            System.out.println("Thank you");
        }
        else
            System.out.println("T3 is less than t4");

        int x1 = 10;
        int x2 = 8;
        int x3 = 5;
        if(x1>x2 && x1>x3)
            System.out.println("x1 is greater than x2 and x3");
        else
            System.out.println("x1 is less than x2 and x3");


        int y1 = 10;
        int y2 = 80;
        int y3 = 50;
        if(y1>y2 && y1>y3)
            System.out.println("y1 is greater than y2 and y3");
        else if(y2>y1 && y2>y3)
            System.out.println("y2 is greater than y1 and y3");
        else
            System.out.println("y3 is greatest");
/////////////////////////////////////////////////////////////////////////////////////
        int n =4;
        int result1 = 0;

//        if(n%2==0)
//            result1 = 10;
//        else
//            result1 = 20;
        //ternary operator works like "?: question mark after is first value and : value after is second value"

        result1 = n%2==0 ? 10 : 20;
        System.out.println(result1);

        int dayNumber = 4;

        // Check the dayNumber and print the corresponding day of the week.
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }

//        int i =1;
//        while (i<=4)
//        {
//            System.out.println("Vishv" + i);
//            i++;
//        }

        // while inner loop (nested while loop)

        int i =1;
        while (i<=4)
        {
            System.out.println("Vishv" + i);
            int j =1;
            while(j<=2){
                System.out.println("Hello" + j);
                j++;
            }
            i++;
        }

        // EVEN IF condition is false and we want to print output once then we use DO while loop

        int g = 5;
        do {
            System.out.println("Hi" + g);
            g++;
        }while(g<=4);

        // For loop

        for (int h=1;h<=4;h++)
        {
            System.out.println("Vishv" + h);
        }

        for (int d=4;d>=1;d--)
        {
            System.out.println("Vishv" + d);
        }


    }
}
