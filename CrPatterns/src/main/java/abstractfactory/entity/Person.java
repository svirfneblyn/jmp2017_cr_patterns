package abstractfactory.entity;

/**
 * Created by Ihar_Rubanovich on 1/16/2017.
 */
public class Person {
    private String name;
    private int age;
    private String personType;
    private int personStrange;

    private Person(Builder builder) {
        name = builder.name;
        age = builder.age;
        personType = builder.personType;
        personStrange = builder.personStrange;
    }

    public static class Builder {
        private String name;
        private int age;
        private String personType;
        private int personStrange;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder personType(String personType) {
            this.personType = personType;
            return this;
        }

        public Builder personStrength(int personStrange) {
            this.personStrange = personStrange;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public String getPersonType() {
        return personType;
    }

    public int getPersonStrange() {
        return personStrange;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person : " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", strange=" + personStrange +
                ", type=" + personType
                ;
    }

}
