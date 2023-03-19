public class Double_linked{
    public class Node{
        Node parent, next;
        int value;

        Node(int value){
            this.value = value;    
            parent = null;
            next = null;
        }

        public void addValue(int value){
            // TODO              
        }
    }

    public Node list;

    Double_linked(int value){
        list = new Node(value);
    }

    public void insertSort_double(int value){
      // TODO
    }

    public void print(){
        System.out.print('(');
        System.out.print(list.value);

        Node current = list;
        while(current.next != null){
            current = current.next;
            System.out.print(", ");
            System.out.print(current.value);
        }

        System.out.println(')');
    }
}
