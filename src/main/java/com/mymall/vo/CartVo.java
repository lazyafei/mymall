package com.mymall.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by bestone on 4/26/2018.
 */
public class CartVo {

    private List<CartProductVo> CartProductVoList;
    private BigDecimal cartTotalPrice;

    public List<CartProductVo> getCartProductVoList() {
        return CartProductVoList;
    }

    public void setCartProductVoList(List<CartProductVo> cartProductVoList) {
        CartProductVoList = cartProductVoList;
    }

    public BigDecimal getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(BigDecimal cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public Boolean getAllChecked() {
        return allChecked;
    }

    public void setAllChecked(Boolean allChecked) {
        this.allChecked = allChecked;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

    private Boolean allChecked;     // 是否已经都勾选
    private String imageHost;

}
