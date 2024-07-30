package customer;

public class CustomerRepositoryImplementation implements CustomerRepository {

 @Override
 public String findCustomerById(int id) {
     return "Customer" + id;
 }
}
