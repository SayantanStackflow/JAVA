//fibonacci series using constractor
public class fibonacci{
    public static void main(String args[]) {
        int a1=0, a2=1, a3, i, count= 5;
        System.out.println(a1+" "+ a2);
        for(i=1; i<count; i++)
        {
            a3= a1+a2;
            System.out.println(""+ a3);
            a1= a2;
            a2=a3;   
        }
        
    }
}