
package Dataproject;

public class Node {
    private Node left;
    private Node right;
    private int id;
    private String name;
    private String surname;
   
    
    public Node(Node right, int id, String name, String surname, Node left ){
        this.right = right;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
        
    }
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
   

    
}
