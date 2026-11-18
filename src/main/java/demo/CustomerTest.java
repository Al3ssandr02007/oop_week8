package demo;

public class CustomerTest {
    public static void main(String[] args) {
        CustomerTest customerTest = new CustomerTest();

    Customer first = new Customer ("Paul", "Gort", "23232323",123,true);
    System.out.println(first);

    Customer second = new Customer();
    second.setName("Pat");
    second.setAddress("Marvue");
    second.setPhoneNumber("23232323");
    second.setCustomerNumber(23);
    second.setMailingList(false);
    System.out.println(second);
}

}
