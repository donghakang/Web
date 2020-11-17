package com.ezen.biz;

import java.util.List;
import com.ezen.dao.EmpDao;
import com.ezen.entity.EmpEntity;

public class EmpBiz {

	public int insertEmp(EmpEntity emp) {
		EmpDao dao=new EmpDao();
		int n=dao.insertEmp(emp);
		return n;
	}

	public List<EmpEntity> listEmp() {
		EmpDao dao=new EmpDao();
		List<EmpEntity> list=dao.listEmp();
		return list;
	}
	
	public int updateEmp(EmpEntity entity) {
		EmpDao dao=new EmpDao();
		int n=dao.updateEmp(entity);
		return n;
	}
	
	public int deleteEmp(EmpEntity entity) {
		EmpDao dao=new EmpDao();
		int n=dao.deleteEmp(entity);
		return n;
	}
}











