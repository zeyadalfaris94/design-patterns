package Adapter;

public class ProductView {
    private ProductFetcher fetcher;

    public void setFetcher(ProductFetcher fetcher) {
        this.fetcher = fetcher;
    }

    public void display() {
        String data = this.fetcher.fetch();
        System.out.println("Data Fetched, " + data);
    }
}
