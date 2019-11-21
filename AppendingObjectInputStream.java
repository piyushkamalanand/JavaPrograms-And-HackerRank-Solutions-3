package rank;
import java.io.*;
import java.util.*;
public class AppendingObjectInputStream extends ObjectOutputStream {

	  public AppendingObjectInputStream(FileInputStream file) throws IOException {
	    super();
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

