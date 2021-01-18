package crud;

public abstract class BaseCrudOpts<T> implements CrudOpts<T> {

    private final Repository repository;

    public BaseCrudOpts(Repository repository) {
        this.repository = repository;
    }
}
