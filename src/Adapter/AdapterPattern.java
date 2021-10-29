package Adapter;

public class AdapterPattern {
    public static void main(String[] args) {
        ProductView productView = new ProductView();
        ProductAdapter productAdapter = new ProductAdapter();
        productView.setFetcher(productAdapter);
        productView.display();
    }
}