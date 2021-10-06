package com.b.a;

import static kotlin.e.b.l.checkNotNull;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class c implements f {
    private final Handler handler;

    public c(Handler handler2) {
        this.handler = handler2;
    }

    @Override // com.b.a.f
    public void f(int i, String str, String str2) {
        checkNotNull(str2);
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(i, str2));
    }

    static class a extends Handler {
        private final String dIK;
        private final int maxFileSize;

        a(Looper looper, String str, int i) {
            super(looper);
            this.dIK = (String) str;
            this.maxFileSize = i;
        }

        public void handleMessage(Message message) {
            String str = (String) message.obj;
            FileWriter fileWriter = null;
            try {
                FileWriter fileWriter2 = new FileWriter(ay(this.dIK, "logs"), true);
                try {
                    a(fileWriter2, str);
                    fileWriter2.flush();
                    fileWriter2.close();
                } catch (IOException unused) {
                    fileWriter = fileWriter2;
                }
            } catch (IOException unused2) {
                if (fileWriter != null) {
                    try {
                        fileWriter.flush();
                        fileWriter.close();
                    } catch (IOException unused3) {
                    }
                }
            }
        }

        private void a(FileWriter fileWriter, String str) throws IOException {
            checkNotNull(fileWriter);
            checkNotNull(str);
            fileWriter.append((CharSequence) str);
        }

        private File ay(String str, String str2) {
            checkNotNull(str);
            checkNotNull(str2);
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = null;
            File file3 = new File(file, String.format("%s_%s.csv", str2, 0));
            int i = 0;
            while (true) {
                file2 = file3;
                if (!file2.exists()) {
                    break;
                }
                i++;
                file3 = new File(file, String.format("%s_%s.csv", str2, Integer.valueOf(i)));
            }
            return (file2 == null || file2.length() >= ((long) this.maxFileSize)) ? file2 : file2;
        }
    }
}