package geometry;


public class triangle{
    private int base,heigth;

    void getbas(int base,int heigth)
    {
        this.base=base;
        this.heigth=heigth;
    }

    double area()
    {
        return (base*heigth)*0.5;
    }
}