package associados.api.mapper;

public interface Mapper<T, U> {
    U map(T t);
}
