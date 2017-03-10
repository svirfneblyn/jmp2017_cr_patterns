package abstrFabr.dao;


import abstrFabr.entity.Person;

public interface IProcessDAO {
    void writePerson(Person person);
    Person readPerson();
    Person readPerson(String name);
}
