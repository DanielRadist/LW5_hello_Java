import java.util.Scanner;

public class Triangle {
    private float first;        //катет a
    private float second;       //катет b

    public void init(float a, float b)
    {
        first = a;
        second = b;
    }

    public float getFirst()
    {
        return first;
    }

    public float getSecond()
    {
        return second;
    }

    public void display()
    {
        System.out.printf("a = %f; b = %f; area = %f\n", first, second, areaTriangle());
    }

    public void read()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a:");
        float a = in.nextFloat();

        System.out.println("Enter b:");
        float b = in.nextFloat();

        init(a, b);
    }

    public float areaTriangle()
    {
        return first * second / 2;
    }
}
