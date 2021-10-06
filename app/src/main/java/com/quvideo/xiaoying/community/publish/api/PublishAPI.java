package com.quvideo.xiaoying.community.publish.api;

import com.google.gson.JsonObject;
import io.reactivex.x;
import okhttp3.ab;
import retrofit2.b.a;
import retrofit2.b.o;

/* access modifiers changed from: package-private */
public interface PublishAPI {
    public static final String METHOD_PUBLISH_APPLY = "checkAndGetUploadToken";
    public static final String METHOD_PUBLISH_CANCEL = "vf";
    public static final String METHOD_PUBLISH_FINISH = "completePush";

    @o(METHOD_PUBLISH_APPLY)
    x<PublishApplyResult> getPublishApply(@a ab abVar);

    @o(METHOD_PUBLISH_CANCEL)
    x<JsonObject> getPublishCancel(@a ab abVar);

    @o(METHOD_PUBLISH_FINISH)
    x<PublishApplyResult> getPublishFinish(@a ab abVar);
}