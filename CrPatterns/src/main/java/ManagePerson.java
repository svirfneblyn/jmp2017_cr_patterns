import abstractfactory.builder.AmazingPersonBuilder;
import abstractfactory.builder.PersonsBuildDirector;
import abstractfactory.entity.Person;
import abstractfactory.entity.Robot;
import abstractfactory.manager.FactoryManager;

/**
 * Created by Ihar_Rubanovich on 1/17/2017.
 */
public class ManagePerson {

    public static void main(String[] args) {
       /*prototypeDemo*/
        showPrototypePattern();
        /*abstract factory demo*/
      //  showFabriquePattern();
        /*builder demo*/
      //  showBuildPattern();

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
        roboClone.setRoboModel("terinator2");
        robot.setRoboModel("terminator3");
        System.out.println(" " + " cloned robot " + roboClone.toString() + "\n" + " First robot " + robot.toString());

    }

}
