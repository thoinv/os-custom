package xiaoying.engine.base;

public class QDrawLayerPaintPen {
    public static final int EU_DRAW_LINE_DOTTED = 1;
    public static final int EU_DRAW_LINE_NORMAL = 0;
    public static final int EU_DRAW_PAINT_BRUSH = 3;
    public static final int EU_DRAW_PAINT_ERASURE = 5;
    public static final int EU_DRAW_PAINT_MARK_PEN = 4;
    public static final int EU_DRAW_PAINT_PEN = 1;
    public static final int EU_DRAW_PAINT_PENCIL = 0;
    public static final int EU_DRAW_PAINT_WATER_PEN = 2;
    public boolean bEnableLight = false;
    public float fDottedLine = 0.01f;
    public float fEdgeFeathering = 0.015f;
    public float fLightRadius = 0.02f;
    public float fLineThickness = 0.01f;
    public int nLightColor = -1;
    public int nLineColor = -1;
    public int nLineType = 0;
    public int nType;
}