package com.ait.otm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.ait.otm.dao.CategoryDAO;
import com.ait.otm.dao.impl.CategoryDAOImpl;
import com.ait.otm.entities.CategoryEntity;
import com.ait.otm.entities.ProductEntity;

public class Test {

    public static void main(String[] args) throws IOException {

//        // Create category object
//        CategoryEntity category = new CategoryEntity();
        CategoryDAO dao = new CategoryDAOImpl();
//
//        category.setCategoryId(101); 
//        category.setCategoryName("Electronics");
//
//        //=============== Adding product 1 ============= 
//        ProductEntity product1 = new ProductEntity(); 
//        product1.setProductId(1);  // Ensure this is unique
//        product1.setProductName("Mobile");
//        
//        // Set image for product 1
//        File file1 = new File("D:\\images\\mob1.jpeg");
//        byte[] imageBytes1 = new byte[(int) file1.length()];
//        try (FileInputStream stream1 = new FileInputStream(file1)) {
//            stream1.read(imageBytes1);
//        }
//        product1.setProductImage(imageBytes1);
//
//        //=============== Adding product 2 ============= 
//        ProductEntity product2 = new ProductEntity(); 
//        product2.setProductId(2);  // Ensure this is unique
//        product2.setProductName("TV");
//        
//        // Set image for product 2
//        File file2 = new File("D:\\images\\tv1.jpeg");
//        byte[] imageBytes2 = new byte[(int) file2.length()];
//        try (FileInputStream stream2 = new FileInputStream(file2)) {
//            stream2.read(imageBytes2);
//        }
//        product2.setProductImage(imageBytes2);
//
//        //=============== Adding product 3 ============= 
//        ProductEntity product3 = new ProductEntity(); 
//        product3.setProductId(3);  // Ensure this is unique
//        product3.setProductName("Earphone");
//        
//        // Set image for product 3
//        File file3 = new File("D:\\images\\earphone1.jpeg");
//        byte[] imageBytes3 = new byte[(int) file3.length()];
//        try (FileInputStream stream3 = new FileInputStream(file3)) {
//            stream3.read(imageBytes3);
//        }
//        product3.setProductImage(imageBytes3);
//        
//        System.out.println("Image size for product1: " + imageBytes1.length + " bytes");
//        System.out.println("Image size for product2: " + imageBytes2.length + " bytes");
//        System.out.println("Image size for product3: " + imageBytes3.length + " bytes");
//
//
//        //================== Saving Category ======== 
//
//        List<ProductEntity> lstOfProducts = Arrays.asList(product1, product2, product3);
//        category.setLstOfProducts(lstOfProducts);
//
//        // Save the category along with products
//        dao.saveCategory(category);
    	
    	//{ ============== Fetching Category From  Db ====================    }
    	/*
    	CategoryEntity entity1 = dao.fetchCategory(101);
    	System.out.println("Category Name : "+entity1.getCategoryName());
    	System.out.println("Category ID :"+entity1.getCategoryId());
    	
    	List<ProductEntity> lsofPrd = entity1.getLstOfProducts(); 
    	
    	ProductEntity product1 = lsofPrd.get(0); 
    	System.out.println("Product Name: "+product1.getProductName());
    	System.out.println("Product Id: "+product1.getProductId());
    	
    	//============ Fetching Image from databse =====
    	File file = new File("D:\\images\\imagesDB\\mob1.jpeg");
    	byte[] img1 = product1.getProductImage();
    	FileOutputStream fso = new FileOutputStream(file); 
    	fso.write(img1);
    	System.out.println("images Saved at "+file.getAbsolutePath());
    	*/
        
        dao.removeCategory(101);
    }  	
}
