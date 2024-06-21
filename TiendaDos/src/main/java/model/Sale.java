package model;

import java.sql.Date;
import java.time.LocalDate;


public class Sale {

    private int id_sale;
    private int product;
    private int quantity;
    private int employee;
    private int costumer;
    private float total_sale;
    public LocalDate sale_date;


    public Sale() {

    }

    public Sale(int id_sale, int product, int quantity, int employee, int costumer, float total_sale, LocalDate sale_date) {
        this.id_sale = id_sale;
        this.product = product;
        this.quantity = quantity;
        this.employee = employee;
        this.costumer = costumer;
        this.total_sale = total_sale;
        this.sale_date = sale_date;
    }

    public int getId_sale() {
        return id_sale;
    }

    public void setId_sale(int id_sale) {
        this.id_sale = id_sale;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getEmployee() {
        return employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }

    public int getCostumer() {
        return costumer;
    }

    public void setCostumer(int costumer) {
        this.costumer = costumer;
    }

    public float getTotal_sale() {
        return total_sale;
    }

    public void setTotal_sale(float total_sale) {
        this.total_sale = total_sale;
    }

    public LocalDate getSale_date() {
        return sale_date;
    }

    public void setSale_date(LocalDate sale_date) {
        this.sale_date = sale_date;
    }
}