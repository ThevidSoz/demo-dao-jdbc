package model.dao;

import db.DB;
import model.dao.impl.SellerDaoImplJBDC;
import model.dao.impl.DepartmentDaoImplJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoImplJBDC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoImplJDBC(DB.getConnection());
	}

}
