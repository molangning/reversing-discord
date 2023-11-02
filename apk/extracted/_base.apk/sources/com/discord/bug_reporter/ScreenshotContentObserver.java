package com.discord.bug_reporter;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import co.discord.media_engine.C2689b;
import com.discord.logging.Log;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9536e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import p467zf.C14180c;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0003J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0014\u0010\u0019\u001a\u00020\u0017*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m14357d2 = {"Lcom/discord/bug_reporter/ScreenshotContentObserver;", "Landroid/database/ContentObserver;", "contentResolver", "Landroid/content/ContentResolver;", "onScreenshot", "Lkotlin/Function0;", "", "(Landroid/content/ContentResolver;Lkotlin/jvm/functions/Function0;)V", "getContentResolver", "()Landroid/content/ContentResolver;", "lastProcessedPath", "", "connect", "disconnect", "getProjection", "", "()[Ljava/lang/String;", "getScreenshotData", "Lcom/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData;", "uri", "Landroid/net/Uri;", "onChange", "selfChange", "", "process", "isWithinCurrentTimeWindow", "", "window", "Companion", "ScreenshotData", "bug_reporter_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ScreenshotContentObserver extends ContentObserver {
    public static final Companion Companion = new Companion(null);
    private static final long DEFAULT_DETECT_WINDOW_SECONDS = 10;
    public static final int IS_PENDING_TRUE = 1;
    private static final String SORT_ORDER = "date_added DESC";
    private final ContentResolver contentResolver;
    private String lastProcessedPath;
    private final Function0<Unit> onScreenshot;

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\u00020\n*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/bug_reporter/ScreenshotContentObserver$Companion;", "", "()V", "DEFAULT_DETECT_WINDOW_SECONDS", "", "IS_PENDING_TRUE", "", "SORT_ORDER", "", "isScreenshotPath", "", "bug_reporter_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isScreenshotPath(String str) {
            boolean m13731M;
            Locale locale = Locale.getDefault();
            C9612q.m13918g(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            C9612q.m13918g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            m13731M = C9654p.m13731M(lowerCase, "screenshots/", false, 2, null);
            return m13731M;
        }
    }

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m14357d2 = {"Lcom/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData;", "", "id", "", "fileName", "", "relativePath", "uri", "Landroid/net/Uri;", "dateAdded", "(JLjava/lang/String;Ljava/lang/String;Landroid/net/Uri;J)V", "getDateAdded", "()J", "getFileName", "()Ljava/lang/String;", "getId", "path", "getPath", "getRelativePath", "getUri", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "bug_reporter_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class ScreenshotData {
        private final long dateAdded;
        private final String fileName;

        /* renamed from: id */
        private final long f8199id;
        private final String path;
        private final String relativePath;
        private final Uri uri;

        public ScreenshotData(long j, String fileName, String relativePath, Uri uri, long j2) {
            C9612q.m13917h(fileName, "fileName");
            C9612q.m13917h(relativePath, "relativePath");
            C9612q.m13917h(uri, "uri");
            this.f8199id = j;
            this.fileName = fileName;
            this.relativePath = relativePath;
            this.uri = uri;
            this.dateAdded = j2;
            this.path = relativePath + "/" + fileName;
        }

        public final long component1() {
            return this.f8199id;
        }

        public final String component2() {
            return this.fileName;
        }

        public final String component3() {
            return this.relativePath;
        }

        public final Uri component4() {
            return this.uri;
        }

        public final long component5() {
            return this.dateAdded;
        }

        public final ScreenshotData copy(long j, String fileName, String relativePath, Uri uri, long j2) {
            C9612q.m13917h(fileName, "fileName");
            C9612q.m13917h(relativePath, "relativePath");
            C9612q.m13917h(uri, "uri");
            return new ScreenshotData(j, fileName, relativePath, uri, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ScreenshotData) {
                ScreenshotData screenshotData = (ScreenshotData) obj;
                return this.f8199id == screenshotData.f8199id && C9612q.m13922c(this.fileName, screenshotData.fileName) && C9612q.m13922c(this.relativePath, screenshotData.relativePath) && C9612q.m13922c(this.uri, screenshotData.uri) && this.dateAdded == screenshotData.dateAdded;
            }
            return false;
        }

        public final long getDateAdded() {
            return this.dateAdded;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final long getId() {
            return this.f8199id;
        }

        public final String getPath() {
            return this.path;
        }

        public final String getRelativePath() {
            return this.relativePath;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return (((((((C2689b.m32716a(this.f8199id) * 31) + this.fileName.hashCode()) * 31) + this.relativePath.hashCode()) * 31) + this.uri.hashCode()) * 31) + C2689b.m32716a(this.dateAdded);
        }

        public String toString() {
            long j = this.f8199id;
            String str = this.fileName;
            String str2 = this.relativePath;
            Uri uri = this.uri;
            long j2 = this.dateAdded;
            return "ScreenshotData(id=" + j + ", fileName=" + str + ", relativePath=" + str2 + ", uri=" + uri + ", dateAdded=" + j2 + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotContentObserver(ContentResolver contentResolver, Function0<Unit> onScreenshot) {
        super(null);
        C9612q.m13917h(contentResolver, "contentResolver");
        C9612q.m13917h(onScreenshot, "onScreenshot");
        this.contentResolver = contentResolver;
        this.onScreenshot = onScreenshot;
    }

    private final String[] getProjection() {
        String[] strArr;
        String[] strArr2;
        Object[] m14262p;
        Object[] m14262p2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            strArr = new String[]{"is_pending", "relative_path"};
        } else {
            strArr = new String[0];
        }
        if (i >= 29) {
            strArr2 = new String[]{"relative_path"};
        } else {
            strArr2 = new String[]{"_data"};
        }
        m14262p = C9536e.m14262p(new String[]{"_display_name", "date_added", "_id"}, strArr);
        m14262p2 = C9536e.m14262p(m14262p, strArr2);
        return (String[]) m14262p2;
    }

    @SuppressLint({"Range"})
    private final ScreenshotData getScreenshotData(Uri uri) {
        Cursor cursor;
        String m13716T0;
        Cursor query = this.contentResolver.query(uri, getProjection(), null, null, SORT_ORDER);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    cursor = query;
                } else {
                    cursor = null;
                }
                if (cursor != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 29) {
                        Integer valueOf = Integer.valueOf(query.getInt(query.getColumnIndex("is_pending")));
                        boolean z = true;
                        if (valueOf.intValue() != 1) {
                            z = false;
                        }
                        if (!z) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            valueOf.intValue();
                        } else {
                            C14180c.m514a(query, null);
                            return null;
                        }
                    }
                    if (i >= 29) {
                        m13716T0 = query.getString(query.getColumnIndex("relative_path"));
                    } else {
                        String string = query.getString(query.getColumnIndex("_data"));
                        C9612q.m13918g(string, "cursor.getString(cursor.…mages.ImageColumns.DATA))");
                        m13716T0 = C9654p.m13716T0(string, '/', null, 2, null);
                    }
                    String relativePath = m13716T0;
                    long j = query.getLong(query.getColumnIndex("_id"));
                    String string2 = query.getString(query.getColumnIndex("_display_name"));
                    C9612q.m13918g(string2, "cursor.getString(cursor.…ages.Media.DISPLAY_NAME))");
                    C9612q.m13918g(relativePath, "relativePath");
                    ScreenshotData screenshotData = new ScreenshotData(j, string2, relativePath, uri, query.getLong(query.getColumnIndex("date_added")));
                    C14180c.m514a(query, null);
                    return screenshotData;
                }
            } finally {
            }
        }
        C14180c.m514a(query, null);
        return null;
    }

    private final boolean isWithinCurrentTimeWindow(long j, long j2) {
        if (Math.abs((System.currentTimeMillis() / ((long) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)) - j) <= j2) {
            return true;
        }
        return false;
    }

    private final void process(Uri uri) {
        boolean m13753u;
        ScreenshotData screenshotData = getScreenshotData(uri);
        if (screenshotData == null) {
            return;
        }
        String str = this.lastProcessedPath;
        if (str != null) {
            m13753u = C9653o.m13753u(str, screenshotData.getPath(), false, 2, null);
            if (m13753u) {
                return;
            }
        }
        if (Companion.isScreenshotPath(screenshotData.getPath()) && isWithinCurrentTimeWindow(screenshotData.getDateAdded(), DEFAULT_DETECT_WINDOW_SECONDS)) {
            this.lastProcessedPath = screenshotData.getPath();
            this.onScreenshot.invoke();
        }
    }

    public final void connect() {
        this.contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this);
    }

    public final void disconnect() {
        this.contentResolver.unregisterContentObserver(this);
    }

    public final ContentResolver getContentResolver() {
        return this.contentResolver;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        boolean m13758H;
        super.onChange(z, uri);
        if (uri == null) {
            return;
        }
        String uri2 = uri.toString();
        C9612q.m13918g(uri2, "uri.toString()");
        String uri3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
        C9612q.m13918g(uri3, "EXTERNAL_CONTENT_URI.toString()");
        m13758H = C9653o.m13758H(uri2, uri3, false, 2, null);
        if (m13758H) {
            try {
                process(uri);
            } catch (Exception e) {
                Log.INSTANCE.m31912e("ScreenshotObserver", "Screenshot error", e);
            }
        }
    }
}
