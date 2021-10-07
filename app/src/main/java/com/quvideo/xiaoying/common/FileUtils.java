package com.quvideo.xiaoying.common;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.xiaoying.support.ktx.a;
import com.xioaying.base.b.b;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Locale;
import xiaoying.utils.QStreamAssets;

public class FileUtils {
    public static final File[] EMPTY_FILE_ARRAY = new File[0];
    public static final BigInteger ONE_EB_BI;
    public static final BigInteger ONE_GB_BI;
    public static final BigInteger ONE_KB_BI;
    public static final BigInteger ONE_MB_BI;
    public static final BigInteger ONE_PB_BI;
    public static final BigInteger ONE_TB_BI;
    public static final BigInteger ONE_YB;
    public static final BigInteger ONE_ZB;
    public static final Charset UTF8 = Charset.forName("UTF-8");

    public interface CopyFolderCallback {
        void onProgressListener(int i);
    }

    public interface FileNumCallback {
        void onNumChangeListener(int i);
    }

    static {
        BigInteger valueOf = BigInteger.valueOf(1024);
        ONE_KB_BI = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        ONE_MB_BI = multiply;
        BigInteger multiply2 = ONE_KB_BI.multiply(multiply);
        ONE_GB_BI = multiply2;
        BigInteger multiply3 = ONE_KB_BI.multiply(multiply2);
        ONE_TB_BI = multiply3;
        BigInteger multiply4 = ONE_KB_BI.multiply(multiply3);
        ONE_PB_BI = multiply4;
        ONE_EB_BI = ONE_KB_BI.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(1024).multiply(BigInteger.valueOf(1152921504606846976L));
        ONE_ZB = multiply5;
        ONE_YB = ONE_KB_BI.multiply(multiply5);
    }

