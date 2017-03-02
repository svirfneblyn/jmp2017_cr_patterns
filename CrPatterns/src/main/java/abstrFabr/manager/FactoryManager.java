package abstrFabr.manager;


import abstrFabr.dao.DBProcessDAO;
import abstrFabr.dao.FileProcessDAO;
import abstrFabr.dao.IProcessDAO;

public class FactoryManager {
    public IProcessDAO ip;

    public FactoryManager(String type) {
        ip = (IProcessDAO) getFactory(type);
    }

    private IProcessDAO getFactory(String fctr) {
        if (fctr.equals("DB")) {
            return getDBUtils();
        }
        if (fctr.equals("File")) {
            return getFileFactory();
        }
        return null;
    }

    private FileProcessDAO getFileFactory() {
        return new FileProcessDAO();
    }

    private DBProcessDAO getDBUtils() {
        return new DBProcessDAO();
    }


}
