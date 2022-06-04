public class Tree {
    private Node root;
    private boolean rootInit = false;

    public Tree() {

    }

    public Tree(Node root) {
        this.root = root;
        this.rootInit = true;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
        this.rootInit = true;
    }

    public void add(int x) {
        Node newNode = new Node(x);
        Node hold = this.root;
        boolean timeToAdd = false;
        if (this.rootInit == false) {
            hold.setValue(x);
        } else {
            while (timeToAdd == false) {
                if (hold.getValue() > x) {
                    if (hold.getLeft() == null) {
                        timeToAdd = true;
                        hold.setLeft(newNode);

                    } else {
                        hold = hold.getLeft();
                    }

                } else if (hold.getValue() < x) {

                    if (hold.getRight() == null) {
                        timeToAdd = true;
                        hold.setRight(newNode);
                    }

                    else {
                        hold = hold.getRight();
                    }
                } else if (hold.getValue() == x) {
                    System.out.println("nie dodaje bo jest");
                }
            }
        }

    }

    public void printRight() {
        Node hold = this.root;
        if (rootInit == true) {
            while (hold != null) {
                System.out.println(hold.getValue());
                hold = hold.getRight();
            }

        } else {
            System.out.println("Jeszcze pusta");
        }
    }
    public void printLeft() {
        Node hold = this.root;
        if (rootInit == true) {
            while (hold != null) {
                System.out.println(hold.getValue());
                hold = hold.getLeft();
            }

        } else {
            System.out.println("Jeszcze pusta");
        }
    }

    public int max(){
        Node hold = this.root;
            while (hold.getRight() != null) {
                hold = hold.getRight();
            }

        return hold.getValue();
    }
    public int min(){
        Node hold = this.root;
        while (hold.getLeft() != null) {
            hold = hold.getLeft();
        }

        return hold.getValue();
    }
    public boolean contains(int x) {
        Node hold = this.root;
        boolean stillSearch =true;
        while(stillSearch==true){
            if(x== hold.getValue()){
                return true;
            }
        else if(x>hold.getValue()){
            if(hold.getRight()!=null) {
                hold=hold.getRight();
            }
            else {
                stillSearch = false;
            }
        }
        else if(x<hold.getValue()){
            if(hold.getLeft()!=null) {
                hold = hold.getLeft();
            }
            else{
                stillSearch=false;
            }
        }
        }
        return false;
    }
    }
