import java.util.Scanner;
public class Stack{
    
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack ");
        int size = sc.nextInt();
        int[] stack = new int[size];
        int top = -1;
        System.out.println("Enter your choice to perform stack\n1.push\n2.pop\n3.peek\n4.Quit");
        int choice = sc.nextInt();
        do{
            switch(choice){
                case 1:
                    if(top+1 == size){
                        System.out.println("Sorry Stack is full");
                    }
                    else{
                        System.out.print("Enter the number to insert into the stack: ");
                        stack[++top]=sc.nextInt();
                        System.out.println(stack[top]+" is inserted");
                    }
                    break;
                case 2:
                    if(top == -1){
                        System.out.println("Stack is Empty");
                    }
                    else{
                        System.out.println(stack[top]+" is deleted");
                        --top;
                    }
                    break;
                case 3:
                    if(top == -1){
                        System.out.println("Stack is Empty");
                    }
                    else{
                        System.out.println("Stack is pointing to "+stack[top]);
                    }
                    break;
                case 4:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Invalid response");
                    break;
            }

            System.out.println("Enter your choice to perform stack\n1.push\n2.pop\n3.peek\n4.Quit");
            choice = sc.nextInt();
        }while (choice!=4);
    }
}