package abstractfactory.entity;

/**
 * Created by Ihar_Rubanovich on 3/2/2017.
 */
public class Robot implements Cloneable {
    private String roboModel;
    private int roboHeight;


    public Robot clone() {

        Robot clone = null;
        try {
            clone = (Robot) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error clonning Robot : ");
            e.printStackTrace();
        }
        return clone;
    }

    public String getRoboModel() {
        return roboModel;
    }

    public void setRoboModel(String roboModel) {
        this.roboModel = roboModel;
    }

    public int getRoboHeight() {
        return roboHeight;
    }

    public void setRoboHeight(int roboHeight) {
        this.roboHeight = roboHeight;
    }

    @Override
    public String toString() {
        return "Robot : " +
                "name='" + getRoboModel() + '\'' +
                ",height=" + getRoboHeight()
                ;
    }
}
