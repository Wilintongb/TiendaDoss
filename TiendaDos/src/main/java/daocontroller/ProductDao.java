package daocontroller;

import conexion.Conexion;
import model.Employee;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao {


    public static void createProductDAO(Product product) {

        Conexion conexion = new Conexion();

        try (Connection connect = conexion.getConnectDB()) {
            PreparedStatement ps = null;

            try {


                String query = "INSERT INTO product(id_product, product_name, category, price, quantity)VALUES(?, ?, ?, ?, ?)";
                ps = connect.prepareStatement(query);


                ps.setInt(1, product.getIdProduct());

                ps.setString(2, product.getProductName());


                ps.setInt(3, product.getCategory());


                ps.setFloat(4, product.getPrice());


                ps.setInt(5, product.getQuantity());



                ps.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }


    } public static void selectProductDao(){

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs =   null;

        try(Connection connect = conexion.getConnectDB()){

            String query = "SELECT * FROM product";

            ps = connect.prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("ID" + rs.getInt("id_product"));
                System.out.println("Producto" + rs.getString("product_name"));
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void deleteProductoDao(int id_product) {
        Conexion conexion = new Conexion();

        try (Connection connect = conexion.getConnectDB()) {

            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM product WHERE product.id_product = ?";

                ps = connect.prepareStatement(query);

                ps.setInt(1, id_product);

                ps.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
