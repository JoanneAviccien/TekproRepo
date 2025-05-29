package org.proxy;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = LoggerConfig.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Database database = new ConcreteDatabase("jdbc:mysql://localhost:3306/mydb");
        
        logger.info("\n=== Mengakses sebagai Admin ===");
        Database adminProxy = new DatabaseProxy(database, DatabaseRole.ADMIN);
        adminProxy.connect();
        String adminResult = adminProxy.query("SELECT * FROM users");
        logger.info("Hasil query admin: " + adminResult);
        adminProxy.execute("INSERT INTO users VALUES (1, 'admin')");
        adminProxy.disconnect();
        
        logger.info("\n=== Mengakses sebagai Developer ===");
        Database developerProxy = new DatabaseProxy(database, DatabaseRole.DEVELOPER);
        String devResult = developerProxy.query("SELECT * FROM products");
        logger.info("Hasil query developer: " + devResult);
        developerProxy.execute("UPDATE products SET price = 100");
        
        logger.info("\n=== Mengakses sebagai Reader ===");
        Database readerProxy = new DatabaseProxy(database, DatabaseRole.READER);
        String readerResult = readerProxy.query("SELECT * FROM orders");
        logger.info("Hasil query reader: " + readerResult);
        readerProxy.execute("DELETE FROM orders");
    }
}