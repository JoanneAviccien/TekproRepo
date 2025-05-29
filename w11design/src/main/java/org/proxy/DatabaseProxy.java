package org.proxy;

import java.util.logging.Logger;

public class DatabaseProxy implements Database {
    private Database realDatabase;
    private DatabaseRole userRole;
    private boolean isConnected;
    private static final Logger logger = LoggerConfig.getLogger(DatabaseProxy.class.getName());

    public DatabaseProxy(Database realDatabase, DatabaseRole userRole) {
        this.realDatabase = realDatabase;
        this.userRole = userRole;
        this.isConnected = false;
    }

    @Override
    public String query(String sql) {
        if (!isConnected) {
            logger.warning("Database belum terkoneksi. Mencoba koneksi otomatis...");
            connect();
        }
        
        if (userRole == DatabaseRole.ADMIN || userRole == DatabaseRole.DEVELOPER || userRole == DatabaseRole.READER) {
            logger.info("Akses diizinkan untuk query");
            return realDatabase.query(sql);
        } else {
            logger.warning("Akses ditolak untuk query");
            return null;
        }
    }

    @Override
    public void execute(String sql) {
        if (!isConnected) {
            logger.warning("Database belum terkoneksi. Mencoba koneksi otomatis...");
            connect();
        }

        if (userRole == DatabaseRole.ADMIN || userRole == DatabaseRole.DEVELOPER) {
            logger.info("Akses diizinkan untuk execute");
            realDatabase.execute(sql);
        } else {
            logger.warning("Akses ditolak untuk execute");
        }
    }

    @Override
    public void connect() {
        if (userRole == DatabaseRole.ADMIN) {
            logger.info("Akses diizinkan untuk koneksi database");
            realDatabase.connect();
            isConnected = true;
        } else {
            logger.warning("Akses ditolak untuk koneksi database manual");
            if (userRole == DatabaseRole.DEVELOPER || userRole == DatabaseRole.READER) {
                logger.info("Melakukan koneksi otomatis untuk " + userRole);
                realDatabase.connect();
                isConnected = true;
            }
        }
    }

    @Override
    public void disconnect() {
        if (userRole == DatabaseRole.ADMIN) {
            logger.info("Akses diizinkan untuk disconnect database");
            realDatabase.disconnect();
            isConnected = false;
        } else {
            logger.warning("Akses ditolak untuk disconnect database manual");
            if (userRole == DatabaseRole.DEVELOPER || userRole == DatabaseRole.READER) {
                logger.info("Melakukan disconnect otomatis untuk " + userRole);
                realDatabase.disconnect();
                isConnected = false;
            }
        }
    }
} 