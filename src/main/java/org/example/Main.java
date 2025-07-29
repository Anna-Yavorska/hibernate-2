package org.example;

import org.example.domain.Customer;
import org.example.service.MovieService;
import org.example.util.HibernateUtil;

public class Main {

    public static void main(String[] args) {
        MovieService service = new MovieService(HibernateUtil.getSessionFactory());

        Customer customer = service.createCustomer();

        service.customerReturnInventoryToStore();
        service.customerRentInventory(customer);
        service.newFilmWasMade();
    }
}
