package shakib;
public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void mew(){
        System.out.println("Meowaaa");
    }
    private void yo(){
        System.out.println("this is yo method");
    }
    public static void jiyo(){
        System.out.println("it is a static and public");

    }
    private static void private_stati(){
        System.out.println("it is a static and private");

    }

}

