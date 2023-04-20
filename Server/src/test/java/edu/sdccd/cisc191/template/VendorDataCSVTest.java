package edu.sdccd.cisc191.template;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VendorDataCSVTest {

    @Test
    public void vendorDataCSVTest() {
        VendorDataCSV vendorDataCSV = new VendorDataCSV();
        //List<CostcoCSV> list = new List<>(vendorDataCSV.importVendorIngredients());

        try {
            for(CostcoCSV index: vendorDataCSV.importCostcoVendor()) {
                System.out.println(index.getIngredientName());
                System.out.println(index.getUnit());
                System.out.println(index.getPrice());
            }
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}