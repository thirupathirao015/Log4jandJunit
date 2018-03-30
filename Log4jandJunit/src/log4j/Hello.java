package log4j;

import org.apache.log4j.Logger;

public class Hello {

	private static final Logger logger = Logger.getLogger(Hello.class);
    private String message;

    public void setMessage(String message) {
            this.message = message;
    }

    public String getMessage() {
            return message;
    }
  
    public void sayHello(){
            logger.info("Hello :"+message);
            
       }

}