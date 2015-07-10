public class Request{
	private String dataToHandle;
	private String request;

	public Request(String newDataToHandle, String request){
		dataToHandle = newDataToHandle;
		this.request = request;
	}

	public String getDataToHandle(){
		return dataToHandle;
	}

	public String getRequest(){
		return request;
	}
}