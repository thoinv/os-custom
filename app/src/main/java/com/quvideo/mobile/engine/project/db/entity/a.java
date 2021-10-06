package com.quvideo.mobile.engine.project.db.entity;

import com.quvideo.xiaoying.datacenter.SocialConstDef;
import com.quvideo.xiaoying.datacenter.SocialServiceDef;
import com.vivavideo.a.a.b;

@b(cMB = "Project")
public class a {
    @b(aDs = "_id", aDu = true)
    public Long _id;
    @b(aDs = SocialConstDef.PROJECT_ACTVITY_DATA)
    public String activityData;
    @b(aDs = SocialConstDef.PROJECT_EXPORT_URL)
    public String dTZ;
    @b(aDs = SocialConstDef.PROJECT_THUMBNAIL)
    public String dUa;
    @b(aDs = "coverURL")
    public String dUb;
    @b(aDs = "version")
    public String dUc;
    @b(aDs = "create_time")
    public String dUd;
    @b(aDs = "modify_time")
    public String dUe;
    @b(aDs = SocialConstDef.PROJECT_CLIP_COUNT)
    public int dUf;
    @b(aDs = SocialConstDef.PROJECT_DURATION_LIMIT)
    public int dUg;
    @b(aDs = SocialConstDef.PROJECT_ISDELETED)
    public int dUh;
    @b(aDs = SocialConstDef.PROJECT_ISMODIFIED)
    public int dUi;
    @b(aDs = SocialConstDef.PROJECT_EDIT_CODE)
    public int dUj;
    @b(aDs = SocialConstDef.PROJECT_CAMERA_CODE)
    public int dUk;
    @b(aDs = SocialConstDef.PROJECT_EFFECT_ID)
    public long dUl;
    @b(aDs = SocialConstDef.PROJECT_THEME_TYPE)
    public int dUm;
    @b(aDs = SocialConstDef.PROJECT_VIDEO_TEMPLATE_INFO)
    public String dUn;
    @b(aDs = "video_desc")
    public String dUo;
    @b(aDs = "is_copy")
    public boolean dUp;
    @b(aDs = "export_cover_path")
    public String dUq;
    @b(aDs = SocialServiceDef.EXTRAS_PROJECT_NAME)
    public String dUr;
    @b(aDs = "is_demo")
    public boolean dUs;
    @b(aDs = "extras")
    public String dtn;
    @b(aDs = "duration")
    public long duration;
    @b(aDs = SocialConstDef.PROJECT_ENTRANCE)
    public String entrance;
    @b(aDs = "url")
    public String prj_url;
    @b(aDs = SocialConstDef.PROJECT_HEIGHT)
    public int streamHeight;
    @b(aDs = "streamWidth")
    public int streamWidth;
    @b(aDs = "title")
    public String title;
    @b(aDs = "todoCode")
    public int todoCode;

    public a() {
    }

    public a(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, long j, int i2, int i3, int i4, int i5, int i6, String str8, int i7, int i8, int i9, long j2, int i10, String str9, String str10, String str11, String str12, String str13, boolean z, String str14, String str15, boolean z2) {
        this._id = l;
        this.prj_url = str;
        this.dTZ = str2;
        this.dUa = str3;
        this.dUb = str4;
        this.dUc = str5;
        this.dUd = str6;
        this.dUe = str7;
        this.dUf = i;
        this.duration = j;
        this.dUg = i2;
        this.streamWidth = i3;
        this.streamHeight = i4;
        this.dUh = i5;
        this.dUi = i6;
        this.entrance = str8;
        this.todoCode = i7;
        this.dUj = i8;
        this.dUk = i9;
        this.dUl = j2;
        this.dUm = i10;
        this.dUn = str9;
        this.title = str10;
        this.dUo = str11;
        this.activityData = str12;
        this.dtn = str13;
        this.dUp = z;
        this.dUq = str14;
        this.dUr = str15;
        this.dUs = z2;
    }

    public Long get_id() {
        return this._id;
    }

    public void set_id(Long l) {
        this._id = l;
    }

    public String awb() {
        return this.prj_url;
    }

    public void jP(String str) {
        this.prj_url = str;
    }

    public String awc() {
        return this.dTZ;
    }

    public void jQ(String str) {
        this.dTZ = str;
    }

