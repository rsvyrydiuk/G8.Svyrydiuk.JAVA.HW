package org.log;

import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainClassLog {
    //**(на самоопрацювання)**
            //regex (регулярні вирази)
            //collections stack, queue, deque, set
            //відображення TreeMap, LinkedHashMap
        //    ** Java 8 **
    //лямбда вирази
    //функціональні інтерфейси
    //stream API
    //default methods
    public static void main(String[] args) {
        System.out.println("Hello!");
        // 1. .jar archive
        // 2. .properties file
        // 3. [Class] - [Method] - [Line]

        Logger logger = Logger.getLogger("MainClassLog");
        logger.info("Info from class");
        logger.debug("Debug info");
        logger.error("Error info");


        Double var = 415.145000001; // 415.15
        logger.info(var);
        logger.info(String.format("%.2f", var));
        BigDecimal bigDecimal = BigDecimal.valueOf(var);
        logger.info(bigDecimal.setScale(2, RoundingMode.valueOf(4)));
        logger.info(bigDecimal.setScale(2, RoundingMode.valueOf(5)));
    }
}
