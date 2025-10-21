package collections1;

public class MyCatInfo {
    String name;
    int age;
    String catType;

    MyCatInfo(String name, int age, String catType) {
        this.name = name;
        this.age = age;
        this.catType = catType;
    }

    @Override
    public String toString() {
        return "name='" + name + "', age=" + age + ", catType='" + catType + "'";
    }
}