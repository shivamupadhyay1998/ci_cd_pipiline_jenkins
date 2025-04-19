public class Student
{

int id;
String name;
String address;
    public Student(int id,String name,String address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public void display()
    {
        System.out.println(id+"  "+ "  "+name+ "  "+address);
    }
    

    public static void main(String[]args)
    {
        Student s1=new Student(1,"Rahul","Delhi");
        Student s2=new Student(2,"Shivam","Noida");
        s1.display();
        s2.display();
    }
}