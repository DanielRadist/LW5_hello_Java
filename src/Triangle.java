import java.util.Scanner;

public class Triangle {


    Triangle(float b) {
        if(b <= 0)
            try {
                throw new Exception("Не положительное значение!");
            } catch (Exception e) {
                e.printStackTrace();
                b = 1;
            }
        second = b;
    }

    Triangle() {
        second = 1;
    }

    public void init(float a, float b) {
        first = a;
        second = b;
    }

    public void read() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a:");
        float a = in.nextFloat();

        System.out.println("Enter b:");
        float b = in.nextFloat();

        init(a, b);
    }

    static public void setFirst(int value) {
        first = value;
    }

    static public float getFirst()
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

    public float areaTriangle()
    {
         return first * second / 2;
    }

    private static float first;         //катет a
    private float second;               //катет b
}
