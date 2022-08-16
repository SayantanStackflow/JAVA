/*for a rectangle class that takes length and weadth of a rectangle
as input then calculate and print the area and parameter of it*/
class rectangle{
    public static void main(String args[]) {
        int length= 10, width= 30, area= length* width, parameter= 2*(length+ width);
        System.out.println("area: "+area);
        System.out.println("parameter: "+parameter);
    }
}
