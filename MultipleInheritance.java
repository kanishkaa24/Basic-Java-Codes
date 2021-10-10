class MultpleInheritance {
    public static void main(String args[]) {
        Name p;
        p = new Person1("Jatin", 20);
        System.out.println("\n" + p.getEmp_name() + "'s Age is: " + p.print());

        p = new Person2("Naman", 19);
        System.out.println(p.getEmp_name() + "'s Age is: " + p.print() + "\n");
    }
}

abstract class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getEmp_name() {
        return name;
    }

    protected abstract int print();
}

class Person1 extends Name {
    private int age;

    public Person1(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    protected int print() {
        return age;
    }
}

class Person2 extends Name {
    private int age;

    public Person2(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    protected int print() {
        return age;
    }
}
