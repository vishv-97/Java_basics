class Computer
{
    public void playMusic()   // void is used when we want to return nothing
    {
        System.out.println("Music Playing...");
    }
    public String getMeAPen(int cost)  // here string is used because we want to return a string value
    {
        if(cost>=10)
            return "Pen";
        else
            return "Nothing";
    }
}


public class Demo1 {
    public static void main(String[] args) {
        Computer obj=new Computer();
        obj.playMusic();
        String src=obj.getMeAPen(10);
        System.out.println(src);
    }
}