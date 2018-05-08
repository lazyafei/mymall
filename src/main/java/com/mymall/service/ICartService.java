package com.mymall.service;

import com.mymall.common.ServerResponse;
import com.mymall.vo.CartVo;

/**
 * Created by bestone on 4/26/2018.
 */
public interface ICartService {

    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);

    ServerResponse<CartVo> update(Integer userId,Integer productId,Integer count);

    ServerResponse<CartVo> deleteProduct(Integer userId,String productIds);

    ServerResponse<CartVo> list (Integer userId);

    ServerResponse<CartVo> SelectOrUnSelect (Integer userId,Integer productId,Integer checked);

    ServerResponse<Integer> getCartProductCount(Integer userId);
}
