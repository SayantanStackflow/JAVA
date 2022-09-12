class rectangle{
    double length, breadth;
    rectangle(double l, double b){
        length= l;
        breadth= b;
    }
    double calarea(){
        return length+breadth;
    }
}
class rectbox extends rectangle{
    double height;
    rectbox(double l, double b, double h){
        super(l, b);
        height= h;
    }
    double calvol(){
        return calarea()* height;
    }
}
class rectvol{
    public static void main(String[] args) {
        rectbox obj= new rectbox(5, 6 ,8);
        double area= obj.calarea();
        double volume= obj.calvol();
        System.out.println("The area is : "+area);
        System.out.println("The volume is: "+volume);
    }
}