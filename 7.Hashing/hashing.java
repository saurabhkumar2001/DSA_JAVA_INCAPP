class Hash {
    private node hashtable[];

    public Hash(int size) {
        hashtable = new node[size];
    }

    class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertion(int value) {
        node newnode = new node(value);
        int index = value % hashtable.length;
        if (hashtable[index] == null) {
            hashtable[index] = newnode;
        } else {
            node currentNode = hashtable[index];
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newnode;
        }

    }

    public void searching(int value) {
        int index = value % hashtable.length;
        boolean flag = true;
        if (hashtable[index] != null) {
            node currentNode = hashtable[index];
            while (currentNode != null) {
                if (currentNode.data == value) {
                    flag = false;
                }
                currentNode = currentNode.next;
            }
        } else {
            flag = false;
        }
        if (flag) {
            System.out.println("no value found");
        } else {
            System.out.println("value found");
        }
    }

    public void traversing() {
        for (int i = 0; i < hashtable.length; i++) {
            node currentNode = hashtable[i];
            System.out.print(i + ": ");
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

    public void deletion(int value) {
        boolean flag = true;
        int index = value % hashtable.length;
        if (hashtable[index] != null) {
            node currentnode = hashtable[index];
            if (currentnode.data == value) {
                hashtable[index] = currentnode.next;
                System.out.println("value is deleted");
            } else {
                node prev = currentnode;
                currentnode = currentnode.next;
                while (currentnode != null) {
                    if (currentnode.data == value) {
                        prev.next = currentnode.next;
                        System.out.println("value is deleted");
                        flag = false;
                        break;
                    }
                    prev = currentnode;
                    currentnode = currentnode.next;
                }
            }
        } else {
            System.out.println("no value is found for deletion");
        }

        if (flag) {
            System.out.println("no value is deleted");
        }
    }

    public void Deleteall(){
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = null;
        }
    }

}

public class hashing {
    public static void main(String[] args) {
        Hash h = new Hash(10);
        h.insertion(10);
        h.insertion(12);
        h.insertion(18);
        h.insertion(25);
        h.insertion(28);
        h.insertion(38);
        h.insertion(15);
        h.insertion(13);
        h.traversing();
        h.searching(12);
        h.searching(5);
        h.searching(15);
        h.deletion(38);
        h.deletion(48);
        h.traversing();
        h.Deleteall();
        h.traversing();
    }
}
