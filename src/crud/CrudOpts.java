package crud;

public interface CrudOpts<T> {

    public long create(T data);

    public int update(T data);

    public void delete();

    public T getById(long id);

}
