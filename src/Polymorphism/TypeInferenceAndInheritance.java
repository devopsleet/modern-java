package Polymorphism;


class MyClass {

}

class FirstDerivedClass extends MyClass {
    int x;
}

class SecondDerivedClass extends FirstDerivedClass {
    int y;
}
public class TypeInferenceAndInheritance {

    // Return some type of MyClass objet.
    static MyClass getObj(int which) {
        switch(which) {
            case 0 : return new MyClass();
            case 1 : return new FirstDerivedClass();
            default : return new SecondDerivedClass();
        }
    }

    public static void main(String[] args) {

    }
}
