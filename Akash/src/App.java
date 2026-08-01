interface Hello {
    void display();
}

class AnonMain {
    public static void main(String[] args) {

        Hello obj = new Hello() {
            public void display() {
                System.out.println("hello");
            }
            void print(){
                System.out.println("s");
            }
        };
        obj.display();
        obj.print();
    }
}