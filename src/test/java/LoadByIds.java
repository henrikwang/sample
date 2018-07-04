import java.util.List;


@FunctionalInterface
public interface LoadByIds<T> {
    List<T> apply(List<String> ids);


}
