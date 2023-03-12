public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager (ICustomerDal database) {
        this.customerDal = database;
    }
    public void add() {
        customerDal.add();
    }
}
