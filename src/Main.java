public class Main {
    public static void main(String[] args) {
        Node nd = new Node(6);
        Tree tree = new Tree();
        tree.setRoot(nd);
        tree.add(8);
        tree.printRight();
        tree.add(3);
        tree.printLeft();
        System.out.println(tree.min());
        System.out.println(tree.max());

    }


}
