/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class Product implements IProduct {

    
    private int[][] salesData = {
        {25, 18, 20}, // Cozy Hights Monarch
        {15, 10, 12}, // Restonic Barbados
        {15, 15, 20}  // Sealy Phuket
    };
    
    private String[] productNames = {
        "Cozy Hights Monarch", 
        "Restonic Barbados", 
        "Sealy Phuket"
    };

    @Override
    public int GetTotalProductSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductSold();
        int count = 0;
        for (int i = 0; i < salesData.length; i++) {
            count += salesData[i].length;
        }
        return count == 0 ? 0.0 : (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        int topIndex = 0;
        
        for (int i = 0; i < salesData.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                topIndex = i;
            }
        }
        String[] productNames = {
            "Cozy Hights Monarch", 
            "Restonic Barbados", 
            "Sealy Phuket"
        };
        return productNames[topIndex] + " (" + maxSales + ")";
    }
}
