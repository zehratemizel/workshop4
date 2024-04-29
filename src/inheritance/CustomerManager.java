package inheritance;
import java.util.Iterator;
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CustomerManager {

    private List<Customer> customers;

    public List<Customer> getAll() {
        return customers;
    }


    public CustomerManager() {
        customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Zehra");
        customer.setLastName("Temizel");
        customer.setEmail("zehra@hotmail.com");
        customer.setPhoneNumber(533567888);
        customer.setAddress("Bağlarbaşı mah. salkım sok.");
        customer.setCreatedDate(LocalDateTime.now());

        customers.add(customer);
    }

    public void add(Customer customer) {
        customer.setCreatedDate(LocalDateTime.now());
        customers.add(customer);
    }

    public void update(Customer customer) {
        for (Customer updatecustomer : customers) {
            if (updatecustomer.getId() == customer.getId()) {
                updatecustomer.setFirstName(customer.getFirstName());
                updatecustomer.setLastName(customer.getLastName());
                updatecustomer.setUpdatedDate(customer.getUpdatedDate());
            }
        }
    }

    public void delete(int id) {

        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customer.getId() == id) {
                iterator.remove();
            }
        }

    }
}