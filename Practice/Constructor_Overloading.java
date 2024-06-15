package Practice;

class Demo{
    int  value1;
    int  value2;
    Demo(){
        value1 = 10;
        value2 = 20;
        System.out.println("Inside 1st Constructor");
    }
    Demo(int a){
        value1 = a;
        System.out.println("Inside 2nd Constructor");
    }
    public static void main(String args[]){
        Demo d1 = new Demo();
        Demo d2 = new Demo(30);
    }
}
