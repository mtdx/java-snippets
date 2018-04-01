
package javaapplication9;


public class Calc {
    public int a, b;

    public int calc(OpM o) {
        return o.op(a, b);
    }

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calc() {
        this(0, 0);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String toString() {
        return a + " " + b;
    }
}
