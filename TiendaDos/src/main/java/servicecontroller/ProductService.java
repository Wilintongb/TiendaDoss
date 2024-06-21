package servicecontroller;

import daocontroller.EmployeeDao;
import daocontroller.ProductDao;
import model.Employee;
import model.Product;

import java.util.Scanner;

public class ProductService {
    Scanner sc = new Scanner(System.in);
    public void createProduct(Product product){


        System.out.println("Ingrese el id del producto");
        int id_product = sc.nextInt();
        product.setIdProduct(id_product);
        sc.nextLine();

        System.out.println("Ingrese el nombre del producto");
        String product_name = sc.nextLine();
        product.setProductName(product_name);

        System.out.println("Ingrese el numero de la categoria a la que pertenece el producto");
        int category = sc.nextInt();
        product.setCategory(category);
        sc.nextLine();

        System.out.println("Ingrese el precio del producto: $");
        float price = sc.nextFloat();
        product.setPrice(price);

        System.out.println("Ingrese el la cantidad");
        int quantity = sc.nextInt();
        product.setQuantity(quantity);



        ProductDao.createProductDAO(product);

    }

    public void selectProduct(){
        ProductDao.selectProductDao();

    }
    public void deleteProduct(int idProducto){

        System.out.println("Indique el id del empleado a eliminar");
        int idProduct = sc.nextInt();

        ProductDao.deleteProductoDao(idProduct);

    }
}
