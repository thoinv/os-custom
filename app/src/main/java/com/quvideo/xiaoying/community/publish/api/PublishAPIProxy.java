package com.quvideo.xiaoying.community.publish.api;

import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.text.TextUtils;
import com.appsflyer.share.Constants;
import com.google.gson.JsonObject;
import com.quvideo.xiaoying.apicore.c;
import com.quvideo.xiaoying.apicore.l;
import com.quvideo.xiaoying.apicore.o;
import com.quvideo.xiaoying.common.MSize;
import io.reactivex.ab;
import io.reactivex.d.h;
import io.reactivex.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.t;
import retrofit2.m;

public class PublishAPIProxy {
    public static final String API_PARAM_PUBLISH_ACTIVITY = "activity";
    public static final String API_PARAM_PUBLISH_ACTIVITY_ID = "ayiddigest";
    public static final String API_PARAM_PUBLISH_ACTIVITY_KEYWORD = "keyword";
    public static final String API_PARAM_PUBLISH_APPLY_FILE_DURATION = "duration";
    public static final String API_PARAM_PUBLISH_APPLY_FILE_FORMAT = "format";
    public static final String API_PARAM_PUBLISH_APPLY_FILE_HEIGHT = "height";
    public static final String API_PARAM_PUBLISH_APPLY_FILE_TITLE = "name";
    public static final String API_PARAM_PUBLISH_APPLY_FILE_UPLOAD_TYPE = "type";
    public static final String API_PARAM_PUBLISH_APPLY_FILE_WIDTH = "width";
    public static final String API_PARAM_PUBLISH_COVER_TITLE = "coverTitle";
    public static final String API_PARAM_PUBLISH_DELAY = "delay";
    public static final String API_PARAM_PUBLISH_DESC = "desc";
    public static final String API_PARAM_PUBLISH_DOWNLOAD_FLAG = "downloadFlag";
    public static final String API_PARAM_PUBLISH_DURATION = "duration";
    public static final String API_PARAM_PUBLISH_FILE = "files";
    public static final String API_PARAM_PUBLISH_FLAG = "flag";
    public static final String API_PARAM_PUBLISH_LANGUAGE = "activeLanguage";
    public static final String API_PARAM_PUBLISH_LOCATION = "location";
    public static final String API_PARAM_PUBLISH_LOCATION_ADDRESS_DETAIL = "addrDetail";
    public static final String API_PARAM_PUBLISH_LOCATION_GPS_ACCURACY = "precision";
    public static final String API_PARAM_PUBLISH_LOCATION_GPS_LATITUDE = "latitude";
    public static final String API_PARAM_PUBLISH_LOCATION_GPS_LONGTITUDE = "longitude";
    public static final String API_PARAM_PUBLISH_LOCATION_NAME = "addrName";
    public static final String API_PARAM_PUBLISH_LOCATION_TYPE = "type";
    public static final String API_PARAM_PUBLISH_PERMIT_LIST = "permitIds";
    public static final String API_PARAM_PUBLISH_PERMIT_TYPE = "permitType";
    private static final String API_PARAM_PUBLISH_PUID = "puiddigest";
    public static final String API_PARAM_PUBLISH_REFER = "refer";
    public static final String API_PARAM_PUBLISH_SHOOTTIME = "shoottime";
    public static final String API_PARAM_PUBLISH_TAG = "tags";
    public static final String API_PARAM_PUBLISH_TITLE = "title";
    private static final String API_PARAM_PUBLISH_VIDEO_SIZE = "videoFileSize";
    public static final String API_PARAM_PUBLISH_VIDEO_TEMPLATE_INFO = "videoTemplateInfo";
    public static final String API_PARAM_PUBLISH_VIDEO_TITLE = "videoTitle";
    public static final String API_PARAM_PUBLISH_VIDEO_TYPE = "videoType";

    private static x<PublishAPI> getAPIIns() {
        String aFc = c.aEV().aFc();
        if (TextUtils.isEmpty(aFc)) {
            return x.W(new Throwable(o.eqy));
        }
        return o.getRetrofitIns(aFc).m(new h<m, PublishAPI>() {
            /* class com.quvideo.xiaoying.community.publish.api.PublishAPIProxy.AnonymousClass1 */

            public PublishAPI apply(m mVar) {
                return (PublishAPI) mVar.aE(PublishAPI.class);
            }
        });
    }

    public static x<JsonObject> getPublishCancel(final String str, final String str2, final boolean z) {
        return getAPIIns().k(new h<PublishAPI, ab<JsonObject>>() {
            /* class com.quvideo.xiaoying.community.publish.api.PublishAPIProxy.AnonymousClass2 */

            public ab<JsonObject> apply(PublishAPI publishAPI) {
                String str = c.aEV().aFc() + PublishAPI.METHOD_PUBLISH_CANCEL;
                HashMap hashMap = new HashMap();
                hashMap.put("a", str);
                hashMap.put("b", str2);
                if (z) {
                    hashMap.put(Constants.URL_CAMPAIGN, "1");
                } else {
                    hashMap.put(Constants.URL_CAMPAIGN, "0");
                }
                return publishAPI.getPublishCancel(l.a(t.Nf(str), (Object) hashMap));
            }
        });
    }

