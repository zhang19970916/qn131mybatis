package service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.StuDao;
import entity.Student;
import mybatis.SqlFactory;

public class StudentService {
	/*
	 * 添加一条学生记录
	 */
	public static int addStu(Student stu) {
		SqlSession session = SqlFactory.getSession();
		StuDao dao = session.getMapper(StuDao.class);
		int i = dao.addStu(stu);
		session.commit();
		return i;
	}

	/*
	 * 添加多条条学生记录
	 */
	public static int addStus(List<Student> stu) {
		SqlSession session = SqlFactory.getSession();
		StuDao dao = session.getMapper(StuDao.class);
		int i = dao.addStus(stu);
		session.commit();
		return i;
	}

	public static List<Student> getList() {
		Student stu = new Student();
		stu.setName("熊三");
		stu.setAge(18);
		stu.setGender("男");
		stu.setTelephone("10086113");
		Student stu1 = new Student();
		stu1.setName("熊四");
		stu1.setAge(19);
		stu1.setGender("男");
		stu1.setTelephone("10086112");
		Student stu2 = new Student();
		stu2.setName("熊五");
		stu2.setAge(20);
		stu2.setGender("男");
		stu2.setTelephone("10086111");
		List<Student> li = new ArrayList<Student>();
		li.add(stu);
		li.add(stu1);
		li.add(stu2);
		return li;
	}

	public static void main(String[] args) {
		List<Student> stu = StudentService.getList();
		int i = StudentService.addStus(stu);
		System.out.println("操作成功记录数" + i);
	}

}
