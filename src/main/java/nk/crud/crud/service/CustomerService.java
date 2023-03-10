package nk.crud.crud.service;

import nk.crud.crud.model.Customer;
import nk.crud.crud.repository.CustomerRepository;
import org.springframework.stereotype.Repository;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Repository

public class CustomerService implements CrudListener<Customer> {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Customer add(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        repository.delete(customer);
    }

}