/**
 * �ۼ��� : 2015. 10. 17.
 * �ۼ��� : ���
 * ��  �� : 
 */
package code.log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * @author ���
 *
 */
public class ConsoleLogFormatter extends Formatter{
	
	public ConsoleLogFormatter(){
		
	}
	
	@Override
	public String format(LogRecord record) {
		StringBuffer output = new StringBuffer();
		output.append(record.getMessage());
		output.append("\r\n");
		
		if (record.getThrown() != null) {
			try {
				StringWriter sw = new StringWriter();
				PrintWriter pw = new PrintWriter(sw);
				record.getThrown().printStackTrace(pw);
				pw.close();
				output.append(sw.toString());
				output.append("\r\n");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return output.toString();
	}
}
