public class test1
{
    public static void main(String[] args) {
        lab4_1<Integer>l=new lab4_1<>();
        System.out.println(l.isEmpty());
        System.out.println(l.size());
        l.addFirst(11);
        l.addlast(12);
        l.addlast(13);
        l.addFirst(10);
        while (!l.isEmpty()){
            System.out.print(l.removeFirst()+"\t");
        }
        System.out.println(l.size());
    }
}
