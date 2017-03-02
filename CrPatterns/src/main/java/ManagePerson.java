import abstrFabr.builder.AmazingPersonBuilder;
import abstrFabr.builder.PersonsBuildDirector;
import abstrFabr.entity.Person;
import abstrFabr.entity.Robot;
import abstrFabr.manager.FactoryManager;

/**
 * Created by Ihar_Rubanovich on 1/17/2017.
 */
public class ManagePerson {

    public static void main(String[] args) {

        /*abstract factory demo*/
        showFabriquePattern();
        /*builder demo*/
        showBuildPattern();
        /*prototipeDemo*/
        showPrototypePattern();
    }

    private static void showBuildPattern() {
        PersonsBuildDirector personsBuildDirector = new PersonsBuildDirector();
        personsBuildDirector.setPersonBuilder(new AmazingPersonBuilder());
        Person amazingPerson = personsBuildDirector.createPerson();
        System.out.println(amazingPerson.toString());
    }

    private static void showFabriquePattern() {
        String type = "File";
        FactoryManager fm = new FactoryManager(type);
        System.out.println(fm.ip.readPerson().getName());
           }
    private static void showPrototypePattern(){
        Robot robot = new Robot();
        robot.setRoboModel("terminator");
        robot.setRoboHeight(11);
        Robot roboClone = robot.clone();
            roboClone.setRoboHeight(111);
        System.out.println(" First robot " + robot.toString() + " cloned robot " + roboClone.toString());

    }

}
