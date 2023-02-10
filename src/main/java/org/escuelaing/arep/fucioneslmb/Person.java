package org.escuelaing.arep.fucioneslmb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Person {


    public enum Sex {MALE, FEMALE}

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return 20;
    }
    public Sex getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void printPerson() {
        // ...
    }

    List<Person> personas = new ArrayList<Person>();

    public static void printPersonsOlderThan(List<Person> lista, int age) {
        for (Person p : lista) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
            ;
        }
    }

    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithPredicate(
            List<Person> lista, Predicate<Person> tester) {
        for (Person p : lista) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void processPersons(List<Person> lista,
                                      Predicate<Person> tester,
                                      Consumer<Person> block) {
        for (Person p : lista) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }

    public static void processPersonsWithFunction(List<Person> roster, Predicate<Person> tester,
                                                  Function<Person, String> mapper,
                                                  Consumer<String> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

    public static <X, Y>
    void processElements(Iterable<X> source, Predicate<X> tester,
                         Function<X, Y> mapper, Consumer<Y> block) {
        for (X p : source) {
            if (tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }


}