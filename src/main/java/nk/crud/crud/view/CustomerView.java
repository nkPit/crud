package nk.crud.crud.view;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import nk.crud.crud.model.Customer;
import nk.crud.crud.service.CustomerService;
import org.vaadin.crudui.crud.impl.GridCrud;

@Route("")
public class CustomerView extends VerticalLayout {

    public CustomerView(CustomerService service) {
        GridCrud<Customer> crud = new GridCrud<>(Customer.class, service);
        add(crud);
        setSizeFull();
    }

}