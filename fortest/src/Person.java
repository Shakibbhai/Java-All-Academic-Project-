
public class Person {
    private String Name;
    private Integer age;

    public Person(String name, Integer age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void YO(){
        System.out.println("liyo");
    }
}
