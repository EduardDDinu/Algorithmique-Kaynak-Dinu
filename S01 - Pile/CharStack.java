package s01;

import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

public class CharStack {
  private char[] buffer;
  private int    topIndex;

  private static final int DEFAULT_SIZE = 10;

  public CharStack(int estimatedSize) {
    // TODO 
  } 

  public CharStack() {
    this(DEFAULT_SIZE); 
  }

  public boolean isEmpty() {
    return false; // TODO 
  }

  public char top() {
    return '\0'; // TODO 
  }

  public char pop() {
    return '\0'; // TODO 
  }

  public void push(char x) {
    // TODO 
  }
  
  /* Returns a read-only snapshot, as an Enumeration instance.
   * Typical usage:
   *   Enumeration<Character> en = myStack.topDownTraversal();
   *   while(en.hasMoreElements()) 
   *     System.out.println(en.nextElement());
   * Note that that according to the specification, nextElement() 
   * has to throw a NoSuchElementException
   */
  public Enumeration<Character> topDownTraversal() {
    return null; // TODO
  }

}