    public String awd() {
        return this.dUa;
    }

    public void jR(String str) {
        this.dUa = str;
    }

    public String awe() {
        return this.dUb;
    }

    public void jS(String str) {
        this.dUb = str;
    }

    public String awf() {
        return this.dUc;
    }

    public void jT(String str) {
        this.dUc = str;
    }

    public String awg() {
        return this.dUd;
    }

    public void jU(String str) {
        this.dUd = str;
    }

    public String awh() {
        return this.dUe;
    }

    public void jV(String str) {
        this.dUe = str;
    }

    public int awi() {
        return this.dUf;
    }

    public void pj(int i) {
        this.dUf = i;
    }

    public long getDuration() {
        return this.duration;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public int awj() {
        return this.dUg;
    }

    public void pk(int i) {
        this.dUg = i;
    }

    public int getStreamWidth() {
        return this.streamWidth;
    }

    public void setStreamWidth(int i) {
        this.streamWidth = i;
    }

    public int getStreamHeight() {
        return this.streamHeight;
    }

    public void setStreamHeight(int i) {
        this.streamHeight = i;
    }

    public int awk() {
        return this.dUh;
    }

    public void pl(int i) {
        this.dUh = i;
    }

    public int awl() {
        return this.dUi;
    }

    public void pm(int i) {
        this.dUi = i;
    }

    public String awm() {
        return this.entrance;
    }

    public void jW(String str) {
        this.entrance = str;
    }

    public int getTodoCode() {
        return this.todoCode;
    }

    public void setTodoCode(int i) {
        this.todoCode = i;
    }

    public int awn() {
        return this.dUj;
    }

    public void pn(int i) {
        this.dUj = i;
    }

    public int awo() {
        return this.dUk;
    }

    public void po(int i) {
        this.dUk = i;
    }

    public long awp() {
        return this.dUl;
    }

    public void cs(long j) {
        this.dUl = j;
    }

    public int awq() {
        return this.dUm;
    }

    public void pp(int i) {
        this.dUm = i;
    }

    public String awr() {
        return this.dUn;
    }

    public void jX(String str) {
        this.dUn = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String aws() {
        return this.dUo;
    }

    public void jY(String str) {
        this.dUo = str;
    }

    public String awt() {
        return this.activityData;
    }

    public void jZ(String str) {
        this.activityData = str;
    }

    public String getExtras() {
        return this.dtn;
    }

    public void setExtras(String str) {
        this.dtn = str;
    }

    public boolean awu() {
        return this.dUp;
    }

    public void dD(boolean z) {
        this.dUp = z;
    }

    public String awv() {
        return this.dUr;
    }

    public void ka(String str) {
        this.dUr = str;
    }

    public boolean aww() {
        return this.dUs;
    }

    public void dE(boolean z) {
        this.dUs = z;
    }

    public String toString() {
        return "DBProject{_id=" + this._id + ", url='" + this.prj_url + '\'' + ", export_url='" + this.dTZ + '\'' + ", thumbnail='" + this.dUa + '\'' + ", coverURL='" + this.dUb + '\'' + ", version='" + this.dUc + '\'' + ", create_time='" + this.dUd + '\'' + ", modify_time='" + this.dUe + '\'' + ", clip_count=" + this.dUf + ", duration=" + this.duration + ", duration_limit=" + this.dUg + ", streamWidth=" + this.streamWidth + ", streamHeight=" + this.streamHeight + ", is_deleted=" + this.dUh + ", is_modified=" + this.dUi + ", entrance='" + this.entrance + '\'' + ", todoCode=" + this.todoCode + ", editCode=" + this.dUj + ", cameraCode=" + this.dUk + ", effectID=" + this.dUl + ", theme_type=" + this.dUm + ", video_template_info='" + this.dUn + '\'' + ", title='" + this.title + '\'' + ", video_desc='" + this.dUo + '\'' + ", activityData='" + this.activityData + '\'' + ", extras='" + this.dtn + '\'' + ", is_copy='" + this.dUp + '\'' + ", export_cover_path='" + this.dUq + '\'' + ", prj_name='" + this.dUr + '\'' + ", is_demo='" + this.dUs + '\'' + '}';
    }

    public String awx() {
        return this.dUq;
    }

    public void kb(String str) {
        this.dUq = str;
    }
}