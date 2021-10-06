package xiaoying.engine.clip;

import xiaoying.utils.QRect;

public class QTrajectoryData {
    public static final int UPDATE_MODE_EXPAND = 1;
    public static final int UPDATE_MODE_REPLACE = 0;
    public QRect[] region = null;
    public float[] rotation = null;
    public int[] ts = null;
    public int updateMode = 0;
    public boolean useTimePos = true;
}