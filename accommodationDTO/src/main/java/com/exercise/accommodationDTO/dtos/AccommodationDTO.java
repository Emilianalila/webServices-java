package com.exercise.accommodationDTO.dtos;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
@Setter @Getter
public class AccommodationDTO implements Serializable {
    //accommodation class
    private int id_house;
    private String houseType;
    private String address;
    private double rentPrice;
    //tenant class
    private String name;
    private String lastName;
    // constructors
    public AccommodationDTO() {
    }

    public AccommodationDTO(int id_house, String houseType, String address, double rentPrice, String name, String lastName) {
        this.id_house = id_house;
        this.houseType = houseType;
        this.address = address;
        this.rentPrice = rentPrice;
        this.name = name;
        this.lastName = lastName;
    }
}




/*When a class implements the Serializable interface, you are indicating that objects
of that class can be serialized, that is, they can be "converted" into a sequence of bytes.
This allows you to save the state of objects and then recover it to the same state
or even to another system. In the case of your AccommodationDTO class,
by implementing Serializable, you are allowing objects of that class to be serialized
and deserialized in different application contexts, such as disk storage or transmission over the network.*/


/*Records are a useful tool in the Java, especially for simple data classes without additional behavior
(Classes provide more flexibility in terms of inheritance and encapsulation. You can define additional behaviors and methods in a class that are not possible in a registry.).
However, they are not a complete replacement for classes and it is important to evaluate each situation
to determine which approach is most appropriate.*/
//example:
/*public record accommodationDTO(int id_house, String houseType, String address, double rentPrice, String name, String lastName) {}
The fields are final and cannot be modified after the object is created.*/

/*Records are a simpler and more concise option for representing DTOs and other immutable data types in Java,
especially when they are simple classes that only store data without additional behavior.*/