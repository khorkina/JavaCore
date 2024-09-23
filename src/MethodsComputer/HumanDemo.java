package MethodsComputer;

public class HumanDemo {
    public static void main(String[] args) throws ClassNotFoundException
    {
        Human obj=new Human();
        obj.SetAge(30);
        obj.setName("Reddy");
//		obj.age=11;
//		obj.name="Navin";

        System.out.println(obj.getName()+" : "+obj.getAge());

    }
}
