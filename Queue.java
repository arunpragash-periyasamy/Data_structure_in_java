import java.util.Scanner;
public class Queue{
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Queue Performed using array");
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
                        System.out.println(queue[rear]+" is inserted");
                    }
                    else if(rear != size-1){
                        queue[++rear]=sc.nextInt();
                        System.out.println(queue[rear]+" is inserted");
                    }
                    else{
                        System.out.println("The Queue is full");
                        }
                        break;
                case 2:
                    if(front<=rear){
                        System.out.println(queue[front]+" is deleted successfully");
                        front++;
                    }
                    else{
                        System.out.println("There is no element to delete from the queue");
                    }
                    break;
                case 3:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Invalid Response");
                    break;
                }
        System.out.println("Enter the choice to perform Queue\n1.Insertion\n2.Deletion\n3.Quit");
        choice = sc.nextInt();
        }while(choice != 3);
    }
}
