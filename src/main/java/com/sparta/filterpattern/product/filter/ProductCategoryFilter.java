package com.sparta.filterpattern.product.filter;

import com.sparta.filterpattern.product.model.Category;
import com.sparta.filterpattern.product.model.Product;

public class ProductCategoryFilter extends ProductFilter {
    @Override
    public boolean check(Product product) {
        if (Category.ACCESSORY == product.getCategory()) {
            return false;
        }

        return checkNext(product);
    }
}
