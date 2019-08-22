package com.company.LAMBDA.Test10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample11 {

    public static void main(String[] args) {
        List<Product>  list = new ArrayList<>();

        list.add(new Product(1,"r",2.4f));
        list.add(new Product(31,"rg",4.4f));
        list.add(new Product(13,"fr",24.4f));
        list.add(new Product(21,"rfgg",2.34f));
        list.add(new Product(15,"fr",2.24f));
        list.add(new Product(13,"rfgaag",222.4f));

        //filtreaza datele, stream intra in toate, si filter compara
        Stream<Product> filtered = list.stream().filter(p ->p.price >200);

        filtered.forEach(product -> System.out.println(product.name + " "+product.price));
    }
}
