package Ej1Sesion3;

import java.sql.*;

public class Empleado {
private int EMPNO;
private String ENAME;
private String JOB;
private int MGR;
private Date Hiredate;
private Double SAL=0.00;
private Double COMM=0.00;
private int DEPTNO;
public Empleado() {
	super();
}
public Empleado(int eMPNO, String eNAME, String jOB, int mGR, Date hiredate, Double sAL, Double cOMM, int dEPTNO) {
	super();
	EMPNO = eMPNO;
	ENAME = eNAME;
	JOB = jOB;
	MGR = mGR;
	Hiredate = hiredate;
	SAL = sAL;
	COMM = cOMM;
	DEPTNO = dEPTNO;
}
public int getEMPNO() {
	return EMPNO;
}
public void setEMPNO(int eMPNO) {
	EMPNO = eMPNO;
}
public String getENAME() {
	return ENAME;
}
public void setENAME(String eNAME) {
	ENAME = eNAME;
}
public String getJOB() {
	return JOB;
}
public void setJOB(String jOB) {
	JOB = jOB;
}
public int getMGR() {
	return MGR;
}
public void setMGR(int mGR) {
	MGR = mGR;
}
public Date getHiredate() {
	return Hiredate;
}
public void setHiredate(Date hiredate) {
	Hiredate = hiredate;
}
public Double getSAL() {
	return SAL;
}
public void setSAL(Double sAL) {
	SAL = sAL;
}
public Double getCOMM() {
	return COMM;
}
public void setCOMM(Double cOMM) {
	COMM = cOMM;
}
public int getDEPTNO() {
	return DEPTNO;
}
public void setDEPTNO(int dEPTNO) {
	DEPTNO = dEPTNO;
}
@Override
public String toString() {
	return "Empleado [EMPNO=" + EMPNO + ", ENAME=" + ENAME + ", JOB=" + JOB + ", MGR=" + MGR + ", Hiredate=" + Hiredate
			+ ", SAL=" + SAL + ", COMM=" + COMM + ", DEPTNO=" + DEPTNO + "]";
}

}