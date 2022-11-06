package j15_Object클래스;

import java.util.Objects;

public class Tether {

    private String name;
    private String schoolName;

    public Tether(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }
//    @Override
//    public boolean equals(Object obj) {
//
//        if (this == obj) return true;
//        if (obj == null) return false;
//        if (getClass() != obj.getClass()) return false;
//
//
//        Tether other = (Tether) obj;
//        return Objects.equals(name, other.name) && Objects.equals(schoolName, other.schoolName);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tether tether = (Tether) o;
        return name.equals(tether.name) && schoolName.equals(tether.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }

    @Override
    public String toString() {
        return "Tether{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }


}


