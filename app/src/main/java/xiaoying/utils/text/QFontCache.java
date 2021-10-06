package xiaoying.utils.text;

import android.graphics.Typeface;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class QFontCache {
    private static TextFontTypeFaceCache mxB = new TextFontTypeFaceCache();

    public static Typeface GetTypeFace(String str) {
        Typeface GetTypeFace;
        if (str == null) {
            return null;
        }
        synchronized (QFontCache.class) {
            GetTypeFace = mxB.GetTypeFace(str, 0);
        }
        return GetTypeFace;
    }

    public static Typeface GetTypeFace(String str, int i) {
        Typeface GetTypeFace;
        if (str == null) {
            return null;
        }
        synchronized (QFontCache.class) {
            GetTypeFace = mxB.GetTypeFace(str, i);
        }
        return GetTypeFace;
    }

    public static void Cleanup() {
        synchronized (QFontCache.class) {
            mxB.Clear();
        }
    }

    /* access modifiers changed from: private */
    public static boolean Ot(String str) {
        if (str == null || str.length() <= 0 || !new File(str).exists()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static class TextFontTypeFaceCache {
        private int mMaxSize;
        private Map<String, TypefaceItem> mxC;

        /* access modifiers changed from: private */
        public class TypefaceItem {
            private Typeface mxD;
            private Typeface mxE = null;
            private Typeface mxF = null;
            private Typeface mxG = null;
            private int weight = 0;

            public TypefaceItem(Typeface typeface) {
                this.mxD = typeface;
            }

            public void IncWeight() {
                this.weight++;
            }

            public int GetWeight() {
                return this.weight;
            }

            public Typeface GetFace() {
                return this.mxD;
            }

            public Typeface GetSubFace(int i) {
                Typeface typeface = this.mxD;
                if (typeface == null) {
                    return null;
                }
                if (i == 0) {
                    return typeface;
                }
                if (i == 1) {
                    if (this.mxE == null) {
                        this.mxE = PF(1);
                    }
                    return this.mxE;
                } else if (i == 2) {
                    if (this.mxF == null) {
                        this.mxF = PF(2);
                    }
                    return this.mxF;
                } else if (i != 3) {
                    return null;
                } else {
                    if (this.mxG == null) {
                        this.mxG = PF(3);
                    }
                    return this.mxG;
                }
            }

            private Typeface PF(int i) {
                try {
                    return Typeface.create(this.mxD, i);
                } catch (Exception unused) {
                    return null;
                }
            }
        }

        public TextFontTypeFaceCache(int i) {
            this.mxC = new HashMap();
            this.mMaxSize = i;
        }

        public TextFontTypeFaceCache() {
            this(6);
        }

        public void Clear() {
            this.mxC = new HashMap();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Typeface GetTypeFace(java.lang.String r8, int r9) {
            /*
            // Method dump skipped, instructions count: 121
            */
            throw new UnsupportedOperationException("Method not decompiled: xiaoying.utils.text.QFontCache.TextFontTypeFaceCache.GetTypeFace(java.lang.String, int):android.graphics.Typeface");
        }
    }
}