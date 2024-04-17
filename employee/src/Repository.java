public interface Repository<K, E> {
    void save(E entity);
    E findById(K id);
}
