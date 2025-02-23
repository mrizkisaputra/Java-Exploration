package com.mrizkisaputra;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.pool.HikariProxyDatabaseMetaData;

public class ConnectionUtil {

    public static HikariDataSource getDataSource() {
        HikariConfig config = new HikariConfig("./application.properties");
        config.setMaximumPoolSize(60);
        config.setMinimumIdle(30);
        return new HikariDataSource(config);
    }
}
