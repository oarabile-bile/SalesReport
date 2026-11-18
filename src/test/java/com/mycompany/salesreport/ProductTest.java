/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.salesreport;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */


public class ProductTest {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product();
        int total = product.GetTotalProductSold();
        
        // Verifies that total product sales returns a valid correct value (> 0)[cite: 39]
        assertTrue(total > 0, "The GetTotalProductsSold method did not return the expected total.");
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product();
        double average = product.GetAverageProductSold();
        
        // Verifies that average product sales returns a valid correct value (> 0.0)[cite: 39]
        assertTrue(average > 0.0, "The GetAverageProductSold method did not return the expected average.");
    }
}