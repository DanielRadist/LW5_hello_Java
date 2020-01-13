public class PyramidAndTriangle {
    PyramidAndTriangle(float a1, float b1, float z1, float a2, float b2)
    {
        one = new Pyramid(a1, b1, z1);
        two = new Triangle(a2, b2);
    }

    public float areaTriangle()
    {
        return two.area();
    }
    public float areaPyramid()
    {
        return one.area();
    }

    public void display()
    {
        System.out.printf("areaTriangle = %f\n", areaTriangle());
        System.out.printf("areaPyramid = %f\n", areaPyramid());
    }


    protected Pyramid one;
    protected Triangle two;
}
