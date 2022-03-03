
package Dataproject;

public class DLL {
    private Node head;
    private Node tail;
    private int theSize;
    
    public DLL(){
        head = new Node(null, 0, null, null, null);
        tail = new Node(null, 0, null, null, head);
        head.setRight(tail);
        theSize = 0;
    }
    
    
    public void addstudent(int id, String name, String surname){
        
        Node temp1 = head;
        Node temp2 = head.getRight();
        Node newnode = new Node(null, id, name, surname, null);
        
        while(newnode.getId() < temp2.getId()){
            temp1 = temp1.getRight();
            temp2 = temp2.getRight();
        }
        
        newnode.setRight(temp2);
        newnode.setLeft(temp1);
        temp2.setLeft(newnode);
        temp1.setRight(newnode);
        
        theSize++;
        
    }
    
    public void deletestudent(int id){
        if(isEmpty())
            System.out.println("There is no student!!");
        else{
            Node temp = head;
            while(temp.getId() != id){
                temp = temp.getRight();
                if(temp.getRight() == null){
                    break;
                }
                if(temp.getId() == id){
                temp.getLeft().setRight(temp.getRight());
                temp.getRight().setLeft(temp.getLeft());
                temp.setRight(null);
                theSize--;
                System.out.println("The student is gone");
                }
            }
        }
    }
    
    public void student(int id){
        Node temp = head;
        int operator = 1;
        int hops = 0;
        while(temp.getId() != id){
            hops++;
            temp = temp.getRight();
            if(temp.getRight() == null){
                System.out.println("There is no student like that");
                operator = 0;
                break;
            }
        }
        if(operator == 1){
            System.out.println("Student's ID = " + temp.getId()
                + "\nStudent's name = " + temp.getName()
                + "\nStudent's surname = " + temp.getSurname()
                + "\nHop" + hops);
        }
    }
    
    public void listAll(){
        Node temp = tail.getLeft();
        while(temp.getLeft()!= null){
            System.out.println(temp.getId() + " " + temp.getName() + " " + temp.getSurname() );
            temp = temp.getLeft();
        }
    }
    
    public int theSize(){
        return theSize;
    }
    public boolean isEmpty(){
        return theSize == 0;
    }
    
}
