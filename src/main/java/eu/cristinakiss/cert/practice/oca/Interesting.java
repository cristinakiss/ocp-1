package eu.cristinakiss.cert.practice.oca;

public interface Interesting {

    public abstract void test1();

    void test2();

    default void test3() {
        System.out.println("aaaaaa");
        test4();
    }

    private void test4() {
        //Error:(14, 23) java: private interface methods are not supported in -source 8
        //  (use -source 9 or higher to enable private interface methods)
        System.out.println("private");
    }
}
