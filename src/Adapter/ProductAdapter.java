package Adapter;

public class ProductAdapter extends ProductFetcher {
    private final OldProductFetcher oldProductFetcher;

    ProductAdapter() {
        super();
        this.oldProductFetcher = new OldProductFetcher();
    }

    @Override
    public String fetch() {
        return this.oldProductFetcher.getData() + " has been converted";
    }
}
