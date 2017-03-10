package abstractfactory.builder;

import abstractfactory.entity.Person;

/**
 * Created by Ihar_Rubanovich on 3/2/2017.
 */
public class PersonsBuildDirector {
    private Builder personBuilder;

    public void setPersonBuilder(Builder builder) {
        this.personBuilder = builder;
    }

    public Person createPerson() {
      return  personBuilder.buildPerson();
    }

}