    private static MSize getBitmapResolution(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new MSize(options.outWidth, options.outHeight);
    }

    private static com.xiaoying.a.a.c getVideoInfo(String str) {
        com.xiaoying.a.a.c cVar = new com.xiaoying.a.a.c();
        MSize mSize = new MSize();
        cVar.lJv = mSize;
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(str);
            mediaPlayer.prepare();
            cVar.duration = mediaPlayer.getDuration();
            mSize.width = mediaPlayer.getVideoWidth();
            mSize.height = mediaPlayer.getVideoHeight();
            mediaPlayer.reset();
            mediaPlayer.release();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> creatRequestMap(PublishApplyParam publishApplyParam) {
        HashMap hashMap = new HashMap();
        hashMap.put(API_PARAM_PUBLISH_LANGUAGE, publishApplyParam.activeLanguage);
        hashMap.put("title", publishApplyParam.title);
        hashMap.put("desc", publishApplyParam.desc);
        hashMap.put(API_PARAM_PUBLISH_SHOOTTIME, publishApplyParam.shoottime);
        hashMap.put(API_PARAM_PUBLISH_REFER, publishApplyParam.refer);
        hashMap.put(API_PARAM_PUBLISH_PERMIT_TYPE, Integer.valueOf(publishApplyParam.permitType));
        hashMap.put("tags", publishApplyParam.tags);
        hashMap.put("duration", publishApplyParam.duration);
        hashMap.put(API_PARAM_PUBLISH_COVER_TITLE, publishApplyParam.coverTitle);
        hashMap.put(API_PARAM_PUBLISH_VIDEO_TITLE, publishApplyParam.videoTitle);
        hashMap.put(API_PARAM_PUBLISH_PERMIT_LIST, publishApplyParam.permitIds);
        hashMap.put(API_PARAM_PUBLISH_DOWNLOAD_FLAG, Integer.valueOf(publishApplyParam.downloadFlag));
        hashMap.put("videoType", Integer.valueOf(publishApplyParam.videoType));
        hashMap.put("flag", Integer.valueOf(publishApplyParam.flag));
        hashMap.put(API_PARAM_PUBLISH_DELAY, Integer.valueOf(publishApplyParam.delay));
        if (publishApplyParam.videoTemplateInfo != null) {
            hashMap.put(API_PARAM_PUBLISH_VIDEO_TEMPLATE_INFO, publishApplyParam.videoTemplateInfo);
        }
        hashMap.put("location", publishApplyParam.location);
        hashMap.put(API_PARAM_PUBLISH_ACTIVITY, publishApplyParam.activity);
        MSize bitmapResolution = getBitmapResolution(publishApplyParam.strThumbLocalBig);
        publishApplyParam.addUploadApplyFile(4, publishApplyParam.strThumbLocalBig, 0, (long) bitmapResolution.width, (long) bitmapResolution.height);
        if (publishApplyParam.videoInfo != null) {
            publishApplyParam.addUploadApplyFile(3, publishApplyParam.strVideoLocal, (long) publishApplyParam.videoInfo.duration, (long) publishApplyParam.videoInfo.width, (long) publishApplyParam.videoInfo.height);
        } else {
            com.xiaoying.a.a.c videoInfo = getVideoInfo(publishApplyParam.strVideoLocal);
            publishApplyParam.addUploadApplyFile(3, publishApplyParam.strVideoLocal, (long) videoInfo.duration, (long) videoInfo.lJv.width, (long) videoInfo.lJv.height);
        }
        if (!TextUtils.isEmpty(publishApplyParam.strPrjFileLocal)) {
            publishApplyParam.addUploadApplyFile(2, publishApplyParam.strPrjFileLocal, 0, 0, 0);
        }
        hashMap.put(API_PARAM_PUBLISH_FILE, publishApplyParam.files);
        return hashMap;
    }

    public static x<PublishApplyResult> getPublishApply(final PublishApplyParam publishApplyParam) {
        return getAPIIns().k(new h<PublishAPI, ab<PublishApplyResult>>() {
            /* class com.quvideo.xiaoying.community.publish.api.PublishAPIProxy.AnonymousClass3 */

            public ab<PublishApplyResult> apply(PublishAPI publishAPI) {
                return publishAPI.getPublishApply(l.a(t.Nf(c.aEV().aFc() + PublishAPI.METHOD_PUBLISH_APPLY), (Map<String, Object>) PublishAPIProxy.creatRequestMap(publishApplyParam)));
            }
        });
    }

    public static x<PublishApplyResult> getPublishFinish(final String str, final long j) {
        return getAPIIns().k(new h<PublishAPI, ab<PublishApplyResult>>() {
            /* class com.quvideo.xiaoying.community.publish.api.PublishAPIProxy.AnonymousClass4 */

            public ab<PublishApplyResult> apply(PublishAPI publishAPI) {
                String str = c.aEV().aFc() + PublishAPI.METHOD_PUBLISH_FINISH;
                HashMap hashMap = new HashMap();
                hashMap.put("puiddigest", str);
                hashMap.put(PublishAPIProxy.API_PARAM_PUBLISH_VIDEO_SIZE, j + "");
                return publishAPI.getPublishFinish(l.a(t.Nf(str), (Object) hashMap));
            }
        });
    }
}