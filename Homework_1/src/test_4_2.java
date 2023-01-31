  public class test_4_2 {
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();

		/* Use push() function to construct
		the below list 8 -> 23 -> 11 -> 29 -> 12 */
        ll.push(12);
        ll.push(29);
        ll.push(11);
        ll.push(23);
        ll.push(8);
        System.out.println(ll.findSecondLastNode(ll.start));
    }
}
