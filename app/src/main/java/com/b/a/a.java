package com.b.a;

import android.os.Environment;
import android.os.HandlerThread;
import com.b.a.c;
import com.quvideo.xiaoying.router.editor.EditorRouter;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class a implements d {
    private static final String NEW_LINE = System.getProperty("line.separator");
    private final f dII;
    private final Date date;
    private final SimpleDateFormat dlE;
    private final String tag;

    private a(C0125a aVar) {
        j.checkNotNull(aVar);
        this.date = aVar.date;
        this.dlE = aVar.dlE;
        this.dII = aVar.dII;
        this.tag = aVar.tag;
    }

    public static C0125a arZ() {
        return new C0125a();
    }

    @Override // com.b.a.d
    public void f(int i, String str, String str2) {
        j.checkNotNull(str2);
        String iy = iy(str);
        this.date.setTime(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(this.date.getTime()));
        sb.append(EditorRouter.KEY_TOOL_LIST_ORDER_SPLIT_OP);
        sb.append(this.dlE.format(this.date));
        sb.append(EditorRouter.KEY_TOOL_LIST_ORDER_SPLIT_OP);
        sb.append(j.ow(i));
        sb.append(EditorRouter.KEY_TOOL_LIST_ORDER_SPLIT_OP);
        sb.append(iy);
        if (str2.contains(NEW_LINE)) {
            str2 = str2.replaceAll(NEW_LINE, " <br> ");
        }
        sb.append(EditorRouter.KEY_TOOL_LIST_ORDER_SPLIT_OP);
        sb.append(str2);
        sb.append(NEW_LINE);
        this.dII.f(i, iy, sb.toString());
    }

    private String iy(String str) {
        if (j.isEmpty(str) || j.equals(this.tag, str)) {
            return this.tag;
        }
        return this.tag + "-" + str;
    }

    /* renamed from: com.b.a.a$a  reason: collision with other inner class name */
    public static final class C0125a {
        f dII;
        Date date;
        SimpleDateFormat dlE;
        String tag;

        private C0125a() {
            this.tag = "PRETTY_LOGGER";
        }

        public a asa() {
            if (this.date == null) {
                this.date = new Date();
            }
            if (this.dlE == null) {
                this.dlE = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS", Locale.UK);
            }
            if (this.dII == null) {
                String str = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separatorChar + "logger";
                HandlerThread handlerThread = new HandlerThread("AndroidFileLogger." + str);
                handlerThread.start();
                this.dII = new c(new c.a(handlerThread.getLooper(), str, 512000));
            }
            return new a(this);
        }
    }
}