public class abd {
    
    private String name;

    void getdata(String name)
    {
        this.name=name;
    }
    String show()
    {
        return name;
    }
}

class employe
{
    public static void main(String[] args) 
    {
        
    employe e =  new employe();
    e.getdata("pranav");

    System.out.println();
    }

}