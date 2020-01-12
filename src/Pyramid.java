public class Pyramid extends Triangle {
    private float z;          //высота

    Pyramid(float a, float b, float z)
    {
        super(a, b);
        this.z = z;
    }

    public void setZ(float value)
    {
        z = value;
    }
    public float getZ() {
        return z;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("z = %f", z);
    }

    @Override
    public float area() {
        return (super.area() * z / 3);
    }
}
