package com.example.vakpatijewellers.Model;

public class AddCart {
    private int ProductImage;
    private  String ProductName,ProductPrice;

    public AddCart(int productImage, String productName, String productPrice) {
        ProductImage = productImage;
        ProductName = productName;
        ProductPrice = productPrice;
    }

    public int getProductImage() {
        return ProductImage;
    }

    public void setProductImage(int productImage) {
        ProductImage = productImage;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }


    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String productPrice) {
        ProductPrice = productPrice;
    }
}
