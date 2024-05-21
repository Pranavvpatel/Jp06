class a 
{
    private int length,breadth;
    public void setDim(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    public int getArea()
    {
        return length*breadth;
    }
}

public class area
{
    public static void main(String[] args) 
    {
        a a1 = new a();
        
        a1.setDim(23,4);
        System.out.println(a1.getArea());
    }
}
