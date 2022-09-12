class employee{
    double da, hra, ma, basic;
    employee(double b)
    {
        hra= .25;
        da= .75;
        ma= 1000;
        basic= b;
        
    }
    double regularsal(){
        return( basic+(basic* hra)+ (basic* da)+ ma);
    }
}
class Scientist extends employee{
    int bonus= 10000; 
    int n;
    Scientist( double b, int num){
        super(b);
        n= num;
    }
    double getbonusofscience(){
        return bonus* n;
    }
}
class Developer extends employee{
    int bonus= 7000; 
    int n;
    Developer( double b, int num){
        super(b);
        n= num;
    }
    double getbonusofdeveloper(){
        return bonus* n;
    }
}
class ProjectLead extends employee{
    int bonus= 8000; 
    int n;
    ProjectLead( double b, int num){
        super(b);
        n= num;
    }
    double getbonusoflead(){
        return bonus* n;
    }
}
class salary{
    public static void main(String[] args) {
        Scientist scienceobj= new Scientist(100000.0, 9);
        Developer develobj= new Developer(70000.0, 8);
        ProjectLead leadobj= new ProjectLead(50000.0, 10);
        System.out.println("Scientist's monthly salary: "+scienceobj.regularsal()+"bonus is"+scienceobj.getbonusofscience());
        System.out.println("Developer's monthly salary: "+develobj.regularsal()+"bonus is"+develobj.getbonusofdeveloper());
        System.out.println("Project Leader's monthly salary: "+leadobj.regularsal()+"bonus is"+leadobj.getbonusoflead());
    }
}