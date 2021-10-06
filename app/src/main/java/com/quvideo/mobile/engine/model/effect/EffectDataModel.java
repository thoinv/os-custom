package com.quvideo.mobile.engine.model.effect;

import android.text.TextUtils;
import com.quvideo.mobile.engine.entity.VeRange;
import com.quvideo.mobile.engine.kit.a;
import com.quvideo.mobile.engine.model.SubtitleFontModel;
import com.quvideo.mobile.engine.model.effect.EffectAudioInfo;
import com.quvideo.mobile.engine.model.effect.EffectKeyFrameRange;
import com.quvideo.mobile.engine.model.effect.MosaicInfo;
import com.quvideo.mobile.engine.model.effect.PipMixInfo;
import com.quvideo.mobile.engine.model.effect.ScaleRotateViewState;
import com.quvideo.mobile.engine.model.effect.TextAnimInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EffectDataModel implements Cloneable, Comparable<EffectDataModel> {
    public static final int EFFECT_TYPE_GIF = 2;
    public static final int EFFECT_TYPE_PHOTO = 0;
    public static final int EFFECT_TYPE_VIDEO = 1;
    public float alpha = 1.0f;
    public int alphaOverlay = 100;
    public int audioVolume = 100;
    private long createTime = 0;
    public float effectLayerId = 0.0f;
    public int fileType = 0;
    public int groupId = 0;
    public boolean isApplyByTheme;
    public boolean isHadAudio = false;
    public ArrayList<EffectKeyFrameRange> keyFrameRanges = new ArrayList<>();
    public a kitEffectAttribute = new a();
    public EffectAudioInfo mAudioInfo;
    private VeRange mDestVeRange = null;
    private String mEffectPath = "";
    public MosaicInfo mMosaicInfo;
    public PipMixInfo mPipMixInfo = new PipMixInfo();
    private VeRange mRawDestVeRange = null;
    private ScaleRotateViewState mScaleRotateViewState;
    private VeRange mSrcVeRange = null;
    public TextAnimInfo mTextAnimInfo = new TextAnimInfo();
    public SubtitleFontModel subtitleFontModel;
    private String uniqueId;

    public String getUniqueId() {
        return this.uniqueId;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
        this.createTime = com.quvideo.mobile.engine.b.a.a.jo(str);
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public void save(EffectDataModel effectDataModel) {
        this.uniqueId = effectDataModel.uniqueId;
        this.createTime = effectDataModel.createTime;
        this.groupId = effectDataModel.groupId;
        this.mEffectPath = effectDataModel.mEffectPath;
        this.mSrcVeRange = effectDataModel.mSrcVeRange;
        this.mDestVeRange = effectDataModel.mDestVeRange;
        this.mRawDestVeRange = effectDataModel.mRawDestVeRange;
        this.fileType = effectDataModel.fileType;
        this.effectLayerId = effectDataModel.effectLayerId;
        this.isApplyByTheme = effectDataModel.isApplyByTheme;
        this.alpha = effectDataModel.alpha;
        this.isHadAudio = effectDataModel.isHadAudio;
        this.audioVolume = effectDataModel.audioVolume;
        this.mAudioInfo = effectDataModel.mAudioInfo;
        this.mScaleRotateViewState = effectDataModel.mScaleRotateViewState;
        this.mMosaicInfo = effectDataModel.mMosaicInfo;
        this.keyFrameRanges = effectDataModel.keyFrameRanges;
        this.subtitleFontModel = effectDataModel.subtitleFontModel;
        this.kitEffectAttribute = effectDataModel.kitEffectAttribute;
        this.alphaOverlay = effectDataModel.alphaOverlay;
        this.mPipMixInfo = effectDataModel.mPipMixInfo;
        this.mTextAnimInfo = effectDataModel.mTextAnimInfo;
    }

    public a getKitEffectAttribute() {
        return this.kitEffectAttribute;
    }

    public void setKitEffectAttribute(a aVar) {
        this.kitEffectAttribute = aVar;
    }

    public static List<EffectDataModel> cloneEffectDataLists(List<EffectDataModel> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (EffectDataModel effectDataModel : list) {
                arrayList.add(effectDataModel.clone());
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    @Override // java.lang.Object
    public EffectDataModel clone() throws CloneNotSupportedException {
        EffectDataModel effectDataModel = (EffectDataModel) super.clone();
        if (this.keyFrameRanges != null) {
            ArrayList<EffectKeyFrameRange> arrayList = new ArrayList<>();
            Iterator<EffectKeyFrameRange> it = this.keyFrameRanges.iterator();
            while (it.hasNext()) {
                arrayList.add((EffectKeyFrameRange) it.next().clone());
            }
            effectDataModel.setKeyFrameRanges(arrayList);
        }
        VeRange veRange = this.mSrcVeRange;
        if (veRange != null) {
            effectDataModel.setSrcRange(new VeRange(veRange));
        }
        VeRange veRange2 = this.mDestVeRange;
        if (veRange2 != null) {
            effectDataModel.setDestRange(new VeRange(veRange2));
        }
        VeRange veRange3 = this.mRawDestVeRange;
        if (veRange3 != null) {
            effectDataModel.setRawDestRange(new VeRange(veRange3));
        }
        EffectAudioInfo effectAudioInfo = this.mAudioInfo;
        if (effectAudioInfo != null) {
            effectDataModel.mAudioInfo = (EffectAudioInfo) effectAudioInfo.clone();
        }
        MosaicInfo mosaicInfo = this.mMosaicInfo;
        if (mosaicInfo != null) {
            effectDataModel.mMosaicInfo = (MosaicInfo) mosaicInfo.clone();
        }
        ScaleRotateViewState scaleRotateViewState = this.mScaleRotateViewState;
        if (scaleRotateViewState != null) {
            effectDataModel.setScaleRotateViewState(scaleRotateViewState.clone());
        }
        SubtitleFontModel subtitleFontModel2 = this.subtitleFontModel;
        if (subtitleFontModel2 != null) {
            effectDataModel.subtitleFontModel = (SubtitleFontModel) subtitleFontModel2.clone();
        }
        a aVar = this.kitEffectAttribute;
        if (aVar != null) {
            effectDataModel.kitEffectAttribute = (a) aVar.clone();
        }
        PipMixInfo pipMixInfo = this.mPipMixInfo;
        if (pipMixInfo != null) {
            effectDataModel.mPipMixInfo = (PipMixInfo) pipMixInfo.clone();
        }
        TextAnimInfo textAnimInfo = this.mTextAnimInfo;
        if (textAnimInfo != null) {
            effectDataModel.mTextAnimInfo = (TextAnimInfo) textAnimInfo.clone();
        }
        return effectDataModel;
    }

    public int compareTo(EffectDataModel effectDataModel) {
        VeRange destRange = getDestRange();
        VeRange destRange2 = effectDataModel.getDestRange();
        if (destRange == null || destRange2 == null) {
            return 0;
        }
        if (destRange.getmPosition() > destRange2.getmPosition()) {
            return 1;
        }
        return destRange.getmPosition() < destRange2.getmPosition() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectDataModel)) {
            return false;
        }
        EffectDataModel effectDataModel = (EffectDataModel) obj;
        if (this.groupId != effectDataModel.groupId || Float.compare(effectDataModel.effectLayerId, this.effectLayerId) != 0 || this.audioVolume != effectDataModel.audioVolume) {
            return false;
        }
        VeRange veRange = this.mDestVeRange;
        if (veRange == null ? effectDataModel.mDestVeRange != null : !veRange.equals(effectDataModel.mDestVeRange)) {
            return false;
        }
        VeRange veRange2 = this.mRawDestVeRange;
        if (veRange2 == null ? effectDataModel.mRawDestVeRange != null : !veRange2.equals(effectDataModel.mRawDestVeRange)) {
            return false;
        }
        ScaleRotateViewState scaleRotateViewState = this.mScaleRotateViewState;
        if (scaleRotateViewState == null ? effectDataModel.mScaleRotateViewState != null : !scaleRotateViewState.equals(effectDataModel.mScaleRotateViewState)) {
            return false;
        }
        String str = this.mEffectPath;
        if (str == null ? effectDataModel.mEffectPath != null : !str.equals(effectDataModel.mEffectPath)) {
            return false;
        }
        PipMixInfo pipMixInfo = this.mPipMixInfo;
        if (pipMixInfo == null ? effectDataModel.mPipMixInfo != null : !pipMixInfo.equals(effectDataModel.mPipMixInfo)) {
            return false;
        }
        TextAnimInfo textAnimInfo = this.mTextAnimInfo;
        TextAnimInfo textAnimInfo2 = effectDataModel.mTextAnimInfo;
        return textAnimInfo == null ? textAnimInfo2 == null : textAnimInfo.equals(textAnimInfo2);
    }

    public int hashCode() {
        int i = this.groupId * 31;
        VeRange veRange = this.mDestVeRange;
        int i2 = 0;
        int hashCode = (i + (veRange != null ? veRange.hashCode() : 0)) * 31;
        VeRange veRange2 = this.mRawDestVeRange;
        int hashCode2 = (hashCode + (veRange2 != null ? veRange2.hashCode() : 0)) * 31;
        ScaleRotateViewState scaleRotateViewState = this.mScaleRotateViewState;
        int hashCode3 = (hashCode2 + (scaleRotateViewState != null ? scaleRotateViewState.hashCode() : 0)) * 31;
        String str = this.mEffectPath;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        float f = this.effectLayerId;
        if (f != 0.0f) {
            i2 = Float.floatToIntBits(f);
        }
        return ((hashCode4 + i2) * 31) + this.audioVolume;
    }

    public boolean isDataEquals(EffectDataModel effectDataModel) {
        if (effectDataModel != null && this.groupId == effectDataModel.groupId && TextUtils.equals(this.uniqueId, effectDataModel.uniqueId) && TextUtils.equals(this.mEffectPath, effectDataModel.mEffectPath) && this.effectLayerId == effectDataModel.effectLayerId && this.alpha == effectDataModel.alpha && this.audioVolume == effectDataModel.audioVolume && this.fileType == effectDataModel.fileType && this.isApplyByTheme == effectDataModel.isApplyByTheme) {
            VeRange veRange = this.mSrcVeRange;
            if (veRange == null ? effectDataModel.mSrcVeRange != null : !veRange.equals(effectDataModel.mSrcVeRange)) {
                return false;
            }
            VeRange veRange2 = this.mDestVeRange;
            if (veRange2 == null ? effectDataModel.mDestVeRange != null : !veRange2.equals(effectDataModel.mDestVeRange)) {
                return false;
            }
            VeRange veRange3 = this.mRawDestVeRange;
            if (veRange3 == null ? effectDataModel.mRawDestVeRange != null : !veRange3.equals(effectDataModel.mRawDestVeRange)) {
                return false;
            }
            EffectAudioInfo effectAudioInfo = this.mAudioInfo;
            if (effectAudioInfo == null ? effectDataModel.mAudioInfo != null : !effectAudioInfo.isDataEquals(effectDataModel.mAudioInfo)) {
                return false;
            }
            MosaicInfo mosaicInfo = this.mMosaicInfo;
            if (mosaicInfo == null ? effectDataModel.mMosaicInfo != null : !mosaicInfo.isDataEquals(effectDataModel.mMosaicInfo)) {
                return false;
            }
            SubtitleFontModel subtitleFontModel2 = this.subtitleFontModel;
            if (subtitleFontModel2 == null ? effectDataModel.subtitleFontModel != null : !subtitleFontModel2.isDataEquals(effectDataModel.subtitleFontModel)) {
                return false;
            }
            ScaleRotateViewState scaleRotateViewState = this.mScaleRotateViewState;
            if (scaleRotateViewState == null ? effectDataModel.mScaleRotateViewState != null : !scaleRotateViewState.isDataEquals(effectDataModel.mScaleRotateViewState)) {
                return false;
            }
            PipMixInfo pipMixInfo = this.mPipMixInfo;
            if (pipMixInfo == null ? effectDataModel.mPipMixInfo != null : !pipMixInfo.isDataEquals(effectDataModel.mPipMixInfo)) {
                return false;
            }
            TextAnimInfo textAnimInfo = this.mTextAnimInfo;
            if (textAnimInfo == null ? effectDataModel.mTextAnimInfo != null : !textAnimInfo.isDataEquals(effectDataModel.mTextAnimInfo)) {
                return false;
            }
            if (this.keyFrameRanges.size() != effectDataModel.keyFrameRanges.size()) {
                return false;
            }
            try {
                int size = this.keyFrameRanges.size();
                for (int i = 0; i < size; i++) {
                    if (!this.keyFrameRanges.get(i).isDataEquals(effectDataModel.keyFrameRanges.get(i))) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public String toString() {
        return "EffectDataModel{uniqueId='" + this.uniqueId + '\'' + ", createTime=" + this.createTime + ", groupId=" + this.groupId + ", mEffectPath='" + this.mEffectPath + '\'' + ", mSrcVeRange=" + this.mSrcVeRange + ", mDestVeRange=" + this.mDestVeRange + ", mRawDestVeRange=" + this.mRawDestVeRange + ", fileType=" + this.fileType + ", effectLayerId=" + this.effectLayerId + ", alpha=" + this.alpha + ", isHadAudio=" + this.isHadAudio + ", audioVolume=" + this.audioVolume + ", mAudioInfo=" + this.mAudioInfo + ", mScaleRotateViewState=" + this.mScaleRotateViewState + ", mMosaicInfo=" + this.mMosaicInfo + ", keyFrameRanges=" + this.keyFrameRanges + ", mPipMixInfo=" + this.mPipMixInfo.toString() + ", mTextAnimInfo=" + this.mTextAnimInfo.toString() + '}';
    }

    public static boolean isRecordListChange(List<EffectDataModel> list, List<EffectDataModel> list2) {
        if (list != null && list2 != null) {
            int size = list.size();
            int size2 = list2.size();
            if (size != size2) {
                return true;
            }
            for (int i = 0; i < size; i++) {
                EffectDataModel effectDataModel = list.get(i);
                if (effectDataModel == null || TextUtils.isEmpty(effectDataModel.getUniqueId()) || TextUtils.isEmpty(effectDataModel.getEffectPath()) || effectDataModel.getDestRange() == null) {
                    break;
                }
                for (int i2 = 0; i2 < size2; i2++) {
                    EffectDataModel effectDataModel2 = list2.get(i2);
                    if (effectDataModel2 == null || TextUtils.isEmpty(effectDataModel2.getUniqueId()) || TextUtils.isEmpty(effectDataModel2.getEffectPath()) || effectDataModel2.getDestRange() == null) {
                        return false;
                    }
                    if (effectDataModel.getUniqueId().equals(effectDataModel2.getUniqueId()) && !(effectDataModel.getEffectPath().equals(effectDataModel2.getEffectPath()) && effectDataModel.getDestRange().getmPosition() == effectDataModel2.getDestRange().getmPosition() && effectDataModel.getDestRange().getmTimeLength() == effectDataModel2.getDestRange().getmTimeLength())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public VeRange getSrcRange() {
        return this.mSrcVeRange;
    }

    public void setSrcRange(VeRange veRange) {
        this.mSrcVeRange = veRange;
    }

    public VeRange getDestRange() {
        return this.mDestVeRange;
    }

    public void setDestRange(VeRange veRange) {
        this.mDestVeRange = veRange;
    }

    public String getEffectPath() {
        return this.mEffectPath;
    }

    public void setEffectPath(String str) {
        this.mEffectPath = str;
    }

    public VeRange getRawDestRange() {
        return this.mRawDestVeRange;
    }

    public void setRawDestRange(VeRange veRange) {
        this.mRawDestVeRange = veRange;
    }

    public ScaleRotateViewState getScaleRotateViewState() {
        return this.mScaleRotateViewState;
    }

    public void setScaleRotateViewState(ScaleRotateViewState scaleRotateViewState) {
        this.mScaleRotateViewState = scaleRotateViewState;
    }

    public void setMosaicInfo(MosaicInfo mosaicInfo) {
        this.mMosaicInfo = mosaicInfo;
    }

    public ArrayList<EffectKeyFrameRange> getKeyFrameRanges() {
        return this.keyFrameRanges;
    }

    public void setKeyFrameRanges(ArrayList<EffectKeyFrameRange> arrayList) {
        this.keyFrameRanges = arrayList;
    }

    public void setPipMixInfo(PipMixInfo pipMixInfo) {
        this.mPipMixInfo = pipMixInfo;
    }

    public PipMixInfo getPipMixInfo() {
        return this.mPipMixInfo;
    }
}