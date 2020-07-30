package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		//System.out.println("=== TEST 1 - INSERT ===");
		Department dep = new Department(null, "RH");
		//departmentDao.insert(dep);
		//System.out.println("Inserted. New department id: " + dep.getId());
		
		//System.out.println("=== TEST 2 - FINDBYID ===");
		//Department dep2 = departmentDao.findById(3);
		//System.out.println(dep2);
		
		//System.out.println("=== TEST 3 - UPDATE ===");
		//Department dep2 = departmentDao.findById(3);
		//dep2.setName("Moda");
		//departmentDao.update(dep2);
		//System.out.println("Updated.");
		
		//System.out.println("=== TEST 4 - deleteById ===");
		//Department dep3 = departmentDao.findById(9);
		//System.out.println(dep3);
		//departmentDao.deleteById(9);
		//System.out.println("Deleted. Id deleted: " + dep3.getId());
		
		System.out.println("=== TEST 5 - FINDALL ===");
		List<Department> list = departmentDao.findAll();
		for(Department depa : list) {
			System.out.println(depa);
		}

	}

}
