import java.util.Iterator;
import java.util.Hashtable;
import java.util.HashMap;

public class ObjectCollectionTwo implements IteratorInterface{

	private HashMap<Integer, SampleObject> hashTable = new HashMap<>();

	public ObjectCollectionTwo(){
		hashTable.put(0, new SampleObject("object one of hashtable"));
		hashTable.put(1, new SampleObject("object two of hashtable"));
		hashTable.put(2, new SampleObject("object three of hashtable"));
	}


	public Iterator createIterator(){
		return hashTable.values().iterator();
	}
}