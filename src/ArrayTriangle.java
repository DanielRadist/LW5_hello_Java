public class ArrayTriangle
{
    ArrayTriangle()
    {
        abc[0] = new Triangle();
        abc[1] = new Triangle();
    }

    public boolean compare()
    {
        if(abc[0].areaTriangle() + abc[1].areaTriangle() < c)
            return true;
        else
            return false;
    }

    public void init(float c)
    {
        this.c = c;
    }

    private float c;           //некое "С" O_o
    Triangle abc[] = new Triangle[2];

}
