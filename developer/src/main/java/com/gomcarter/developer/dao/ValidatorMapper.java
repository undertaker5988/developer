package com.gomcarter.developer.dao;

import com.gomcarter.frameworks.base.pager.Pageable;
import com.gomcarter.developer.entity.Validator;
import com.gomcarter.developer.params.JValidatorQueryParams;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

/**
 *
 * @ClassName ValidatorMapper
 * @Description
 * @author gomcarter
 * @date 2019-06-17 16:41:02
 */
public interface ValidatorMapper {

    Long insert(Validator validator);

    Integer update(Validator validator);

    Validator getById(Long id);

    List<Validator> getByIdList(@Param("idList") Collection<Long> idList);

    List<Validator> query(
                @Param("params") JValidatorQueryParams params,
                @Param("pager") Pageable pager);

    Integer count(@Param("params") JValidatorQueryParams params);
}
