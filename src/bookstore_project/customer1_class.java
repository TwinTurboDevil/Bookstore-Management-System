/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore_project;

/**
 *
 * @author SARK
 */
public class customer1_class extends person_class {
    private String account_no;

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAccount_no() {
        return account_no;
    }

    public String getName() {
        return name;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getPass() {
        return pass;
    }

    public customer1_class(String account_no, String name, String user_name, String age, String address, String phone, String pass) {
        super(name, user_name, age, address, phone, pass);
        this.account_no = account_no;
    }

    
}
