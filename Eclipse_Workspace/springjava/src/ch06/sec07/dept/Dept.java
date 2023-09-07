package ch06.sec07.dept;

public class Dept {

	// 필드 선언
	int deptno;
	String dname;
	String loc;
	
	Dept(){}
	
	Dept(int deptno){
		this.deptno = deptno;
	}
	
	Dept(int deptno, String dname){
		this.deptno = deptno;
		this.dname = dname;
	}
	
	Dept(int deptno, String dname, String loc){
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	
}
