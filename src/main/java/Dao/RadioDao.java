package Dao;

import Bean.Question;
import DB.DBconnection;

import java.sql.*;
import java.util.*;

public class RadioDao {
    public static List<Question> DisplayQuestion(){
        Connection conn = DBconnection.CreatConnect();
        List<Question> list = new ArrayList<Question>();
        String sql = "SELECT* FROM Incompletesentence";

        try {
            PreparedStatement ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while(rs.next()){
                int number = rs.getInt("number");
                String question = rs.getString("question");
                String option1 = rs.getString("option1");
                String option2 = rs.getString("option2");
                String option3 = rs.getString("option3");
                String option4 = rs.getString("option4");
                String correctanswer = rs.getString("correctanswer");

                Question ques = new Question();
                ques.setNumber(number);
                ques.setQuestion(question);
                ques.setOption1(option1);
                ques.setOption2(option2);
                ques.setOption3(option3);
                ques.setOption4(option4);
                ques.setCorrectanswer(correctanswer);

                list.add(ques);
            }
            ptmt.close();
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }
}
