
package Dataproject;

public class BST {
    private Node root;
    
    public void insert(int id, String name, String surname){
        Node newnode = new Node(null, id, name, surname, null);
        
        if(root == null){
            root = newnode;
        }
        else{
            Node x = root;
            while(true){
                if(id < x.getId()){
                    if(x.getLeft() == null){
                        x.setLeft(newnode);
                        break;
                    }
                    else{
                        x = x.getLeft();
                    }
                }
                else{
                    if(x.getRight() == null){
                        x.setRight(newnode);
                        break;
                    }
                    else{
                        x = x.getRight();
                    }
                }
            }
        }
    }
    public int minimum(Node temp){
        int minv = temp.getId();
        while (temp.getLeft() != null) 
        {
            minv =  temp.getLeft().getId();
            temp = temp.getLeft();
        }
        return minv;
    }
     public Node delete(Node temp, long id){
        if (temp == null){
            System.out.println("The Student does not exist in BST");
            return temp;
        }

        if (id < temp.getId())
            temp.setLeft(delete(temp.getLeft(), id));
        else if (id > temp.getId())
            temp.setRight(delete(temp.getRight(), id));
        else {
            if (temp.getLeft() == null)
                return temp.getRight();
            else if (temp.getRight()== null)
                return temp.getLeft();
            temp.setId(minimum(temp.getRight()));
            temp.setRight(delete(temp.getRight(), temp.getId()));
        }
        System.out.println("The student is gone");
        return temp;
        
    }
    
     public void delete(long id){
        delete(root, id);
    }
    
    
    public void student(int id){
        Node temp = root;
        int hops = 0;
        while(true){
            if(temp.getId() == id){
                System.out.println("Student's ID = " + temp.getId()
                + "\nStudent's name = " + temp.getName()
                + "\nStudent's surname = " + temp.getSurname()
                + "\nHop" + hops);
                break;
            }
            
            if(id < temp.getId())
                temp = temp.getLeft();
            else
                temp = temp.getRight();
            
            
            hops++;
           
        }         
    }
    
    
    
    public void inorder(Node temp){
        if(temp == null){
            return;
        }
        inorder(temp.getLeft());
        System.out.println(temp.getId() + " " + temp.getName() + " " + temp.getSurname() + " ");
        inorder(temp.getRight());
        
    }
    
    public void inorder(){
        inorder(root);
    }
    
}
