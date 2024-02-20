package com.driver;
// Task 1


// Task 2


public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        // Class B extends Class A
        @Override
        public String meth(){
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        // Task 3
        A objB = new A();
        String resultTask3 = objB.meth();
        System.out.println(resultTask3);

        B obj = new Main.B();
        // Task 5
        String resultTask5 = obj.meth();
        System.out.println(resultTask5);  // Output: Method is overridden in Extended class B
    }
}
