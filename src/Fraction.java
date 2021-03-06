public class Fraction {
    private float a, b;

    public Fraction() {
        a = 1;
        b = 1;
    }

    public Fraction(float a) {
        this.a = a;
        this.b = 1;
    }

    public Fraction(float a, float b) {
        this.a = a;
        if (b != 0)
            this.b = b;
        else
            this.b = 1;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getA() {
        return this.a;
    }

    public float getB() {
        return this.b;
    }

    public void Mult(Fraction f) {
        this.a *= f.getA();
        this.b *= f.getB();
    }

    public void Add(Fraction f) {
        this.a = this.a * f.getB() + this.b * f.getA();
        this.b = this.a * f.getB();
    }
}
