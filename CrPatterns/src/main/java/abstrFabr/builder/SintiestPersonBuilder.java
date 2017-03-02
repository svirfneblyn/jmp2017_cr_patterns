package abstrFabr.builder;

import abstrFabr.entity.Person;

/**
 * Created by Ihar_Rubanovich on 3/2/2017.
 */
public class SintiestPersonBuilder extends Builder {
    @Override
    public Person buildPerson() {
        Person sintiestPerson = new Person.Builder()
                .personStrange(10)
                .age(30)
                .personType("scintiest")
                .name("Yazep")
                .build();

        return sintiestPerson;
    }
}
