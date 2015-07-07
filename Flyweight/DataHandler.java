import java.util.List;
import java.lang.StringBuilder;
import java.util.Collections;
import java.util.ArrayList;

public class DataHandler{

	private String input;

	public DataHandler(String input){
		this.input = input;
	}

/**
Funcion que lo unico que hace es alterar las letras palabra
*/
	public String corruptInput(){
		List<Character> l = new ArrayList<>();
		for(char c :  input.toCharArray()) 
    		l.add(c); 
		Collections.shuffle(l); 				
		StringBuilder sb = new StringBuilder();
		for(char c : l)
			sb.append(c);
		input = sb.toString();
		return input;
	}

}