package com.xioaying.base.b;

import android.content.Context;
import android.os.Environment;
import com.xiaojinzi.component.impl.service.c;
import com.xioaying.base.service.k;
import java.io.File;
import java.util.HashMap;
import kotlin.e.b.l;
import kotlin.l.g;

public final class b {
    public static final b lMb = new b();

    public static final File ns(Context context) {
        return a(context, null, 2, null);
    }

    private b() {
    }

    public static /* synthetic */ File a(Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return eg(context, str);
    }

    public static final File eg(Context context, String str) {
        File file;
        String path;
        l.r(context, "context");
        String externalStorageState = Environment.getExternalStorageState();
        if (l.areEqual("mounted", externalStorageState)) {
            file = context.getExternalFilesDir(str);
            if (file == null) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (externalStorageDirectory == null || (path = externalStorageDirectory.getPath()) == null) {
                    File filesDir = context.getFilesDir();
                    if (str == null) {
                        str = "";
                    }
                    return new File(filesDir, str);
                }
                String str2 = File.separator;
                l.p(str2, "File.separator");
                if (g.c(path, str2, false, 2, (Object) null)) {
                    String str3 = File.separator;
                    l.p(str3, "File.separator");
                    path = g.b(path, str3);
                }
                String packageName = context.getPackageName();
                l.p(packageName, "context.packageName");
                if (g.c(path, packageName, false, 2, (Object) null)) {
                    if (str == null) {
                        str = "";
                    }
                    file = new File(externalStorageDirectory, str);
                } else {
                    File filesDir2 = context.getFilesDir();
                    if (str == null) {
                        str = "";
                    }
                    file = new File(filesDir2, str);
                }
            }
            l.p(file, "context.getExternalFiles… ?: \"\")\n        }\n      }");
        } else {
            try {
                HashMap<String, String> hashMap = new HashMap<>();
                l.p(externalStorageState, "state");
                String externalStorageState2 = Environment.getExternalStorageState();
                l.p(externalStorageState2, "Environment.getExternalStorageState()");
                hashMap.put(externalStorageState, externalStorageState2);
                ((k) c.am(k.class)).onEvent("Storage_SD_Card_State", hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
            File filesDir3 = context.getFilesDir();
            if (str == null) {
                str = "";
            }
            file = new File(filesDir3, str);
        }
        return file;
    }
}