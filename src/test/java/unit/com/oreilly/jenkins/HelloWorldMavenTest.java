package unit.com.oreilly.jenkins;

import static org.junit.Assert.*;

import com.oreilly.jenkins.HelloWorldMaven;
import java.io.*;
import org.junit.Test;

public class HelloWorldMavenTest {
    @Test
    public void test() {
	PrintStream savedOut = System.out;
	try {
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(baos));
	    HelloWorldMaven.main(new String[0]);

	    assertEquals("Hello from a Maven project.\n", baos.toString());
	} finally {
	    System.setOut(savedOut);
	}
    }
}
