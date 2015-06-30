public interface Observable{
	public void register(int type, Observer o);
	public void unregister(int type, Observer o);
	public void notify(int type, Evento evt);
}