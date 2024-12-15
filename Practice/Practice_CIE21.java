
interface Routine{
    default void diet(){
        System.out.println("2500 calories needed per day");
    }
    void workout();
}
class Person1 implements Routine{
    public void workout(){
        System.out.println("Person1 Workout");
    }
}
class Person2 implements Routine{
    @Override
    public void workout() {
        System.out.println("Person2 Workout");
    }
}
public class Practice_CIE21 {
    public static void main(String[] args) {
        Person1 p1 =new Person1();
        Person2 p2 =new Person2();
        p1.diet();
        p1.workout();
        p2.diet();
        p2.workout();
    }
}
