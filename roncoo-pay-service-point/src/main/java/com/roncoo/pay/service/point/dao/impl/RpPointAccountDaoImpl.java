/*
 * ====================================================================
 * 龙果学院： www.roncoo.com （微信公众号：RonCoo_com）
 * 超级教程系列：《微服务架构的分布式事务解决方案》视频教程
 * 讲师：吴水成（水到渠成），840765167@qq.com
 * 课程地址：http://www.roncoo.com/course/view/7ae3d7eddc4742f78b0548aa8bd9ccdb
 * ====================================================================
 */
package com.roncoo.pay.service.point.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.roncoo.pay.common.core.dao.impl.BaseDaoImpl;
import com.roncoo.pay.service.point.dao.RpPointAccountDao;
import com.roncoo.pay.service.point.entity.RpPointAccount;


/**
 * @类功能说明： 账户dao实现类
 * @类修改者：
 * @修改日期：
 * @修改说明：
 * @公司名称：广州领课网络科技有限公司（龙果学院：www.roncoo.com）
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
@Repository
public class RpPointAccountDaoImpl  extends BaseDaoImpl<RpPointAccount> implements RpPointAccountDao{

	@Override
    public RpPointAccount getByUserNo(String userNo){

		Map<String , Object> paramMap = new HashMap<String , Object>();
		paramMap.put("userNo",userNo);
		paramMap.put("isPessimist", true);
		return this.getSessionTemplate().selectOne(getStatement("getByUserNo"), paramMap);

	}
}