import java.util.Scanner;
public class CircularQueue{
    public static void main(String [] a){
        int front=-1,rear=-1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Circular Queue operation performed");
        System.out.print("Enter the size of the queue: ");
        int size = sc.nextInt();
        int [] circularQueue = new int[size];
        System.out.println("\nEnter the choice the perform the circular queue\n1.Insertion\n2.Deletion\n3.Quit");
        int choice = sc.nextInt();
        do{
            switch(choice){
                case 1:
                    if(rear==-1 && front==-1){
                        System.out.print("Enter a number to insert into a circular queue: ");
                        circularQueue[++front] = sc.nextInt();
                    }
                    else if(rear != size-1){
                        if(rear+1 != front){
                            System.out.print("\nEnter a number to insert into a circular queue: ");
                            circularQueue[++rear] = sc.nextInt();
                        }
                        else{
                            System.out.println("Queue is full");
                        }
                    }
                    else{
                        if((rear%n-1)==front){
                            System.out.println("Queue is full");
                        }
                        else{
                            rear=%(n-1);
                            System.out.print("\n"+rear+" Enter a number to insert into a circular queue: ");
                            circularQueue[rear]
                        }
                    }
                    break;
                case 2:
                    if(front != n-1 && front != rear){
                        System.out.println(circularQueue[front]+ " is deleted successfully");
                        front++;
                    }
                    else if(){
                        
                    }
                    break;
                case 3:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Invalid Response");
                    break;
            }
            System.out.println("\nEnter the choice the perform the circular queue\n1.Insertion\n2.Deletion\n3.Quit");
            choice = sc.nextInt();
        }while(choice != 3);
    }
}