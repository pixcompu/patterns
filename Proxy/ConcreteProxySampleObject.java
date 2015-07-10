public class ConcreteProxySampleObject implements GeneralProxy{
	public String getData(){
		SampleObject importantObject = new SampleObject();
		return importantObject.getImportantString();
	}
}