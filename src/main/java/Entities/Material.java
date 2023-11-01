package Entities;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class Material {
    @NotNull
    @Size(min = 3,message = "Material name must include minimum 3 symbols")
    private String materialName;

    /*GOST size can be different
    * So I take minimum size 6 only because I want =) */

    @NotNull
    @Size(min = 6, message = "Gost must include minimum 6 symbols ")
    private String gost;

    /*Reference to the material datasheet
    * At early step I use reference to store page, where we bought it*/

    @NotNull
    @Size(min = 8, message = "Reference must include minimum 8 symbols")
    private String reference;

}
