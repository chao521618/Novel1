package yueshenginfo.com.mynovel.module.home.interfaces;

import yueshenginfo.com.mynovel.module.home.dto.BooksCategoryDto;

/**
 * Created by huchao on 2016/12/7.
 * Email 1064224874@qq.com
 */
public interface BooksCategoryInterface {
    /**
     * 书籍类别
     * @param isOk
     * @param dto
     */
    public void getBooksCategoryResult(boolean isOk, BooksCategoryDto dto);
}
