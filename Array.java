package tools;


public class Array {
    public static void main(String[] args) {
        int num[] = {3,4,7,4};
        num[2]=10; //changing array value

        int nums[] = new int[4]; // means it will create 4 elements with zero as a value
        nums[0]=4;
        nums[1]=5;
        nums[2]=10;
        nums[3]=123;
        System.out.println(num[2]);

        for(int i=0;i<4;i++)
        {
            System.out.println(nums[i]);
        }

        int num1[][]=new int[3][4];
        for (int q=0;q<3;q++)
        {
            for (int j=0;j<4;j++)
            {
                System.out.println(num1[q][j] + " ");
            }
            System.out.println();
        }
    }
}
