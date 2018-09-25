package Repository;

import com.greenfox.demo.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryInterface extends CrudRepository<Todo,Long> {
List<Todo> findAll();
}
