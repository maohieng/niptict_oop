package crud;

public class ProductCrud extends BaseCrudOpts<Product> {

    public ProductCrud(Repository repository) {
        super(repository);
    }

    @Override
    public long create(Product data) {
        return 0;
    }

    @Override
    public int update(Product data) {
        return 0;
    }

    @Override
    public void delete() {

    }

    @Override
    public Product getById(long id) {
        return null;
    }
}
