package com.quvideo.xiaoying.router.editor;

import com.quvideo.xiaoying.router.editor.studio.BoardType;
import java.io.Serializable;
import java.util.HashMap;

public class EditorIntentInfo2 implements Serializable {
    public String activityId;
    public boolean autoPlay = false;
    public int baseMode = 0;
    public boolean demoTemplate = false;
    public String demoTemplateTargetDir;
    public BoardType firstTab = BoardType.CLIP;
    public String from = "";
    public String groupCode;
    public boolean isDraftProject = false;
    public boolean kitMode = false;
    public String kitTitle;
    public String kitTtid;
    public HashMap<String, String> paramMap = new HashMap<>();
    public String prj_url = null;
    public String templateId;
    public int todoCode;
    public String zip_url;
}