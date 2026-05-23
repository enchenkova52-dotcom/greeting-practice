class B {
    int a;
    int b;
    int c;
    int z;

    public B() {
        this(0, 0, 0);
        z = 1;
    }

    public B(int a) {
        this(a, 0, 0);
        z = 1;
    }

    public B(int a, int b) {
        this(a, b, 0);
        z = 1;
    }

    public B(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;
    }

    public void print() {
        System.out.printf("a=%d, b=%d, c=%d, z=%d%n", a, b, c, z);
    }

    public static void main(String[] args) {
        new B().print();
        new B(1).print();
        new B(1, 2).print();
        new B(1, 2, 3).print();
    }
}