package s01;

import java.rmi.NoSuchObjectException;
import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

public class CharStack {
  private char[] buffer;
  private int    topIndex;

  private static final int DEFAULT_SIZE = 10;

  /** estimatedSize should be greater than zero **/
  public CharStack(int estimatedSize) {
      topIndex = -1;
      buffer = new char[estimatedSize];
  } 

  public CharStack() {
    this(DEFAULT_SIZE); 
  }

  public boolean isEmpty() {
     return topIndex < 0 ?  true : false;
  }

/** Buffer shouldn't be empty **/
  public char top() {
      return buffer[topIndex];
  }
/** buffer shouldn't be empty. **/
  public char pop() {
    return buffer[topIndex--];
  }

  public void push(char x) {
    if(topIndex == buffer.length-1){
        char[] newBuffer = new char[buffer.length*2];
        for(int i = 0;i < buffer.length; i++){
            newBuffer[i] = buffer[i];
        }
        buffer = newBuffer;
    }
      buffer[++topIndex] = x;
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
