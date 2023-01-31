public class linkedList<E> {
    public static class Node<E>{
        private E element;
        private Node<E>next;
        public Node(E e,Node<E>n){
            element=e;
            next=n;
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
    private Node<E> head =null;
    private Node<E> tial=null;
    private int size=0;
    public linkedList(){}
    public int size(){
        return size;
    }
    public boolean isEmpty(){return size==0;}
    public E first(){if (isEmpty())return null;
    return head.getElement();}
    public E last (){
        if (isEmpty())return null;
        return tial.getElement();
    }
    public void addFirst(E e){
        head=new Node<>(e,head);
        if ( size==0)
            tial=head;
        size++;
    }
    public void addlast(E e){
       Node<E> newest=new Node<>(e,null);
        if ( isEmpty())
            head=newest;
        else
            tial.setNext(newest);
        tial=newest;
        size++;
    }
    public E removeFirst(){
        if (isEmpty())return null;
        E answer=head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tial=null;
        return answer;
    }


}
