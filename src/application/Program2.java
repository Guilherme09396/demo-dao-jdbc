package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST1: department findById ===");
		Department dep = depDao.findById(1);
		System.out.println(dep);

		System.out.println("=== TEST2: department findAll ===");
		List<Department> list = depDao.findAll();
		list.forEach(System.out::println);
		
//		System.out.println("=== TEST3: seller insert ===");
//		dep = new Department();
//		dep.setName("D2");
//		depDao.insert(dep);
//		System.out.println("Inserted! New id: " + dep.getId());
		
		System.out.println("=== TEST4: department update ===");
		dep = depDao.findById(7);
		dep.setName("D3");
		depDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("=== TEST5: department delete ===");
		depDao.deleteById(1);
		System.out.println("Delete completed!");
	}

}
