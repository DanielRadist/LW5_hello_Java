

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
        /*demo #1
        Triangle Cat = new Triangle();
        Cat.init(5, 7);

        Triangle Dog = new Triangle();
        Dog.read();

        System.out.print("Cat: ");
        Cat.display();
        System.out.print("Dog: ");
        Dog.display();

        System.out.printf("Cat a = %f\n", Cat.getFirst());
        System.out.printf("Dog b = %f\n", Dog.getSecond());

        System.out.printf("area Cat = %f\n", Cat.areaTriangle());*/

        /*demo #2*/
        ArrayTriangle triangles = new ArrayTriangle();
        triangles.abc[0].init(3, 4);
        triangles.abc[1].init(5, 6);

        triangles.init(50);
        System.out.print(triangles.compare());

        System.out.printf("\n");

        triangles.init(10);
        System.out.print(triangles.compare());


    }
}
