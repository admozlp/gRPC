package com.ademozalp.grpc.model.enm;

public enum Message {
    PRODUCT_NOT_FOUND("Product not found"),
    CATEGORY_NOT_FOUND("Category not found"),
    PRODUCT_ALREADY_EXISTS("Product already exists"),
    CATEGORY_ALREADY_EXISTS("Category already exists"),
    PRODUCT_DELETED("Product deleted"),
    CATEGORY_DELETED("Category deleted"),
    PRODUCT_ADDED("Product added"),
    CATEGORY_ADDED("Category added"),
    PRODUCT_UPDATED("Product updated"),
    CATEGORY_UPDATED("Category updated"),
    LISTED("Listed");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
