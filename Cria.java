package criandoarquivo;

import java.io.*;

public class Cria {

	public static void main(String[] args) {
		char[] in = new char[50];
		int size = 0;
		
		try {
			File file = new File("arquivoteste.txt");
			FileReader fr = new FileReader(file);
			size = fr.read(in);
			System.out.print(size + " ");
			for(char c : in)
				//if (in[c] == "invoke") {
				System.out.print(c);
				//}
			fr.close();
			
		} catch(IOException e) { }
		

	}

}
