package Interface;

interface one {
    int a = 1;

    void sample1();
}

interface two {
    int b = 2;

    void sample2();
}

class three implements one, two {
    public void sample1() {
        System.out.println(a);
    }

    public void sample2() {
        System.out.println(b);
    }

    public static void main(String[] args) {
        three obj = new three();
        obj.sample1();
        obj.sample2();
    }
}
