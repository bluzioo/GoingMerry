package demo.design.iterator;

public class IteratorImpl implements Iterator {

    private Aggregate aggregate;
    private int current = 0;

    public IteratorImpl(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object next() {
        return aggregate.get(current++);
    }

    @Override
    public boolean hasNext() {
        return current < aggregate.count();
    }
}
