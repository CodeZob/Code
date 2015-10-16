/**
 * ÀÛ¼ºÀÏ : 2015. 10. 17.
 * ÀÛ¼ºÀÚ : Áê¿å
 * ¼³  ¸í : 
 */
package code.log;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

/**
 * @author Áê¿å
 *
 */
public class ErrorFilter implements Filter{
	
	public ErrorFilter(){
		
	}
	
	public boolean isLoggable(LogRecord record){
		return record.getThrown() != null;
	}

}
