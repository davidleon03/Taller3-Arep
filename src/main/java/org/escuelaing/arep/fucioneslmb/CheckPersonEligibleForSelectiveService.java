package org.escuelaing.arep.fucioneslmb;

public class CheckPersonEligibleForSelectiveService implements CheckPerson {
    public boolean test(Person p) {
        return p.gender == Person.Sex.FEMALE &&
                p.getAge() >= 18 &&
                p.getAge() <= 25;}
}