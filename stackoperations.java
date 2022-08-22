class stackoperations{
    int arr[]= new int [5];
    int top;
    int capacity;

    stackoperations(int size){
        capacity= size;
        top= -1;
    }
    
    void push(int value)
    {
        if(top==4)
        {
            System.out.println("Stack Overflow!");
        }
        System.out.println("Inserting " + value);
        arr[++top] = value;
    }
    int pop(){
        if(top==-1)
        {
            System.out.println("Stack Underflow!");
        }   
        return arr[top--];
    }
    public void printStack() {
        for (int i = 0; i <= top; i++) {
          System.out.print(arr[i] + ", ");
        }
    }
}
public static void main(String args[]) {
    stackoperations stack= new stackoperations(5);
    stack.push(1);
    
    System.out.println("Current Stack: ");

}