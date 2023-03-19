public class Node {
    public int value;
    public Node next = null;

    public Node(int value){
        this.value = value;
    }

    public Node(int value, Node next){
        this.value = value;
        this.next  = next;
    }

    public void addValue(int value){
        if (next == null)
            this.next = new Node(value);
        else
            this.next.addValue(value);
    }

    public void addNode(Node next){
        if (this.next == null)
            this.next = next;
        else
            this.next.addNode(next);
    }

    public void removeLast(){
        if (next == null)
            return;
        if (next.next == null)
            next = null;
        else
            next.removeLast();
    }

    public void removeValue(int value){
        if (next == null)
            return;
        while (next.value == value)
            next = next.next;
            if (next == null)
                return;
        next.removeValue(value);
    }

    public int length_iteratif(){
        int i = 1;

        Node n = next;
        while (n != null){
            n = n.next;
            i++;
        }
        return i;
    }

    public int length_recurssion(){
        if (next == null)
            return 1;
        return 1 + next.length_recurssion();
    }

    public int returnNlast(int nLast){
        Node n = next;
        int len = length_iteratif();

        if (nLast>len)
            return value;

        for (int i=0; i<len-nLast-1; i++){
            n = n.next;
        }

        return n.value;
    }

    public void addValue_ordered(int value){
        if (value < this.value){
            next = new Node(this.value, next);
            this.value = value;
        }
        else if (next == null){
            next = new Node(value);
        }
        else {
            next.addValue_ordered(value);
        }
    }

    public void insertSort(){
        Node tmp = next;
        next = null;

        while (tmp != null){
            this.addValue_ordered(tmp.value);
            tmp = tmp.next;
        }
    }

    public void print(){
        System.out.print('(');
        System.out.print(this.value);

        Node current = this;
        while(current.next != null){
            current = current.next;
            System.out.print(", ");
            System.out.print(current.value);
        }

        System.out.println(')');
    }

}
