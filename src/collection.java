import java.util.*;

public class collection {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(2);
        list.add(15);
        Iterator i = list.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
class Collection1{
    public static void main(String[] args) {

        ArrayList<String> home= new ArrayList<String>();
        home.add("Apple");
        home.add("Drinks");
        home.add("Television");
        Iterator h = home.iterator();
        while (h.hasNext());
        {
            System.out.println(h.next());

        }

    }
}
class Collection2LinkedList{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<Integer>();
        linkedList.add(500);
        linkedList.add(10000);
        linkedList.add(15000);
        Iterator<Integer> l=linkedList.iterator();
        while (l.hasNext()) {
            System.out.println(l.next());
        }

    }

}
class CollectionsLink3{
    public static void main(String[] args) {
        LinkedList<String> fruits= new LinkedList<>();
        fruits.add("Mango");
        fruits.add("Cashew");
        fruits.add("Pawpaw");
        Iterator<String> fruit= fruits.iterator();
        while (fruit.hasNext()){
            System.out.println(fruit.next());


        }

        }

        }
class Collection4Vector{
    public static void main(String[] args) {
        Vector<Integer>vec=new Vector<>();
        vec.add(12);
        vec.add(32);
        vec.add(43);
        Iterator<Integer>v= vec.iterator();
        while (v.hasNext()){
            System.out.println(v.next());

        }

    }


}
class Collection3JStack{
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(33);
        stack.push(43);
        stack.add(23);
        stack.pop();// removes one of the added items using LIFO
        stack.peek();
        Iterator<Integer>s = stack.iterator();
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }


}
class Collection4Queue{
    public static void main(String[] args) {
        PriorityQueue<Integer> priorq = new PriorityQueue<>();
        priorq.add(29);
        priorq.add(50);
        priorq.add(67);
       /* Iterator<Integer> pq= priorq.iterator();
        while (pq.hasNext()){
            System.out.println(pq.next());
        }*/
        System.out.println("HIGH PRIORITY: "+ priorq.element());
        System.out.println("HIGH PRIORITY: "+ priorq.peek());
        System.out.println("Iteration through the queue");
        Iterator<Integer> itr=priorq.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        priorq.remove();// removes one of the element using FIFO
        priorq.poll();//removes one of the element using FIFO
        System.out.println("After removing two elements :");
        Iterator<Integer>itr2= priorq.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }


}
