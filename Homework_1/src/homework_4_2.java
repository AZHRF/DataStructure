


    // Java program to find the second last node
// of a linked list in single traversal

    // Linked list node
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }
    class LinkedList
    {
        Node start;
        LinkedList()
        {
            start = null;
        }

        // Function to push node at head
        public void push(int data)
        {
            if(this.start == null)
            {
                Node temp = new Node(data);
                this.start = temp;
            }
            else
            {
                Node temp = new Node(data);
                temp.next = this.start;
                this.start = temp;
            }
        }

        // method to find the second last
        // node of the linked list
        public int findSecondLastNode(Node ptr)
        {
            Node temp = ptr;

            // If the list is empty or contains less
            // than 2 nodes
            if(temp == null || temp.next == null)
                return -1;

            // This loop stops at second last node
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            return temp.data;
        }

        // Driver code

    }

// This code is Contributed by Adarsh_Verma



