package spring.application.Trucks.AppModel;

import javax.persistence.*;

import com.sun.istack.NotNull;

//import lombok.Data;


@Entity

public class Trucks {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name="truckNumber")
    private Long truckNumber;


    @Column(name = "truckName")
    @NotNull
    private String truckName;


    @Column(name = "trucktype")
    @NotNull
    private String trucktype;

    public Trucks() {
    }

    public Trucks(Long truckNumber, String truckName, String trucktype) {
        this.truckNumber = truckNumber;
        this.truckName = truckName;
        this.trucktype = trucktype;
    }

    public Long getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(Long truckNumber) {
        this.truckNumber = truckNumber;
    }

    public String getTruckName() {
        return truckName;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    public String getTrucktype() {
        return trucktype;
    }

    public void setTrucktype(String trucktype) {
        this.trucktype = trucktype;
    }

    @Override
    public String toString() {
        return "DistributionCenter{" +
                "truckNumber=" + truckNumber +
                ", truckName='" + truckName + '\'' +
                ", trucktype='" + trucktype + '\'' +
                '}';
    }
}
