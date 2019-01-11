package com.zork.metaData.dataSource;

import org.apache.ibatis.session.SqlSession;

import java.sql.Connection;

public class DbConnection {
    private static Connection connection = null;

    /**
     * 获取sqlSession.
     *
     * @return
     */
    public static Connection getConnection() {
        return connection;
    }

    /**
     * 设置sqlSession.
     *
     * @return
     */
    public static Connection setConnection(SqlSession sqlSession) {
        if (sqlSession != null) {
            connection = sqlSession.getConnection();
        }
        return connection;
    }
}
