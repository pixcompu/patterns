import java.util.Iterator;
import java.util.ArrayList;

public class ObjectCollectionOne implements IteratorInterface{

	private ArrayList<SampleObject> arrayList = new ArrayList<>();

	public ObjectCollectionOne(){
		arrayList.add(new SampleObject("object one of arr"));
		arrayList.add(new SampleObject("object two of arr"));
		arrayList.add(new SampleObject("object three of arr"));
	}

	public Iterator createIterator(){
		return arrayList.iterator();
	}

}