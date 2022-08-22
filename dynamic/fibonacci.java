//fibonacci series using constructor
public class fibonacci{
    public static void main(String args[]) {
        int a1=0, a2=1, a3, count= 5;
        System.out.println(a1+" "+ a2);
        for(int i=1; i<count; i++)
        {
            a3= a1+a2;
            System.out.println(" "+a3);
            a1= a2;
            a2=a3;   
        }
        
    }
}