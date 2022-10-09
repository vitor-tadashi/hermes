package br.com.tadashera.roadrunner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {

    private static final Logger LOGGER = LogManager.getLogger(Application.class);

    public static final String STARTING_LOG = "Starting Roadrunner - Lightweight FIX Protocol Gateway";
    public static final String STARTED_LOG = "Roadrunner started - Lightweight FIX Protocol Gateway";

    public static void main(String[] args) {
        LOGGER.info(STARTING_LOG);
        LOGGER.info(STARTED_LOG);
    }
}
