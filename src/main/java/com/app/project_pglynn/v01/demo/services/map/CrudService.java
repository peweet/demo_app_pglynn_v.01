package guru.springframework.demo.services;


import com.app.project_pglynn.v01.demo.models.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.prefs.BackingStoreException;
@Service
public interface CrudService <T extends BaseEntity> {
    Set<T> findAll();
    T findById(Long id);
    T save(T object);
    void delete(T object);
    // void deleteById(ID id);
}
