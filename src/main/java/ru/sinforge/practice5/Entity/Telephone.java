package ru.sinforge.practice5.Entity;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Entity
public class Telephone extends Good {

    public String producer;
    public double batteryCapacity;

}
