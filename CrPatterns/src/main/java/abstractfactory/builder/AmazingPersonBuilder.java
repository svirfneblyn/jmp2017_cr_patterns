package abstractfactory.builder;

import abstractfactory.entity.Person;

/**
 * Created by Ihar_Rubanovich on 3/2/2017.
 */
public class AmazingPersonBuilder extends Builder {
    @Override
    public Person buildPerson() {
        Person amazingPerson = new Person.Builder()
                .personStrength(100)
                .age(22)
                .personType("Amazing Person")
                .name("Saturn")
                .build();

        return amazingPerson;
    }
}
