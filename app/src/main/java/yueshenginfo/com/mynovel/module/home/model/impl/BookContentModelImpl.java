package yueshenginfo.com.mynovel.module.home.model.impl;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import yueshenginfo.com.IBaseModel;
import yueshenginfo.com.mynovel.module.home.dto.BookContentDto;
import yueshenginfo.com.mynovel.module.home.interfaces.BookContentInterface;
import yueshenginfo.com.mynovel.module.home.model.BookContentModel;

/**
 * Created by huchao on 2016/12/6.
 * Email 1064224874@qq.com
 */
public class BookContentModelImpl extends IBaseModel implements BookContentModel {
    private BookContentInterface mBookContentInterface;

    @Override
    public void getBookContent(Object params, Object obj) {
        mBookContentInterface = (BookContentInterface) obj;
        mRequestManager.requestBookContent(params, new Response.Listener<BookContentDto>() {
            @Override
            public void onResponse(BookContentDto bookContentDto) {
                if (bookContentDto.isOk()) {
                    mBookContentInterface.getBookContentResult(true, bookContentDto);
                } else {
                    mBookContentInterface.getBookContentResult(false, bookContentDto);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                mBookContentInterface.getBookContentResult(false, null);

            }
        });
    }
}
