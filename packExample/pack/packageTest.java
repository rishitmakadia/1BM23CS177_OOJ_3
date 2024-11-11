package pack;
import p1.classA;
import p1.classB;
import p1.p11.classC;
import p2.classD;
public class packageTest {
    public static void main(String[] args) {
        classA a1 = new classA();
        classB b1 = new classB();
        classC c1 = new classC();
        classD d1 = new classD();
        a1.displayA();
        b1.displayB();
        c1.displayC();
        d1.displayD();
    }
}
