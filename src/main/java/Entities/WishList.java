package Entities;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class WishList {

    /*State variable need to monitoring stage of material delivery */

    @NotNull
    private int state;

    /*List of materials which we need deliver*/

    @NotNull
    @Size(min = 1, message = "You need add more materials in wishlist")
    private List<Material> materialList = new ArrayList<>();
}
