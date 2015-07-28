package singleton;

/**
 * Created by will on 7/28/15.
 */
public class ProductList {
    private static final ProductList productList = new ProductList();
    private ProductList(){

    }
    public ProductList getList(){
        return productList;
    }
}
