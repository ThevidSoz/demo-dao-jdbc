package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("\n====== TEST 1: Department findAll =======\n");

		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}

		System.out.println("\n====== TEST 2: Department findById =======\n");

		Department dep = departmentDao.findById(7);

		System.out.println(dep);

		System.out.println("\n====== TEST 4: Department Insert =========\n");
		dep = new Department(7, "Lolo");
		departmentDao.insert(dep);

		System.out.println("Inserted! New id = " + dep.getId());

		System.out.println("\n====== TEST 3: Department delete =======\n");

		System.out.print("Enter id for delete(test): ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete complete!");

		System.out.println("\n====== TEST 5: Seller update =========\n");

		dep = departmentDao.findById(6);
		dep.setName("Xvideos");
		departmentDao.update(dep);
		System.out.println("Updated complete! ");

		sc.close();

	}

}
