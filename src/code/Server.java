/**
 * 작성일 : 2015. 10. 17.
 * 작성자 : 쥬욕
 * 설  명 : 
 */
package code;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * @author 쥬욕
 *
 */
public class Server {
	
	private static Server _instance = null;
	
	private static Logger _log = Logger.getLogger(Server.class.getName());
	
	private static final String LOG_PROP = "./config/log.properties";
	
	/**
	 * 서버 시작!
	 * @return Server Singleton Instance
	 */
	public static synchronized Server start(){
		if(_instance == null)
			_instance = new Server();
		
		return _instance;
	}
	
	private Server(){
		File logFolder = new File("log");
		logFolder.mkdir();
		
		try {
			InputStream is = new BufferedInputStream(new FileInputStream(LOG_PROP));
			LogManager.getLogManager().readConfiguration(is);
			is.close();
		} catch (IOException e) {
			_log.log(Level.SEVERE, "로드 실패 " + LOG_PROP + " 파일.", e);
			System.exit(0);
		}
		
		try {
			
		} catch (Exception e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
			System.exit(0);
		}
	}

}
