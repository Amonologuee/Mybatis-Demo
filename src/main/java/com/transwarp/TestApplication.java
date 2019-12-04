package com.transwarp;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.transwarp.dataobject.UserDO;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestApplication {
    public static void main(String[] args) throws IOException {

        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<UserDO> UserDo = sqlSession.selectList("com.transwarp.dao.UserDOMapper.findAll");
        sqlSession.close();
        for (UserDO usr: UserDo){
            System.out.println(usr.toString());
        }
    }
}
