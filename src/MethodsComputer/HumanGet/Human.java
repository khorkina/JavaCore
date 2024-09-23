package MethodsComputer.HumanGet;

class Human
{

    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void SetAge(int age, Human obj)
    {
        //Human obj1=new Human();
        Human obj1=obj;
        obj1.age=age;
        //this.age=age;
    }

//	public void SetAge(int a)
//	{
//		age=a;
//	}


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

//	public void setName(String n)
//	{
//		name=n;
//	}

}
