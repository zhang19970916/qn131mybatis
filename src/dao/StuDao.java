package dao;

import java.util.List;

import entity.Student;

public interface StuDao {
	/*
	 * 增加一条学生记录
	 */
	public int addStu(Student stu);
	/*
	 * 增加多跳条学生记录
	 */
	public int addStus(List<Student> stu);
	/*
	 * 修改学生记录
	 */
	public int updateStu(int id);
	/*
	 * 批量删除学生记录
	 */
	public int delStu(int id);
	/*
	 * 查询学生记录
	 */
	public List<Student> selStu();
}
