package hello;

import java.io.PrintWriter;

public class HelloWorld {
  public static void main (String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println ("Hello, GitHub!");
    pen.println("Hello!");
    pen.println("ABC");
    pen.flush();
  } // main(String[])
}
