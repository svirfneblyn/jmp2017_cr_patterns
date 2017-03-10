package abstrFabr.dao;


import abstrFabr.entity.Person;
import abstrFabr.manager.FileUtils;


public class FileProcessDAO implements IProcessDAO {
    @Override
    public void writePerson(Person person) {
        FileUtils.writePerson(person);
    }

    @Override
    public Person readPerson()

    {
        return null;
    }

    @Override
    public Person readPerson(String name) {
        return FileUtils.readPerson(name);
    }
}
