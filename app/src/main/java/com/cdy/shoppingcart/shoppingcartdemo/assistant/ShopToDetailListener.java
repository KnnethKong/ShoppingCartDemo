package com.cdy.shoppingcart.shoppingcartdemo.assistant;


import com.cdy.shoppingcart.shoppingcartdemo.mode.ShopProduct;

/**
 * 购物车添加接口回调
 */
public interface ShopToDetailListener {
    /**
     * Type表示添加或减少
     * @param product
     * @param type
     */
    void onUpdateDetailList(ShopProduct product, String type);

    void onRemovePriduct(ShopProduct product);
}
