package casestudy.models.person;


import casestudy.models.service.Service;

public class Customer implements Comparable<Customer> {
    private String nameCustomer;
    private String birthDay;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String customerAddress;

    Service service;

    public Customer() {
    }

    public Customer(String nameCustomer, String birthDay, String gender, String idCard,
                    String phoneNumber, String email, String customerType, String customerAddress) {
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.customerAddress = customerAddress;


    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public Service getService() {
        return service;
    }

    public void setServices(Service service) {
        this.service = service;
    }



    public void setService(Service service) {
        this.service = service;
    }

    public int year(){
        return Integer.parseInt(birthDay.substring(6));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", service=" + service +
                '}';
    }

    public String showInfo(){
        return
                nameCustomer +','+
                        birthDay + ',' +
                        gender + ',' +
                        idCard + ',' +
                        phoneNumber + ',' +
                        email + ',' +
                        customerType + ',' +
                        customerAddress;


    }

    @Override
    public int compareTo(Customer o) {
        if (this.getNameCustomer().compareTo(o.getNameCustomer())==0){
            return this.year() -o.year();
        }else {
            return this.getNameCustomer().compareTo(o.getNameCustomer());
        }
    }
}
