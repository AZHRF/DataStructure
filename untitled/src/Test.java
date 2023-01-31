public class Test {
    public static void main(String[] args) {
        LAB_4<Integer>l=new LAB_4<>();
        System.out.println(l.isEmpty());
        System.out.println(l.size());
        l.addFirst(11);
        l.addLast(12);
        l.addLast(13);
        l.addFirst(10);
        while (!l.isEmpty()){
            System.out.print(l.removeFirst()+"\t");
        }
        System.out.println(l.size());
    }
}
