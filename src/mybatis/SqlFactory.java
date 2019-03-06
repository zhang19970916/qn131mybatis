package mybatis;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlFactory {
	private static final SqlSessionFactory SESSIONFACTORY;
	static {
		String resource="mybatis/mybatis-config.xml";
		SqlSessionFactory temp=null;
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			 temp= new SqlSessionFactoryBuilder().build(is);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		SESSIONFACTORY=temp;
	}
	public static SqlSession getSession() {
		return SESSIONFACTORY.openSession();
	}
}
