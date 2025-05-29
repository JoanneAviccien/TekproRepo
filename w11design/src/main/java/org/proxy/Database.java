package org.proxy;

public interface Database {
    String query(String sql);
    void execute(String sql);
    void connect();
    void disconnect();
} 