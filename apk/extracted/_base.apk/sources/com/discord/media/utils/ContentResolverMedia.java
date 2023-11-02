package com.discord.media.utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import co.discord.media_engine.C2689b;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.reactnativecommunity.webview.RNCWebViewManager;
import gg.C6759j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.webrtc.MediaStreamTrack;
import p304qf.AbstractC11883p;
import p467zf.C14180c;
import pf.C11581q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000 /2\u00020\u0001:\u0005./012BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003Jg\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\fHÖ\u0001J\t\u0010-\u001a\u00020\tHÖ\u0001R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00063"}, m14357d2 = {"Lcom/discord/media/utils/ContentResolverMedia;", "", "id", "", "uri", "Landroid/net/Uri;", "mediaType", "Lcom/discord/media/utils/ContentResolverMedia$MediaType;", "mimeType", "", ZeroconfModule.KEY_SERVICE_NAME, "duration", "", "dateAdded", "width", "height", "(JLandroid/net/Uri;Lcom/discord/media/utils/ContentResolverMedia$MediaType;Ljava/lang/String;Ljava/lang/String;IIII)V", "getDateAdded", "()I", "getDuration", "getHeight", "getId", "()J", "getMediaType", "()Lcom/discord/media/utils/ContentResolverMedia$MediaType;", "getMimeType", "()Ljava/lang/String;", "getName", "getUri", "()Landroid/net/Uri;", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Column", "Companion", "MediaType", "QueryColumns", "QueryType", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class ContentResolverMedia {
    public static final Companion Companion = new Companion(null);
    private final int dateAdded;
    private final int duration;
    private final int height;

    /* renamed from: id */
    private final long f8907id;
    private final MediaType mediaType;
    private final String mimeType;
    private final String name;
    private final Uri uri;
    private final int width;

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/media/utils/ContentResolverMedia$Column;", "", "field", "", "(Ljava/lang/String;)V", "columnIndex", "", "getField", "()Ljava/lang/String;", "getColumnIndex", "", "cursor", "Landroid/database/Cursor;", "getInt", "getLong", "", "getString", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Column {
        private Number columnIndex;
        private final String field;

        public Column(String field) {
            C9612q.m13917h(field, "field");
            this.field = field;
        }

        private final int getColumnIndex(Cursor cursor) {
            if (this.columnIndex == null) {
                this.columnIndex = Integer.valueOf(cursor.getColumnIndexOrThrow(this.field));
            }
            Number number = this.columnIndex;
            if (number == null) {
                C9612q.m13900y("columnIndex");
                number = null;
            }
            return number.intValue();
        }

        public final String getField() {
            return this.field;
        }

        public final int getInt(Cursor cursor) {
            C9612q.m13917h(cursor, "cursor");
            return cursor.getInt(getColumnIndex(cursor));
        }

        public final long getLong(Cursor cursor) {
            C9612q.m13917h(cursor, "cursor");
            return cursor.getLong(getColumnIndex(cursor));
        }

        public final String getString(Cursor cursor) {
            C9612q.m13917h(cursor, "cursor");
            return cursor.getString(getColumnIndex(cursor));
        }
    }

    @Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0003J=\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/media/utils/ContentResolverMedia$Companion;", "", "()V", "getMedia", "", "Lcom/discord/media/utils/ContentResolverMedia;", "context", "Landroid/content/Context;", "queryType", "Lcom/discord/media/utils/ContentResolverMedia$QueryType;", "queryLimit", "", "queryOffset", "(Landroid/content/Context;Lcom/discord/media/utils/ContentResolverMedia$QueryType;ILjava/lang/Integer;)Ljava/util/List;", "isAtLeastQ", "", "queryMedia", "queryUri", "Landroid/net/Uri;", "(Landroid/content/Context;Lcom/discord/media/utils/ContentResolverMedia$QueryType;ILandroid/net/Uri;Ljava/lang/Integer;)Ljava/util/List;", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isAtLeastQ() {
            return Build.VERSION.SDK_INT >= 29;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<ContentResolverMedia> queryMedia(Context context, QueryType queryType, int i, Uri uri, Integer num) {
            QueryColumns queryColumns;
            String str;
            IntRange m21916q;
            int m14093t;
            List<ContentResolverMedia> m14104i;
            if (isAtLeastQ() && !queryType.shouldIncludeVideo()) {
                queryColumns = new QueryColumns(null, null, null, null, null, null, null, null, 127, null);
            } else if (!isAtLeastQ() && !uri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                queryColumns = new QueryColumns(null, null, null, null, null, null, null, null, 63, null);
            } else if (!isAtLeastQ() && uri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                queryColumns = new QueryColumns(null, null, null, null, null, null, null, null, 191, null);
            } else {
                queryColumns = new QueryColumns(null, null, null, null, null, null, null, null, 255, null);
            }
            ContentResolverUtils contentResolverUtils = ContentResolverUtils.INSTANCE;
            ContentResolver contentResolver = context.getContentResolver();
            C9612q.m13918g(contentResolver, "context.contentResolver");
            String[] projection = queryColumns.getProjection();
            if (isAtLeastQ()) {
                str = queryType.getSelection();
            } else {
                str = null;
            }
            Cursor queryCompat = contentResolverUtils.queryCompat(contentResolver, uri, projection, i, "date_added DESC", str, num);
            if (queryCompat != null) {
                try {
                    m21916q = C6759j.m21916q(0, queryCompat.getCount());
                    m14093t = C9546k.m14093t(m21916q, 10);
                    ArrayList arrayList = new ArrayList(m14093t);
                    Iterator<Integer> it = m21916q.iterator();
                    while (it.hasNext()) {
                        queryCompat.moveToPosition(((AbstractC11883p) it).nextInt());
                        arrayList.add(queryColumns.getContentResolverMedia(uri, queryCompat));
                    }
                    C14180c.m514a(queryCompat, null);
                    return arrayList;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C14180c.m514a(queryCompat, th2);
                        throw th3;
                    }
                }
            }
            m14104i = C9545j.m14104i();
            return m14104i;
        }

        public final List<ContentResolverMedia> getMedia(Context context, QueryType queryType, int i, Integer num) {
            List<? extends ContentResolverMedia> m14104i;
            List<? extends ContentResolverMedia> m14104i2;
            List m14110c;
            List<ContentResolverMedia> m14112a;
            C9612q.m13917h(context, "context");
            C9612q.m13917h(queryType, "queryType");
            ContentResolverMedia$Companion$getMedia$performQuery$1 contentResolverMedia$Companion$getMedia$performQuery$1 = new ContentResolverMedia$Companion$getMedia$performQuery$1(context, queryType, i, num);
            if (isAtLeastQ()) {
                Uri contentUri = MediaStore.Files.getContentUri("external");
                C9612q.m13918g(contentUri, "getContentUri(MediaStore.VOLUME_EXTERNAL)");
                return (List) contentResolverMedia$Companion$getMedia$performQuery$1.invoke((ContentResolverMedia$Companion$getMedia$performQuery$1) contentUri);
            }
            if (queryType.shouldIncludeImages()) {
                Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                C9612q.m13918g(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                m14104i = contentResolverMedia$Companion$getMedia$performQuery$1.invoke((ContentResolverMedia$Companion$getMedia$performQuery$1) EXTERNAL_CONTENT_URI);
            } else {
                m14104i = C9545j.m14104i();
            }
            if (queryType.shouldIncludeVideo()) {
                Uri EXTERNAL_CONTENT_URI2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                C9612q.m13918g(EXTERNAL_CONTENT_URI2, "EXTERNAL_CONTENT_URI");
                m14104i2 = contentResolverMedia$Companion$getMedia$performQuery$1.invoke((ContentResolverMedia$Companion$getMedia$performQuery$1) EXTERNAL_CONTENT_URI2);
            } else {
                m14104i2 = C9545j.m14104i();
            }
            m14110c = C9544i.m14110c();
            m14110c.addAll(m14104i);
            m14110c.addAll(m14104i2);
            m14112a = C9544i.m14112a(m14110c);
            return m14112a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/media/utils/ContentResolverMedia$MediaType;", "", "(Ljava/lang/String;I)V", "toString", "", "IMAGE", "VIDEO", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public enum MediaType {
        IMAGE,
        VIDEO;

        @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MediaType.values().length];
                try {
                    iArr[MediaType.IMAGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MediaType.VIDEO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "ALAssetTypeVideo";
                }
                throw new C11581q();
            }
            return "ALAssetTypePhoto";
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m14357d2 = {"Lcom/discord/media/utils/ContentResolverMedia$QueryType;", "", "(Ljava/lang/String;I)V", "getSelection", "", "shouldIncludeImages", "", "shouldIncludeVideo", "ALL", "IMAGE", "VIDEO", "Companion", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public enum QueryType {
        ALL,
        IMAGE,
        VIDEO;
        
        public static final Companion Companion = new Companion(null);
        private static final List<String> UNSUPPORTED_IMAGE_MIME_TYPES;

        @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;", "", "()V", "UNSUPPORTED_IMAGE_MIME_TYPES", "", "", "getUnsupportedImageMimeTypes", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final String getUnsupportedImageMimeTypes() {
                String m14046d0;
                m14046d0 = C9553r.m14046d0(QueryType.UNSUPPORTED_IMAGE_MIME_TYPES, ",", null, null, 0, null, C3288x69014d2f.INSTANCE, 30, null);
                return m14046d0;
            }
        }

        static {
            List<String> m14109d;
            m14109d = C9544i.m14109d("image/x-adobe-dng");
            UNSUPPORTED_IMAGE_MIME_TYPES = m14109d;
        }

        public final String getSelection() {
            String str;
            List m14099n;
            String m14046d0;
            String str2 = null;
            if (shouldIncludeImages()) {
                str = "media_type=1 AND mime_type NOT IN (" + Companion.getUnsupportedImageMimeTypes() + ")";
            } else {
                str = null;
            }
            if (shouldIncludeVideo()) {
                str2 = "media_type = 3";
            }
            m14099n = C9545j.m14099n(str, str2);
            m14046d0 = C9553r.m14046d0(m14099n, " OR ", null, null, 0, null, null, 62, null);
            return m14046d0;
        }

        public final boolean shouldIncludeImages() {
            return this == ALL || this == IMAGE;
        }

        public final boolean shouldIncludeVideo() {
            return this == ALL || this == VIDEO;
        }
    }

    public ContentResolverMedia(long j, Uri uri, MediaType mediaType, String str, String str2, int i, int i2, int i3, int i4) {
        C9612q.m13917h(uri, "uri");
        C9612q.m13917h(mediaType, "mediaType");
        this.f8907id = j;
        this.uri = uri;
        this.mediaType = mediaType;
        this.mimeType = str;
        this.name = str2;
        this.duration = i;
        this.dateAdded = i2;
        this.width = i3;
        this.height = i4;
    }

    public final long component1() {
        return this.f8907id;
    }

    public final Uri component2() {
        return this.uri;
    }

    public final MediaType component3() {
        return this.mediaType;
    }

    public final String component4() {
        return this.mimeType;
    }

    public final String component5() {
        return this.name;
    }

    public final int component6() {
        return this.duration;
    }

    public final int component7() {
        return this.dateAdded;
    }

    public final int component8() {
        return this.width;
    }

    public final int component9() {
        return this.height;
    }

    public final ContentResolverMedia copy(long j, Uri uri, MediaType mediaType, String str, String str2, int i, int i2, int i3, int i4) {
        C9612q.m13917h(uri, "uri");
        C9612q.m13917h(mediaType, "mediaType");
        return new ContentResolverMedia(j, uri, mediaType, str, str2, i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContentResolverMedia) {
            ContentResolverMedia contentResolverMedia = (ContentResolverMedia) obj;
            return this.f8907id == contentResolverMedia.f8907id && C9612q.m13922c(this.uri, contentResolverMedia.uri) && this.mediaType == contentResolverMedia.mediaType && C9612q.m13922c(this.mimeType, contentResolverMedia.mimeType) && C9612q.m13922c(this.name, contentResolverMedia.name) && this.duration == contentResolverMedia.duration && this.dateAdded == contentResolverMedia.dateAdded && this.width == contentResolverMedia.width && this.height == contentResolverMedia.height;
        }
        return false;
    }

    public final int getDateAdded() {
        return this.dateAdded;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.f8907id;
    }

    public final MediaType getMediaType() {
        return this.mediaType;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int m32716a = ((((C2689b.m32716a(this.f8907id) * 31) + this.uri.hashCode()) * 31) + this.mediaType.hashCode()) * 31;
        String str = this.mimeType;
        int hashCode = (m32716a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        return ((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.duration) * 31) + this.dateAdded) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        long j = this.f8907id;
        Uri uri = this.uri;
        MediaType mediaType = this.mediaType;
        String str = this.mimeType;
        String str2 = this.name;
        int i = this.duration;
        int i2 = this.dateAdded;
        int i3 = this.width;
        int i4 = this.height;
        return "ContentResolverMedia(id=" + j + ", uri=" + uri + ", mediaType=" + mediaType + ", mimeType=" + str + ", name=" + str2 + ", duration=" + i + ", dateAdded=" + i2 + ", width=" + i3 + ", height=" + i4 + ")";
    }

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0011\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\u0010\u0015R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;", "", "queryColumnId", "Lcom/discord/media/utils/ContentResolverMedia$Column;", "queryColumnDisplayName", "queryColumnMimeType", "queryColumnWidth", "queryColumnHeight", "queryColumnDateAdded", "queryMediaType", "queryColumnDuration", "(Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;)V", "getContentResolverMedia", "Lcom/discord/media/utils/ContentResolverMedia;", "queryUri", "Landroid/net/Uri;", "cursor", "Landroid/database/Cursor;", "getProjection", "", "", "()[Ljava/lang/String;", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class QueryColumns {
        private final Column queryColumnDateAdded;
        private final Column queryColumnDisplayName;
        private final Column queryColumnDuration;
        private final Column queryColumnHeight;
        private final Column queryColumnId;
        private final Column queryColumnMimeType;
        private final Column queryColumnWidth;
        private final Column queryMediaType;

        public QueryColumns() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public QueryColumns(Column queryColumnId, Column queryColumnDisplayName, Column queryColumnMimeType, Column queryColumnWidth, Column queryColumnHeight, Column queryColumnDateAdded, Column column, Column column2) {
            C9612q.m13917h(queryColumnId, "queryColumnId");
            C9612q.m13917h(queryColumnDisplayName, "queryColumnDisplayName");
            C9612q.m13917h(queryColumnMimeType, "queryColumnMimeType");
            C9612q.m13917h(queryColumnWidth, "queryColumnWidth");
            C9612q.m13917h(queryColumnHeight, "queryColumnHeight");
            C9612q.m13917h(queryColumnDateAdded, "queryColumnDateAdded");
            this.queryColumnId = queryColumnId;
            this.queryColumnDisplayName = queryColumnDisplayName;
            this.queryColumnMimeType = queryColumnMimeType;
            this.queryColumnWidth = queryColumnWidth;
            this.queryColumnHeight = queryColumnHeight;
            this.queryColumnDateAdded = queryColumnDateAdded;
            this.queryMediaType = column;
            this.queryColumnDuration = column2;
        }

        public final ContentResolverMedia getContentResolverMedia(Uri queryUri, Cursor cursor) {
            boolean z;
            MediaType mediaType;
            boolean z2;
            C9612q.m13917h(queryUri, "queryUri");
            C9612q.m13917h(cursor, "cursor");
            Column column = this.queryMediaType;
            boolean z3 = true;
            int i = 0;
            if (column != null && column.getInt(cursor) == 3) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                List<String> pathSegments = queryUri.getPathSegments();
                if (pathSegments != null && pathSegments.contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z3 = false;
                }
            }
            long j = this.queryColumnId.getLong(cursor);
            Uri withAppendedId = ContentUris.withAppendedId(queryUri, this.queryColumnId.getLong(cursor));
            C9612q.m13918g(withAppendedId, "withAppendedId(queryUri,…ColumnId.getLong(cursor))");
            if (z3) {
                mediaType = MediaType.VIDEO;
            } else {
                mediaType = MediaType.IMAGE;
            }
            MediaType mediaType2 = mediaType;
            String string = this.queryColumnMimeType.getString(cursor);
            String string2 = this.queryColumnDisplayName.getString(cursor);
            Column column2 = this.queryColumnDuration;
            if (column2 != null) {
                i = column2.getInt(cursor);
            }
            return new ContentResolverMedia(j, withAppendedId, mediaType2, string, string2, i / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.queryColumnDateAdded.getInt(cursor), this.queryColumnWidth.getInt(cursor), this.queryColumnHeight.getInt(cursor));
        }

        public final String[] getProjection() {
            String str;
            List m14099n;
            String[] strArr = new String[8];
            strArr[0] = this.queryColumnId.getField();
            strArr[1] = this.queryColumnDisplayName.getField();
            strArr[2] = this.queryColumnMimeType.getField();
            strArr[3] = this.queryColumnWidth.getField();
            strArr[4] = this.queryColumnHeight.getField();
            strArr[5] = this.queryColumnDateAdded.getField();
            Column column = this.queryMediaType;
            String str2 = null;
            if (column != null) {
                str = column.getField();
            } else {
                str = null;
            }
            strArr[6] = str;
            Column column2 = this.queryColumnDuration;
            if (column2 != null) {
                str2 = column2.getField();
            }
            strArr[7] = str2;
            m14099n = C9545j.m14099n(strArr);
            return (String[]) m14099n.toArray(new String[0]);
        }

        public /* synthetic */ QueryColumns(Column column, Column column2, Column column3, Column column4, Column column5, Column column6, Column column7, Column column8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Column("_id") : column, (i & 2) != 0 ? new Column("_display_name") : column2, (i & 4) != 0 ? new Column("mime_type") : column3, (i & 8) != 0 ? new Column("width") : column4, (i & 16) != 0 ? new Column("height") : column5, (i & 32) != 0 ? new Column("date_added") : column6, (i & 64) != 0 ? new Column("media_type") : column7, (i & 128) != 0 ? new Column("duration") : column8);
        }
    }
}
