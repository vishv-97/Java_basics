class Human
        {
            private int age=25;                         // making variables private and then only way to access is through methods
            private String name="Vishv Patel";          // so now one from outside world can access variables directly
                                                        // so here we are encapsulating data and methods and that is known as encapsulation.

            public Human()   // this is a constructor (default)
            {
                System.out.println("in constructor");
                age = 12;
                name = "John";
            }

            public Human(int a, String n)  //parameterized constructor
            {
                age = a;
                name = n;
            }

            public int getAge()
            {
                return age;
            }

            public void setAge(int a)
            {
                age = a;
            }

            public String getName()
            {
                return name;
            }

            public void setName(String b)
            {
                name = b;
            }

        }


public class Encap {
    public static void main(String[] args) {
        Human hum = new Human();
        Human hum1 = new Human(18,"Vishv");   // parameterized constructor
//        hum.setAge(27);
//        hum.setName("Vishv");
        System.out.println(hum.getAge() + " : " + hum.getName());
        System.out.println(hum1.getAge() + " : " + hum1.getName());

    }
}
