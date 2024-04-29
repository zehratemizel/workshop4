package inheritance;
import java.time.LocalDateTime;
import java.util.List;

public class CustomerMain {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        List<Customer> responses = customerManager.getAll();

        User user = new Customer();


        Customer customer1 = new Customer();
        customer1.setId(2);
        customer1.setFirstName("Ahmet");
        customer1.setLastName("Yılmaz");
        customer1.setEmail("Ahmet@hotmail.com");
        customer1.setPhoneNumber(533456788);
        customer1.setAddress("abc mah. cde sok.");


        for (Customer customer: responses) {
            System.out.println("Kayıt olan Müşterinin Adı ve Soyadı : " +
                    customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Email bilgisi : " + customer.getEmail());
            System.out.println("Telefon numarası : " + customer.getPhoneNumber());
            System.out.println("Adresi : " + customer.getAddress());
            System.out.println("Sisteme kayıt tarihi : " + customer.getCreatedDate());
        }

        customerManager.add(customer1);
        System.out.println("-----Create-------");


        for(Customer customer2: responses){
            System.out.println("Kayit olan Müşterinin Adi ve Soyadi: " +  customer2.getFirstName() + " " + customer2.getLastName());
            System.out.println("Email bilgisi: " + customer2.getEmail());
            System.out.println("Bölüm: " + customer2.getPhoneNumber());
            System.out.println("Adres: " + customer2.getAddress());
            System.out.println("Sisteme kayit tarihi: " + customer2.getCreatedDate());
        }


        System.out.println("-----Update-------");

        Customer updatedCustomer = new Customer();
        updatedCustomer.setId(2);
        updatedCustomer.setFirstName("Açelya");
        updatedCustomer.setLastName("Oğuz");
        updatedCustomer.setUpdatedDate(LocalDateTime.now());

        customerManager.update(updatedCustomer);

        for (Customer customer4:responses){
            System.out.println(customer4.getFirstName() + " " + customer4.getLastName() + " " + customer4.getCreatedDate());
        }

        System.out.println("-------Delete-------------");

        customerManager.delete(1);
        for(Customer customer3:responses){
            System.out.println(customer3.getFirstName() + " "+ customer3.getLastName());
        }


    }
}
