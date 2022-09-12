/*a class Volume and overload a method to calculate the volume of a rectangular box, a cube and a cylinder */
class volume{
    double calvolume( double side)
    {
        return side*side*side;
    }
    double calvolume(double length, double breadth, double height)
    {
        return length*breadth*height;
    }
    double calvolume(double radius, double height)
    {
        return 3.14*radius*radius*height;
    }
}
class method{
    public static void main(String[] args) {
        volume object= new volume();
        System.out.println("Volumn of cube: "+object.calvolume(3));
        System.out.println("Volumn of rectangle: "+object.calvolume(5,7));
        System.out.println("Volumn of cylinder: "+object.calvolume(7, 9, 12));
    }
}