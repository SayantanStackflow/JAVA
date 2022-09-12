class calculate{
    double volume, radius, height;
    calculate(){
        volume= 0;
    }
    calculate (double r, double h)
    {
        radius= r;
        height= h;
        volume= 0;
    }
    double calvolume(){
        volume= (3.14* radius*radius*height)/3;
        return volume;
    }
}
class cone{
    public static void main(String[] args) {
        calculate obj1= new calculate();
        calculate obj2= new calculate(9,7);
        double volume= obj2. calvolume();
        System.out.println("Volume of cone: "+volume);
    }
}