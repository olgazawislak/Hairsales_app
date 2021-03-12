package com.hairsales;

import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Website {

    @Column(nullable = false)
    private String address;

    @Column
    private float price;


}
