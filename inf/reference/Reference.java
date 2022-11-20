public class Reference {

    // Reference vs value type when passing parameters
    public static void foo(int a, SomeClass b) {
        int copyOfa = a;
        // Warning: what we copy here is the reference NOT the object
        SomeClass copyIOfb = b;
        System.out.println(b.aNumber); // 10
        copyIOfb.aNumber = 42;
        System.out.println(b.aNumber); // 42
        b.aNumber = 141;
        System.out.println(copyIOfb.aNumber); // 141
    }
    public static void main(String[] args) {
        // declare reference
        SomeClass oneVar = null;
        // create instance
        new SomeClass(); // ready for Garbage collection
        // declare reference + declare instance
        SomeClass otherVar = new SomeClass();
        int a = 10;
        foo(a, otherVar);
        System.out.println(a); // 10 ALWAYS!
    }
}