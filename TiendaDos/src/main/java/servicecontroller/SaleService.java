package servicecontroller;

import daocontroller.CostumerDao;
import daocontroller.SaleDao;
import model.Costumer;
import model.Sale;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;


public class SaleService {

    Scanner sc = new Scanner(System.in);
    public void createSale(Sale sale){


        System.out.println("Ingrese el id de la venta ");
        int id_sale = sc.nextInt();
        sale.setId_sale(id_sale);
        sc.nextLine();

        System.out.println("Ingrese el numero del producto");
        int product = sc.nextInt();
        sale.setProduct(product);

        System.out.println("Ingrese la cantidad de productos a comprar");
        int quantity = sc.nextInt();
        sale.setQuantity(quantity);
        sc.nextLine();


        System.out.println("El total de la venta fue: ");
        float total_sale = sc.nextFloat();
        sale.setTotal_sale(total_sale);
        sc.nextLine();

        System.out.println("Ingrese el id del cliente: ");
        int costumer = sc.nextInt();
        sale.setCostumer (costumer);
        sc.nextLine();

        System.out.println("Ingrese el id del empleado: ");
        int employee = sc.nextInt();
        sale.setEmployee (employee);
        sc.nextLine();

        System.out.println("Fecha: " + LocalDate.now());
        sale.setSale_date(sale.sale_date);



        SaleDao.createSaleDAO(sale);

    }

    public void selectSale(){
        SaleDao.selectSaleDao();

    }
    public void deleteSale(int idSale){

        System.out.println("Indique el id de la venta a eliminar");
        int id_Sale = sc.nextInt();

        SaleDao.deleteSaleDao(idSale);

    }
}
