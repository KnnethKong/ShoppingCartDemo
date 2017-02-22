package com.cdy.shoppingcart.shoppingcartdemo.assistant;


import com.cdy.shoppingcart.shoppingcartdemo.mode.ShopProduct;

/**
 * 购物车添加接口回调
 */
public interface onCallBackListener {
    /**
     * Type表示添加或减少
     * @param product
     * @param type
     */
    void updateProduct(ShopProduct product, String type);
}
