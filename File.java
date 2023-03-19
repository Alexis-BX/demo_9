public class File {
    public int[] elements;
    public int start;
    public int end;
    public int len = 100;
    
    public File(){
        // TODO
        this.elements = new int[len];
        start = 0;
        end = 0;
        return;
    }

    public int top(){
        return this.elements[start];
    }

    public void push(int element){
        // TODO
        if (this.length() >= len-1)
            return;

        this.elements[end] = element;
        end = (end + 1) % len;
    }

    public int pop(){
        int elem = this.elements[start];
        start = (start + 1) % len;
        return elem;
    }

    public int length(){
        return (end - start + len) % len;
    }

    public void print(){
        System.out.print('(');
        
        if (this.length()>0){
            int i = 0;

            int elem = this.pop();
            System.out.print(elem);
            this.push(elem);
            i++;

            while (i < this.length()){
                elem = this.pop();
                System.out.print(", ");
                System.out.print(elem);
                this.push(elem);
                i++;
            }
        }

        System.out.println(')');
    }

    public boolean search(int element){
        int i = 0;
        boolean found = false;

        while (i < this.length()){
            int elem = this.pop();
            if (elem == element)
                found = true;
            this.push(elem);
            i++;
        }

        return found;
    }

    public void remove(int value){
        int i = 0;
        boolean found = false;

        while (i < this.length()+1){
            i++;
            int elem = this.pop();

            if (elem == value && !found){
                found = true;
            } else {
                this.push(elem);
            }
        }
    }
}
