import java.util.Scanner;
public class Queue{
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Queue: ");
        int size = sc.nextInt();
        int[] queue = new int[size];
        int rear=-1,front=-1;
        System.out.println("Enter the choice to perform Queue\n1.Insertion\n2.Deletion\n3.Quit");
        int choice = sc.nextInt();
        do{
            switch(choice){
                case 1:
                    if(rear==-1&&front==-1){
                        ++rear;
                        ++front;
                        queue[front]=sc.nextInt();
                    }
                    else if(rear != n-1){
                        
                    }
            }
            System.out.println("Enter the choice to perform Queue\n1.Insertion\n2.Deletion\n3.Quit");
            choice = sc.nextInt();
        }while()
    }
}