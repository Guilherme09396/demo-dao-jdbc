package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST1: seller findById ===");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
		
		Department dep = new Department(2, null);
		System.out.println("=== TEST2: seller findByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(dep);
		list.forEach(System.out::println);
		
		System.out.println("=== TEST3: seller findAll ===");
		list = sellerDao.findAll();
		list.forEach(System.out::println);
		
//		System.out.println("=== TEST4: seller insert ===");
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New Id: " + newSeller.getId());
		
		System.out.println("=== TEST5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
	}

}
