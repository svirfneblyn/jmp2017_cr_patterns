package abstrFabr.builder;

import abstrFabr.entity.Person;

/**
 * Created by Ihar_Rubanovich on 3/2/2017.
 */
public abstract class Builder {
    protected Person person;
    public abstract Person buildPerson();

}
