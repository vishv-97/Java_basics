interface Computer1
{
    void code();
}

class Laptop implements Computer1
{
    public void code()
    {
        System.out.println("code, compile, run");
    }

}

class Desktop implements Computer1
{
    public void code()
    {
        System.out.println("code, compile, faster");
    }
}
class Developer
{
    //	public void devApp(Laptop lap)
    public void devApp(Computer1 lap)
    {
        lap.code();
    }
}

public class Demo7_interface {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();

        Computer1 lap=new Laptop();
        Computer1 desk=new Desktop();

        Developer navin=new Developer();
        navin.devApp(lap);

    }
}
