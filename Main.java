public class Main {
    public static File merge_sort(File file){
        // TODO
        return new File();
    }

    public static File quick_sort(File file){
        // TODO
        return new File();
    }

    public static Node bubble_sort(Node list){
        // TODO
        return new Node(0);
    }

    public static void main(String[] args) throws Exception {
        File file = new File();
        file.push(3);
        file.push(7);
        file.push(0);
        file.push(6);
        file.push(9);
        file.push(4);
        file.push(2);
        file.push(10);
        file.push(5);

        // expected : (0, 2, 3, 4, 5, 6, 7, 9, 10)
        file = merge_sort(file);
        // file = quick_sort(file);

        file.print();

        Node linked_list = new Node(9);
        linked_list.addValue(3);
        linked_list.addValue(5);
        linked_list.addValue(2);
        linked_list.addValue(8);
        linked_list = bubble_sort(linked_list);
        linked_list.print();


        Double_linked double_linked = new Double_linked(5);
        double_linked.insertSort_double(3);
        double_linked.insertSort_double(7);
        double_linked.insertSort_double(6);
        double_linked.print();
    }
}
