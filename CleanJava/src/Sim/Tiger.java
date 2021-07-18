package CleanJava.src.Sim;

import java.util.Arrays;
import java.util.List;

public class Tiger {

    public static void main(String[] args) {
        var s=List.of(new book("Java"),new book("Python"),new book("C++"),new book("C#"),
        new book("R"),new book("JavaScript"),new book("Spring"));
        System.out.println("TIger Added");
        System.out.println("Fucking pussy by Eclipse");
        s.stream().forEach(e->{
            System.out.println(e);
        });
    }
    record book(String name){}

}
