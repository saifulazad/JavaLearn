package strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Azad on 05-Nov-16.
 */
public class PersonTest {

    public static void main(String[] args) {
        Person azad = new Person("Azad", 16);

        Person sadi = new Person("Sadi", 15);

        Person nazlul = new Person("Nazmul", 17);
        Person bhaktear = new Person("Baktear", 17);
        Person munna = new Person("Munna", 17);
        Person saif = new Person("Saif", 17);


        List<Person> persons = new ArrayList<Person>();


        persons.add(sadi);
        persons.add(nazlul);
        persons.add(azad);
        persons.add(saif);
        persons.add(munna);
        persons.add(bhaktear);

        Collections.sort(persons, new CustomSort());

        for (Person person : persons){
            System.out.println(person);

        }
    }




}
