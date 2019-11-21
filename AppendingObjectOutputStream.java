package rank;
import java.io.*;
import java.util.*;
public class AppendingObjectOutputStream extends ObjectOutputStream {

	  public AppendingObjectOutputStream(FileOutputStream file) throws IOException {
	    super(file);
	  }

	  @Override
	  protected void writeStreamHeader() throws IOException {
	    // do not write a header, but reset:
	    // this line added after another question
	    // showed a problem with the original
	    reset();
	  }

	public P7 readObject() {
		// TODO Auto-generated method stub
		return null;
	}

	}
