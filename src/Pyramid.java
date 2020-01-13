public class Pyramid extends Triangle {
    protected float z;          //высота

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
        System.out.printf("z = %f\n", z);
        System.out.printf("areaS = %f\n", super.area());
        System.out.printf("areaV = %f\n", area());
    }

    @Override
    public float area() {
        return (super.area() * z / 3);
    }

    public Pyramid clone() throws CloneNotSupportedException{

        return (Pyramid) super.clone();
    }
}
