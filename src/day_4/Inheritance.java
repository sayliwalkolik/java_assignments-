package day_4;

class Inheritance{
    int a = 10;
    void show() {
        System.out.println("a = "+a);
    }
}

class B extends Inheritance{
    int b = 10;
    void showB() {
        System.out.println("b = "+b);
    }
        public static void main(String[] args) {
            B c = new B();
            c.show();
            c.showB();  
            }
        //overrinding
        void show() {
        	a++;
            System.out.println("a = "+a);
        }
    }

 