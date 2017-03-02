package abstrFabr.builder;

import abstrFabr.entity.Person;

/**
 * Created by Ihar_Rubanovich on 3/2/2017.
 */
public class DoctorPersonBuilder extends Builder {
    @Override
    public Person buildPerson() {
        Person doctortPerson = new Person.Builder()
                .personStrange(2)
                .age(44)
                .personType("doctor")
                .name("Veniamin")
                .build();

        return doctortPerson;
    }
}
