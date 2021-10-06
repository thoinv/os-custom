package xiaoying.engine.clip;

public class QTransition {
    public static final int ANIMATED_CFG_AUTO = 4;
    public static final int ANIMATED_CFG_LEFT = 1;
    public static final int ANIMATED_CFG_RIGHT = 2;
    public static final int ANIMATED_CFG_TWO = 3;
    public static final int ANIMATED_CFG_ZERO = 0;
    private int animatedCfg = 0;
    private int cfgIndex = -1;
    private int duration = 0;
    private boolean setbyengine = false;
    private String template = null;

    public QTransition() {
    }

    public QTransition(String str, int i, int i2, int i3) {
        this.template = str;
        this.duration = i;
        this.animatedCfg = i2;
        this.setbyengine = false;
        this.cfgIndex = i3;
    }

    public QTransition(QTransition qTransition) {
        this.template = qTransition.template;
        this.duration = qTransition.duration;
        this.animatedCfg = qTransition.animatedCfg;
        this.setbyengine = qTransition.setbyengine;
        this.cfgIndex = qTransition.cfgIndex;
    }

    public String getTemplate() {
        return this.template;
    }

    public int getCfgIndex() {
        return this.cfgIndex;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getAnimatedCfg() {
        return this.animatedCfg;
    }

    public boolean isAutomatizm() {
        return this.setbyengine;
    }

    public void setTemplate(String str) {
        this.template = str;
    }

    public void setCfgIndex(int i) {
        this.cfgIndex = i;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setAnimatedCfg(int i) {
        this.animatedCfg = i;
    }

    public void setAutomatizm(boolean z) {
        this.setbyengine = z;
    }
}