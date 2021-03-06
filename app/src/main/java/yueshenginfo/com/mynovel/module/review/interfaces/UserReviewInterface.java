package yueshenginfo.com.mynovel.module.review.interfaces;

import yueshenginfo.com.mynovel.module.review.dto.UserReviewDto;

/**
 * Created by huchao on 2016/12/23.
 * Email 1064224874@qq.com
 */
public interface UserReviewInterface {
    /**
     * 用户详情评论请求
     * @param isOk
     * @param dto
     */
    public void getUserReviewViewResult(boolean isOk, UserReviewDto dto);
}
