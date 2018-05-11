package demo.design.iterator;

public class IteratorClient {

    public static void main(String[] args) {
        Aggregate aggregate = new AggregateImpl();
        aggregate.add("a");
        aggregate.add("c");
        aggregate.add("d");
        aggregate.add("e");

        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
