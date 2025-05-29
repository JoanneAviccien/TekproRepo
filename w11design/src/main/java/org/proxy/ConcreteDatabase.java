package org.proxy;

import java.util.logging.Logger;

public class ConcreteDatabase implements Database {
    private String connectionString;
    private boolean isConnected;
    private static final Logger logger = LoggerConfig.getLogger(ConcreteDatabase.class.getName());

    public ConcreteDatabase(String connectionString) {
        this.connectionString = connectionString;
        this.isConnected = false;
    }

    @Override
    public String query(String sql) {
        if (!isConnected) {
            logger.severe("Database belum terkoneksi!");
            throw new IllegalStateException("Database belum terkoneksi!");
        }
        logger.info("Menjalankan query: " + sql);
        return "Hasil dari query: " + sql;
    }

    @Override
    public void execute(String sql) {
        if (!isConnected) {
            logger.severe("Database belum terkoneksi!");
            throw new IllegalStateException("Database belum terkoneksi!");
        }
        logger.info("Menjalankan perintah: " + sql);
    }

    @Override
    public void connect() {
        logger.info("Menghubungkan ke database: " + connectionString);
        isConnected = true;
    }

    @Override
    public void disconnect() {
        logger.info("Memutuskan koneksi database");
        isConnected = false;
    }
} 