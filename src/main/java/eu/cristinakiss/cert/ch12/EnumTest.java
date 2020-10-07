package eu.cristinakiss.cert.ch12;

public class EnumTest {

    public static void main(String[] args) {
        OnlyOne enum1 = OnlyOne.ONE;
        System.out.println(enum1);
    }
}

enum OnlyOne {
    ONE("one"),TWO("two");
    private final String innerValue;
    private OnlyOne(String value) {
        this.innerValue=value;
        System.out.println("constr:"+this.innerValue);
    }
}
