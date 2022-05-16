package org.tms.model;

import lombok.*;
import lombok.extern.log4j.Log4j;

@Log4j
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {

    private String brand;
    private String model;


}
