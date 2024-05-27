package geometry;
public class circle
{
    double radius;

    public circle (double radius)
    {
        this.radius =radius;
    }
    
    public void setarea(double radius)
    {
        this.radius =radius;
    }

    public double getarea()
    {
        return 3.14*radius*radius;
    }

}
