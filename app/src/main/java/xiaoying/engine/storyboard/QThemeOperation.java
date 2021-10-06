package xiaoying.engine.storyboard;

public class QThemeOperation {
    public static int TYPE_ADD_COVER = 6;
    public static int TYPE_ADD_EFFECT = 1;
    public static int TYPE_ADD_FREEZE_FRAME = 15;
    public static int TYPE_ADD_FX = 11;
    public static int TYPE_ADD_MUSIC = 9;
    public static int TYPE_ADD_PASTER = 13;
    public static int TYPE_ADD_TEXT = 7;
    public static int TYPE_ADD_TRANSITION = 3;
    public static int TYPE_REMOVE_COVER = 5;
    public static int TYPE_REMOVE_EFFECT = 2;
    public static int TYPE_REMOVE_FREEZE_FRAME = 16;
    public static int TYPE_REMOVE_FX = 12;
    public static int TYPE_REMOVE_MUSIC = 10;
    public static int TYPE_REMOVE_PASTER = 14;
    public static int TYPE_REMOVE_TEXT = 8;
    public static int TYPE_REMOVE_TRANSITION = 4;
    private int clipIndex;
    private int effectGroupID;
    private int effectTrackType;
    private int errorCode;
    private boolean onStoryboard;
    private Object opData;
    private boolean opFinish;
    private int operationType;

    private QThemeOperation() {
        this.operationType = 0;
        this.onStoryboard = false;
        this.clipIndex = 0;
        this.effectTrackType = 0;
        this.effectGroupID = 0;
        this.errorCode = 0;
        this.opFinish = false;
        this.opData = null;
        this.operationType = 0;
        this.onStoryboard = false;
        this.clipIndex = 0;
        this.effectTrackType = 0;
        this.effectGroupID = 0;
    }

    public int getType() {
        return this.operationType;
    }

    public boolean operateOnStoryboard() {
        return this.onStoryboard;
    }

    public int getClipIndex() {
        return this.clipIndex;
    }

    public int getEffectTrackType() {
        return this.effectTrackType;
    }

    public int getEffectGroupID() {
        return this.effectGroupID;
    }

    public boolean operatorFinish() {
        return this.opFinish;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public Object getOperatorData() {
        return this.opData;
    }

    public void setEffectTrackType(int i) {
        this.effectTrackType = i;
    }

    public void setEffectGroupID(int i) {
        this.effectGroupID = i;
    }
}