package demo.design.iterator;

public interface Aggregate {

    Iterator createIterator();

    Object get(int index);

    int count();

    void add(Object o);

}
