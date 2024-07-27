class Operators{
    public static void main(String[]args){
        // arthimatic operators
        int a=13;
        int b=6;
        System.out.println("Addition of a and b is"+(a+b));
        System.out.println("Sbstraction of a and b is"+(a-b));
        System.out.println("Multiplication of a ana b ic"+(a*b));
        System.out.println("Division of a and b is"+(a/b));
        System.out.println("Modulus of a and b is"+(a%b));

       //unary operators
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

    //logical operators
    boolean ab=true;
    boolean bc=false;
    System.out.println("The value of a && b is"+(ab&&bc));
    System.out.println("The value of ab || bc"+(ab||bc));
    System.out.println("The value of !bc is "+(!bc));

    //relationol operator
    int x=10;
    int y=20;
    System.out.println(x>y);
    System.out.println(x<y);
    System.out.println(x==y);
    System.out.println(x!=y);
    System.out.println(x>=y);
    System.out.println(x<=y);

    //Assigment operators
    int d=1;
    d+=3;
    d-=4;
    d*=5;
    d/=6;

    System.out.println(d);

    
    }
}