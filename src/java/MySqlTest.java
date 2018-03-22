import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xalan.internal.utils.FeatureManager;
import org.junit.Test;

import java.sql.*;

/**
 * Created by panyi on 2018/2/28.
 */
public class MySqlTest {
    public static Connection getConnection() throws Exception {


            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/ssmdemo";

            return DriverManager.getConnection(url,"root","199610");

    }
    public static void close(Connection connection,Statement statement,ResultSet resultSet) throws SQLException {
        resultSet.close();
        statement.close();
        connection.close();
    }
    @Test
    public void test1(){
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        try {
            connection=getConnection();
            String sql="select *from employee";
            statement=connection.createStatement();
            resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("empId="+resultSet.getString(1)+"empName="+resultSet.getString(2)+"gender="+resultSet.getInt(3)+"hireDate="+resultSet.getDate(4)+"salary="+resultSet.getInt(5)+"dept_id="+resultSet.getString(6));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                close(connection,statement,resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    }

