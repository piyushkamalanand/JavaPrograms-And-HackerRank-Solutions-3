package rank;
import java.io.*;
import java.util.*;
public class AppendableObjectOutputStream extends ObjectOutputStream {

	  public AppendableObjectOutputStream(OutputStream out) throws IOException {
	    super(out);
	  }

	  @Override
	  protected void writeStreamHeader() throws IOException {
	    // do not write a header, but reset:
	    // this line added after another question
	    // showed a problem with the original
	    reset();
	  }

	}