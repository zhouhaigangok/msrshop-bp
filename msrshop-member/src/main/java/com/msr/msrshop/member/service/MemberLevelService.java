package com.msr.msrshop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.common.utils.PageUtils;
import com.msr.msrshop.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author tom
 * @email tom@gmail.com
 * @date 2020-09-01 15:48:29
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

