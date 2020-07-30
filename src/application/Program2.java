package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = new Department(null, "Lanches");
		departmentDao.insert(dep);
		System.out.println("Inserted. New department id: " + dep.getId());

	}

}