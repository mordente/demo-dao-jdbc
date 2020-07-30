package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


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
		
		//System.out.println("\n=== TEST 4: insert ===");
		//Department dep2 = new Department(2, null);
		//Seller newSel = new Seller(null, "Fred", "fred@hotmail.com", sdf.parse("11/11/1991"), 2800.0, dep2);
		//sellerDao.insert(newSel);
		//System.out.println("Done! New seller id: " + newSel.getId());
		
		System.out.println("\n=== TEST 5: update ===");
		seller = sellerDao.findById(1);
		seller.setName("Bob Lucas");
		sellerDao.update(seller);
		System.out.println("Updated!");
		
		System.out.println("\n=== TEST 6: deleteById ===");
		sellerDao.deleteById(29);
		System.out.println("Deleted.");
	}

}
