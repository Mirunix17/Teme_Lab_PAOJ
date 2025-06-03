package Execitiul1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog(new ComparatorMedie());

        catalog.add(new Student("Maria Andronache", 5.60f));
        catalog.add(new Student("Silviu Pascariu", 9.75f));
        catalog.add(new Student("Claudia Mironescu", 8.45f));
        catalog.add(new Student("Darius Topliceanu", 7.5f));
        catalog.add(new Student("Anastasia Creanga", 6.9f));
        catalog.add(new Student("Marius Vuletescu", 9.35f));
        catalog.add(new Student("Cosmina Soare", 11.9f));
        catalog.add(new Student("Adelin Ivascu", 7.2f));

        for (var aux: catalog.entrySet()) {
            System.out.println();
            List<Student> listaStudenti = aux.getValue();
            System.out.println(aux.getKey());
            System.out.println("============ Inainte de sortare ============");
            for(var student : aux.getValue()) {
                System.out.println(student);
            }
            System.out.println("============ Dupa sortare ============");
            listaStudenti.sort(Comparator.comparing(Student::getNume));
            for (Student student : listaStudenti) {
                System.out.println(student);
            }
        }
    }
}
