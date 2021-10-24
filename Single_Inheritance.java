class Mathametics{
    int first, second;
    void setSide(int first, int second ){
        this.first = first;
        this.second = second;
    }
    void getSides(){
        System.out.println("");
    }
}

class Multiply extends Mathametics{
    void numbers(){
        System.out.println("\nThe Multiplication of numbers (3,5): "+ this.first*this.second);
    }
}



public class Single_Inheritance {
    public static void main(String[] args) {
        Multiply num = new Multiply();
        num.setSide(3,5);
        num.numbers();
    }
}
