package com.driver;
// Task 1
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2
class B extends A {
    // Class B extends Class A
}

public class Main {
    public static void main(String[] args) {
        // Task 3
        B objB = new B();
        String resultTask3 = objB.meth();
        System.out.println(resultTask3);  // Output: Invoking method from class A

        // Task 4
        // Override the meth method in Class B
        class B extends A {
            @Override
            public String meth() {
                return "Method is overridden in Extended class B";
            }
        }

        // Task 5
        String resultTask5 = objB.meth();
        System.out.println(resultTask5);  // Output: Method is overridden in Extended class B
    }
}
