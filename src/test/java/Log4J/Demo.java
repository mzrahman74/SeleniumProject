package Log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
    private static Logger log = LogManager.getLogger(Demo.class.getName());
  public static void main(String[] args) {
    log.debug("I'm debugging");

        log.info("Object is present.");
        log.fatal("this is fatal");
        log.error("error");

  }
}
