package abstractfactory.builder;

import abstractfactory.entity.Person;

/**
 * Created by Ihar_Rubanovich on 3/2/2017.
 */
public class SintiestPersonBuilder extends Builder {
    @Override
    public Person buildPerson() {
        Person sintiestPerson = new Person.Builder()
                .personStrength(10)
                .age(30)
                .personType("scintiest")
                .name("Yazep")
                .build();

        return sintiestPerson;
    }
}
