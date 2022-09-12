class maincalculate{
    static double result;
    static double num1, num2;
    maincalculate(int a, int b)
    {
        num1= a;
        num2= b;
        result= 0;
    }
    static void print(){
        System.out.println("The values areL: "+num1+ "and" +num2);
        
    }
    static double add(){
        return num1+ num2;
    }
    static double difference(){
        return num1-num2;
    }
    static double multiplication(){
        return num1*num2;
    }
     static double devide(){
        return num1/ num2;
    }
}
class calculator{
    public static void main(String[] args){
        maincalculate obj= new maincalculate(10 , 5);
        maincalculate.print();
        System.out.println("The sum is : "+maincalculate.add());
        System.out.println("The multiplication is : "+maincalculate.multiplication());
        System.out.println("The difference is : "+maincalculate.difference());
        System.out.println("The device is : "+maincalculate.devide());
    }
}