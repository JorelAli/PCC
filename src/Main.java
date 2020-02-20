import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Collectors;

import javacc.PCC;

public class Main {

	public static void main(String[] args) throws IOException {
		String ourCode = Files.readAllLines(new File("prog.pcc").toPath()).stream().collect(Collectors.joining("\n"));
    	PCC.parse(ourCode);
	}
	
}
