package abstractfactory.builder;

import abstractfactory.entity.Person;

/**
 * Created by Ihar_Rubanovich on 3/2/2017.
 */
public class DoctorPersonBuilder extends Builder {
    @Override
    public Person buildPerson() {
        Person doctortPerson = new Person.Builder()
                .personStrength(2)
                .age(44)
                .personType("doctor")
                .name("Veniamin")
                .build();

        return doctortPerson;
    }


}
