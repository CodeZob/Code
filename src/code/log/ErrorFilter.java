/**
 * �ۼ��� : 2015. 10. 17.
 * �ۼ��� : ���
 * ��  �� : 
 */
package code.log;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

/**
 * @author ���
 *
 */
public class ErrorFilter implements Filter{
	
	public ErrorFilter(){
		
	}
	
	public boolean isLoggable(LogRecord record){
		return record.getThrown() != null;
	}

}
