package az.mdm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

@ApiModel
public class Person {
    @ApiParam(name = "name")
    private String name;
    @ApiParam(name = "surname")
    private String surname;
    @ApiParam(name = "age")
    private int age;

    public Person() {
        name = "Baxshi";
        surname = "Isgandarov";
        age = 26;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
