/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class Main {
    public static void main(String[] args) {
        Product productReport = new Product();
        
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("**************************************************");
        System.out.println("TOTAL PRODUCT SALES: " + productReport.GetTotalProductSold());
        System.out.println("AVERAGE PRODUCT SALES: " + (int) Math.round(productReport.GetAverageProductSold()));
        System.out.println("MOST POPULAR PRODUCT: " + productReport.GetMostPopularProduct());
    }
}
