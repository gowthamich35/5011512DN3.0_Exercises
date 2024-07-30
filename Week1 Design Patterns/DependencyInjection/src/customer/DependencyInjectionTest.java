package customer;

public class DependencyInjectionTest {
public static void main(String[] args) {
     CustomerRepository customerRepository = new CustomerRepositoryImplementation();

     CustomerService customerService = new CustomerService(customerRepository);

     String customer = customerService.getCustomer(1);
     System.out.println("Customer found: " + customer);
 }
}

