import java.util.Scanner;

public class Triangle {


    /*
    Triangle(float b) {
        if(b <= 0)
            try {
                throw new Exception("Не положительное значение!");
            } catch (Exception e) {
                e.printStackTrace();
                b = 1;
            }
        second = b;
    }*/

    Triangle(float a, float b) {
        this.first = a;
        this.second = b;
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

    public void setFirst(int value) {
        first = value;
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
        System.out.printf("a = %f; b = %f; area = %f\n", first, second, area());
    }

    public float area()
    {
         return first * second / 2;
    }

    protected float first;              //катет a
    protected float second;             //катет b
}
