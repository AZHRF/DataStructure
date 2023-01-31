public class lab4_1 <E>{

    private Node<E>head=null;
    private Node<E>tail=null;
    private int size=0;

   public lab4_1(){

   }
   public boolean isEmpty(){
      return size==0;
   }
   public int size(){
       return size;
   }
   public E first(){
       if (isEmpty()) return null;
       return head.element;
   }
    public E last(){
        if (isEmpty()) return null;
        return tail.element;
    }

    public void addFirst(E element){
        head=new Node<>(element,head);
        if (isEmpty())
            tail=head;
        size++;
    }

   public void addlast(E element){
       Node<E>newst=new Node<>(element, null);
       if (isEmpty())
           head=newst;
       else
           tail.next=newst;
       tail=newst;
       size++;
   }
    public E removeFirst(){
        if (isEmpty())return null;
        E deleted=head.element;
        head=head.next;
        size--;
        if (size==0)
            tail=null;
        return deleted;
    }









    private static class Node<E>{
        E element;
        Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
