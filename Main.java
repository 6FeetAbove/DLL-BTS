
package Dataproject;

import java.util.Scanner;

public class Main {
    public static Scanner user = new Scanner(System.in);
    public static DLL dll = new DLL();
    public static BST bst = new BST();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operation = 1;
        while(operation == 1){
            System.out.println(" 0. Exit");
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Find student");
            System.out.println("4. List all students");
            System.out.println("5. List distinct names");
            System.out.println("6. List name counts");
            System.out.println("7. About");
            System.out.println("Enter number = ");
            int input = user.nextInt();
            switch(input){
                case 0:
                    close();
                    break;
                case 1:
                    addstudent();
                    break;
                case 2:
                    deletestudent();
                    break;
                case 3:
                    findstudent();
                    break;
                case 4:
                    set();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Student ID = "
                + "\nName = Talha"
                + "\nSurname = Çerçioğlu");
                    break;
                default:
                    System.out.println("You entered unvalid number!");
            }
        }
    }
    
    public static void close(){
        System.out.println("Are you sure?");
        System.out.println("1. No");
        System.out.println("2. Yes");
        int input = user.nextInt();
        switch(input){
            case 1:
                break;
            case 2:
                System.exit(0);
                break;
            default:
                break;
        }  
    }
    
    public static void addstudent(){
        System.out.println("Enter id: ");
            int id = user.nextInt();
            System.out.println("Enter Name: ");
            String name = user.next();
            System.out.println("Enter Surname: ");
            String surname = user.next();
            dll.addstudent(id, name, surname);
            bst.insert(id, name, surname);
    }
    
    public static void deletestudent(){
        System.out.println("Enter id");
        int delete = user.nextInt();
            dll.deletestudent(delete);
            bst.delete(delete);
    }
    
    public static void findstudent(){
        System.out.println("Enter id");
        int find = user.nextInt();
            dll.student(find);
            bst.student(find);
            
    }
    
    public static void set(){
        System.out.println("1. Double linked list");
        System.out.println("2. Binary search tree");
        int input = user.nextInt();
        switch(input){
            case 1:
               dll.listAll();
               break;
            case 2:
                bst.inorder();
                break;
            default:
                System.out.println("you entered unvalid number!");
        }
        
    } 
}
