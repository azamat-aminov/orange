package com.tr.orange.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultLogger {

  private static final Logger logger = LoggerFactory.getLogger(DefaultLogger.class);

  public static void writeLogs() throws InterruptedException {
    while (true) {
      Thread.sleep(3000);
      logger.info("INFO - log from Orange application");
      logger.trace("TRACE - log from Orange application");
    }
  }

}
