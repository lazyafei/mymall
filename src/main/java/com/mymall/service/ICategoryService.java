package com.mymall.service;

import com.mymall.common.ServerResponse;
import com.mymall.pojo.Category;

import java.util.List;

/**
 * Created by bestone on 4/22/2018.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId,String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
