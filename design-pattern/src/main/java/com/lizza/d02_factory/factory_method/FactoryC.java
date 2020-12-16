package com.lizza.d02_factory.factory_method;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-08-05
 */
public class FactoryC implements Factory {

    @Override
    public Product create() {
        Product product = new ProductC();
        product.setName();
        return product;
    }
}
