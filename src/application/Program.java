package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Departament obj = new Departament(1, "Books");
		
		System.out.println(obj);
		
		Seller sellerObj = new Seller(21, "Douglas", "d.oublas@email.com", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = new DaoFactory.createSellerDao();
		
		System.out.println(sellerObj);

	}

}
