/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class PrintProduct {
    private Product product = new Product();

    public void PrintTotalSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductSold());
    }

    public void PrintAverageSales() {
        System.out.println("AVERAGE PRODUCT SALES: " + (int) Math.round(product.GetAverageProductSold()));
    }

    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
    
}
