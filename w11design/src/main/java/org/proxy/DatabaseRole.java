package org.proxy;

public enum DatabaseRole {
    ADMIN,      // Dapat melakukan semua operasi
    DEVELOPER,  // Dapat melakukan query dan execute
    READER      // Hanya dapat melakukan query
} 