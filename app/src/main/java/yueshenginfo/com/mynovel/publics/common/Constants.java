package yueshenginfo.com.mynovel.publics.common;

/**
 * Created by huchao on 2016/12/5.
 * Email 1064224874@qq.com
 */

public class Constants {
    public static String MessageInfo = "MessageInfo";
    public static String HistorySearch = "HistorySearch";
    public static final String FLIP_STYLE = "flipStyle";
//    public static String PATH_DATA = FileUtils.createRootPath(AppUtils.getAppContext()) + "/cache";

  //  public static String BASE_PATH = FileUtils.createRootPath(AppUtils.getAppContext()) + "/book/";

    /**
     *
     */
    public static class ServiceInterFace {
        public static String BaseUrl = "http://api.zhuishushenqi.com";
        public static final String IMG_BASE_URL = "http://statics.zhuishushenqi.com";
        public static final String BaseVideoUrl = "http://c.3g.163.com";

        public static String GetBookChapterUrl = BaseUrl + "/mix-atoc";
        public static String GetBookContentUrl = "http://chapter2.zhuishushenqi.com/chapter";
        public static String GetBooksCategoryUrl = BaseUrl + "/cats/lv2";
        public static String GetBooksMoreUrl = BaseUrl + "/book/by-categories";
        public static String GetBooksRecommendUrl = BaseUrl + "/book/recommend";
        public static String GetAllLookBooksUrl = BaseUrl + "/book/hot-word";
        public static String GetSearchWordsUrl = BaseUrl + "/book/auto-complete";
        public static String GetSearchResultUrl = BaseUrl + "/book/fuzzy-search";
        public static String GetBookDetailUrl = BaseUrl + "/book";
        public static String GetBookDetailReviewUrl = BaseUrl + "/post/review/best-by-book";
        public static String GetUserDetailReviewUrl = BaseUrl + "/post";
        public static String GetMoreReviewUrl = BaseUrl + "/post/review/by-book";
        public static String GetCommunityUrl = BaseUrl + "/post/by-book";
        public static String GetVideoListUrl = BaseVideoUrl+"/nc/video/list";
        public static String GetNewsListUrl = BaseVideoUrl+"/nc/article";
    }

    /**
     * @description Request的Tag管理
     */
    public static class RequestTag {
        public static final int GetBookChapterTag = 1001;
        public static final int GetBookContentTag = 1002;
        public static final int GetBooksCategoryTag = 1003;
        public static final int GetBooksMoreTag = 1004;
        public static final int GetBooksRecommendTag = 1005;
        public static final int GetAllLookBooksTag = 1006;
        public static final int GetSearchWordsTag = 1007;
        public static final int GetSearchResultTag = 1008;
        public static final int GetBookDetailTag = 1009;
        public static final int GetBookDetailReviewTag = 1010;
        public static final int GetUserDetailReviewTag = 1011;
        public static final int GetReviewFloorTag = 1012;
        public static final int GetMoreReviewTag = 1013;
        public static final int GetCommunityTag = 1014;
        public static final int GetVideoListTag = 1015;
        public static final int GetNewsListTag = 1016;
        public static final int GetFinaceListTag = 1017;
    }
}
