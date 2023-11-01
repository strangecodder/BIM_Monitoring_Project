package Entities;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class WishListOrder {

    @NotNull
    @Size(min = 5, message = "Address length must include minimum 5 symbols")
    private String deliveryAddress;

    @NotNull
    @Size(min = 5, message = "Company name must include minimum 5 symbols")
    private String companyName;

}

// TODO: 01.11.2023 add regex to checking adress and company name (don`t include $%^ e.t.c)
