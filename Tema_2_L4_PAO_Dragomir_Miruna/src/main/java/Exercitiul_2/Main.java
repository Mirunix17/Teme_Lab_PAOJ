package Exercitiul_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Form> Forms = new ArrayList<Form>();
        Forms.add(new Circle(10, "red"));
        Forms.add(new Triangle(5, 2, "red"));
        Forms.add(new Circle(15, "blue"));
        Forms.add(new Circle(5, "green"));
        Forms.add(new Triangle(6, 5, "yellow"));
        Forms.add(new Triangle(3, 4, "blue"));
        Forms.add(new Circle(7, "yellow"));
        Forms.add(new Triangle(7, 8, "green"));
        for (Form form : Forms)
            System.out.println(form.toString());

        System.out.println("\n\n");

        for (Form form : Forms) {
            if (form instanceof Circle)
                ((Circle) form).printCircleDimensions();
            if (form instanceof Triangle)
                ((Triangle) form).printTriangleDimensions();
        }

        for (Form form : Forms) {
            if (form instanceof Circle)
                ((Circle) form).printCircleDimensions();
            if (form instanceof Triangle)
                ((Triangle) form).printTriangleDimensions();
        }

        System.out.println("\n\n");

        for (Form form : Forms) {
            try
            {
                Circle circle = (Circle) form;
                circle.printCircleDimensions();
            }catch (ClassCastException e){
                Triangle triangle = (Triangle) form;
                triangle.printTriangleDimensions();
            }
        }
    }
}
