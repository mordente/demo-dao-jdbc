package application;

import java.util.Date;
import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {


		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: findById ===");
		Seller seller = sellerDao.findById(8);
		System.out.println(seller);
		
		
		System.out.println("\n=== TEST 2: findByDepartment ===");
		Department dep = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartmentId(dep);
		for(Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println("\n=== TEST 3: findAll ===");
		list = sellerDao.findAll();
		for(Seller sel : list) {
			System.out.println(sel);
		}
	

	}

}
