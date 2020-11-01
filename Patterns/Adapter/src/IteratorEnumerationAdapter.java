import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumerationAdapter implements Enumeration<Object> {
    private Iterator<?> iterator;
    IteratorEnumerationAdapter(Iterator<?> iterator){
        this.iterator = iterator;
    }
    @Override
    public boolean hasMoreElements() {
       return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
