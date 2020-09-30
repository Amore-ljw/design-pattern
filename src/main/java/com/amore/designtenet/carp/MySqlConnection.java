package com.amore.designtenet.carp;

public class MySqlConnection extends DBConnection {
    @Override
    String getConnection() {
        return "MySql Connection";
    }
}
