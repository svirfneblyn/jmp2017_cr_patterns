package abstractfactory.dao;


import abstractfactory.entity.Person;
import singelton.ConnectionSingelton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBProcessDAO implements IProcessDAO {

    @Override
    public void writePerson(Person person) {
        PreparedStatement pst = null;
        try {
            Connection con = ConnectionSingelton.createConnection();
            pst = con.prepareStatement("INSERT INTO persons  VALUES (?,?)");
            pst.setString(1, person.getName());
            pst.setInt(2, person.getAge());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pst != null) try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public Person readPerson() {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Person person = null;
        try {
            Connection con = ConnectionSingelton.createConnection();
            pst = con.prepareStatement("SELECT persons.name, persons.age FROM persons");
            rs = pst.executeQuery();
            String name="";
            int age=0;
            while (rs.next()) {
                name =  rs.getString(1) ;
                age =rs.getInt(2);
            }
             person = new Person.Builder()
                    .name(name)
                    .age(age)
                    .personStrength(0)
                    .personType("")
                    .build();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pst != null) try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return person;
    }

    @Override
    public Person readPerson(String name) {

        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            Connection con = ConnectionSingelton.createConnection();
            pst = con.prepareStatement("SELECT persons.name, persons.age FROM persons WHERE persons.name = ?");
            pst.setString(1, name);
            rs = pst.executeQuery();
            while (rs.next()) {
                Person person = new Person.Builder()
                        .name(rs.getString(1))
                        .age(rs.getInt(2))
                        .personStrength(0)
                        .personType("")
                        .build();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pst != null) try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
