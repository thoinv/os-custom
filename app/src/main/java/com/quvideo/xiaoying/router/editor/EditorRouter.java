package com.quvideo.xiaoying.router.editor;

import android.app.Activity;

import com.example.myapplication.R;
import com.quvideo.xiaoying.router.BaseRouter;
import com.quvideo.xiaoying.router.PassThoughUrlGenerator;

public class EditorRouter extends BaseRouter {
    public static final String BASE_URL = "/XYVideoEditor/";
    public static final String BASE_URL1 = "/XYVideoEditor1/";
    public static final String BIZ_VIDEO_EXPORT_SERVICE = "/XYVideoEditor/biz_video_export_service";
    public static final String COLLAGE_URL = "/XYVideoEditor/CollageAlbum";
    public static final String EDITOR_CLIP_SORT_URL = "/XYVideoEditor/ClipSort";
    public static final String EDITOR_EDIT_LESSON_URL = "/XYVideoEditor/EditLesson";
    public static final String EDITOR_PRE_LOAD = "/XYVideoEditor/PreLoad";
    private static final int EDITOR_REQUEST_CODE_BASE = 24577;
    public static final String EDITOR_SERVICE = "/XYVideoEditor/editor_service";
    public static final String EDITOR_SORT_URL = "/XYVideoEditor/EditorSort";
    public static final String EDITOR_TODO_INTERCEPTOR = "/XYVideoEditor/todoInterceptor";
    public static final String EDITOR_TOOL_LIST = "editor_tool_list";
    public static final String EDITOR_URL = "/XYVideoEditor/VideoEditor";
    public static final String EDITOR_VIDEO_TRIM = "/XYVideoEditor/VideoTrim";
    public static final String ENTRANCE_CAMERA = "camera";
    public static final String ENTRANCE_EDIT = "edit";
    public static final String ENTRANCE_HOME_PAGE = "home_page";
    public static final String ENTRANCE_LOCAL_NOTIFICATION_NEW_MV = "Local_Notification_new_mv";
    public static final String ENTRANCE_LOCAL_NOTIFICATION_UNEXPORTED = "Local_Notification_unexported";
    public static final String ENTRANCE_ME_STUDIO = "me_studio";
    public static final String ENTRANCE_MV = "MV";
    public static final String ENTRANCE_PIP = "PIP";
    public static final String ENTRANCE_QUICK_PREVIEW = "quick_preview";
    public static final String ENTRANCE_SHARE = "share";
    public static final String ENTRANCE_STUDIO = "studio";
    public static final String KEY_EDIT_LESSON_URL = "edit_lesson_url";
    public static final String KEY_FORCE_SHOW_LOGO_WATERMARK = "key_force_show_logo_watermark";
    public static final String KEY_HAS_SHOWED_EDIT_LESSON_ANIMATION = "key_has_showed_edit_lesson_animation";
    public static final String KEY_HAS_SHOWED_FUNNY_TEMPLATE_DIALOG = "key_has_showed_funny_tempalte_dialog";
    public static final String KEY_PARAMS_CLIP_REVERSE = "key_params_clip_reverse";
    public static final String KEY_PARAMS_DUB_CHOOSE = "dub_choose";
    public static final String KEY_PARAMS_THEME_MUSIC_DOWNLOAD = "theme_music_download";
    public static final String KEY_TOOL_LIST_ORDER_SPLIT_OP = ",";
    public static final String MAP_PARAMS_EVENT_ID = "map_params_event_id";
    public static final int MAP_PARAMS_EVENT_ID_SUBTITLE_TAB_ANIM = 3;
    public static final int MAP_PARAMS_EVENT_ID_SUBTITLE_TAB_NORMAL = 4;
    public static final int MAP_PARAMS_EVENT_ID_USE_FONT = 2;
    public static final int MAP_PARAMS_EVENT_ID_USE_TEMPLATE = 1;
    public static final String MAP_PARAMS_TCID = "map_params_tcid";
    public static final String MAP_PARAMS_TEMPLATE_CATEGORY_ID = "map_params_template_category_id";
    public static final String MAP_PARAMS_TEMPLATE_ID = "map_params_template_id";
    public static final String MAP_PARAMS_TEMPLATE_PACKAGE_ID = "map_params_template_package_id";
    public static final String MAP_PARAMS_TEMPLATE_PATH = "map_params_template_path";
    public static final String MAP_PARAMS_TEMPLATE_ROLL_ID = "map_params_template_roll_id";
    public static final String MAP_PARAMS_TITLE = "map_params_title";
    public static final String MAP_PARAM_MOSAIC_TYPE = "map_param_mosaic_type";
    public static final int Mode_ClipEdit = 0;
    public static final int Mode_Effects = 1;
    public static final int Mode_GifMaker = 2;
    public static final String PATH_APP_UPDATE = "/XYVideoEditor1/AppUpdate";
    public static final String PROXY_MAIN_ACTIVITY = "/XYVideoEditor/MainActLifeCycle";
    public static final String PROXY_MAIN_APP = "/XYVideoEditor/EditorAppLifeCycle";
    public static final String PROXY_USER = "/XYVideoEditor/EditorUserLifeCycle";
    public static final String REMOVE_WATERMARK_VIDEO_PAGE = "/XYVideoEditor/watermarkVideo";
    public static final int REQUEST_CODE_ADD_CLIP_FROM_GALLERY = 24581;
    public static final int REQUEST_CODE_FOR_CLIP_SORT = 24584;
    public static final int REQUEST_CODE_FOR_SORT = 24583;
    public static final int REQUEST_CODE_GET_MORE_EFFECT = 24580;
    public static final int REQUEST_CODE_GET_MORE_THEME = 24579;
    public static final int REQUEST_CODE_GIF_MAKER_SORT_CODE = 24578;
    public static final int REQUEST_CODE_REPLACE_CLIP_FROM_GALLERY = 24585;
    public static final String SORT_MODE = "editor_sort_mode";
    public static final String VIVA_EDITOR_PREF_FILENAME = "viva_editor";
    public static final String VIVA_EDITOR_PREF_KEY_TRANSITION_STATIC = "viva_editor_key_transition_static";

    public static void launchEditorActivity(Activity activity, Object... objArr) {
        if (activity != null) {
            getRouterBuilder(activity.getApplication(), EDITOR_URL).z(PassThoughUrlGenerator.EXTRA_PASS_THROUGH_URL, PassThoughUrlGenerator.generateUrl(EDITOR_URL, objArr)).bb(R.anim.anim_activity_enter, R.anim.anim_activity_exit).bp(activity);
        }
    }

    public static void launchEditorActivity(Activity activity, String str) {
        if (activity != null) {
            getRouterBuilder(activity.getApplication(), EDITOR_URL).z(PassThoughUrlGenerator.EXTRA_PASS_THROUGH_URL, str).bb(R.anim.anim_activity_enter, R.anim.anim_activity_exit).bp(activity);
        }
    }

    public static void launchClipSortActivity(Activity activity) {
        getRouterBuilder(activity.getApplication(), EDITOR_CLIP_SORT_URL).bb(R.anim.anim_activity_enter, R.anim.anim_activity_exit).c(activity, 24584);
    }
}