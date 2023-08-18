package edu.icet.dto.custom;

import edu.icet.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer implements SuperDTO {
    private String id;
    private String name;
    private String address;
    private Double salary;
}
