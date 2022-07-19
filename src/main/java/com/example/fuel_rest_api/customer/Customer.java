package com.example.fuel_rest_api.customer;
import com.example.fuel_rest_api.fuel_buy_details.FuelBuyDetails;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String district;
    private int age;

    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    private List<FuelBuyDetails> fuelBuyDetailsList;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, String district, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.district = district;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
