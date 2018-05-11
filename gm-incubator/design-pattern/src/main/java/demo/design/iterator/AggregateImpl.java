package demo.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class AggregateImpl implements Aggregate {

    List<Object> list = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new IteratorImpl(this);
    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public int count() {
        return list.size();
    }

    @Override
    public void add(Object o) {
        list.add(o);
    }


}
