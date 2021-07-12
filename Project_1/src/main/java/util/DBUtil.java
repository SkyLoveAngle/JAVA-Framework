package util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 方便其他的代码随时能和数据库建立连接~
public class DBUtil {
    // DataSource 这个东西一般一个程序里有一个实例就够了~~
    // 单例模式
    private static final String URL = "jdbc:mysql://localhost:3306/online_oj?characterEncoding=utf8&zeroDateTimeBehavior=convertToNull";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1314520sky";

    private static DataSource dataSource = null;

    // 目的是只创建出一个 DataSource 实例
    private static DataSource getDataSource() {
        if (dataSource == null) {
            // 没有被实例化过, 就创建一个实例
            dataSource = new MysqlDataSource();
            ((MysqlDataSource)dataSource).setUrl(URL);
            ((MysqlDataSource)dataSource).setUser(USERNAME);
            ((MysqlDataSource)dataSource).setPassword(PASSWORD);
        }
        // 如果已经被实例化过了, 就直接返回现有的实例
        return dataSource;
    }

    public static Connection getConnection() {
        try {
            return getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // 回收资源,关闭顺序一定要注意要和打开顺序相反~~
    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
