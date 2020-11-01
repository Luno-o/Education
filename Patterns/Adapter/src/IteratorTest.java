import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test1");
        arrayList.add("Test2");
        arrayList.add("Test3");
        Iterator arrayIterator = arrayList.iterator();
        Enumeration iteratorEnumerationAdapter = new IteratorEnumerationAdapter(arrayIterator);
        System.out.println(iteratorEnumerationAdapter.hasMoreElements());
        System.out.println(iteratorEnumerationAdapter.nextElement());

    }
}
