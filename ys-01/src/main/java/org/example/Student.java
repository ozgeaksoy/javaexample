package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Student {

    private String name;
    private LocalDate birthDate;
    private String address;
    private String gender;



    public Student(String name, LocalDate birthDate, String address, String gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public LocalDate getBirthDate() {return birthDate;}

    public void setBirthDate(LocalDate birthDate) {this.birthDate = birthDate;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public String getGender() {return gender;}

    public void setGender(String gender) {this.gender = gender;}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(birthDate, student.birthDate) && Objects.equals(address, student.address) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, address, gender);
    }
}
