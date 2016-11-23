package strategy;

/**
 * Created by Azad on 05-Nov-16.
 */
public class Person  {


    final private String name ;
    final private int age ;

    public Person(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s %d",this.name,this.age );
    }
}
