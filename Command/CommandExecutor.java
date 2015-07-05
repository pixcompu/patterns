public class CommandExecutor{
	private Command theCommand;

	public CommandExecutor(Command theCommand){
		this.theCommand = theCommand;	
	}

	public void startExecuting(){
		theCommand.execute();
	}
}