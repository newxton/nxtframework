package com.newxton.nxtframework.service;

import com.newxton.nxtframework.entity.NxtWebPage;

import java.util.List;

/**
 * (NxtWebPage)表服务接口
 *
 * @author makejava
 * @since 2020-08-04 11:21:23
 */
public interface NxtWebPageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NxtWebPage queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<NxtWebPage> queryAllByLimit(int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param nxtWebPage 实例对象
     * @return 对象列表
     */
    List<NxtWebPage> queryAll(NxtWebPage nxtWebPage);

    /**
     * 新增数据
     *
     * @param nxtWebPage 实例对象
     * @return 实例对象
     */
    NxtWebPage insert(NxtWebPage nxtWebPage);

    /**
     * 修改数据
     *
     * @param nxtWebPage 实例对象
     * @return 实例对象
     */
    NxtWebPage update(NxtWebPage nxtWebPage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}