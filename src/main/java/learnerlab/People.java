package learnerlab;

import java.util.*;

public abstract class People <E extends Person> implements Iterable<E> {
    //E == Person object

    //People class should instantiate a List field of Person objects named personList
    List<E> eList = new ArrayList<E>();

    public void add(E eObject) {
        eList.add(eObject);
    }

    public E findById(long id) {
        for (E x : eList) {
            if (x.getId() == id) {
                //return the person with the matching id
                return x;
            }
        }
        return null;
    }

    public boolean contains(E eObject) {
        if (eList.contains(eObject)) {
            return true;
        }
        return false;
    }

    public void remove(E eObject) {
        if (eList.contains(eObject)) {
            eList.remove(eObject);
        }
    }

    public void remove(long id) {
        for (E x : eList) {
            if (x.getId() == id) {
                eList.remove(x);
            }
        }
    }

    public void removeAll() {
        eList.removeAll(eList);
    }

    public int count() {
        return eList.size();
    }

    public Iterator iterator() {
        Iterator<E> i = eList.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        return i;
    }

    abstract E[] toArray();
}