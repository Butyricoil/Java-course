package collection;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        String s = "This is John. He is 27 years old";
        String name = s.substring(8, 12);
        String age_String = s.substring(20, 22);
        int age = Integer.parseInt(age_String);

        Person person = new Person(name, age);

        System.out.print(person.getName() + " " + person.getAge());
    }
}