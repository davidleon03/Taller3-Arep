package org.escuelaing.arep.fucioneslmb;

import java.util.ArrayList;
import java.util.List;

import static org.escuelaing.arep.fucioneslmb.Person.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<Person>();
        printPersons(personas, new CheckPersonEligibleForSelectiveService());
        printPersons(
                personas,
                (Person p) -> p.gender == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 29
        );
        printPersonsWithPredicate(personas, p -> p.gender == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25);
        processPersons(personas, p -> p.gender == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 29,
                p -> p.printPerson());
        processPersonsWithFunction(
                personas,
                p -> p.gender == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 29,
                p -> p.emailAddress,
                email -> System.out.println(email)
        );
        processElements(
                personas,
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25,
                p -> p.getEmailAddress(),
                email -> System.out.println(email)
        );
        personas.stream()
                .filter(
                        p -> p.gender == Person.Sex.MALE
                                && p.getAge() >= 18
                                && p.getAge() <= 40)
                .map(p -> p.emailAddress)
                .forEach(email -> System.out.println(email));
    }
}