package com.ezen.biz;

import java.util.List;

import com.ezen.dao.EmpDao;
import com.ezen.entity.EmpEntity;

public class EmpBiz {

	public int insertEmp(EmpEntity emp) {
		EmpDao dao = new EmpDao();
		int n = dao.insertEmp(emp);
		return n;
	}

	public List<EmpEntity> listEmp() {
		EmpDao dao = new EmpDao();
		List<EmpEntity> list = dao.listEmp();
		return list;
	}

	public int deleteEmp(int empNo) {
		EmpDao dao = new EmpDao();
		int n = dao.deleteEmp(empNo);
		return n;
	}

	public int updateEmp(EmpEntity emp) {
		EmpDao dao = new EmpDao();
		int n = dao.updateEmp(emp);

		return n;
	}

}