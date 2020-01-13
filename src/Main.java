import java.lang.Math;

public class Main
{
    /* @autor Rakhmanin Danila aka Radist AltSTU PE-82
    *
    * 1) Класс с двумя полями first и second по варианту 18.
    * Методы: init(), getFirst(), getSecond(), display(), read(), areaTriangle()
    *
    * 18. Поле first — вещественное число - катет а прямоугольного треуголь¬ника;
    * поле second — вещественное число - катет b прямоугольного треугольника.
    * Реализовать метод, вычисляющий площадь треугольника.
    *
    * 2) добавить основной класс: 2 поля вспомагательного класса, 1 или 2 доп. поля, + доп. метод.
    *
    * Основной класс содержит С и метод дает в качестве результата 1 или 0,
    * если сумма площадей треугольников меньше С (истина) или больше/равна С (ложь).
    *
    */

    public static void main(String[] args)
    {
        //LW12
        /*
        Pyramid a = new Pyramid(2, 5, 7);
        a.display();

        */
        //LW13
        PyramidAndTriangle a = new PyramidAndTriangle(2, 3, 4, 5, 6);
        a.display();

        /*demo from lw10*/
        //lw10 static
        /*
        Triangle.setFirst(10);
        System.out.printf("Triangle a = %f\n", Triangle.getFirst());

        final int N = 5;
        Triangle[] triangles = new Triangle[N];
        for(int i = 0; i < N; i++)
            if(i % 2 == 0)
                triangles[i] = new Triangle();
            else
                triangles[i] = new Triangle(0);

        for(int i = 0; i < N; i++)
        {
            System.out.printf("#%d: first = %f, second = %f\n", i + 1, triangles[i].getFirst(), triangles[i].getSecond());
        }*/



        /*demo #1*/
        /*
        Triangle Cat = new Triangle(7);

        Triangle Dog = new Triangle();
        Dog.read();

        System.out.print("Cat: ");
        Cat.display();
        System.out.print("Dog: ");
        Dog.display();

        System.out.printf("Cat a = %f\n", Cat.getFirst());
        System.out.printf("Dog b = %f\n", Dog.getSecond());

        System.out.printf("area Cat = %f\n", Cat.areaTriangle());
        */

        /*demo #2
        ArrayTriangle triangles = new ArrayTriangle();
        triangles.abc[0].init(3, 4);
        triangles.abc[1].init(5, 6);

        triangles.init(50);
        System.out.print(triangles.compare());

        System.out.printf("\n");

        triangles.init(10);
        System.out.print(triangles.compare());

        /*demo #3
        final int N = 5;
        Triangle[] triangles = new Triangle[N];
        for(int i = 0; i < N; i++)
            triangles[i] = new Triangle();

        //inits() and displays()
        for(int i = 0; i < N; i++)
        {
            float a = 1 + (float)(Math.random() * 10);
            float b = 1 + (float)(Math.random() * 10);
            triangles[i].init(a, b);
            triangles[i].display();
        }

        float[] resAreaTriangles;
        resAreaTriangles = new float[N];

        //areaTriangles()
        for(int i = 0; i < N; i++)
        {
            resAreaTriangles[i] = triangles[i].areaTriangle();
        }
        //вывод
        for(int i = 0; i < N; i++)
        {
            System.out.printf("#%d: area = %f\n", i + 1, resAreaTriangles[i]);
        }
        float max = resAreaTriangles[0];
        for(int i = 1; i < N; i++)
        {
            if(max < resAreaTriangles[i])
                max = resAreaTriangles[i];
        }
        System.out.printf("Max = %f", max);
        */
    }
}
