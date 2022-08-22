class stackoperations{
    int[] stack= new int[5];
    int count= -1;
    void printstack()
    {
        for(int i=0; i<=count; i++)
        {
              System.out.println(stack[i]+" ");
        }
        System.out.println("Top: "+count);
    }
    void push(int value)
    {
        if(count==4)
        {
            System.out.println("Stack Overflow! ");
        }
        else
        {
            count++;
            stack[count]= value;
        }
    }
    void pop()
    {
        if(count==-1)
        {
            System.out.println("Stack Underflow! ");
        }
        else
        {
            stack[count]= 0;
            count--;
        }
    }

}
 class Stack{
    public static void main(String args[]) {
        stackoperations value= new stackoperations();
        value.push(1);
        value.push(2);
        value.push(3);
        value.push(4);
        value.push(5);
        System.out.println("Current Stack: ");
        value.printstack();
        System.out.println("Pushing 6 to Stack: ");
        value.push(6);
        value.printstack();
        System.out.println("Poping from the Stack: ");
        value.pop();
        System.out.println("Current Stack: ");
        value.printstack();
    }
}