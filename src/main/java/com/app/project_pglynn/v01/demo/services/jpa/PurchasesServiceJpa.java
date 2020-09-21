package com.app.project_pglynn.v01.demo.services.jpa;



import com.app.project_pglynn.v01.demo.models.Purchases;
import com.app.project_pglynn.v01.demo.repositories.PurchasesRepository;
import com.app.project_pglynn.v01.demo.services.PurchasesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class PurchasesServiceJpa extends
        AbstractJpaService<Purchases, PurchasesRepository> implements PurchasesService {

    public PurchasesServiceJpa(PurchasesRepository repository)
    {
        super(repository);
    }

    //  @Override
    //  public void deleteById(ID id) {

    //  }
}
