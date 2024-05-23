import  pack.*;
class br
{
    private String name;

    public void setname(String name)
    {
        this.name=name;
    }

    public String getname()
    {
        return name;
    }
}

public class pack2 
{
    public static void main(String[] args) 
    {
        abc a = new abc();
        br b1 = new br();

        a.setCity("Mumbai");
        a.setstate("Maharashtra");
        b1.setname("Pranav");
        System.out.println("Name is "+ b1.getname() + "State is" + a.getstate() +"City is " + a.getcity());
    }
}
