package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST1: seller findById ===");
		Department dep = depDao.findById(1);
		System.out.println(dep);

		

		System.out.println("=== TEST2: seller findByDepartment ===");

		System.out.println("=== TEST3: seller findAll ===");
		
//		System.out.println("=== TEST4: seller insert ===");
		
		System.out.println("=== TEST5: seller update ===");
		
		System.out.println("=== TEST6: seller delete ===");
	}

}
