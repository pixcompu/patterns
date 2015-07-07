import java.util.Iterator;

public class Launcher{
	public static void main(String[] args) {
		ObjectCollectionOne collectionOne = new ObjectCollectionOne();
		ObjectCollectionTwo collectionTwo = new ObjectCollectionTwo();
		showValues(collectionOne);
		showValues(collectionTwo);
	}

	public static void showValues(IteratorInterface collectionN){
		Iterator it = collectionN.createIterator();
		while (it.hasNext()) {
			SampleObject sample = ((SampleObject)it.next());
			System.out.println(sample.getData());
		}
	}
}