package edu.icet.dto.custom;

import edu.icet.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item implements SuperDTO {
    private String code;
    private String description;
    private int qty;
    private double unitPrice;
}