    public static void deleteFolderSubFiles(String str, FilenameFilter filenameFilter) {
        File[] listFiles;
        File file = new File(str);
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles(filenameFilter)) != null && listFiles.length > 0) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isFile()) {
                    listFiles[i].delete();
                }
            }
        }
    }

    public static String getFreeFileName(String str, String str2, String str3, int i) {
        if (str == null || str2 == null || str3 == null) {
            return null;
        }
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        if (!str2.endsWith("_")) {
            String str4 = str + str2 + str3;
            if (!isFileExisted(str4)) {
                return str4;
            }
            str2 = str2 + "_";
            if (i == 0) {
                i = 1;
            }
        }
        while (true) {
            String format = String.format(Locale.US, "%s%s%d%s", str, str2, Integer.valueOf(i), str3);
            if (!isFileExisted(format)) {
                return format;
            }
            i++;
        }
    }

    public static boolean isFileExisted(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith(QStreamAssets.ASSETS_THEME)) {
            String substring = str.substring(17);
            if (TextUtils.isEmpty(substring)) {
                return false;
            }
            return ResourceUtils.isAssetsFileExisted(ResourceUtils.mAssetsManager, substring);
        }
        File file = new File(str);
        if (!file.isFile() || !file.exists()) {
            return false;
        }
        return true;
    }

    public static boolean isDirectoryExisted(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        return true;
    }

    public static boolean deleteFiles(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            deleteFile(str);
        }
        return true;
    }

    public static boolean deleteFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.isFile()) {
            try {
                file.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean fileExisted(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static boolean deleteDirectory(String str) {
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return true;
            }
            boolean z = true;
            for (int i = 0; i < listFiles.length; i++) {
                if (!listFiles[i].isFile()) {
                    z = deleteDirectory(listFiles[i].getAbsolutePath());
                    if (!z) {
                        break;
                    }
                } else {
                    z = deleteFile(listFiles[i].getAbsolutePath());
                    if (!z) {
                        break;
                    }
                }
            }
            if (z && file.delete()) {
                return true;
            }
        }
        return false;
    }

    public static boolean copyDirectory(String str, String str2, CopyFolderCallback copyFolderCallback) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!str.endsWith(File.separator)) {
                str = str + File.separator;
            }
            if (!str2.endsWith(File.separator)) {
                str2 = str2 + File.separator;
            }
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                String[] list = file.list();
                if (list == null) {
                    return true;
                }
                int i = 0;
                boolean z = true;
                for (int i2 = 0; i2 < list.length; i2++) {
                    if (!new File(str + list[i2]).isFile()) {
                        createMultilevelDirectory(str2 + list[i2] + File.separator);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(list[i2]);
                        z = copyDirectory(sb.toString(), str2 + list[i2], copyFolderCallback);
                        if (!z) {
                            break;
                        }
                    } else {
                        z = copyAndCheckFile(str + list[i2], str2 + list[i2]);
                        if (!z) {
                            break;
                        } else if (copyFolderCallback != null) {
                            i++;
                            copyFolderCallback.onProgressListener(i);
                        }
                    }
                }
                return z;
            }
        }
        return false;
    }

    public static boolean copyDirectory(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!str.endsWith(File.separator)) {
                str = str + File.separator;
            }
            if (!str2.endsWith(File.separator)) {
                str2 = str2 + File.separator;
            }
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                String[] list = file.list();
                boolean z = true;
                if (list != null) {
                    for (int i = 0; i < list.length; i++) {
                        if (!new File(str + list[i]).isFile()) {
                            createMultilevelDirectory(str2 + list[i] + File.separator);
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(list[i]);
                            z = copyDirectory(sb.toString(), str2 + list[i]);
                            if (!z) {
                                break;
                            }
                        } else {
                            z = copyFile(str + list[i], str2 + list[i]);
                            if (!z) {
                                break;
                            }
                        }
                    }
                }
                return z;
            }
        }
        return false;
    }

    public static boolean renameFile(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str);
            File file2 = new File(str2);
            if (!file.isFile() || !file.renameTo(file2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean renameFile(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                String[] list = file.list();
                boolean z = true;
                for (String str4 : list) {
                    if (new File(str + str4).isFile() && str4.contains(str2)) {
                        z &= renameFile(str + str4, str + str4.replace(str2, str3));
                        if (!z) {
                            return false;
                        }
                    }
                }
                return z;
            }
        }
        return false;
    }

    public static boolean folderExit(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0079 A[SYNTHETIC, Splitter:B:48:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0083 A[SYNTHETIC, Splitter:B:53:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x008f A[SYNTHETIC, Splitter:B:60:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0099 A[SYNTHETIC, Splitter:B:65:0x0099] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copyFile(java.lang.String r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quvideo.xiaoying.common.FileUtils.copyFile(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x009c A[SYNTHETIC, Splitter:B:55:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a6 A[SYNTHETIC, Splitter:B:60:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b2 A[SYNTHETIC, Splitter:B:67:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00bc A[SYNTHETIC, Splitter:B:72:0x00bc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copyAndCheckFile(java.lang.String r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quvideo.xiaoying.common.FileUtils.copyAndCheckFile(java.lang.String, java.lang.String):boolean");
    }

    public static boolean copyFile(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null || outputStream == null) {
            return false;
        }
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public static long fileSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return sizeOf(new File(str));
    }

    public static boolean createMultilevelDirectory(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            return true;
        }
        file.mkdirs();
        File file2 = new File(str);
        if (!file2.exists() || !file2.isDirectory()) {
            return false;
        }
        return true;
    }

    public static String getFileType(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(InstructionFileId.DOT)) >= 0) {
            return str.substring(lastIndexOf + 1).toUpperCase();
        }
        return null;
    }

    public static long getFileDate(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file.lastModified();
        }
        return 0;
    }

    public static long getFreeSpace(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String absolutePath = b.ns(a.getApp()).getAbsolutePath();
        if (str.startsWith(absolutePath)) {
            return new File(absolutePath).getUsableSpace();
        }
        File file = new File(str);
        while (true) {
            if (!file.exists()) {
                file = file.getParentFile();
                if (file != null) {
                    if (file.getAbsolutePath().equals(File.separator)) {
                        break;
                    }
                } else {
                    file = new File(File.separator);
                    break;
                }
            } else {
                break;
            }
        }
        return file.getUsableSpace();
    }

    public static String ext(String str) {
        int lastIndexOf = str.lastIndexOf(InstructionFileId.DOT);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static long sizeOfDirectory(File file) {
        try {
            Q(file);
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return 0;
            }
            long j = 0;
            for (File file2 : listFiles) {
                try {
                    if (!isSymlink(file2)) {
                        j += sizeOf(file2);
                        if (j < 0) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (IOException unused) {
                }
            }
            return j;
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static long sizeOfDirectory(File file, FileNumCallback fileNumCallback) {
        try {
            Q(file);
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return 0;
            }
            long j = 0;
            int i = 0;
            for (File file2 : listFiles) {
                try {
                    if (!isSymlink(file2)) {
                        j += sizeOf(file2);
                        if (fileNumCallback != null) {
                            i++;
                            fileNumCallback.onNumChangeListener(i);
                        }
                        if (j < 0) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (IOException unused) {
                }
            }
            return j;
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static long sizeOf(File file) {
        if (!file.exists()) {
            return 0;
        }
        if (file.isDirectory()) {
            return sizeOfDirectory(file);
        }
        return file.length();
    }

    private static void Q(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    public static boolean isSymlink(File file) throws IOException {
        if (file != null) {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            return !file.getCanonicalFile().equals(file.getAbsoluteFile());
        }
        throw new NullPointerException("File must not be null");
    }

    public static String formatFileSize(long j) {
        if (j < 1024) {
            return String.format(Locale.US, "%d B", Integer.valueOf((int) j));
        } else if (j < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return String.format(Locale.US, "%.2f KB", Float.valueOf(((float) j) / ((float) 1024)));
        } else if (j < Constants.GB) {
            return String.format(Locale.US, "%.2f MB", Float.valueOf(((float) j) / ((float) PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)));
        } else {
            return String.format(Locale.US, "%.2f GB", Float.valueOf(((float) j) / ((float) Constants.GB)));
        }
    }

    public static String getFileName(String str) {
        int lastIndexOf;
        String name = new File(str).getName();
        return (TextUtils.isEmpty(name) || (lastIndexOf = name.lastIndexOf(InstructionFileId.DOT)) <= 0) ? name : name.substring(0, lastIndexOf);
    }

    public static String getFileNameWithFormat(String str) {
        return new File(str).getName();
    }

    public static String getFileNameWithExt(String str) {
        if (str == null) {
            return null;
        }
        if (str.endsWith(File.separator)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(File.separator);
        return lastIndexOf > 0 ? str.substring(lastIndexOf + 1) : str;
    }

    public static String getFileParentPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            int lastIndexOf = str.lastIndexOf(File.separator);
            if (lastIndexOf <= 0) {
                return "";
            }
            return str.substring(0, lastIndexOf) + "/";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getFileNameFromAbPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            int lastIndexOf = str.lastIndexOf(File.separator) + 1;
            int lastIndexOf2 = str.lastIndexOf(46);
            if (lastIndexOf <= 0 || lastIndexOf2 <= 0 || lastIndexOf >= lastIndexOf2) {
                return "";
            }
            return str.substring(lastIndexOf, lastIndexOf2);
        } catch (Exception e) {
            LogUtilsV2.e("exception ex=" + e.getMessage());
            return "";
        }
    }

    public static String getFileExtFromAbPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf > 0) {
                return str.substring(lastIndexOf);
            }
            return "";
        } catch (Exception e) {
            LogUtilsV2.e("exception ex=" + e.getMessage());
            return "";
        }
    }
}