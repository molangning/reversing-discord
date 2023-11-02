package com.discord.media.utils;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.MimeTypeMap;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import org.webrtc.MediaStreamTrack;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u000b\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\u000e\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\u000f\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\u0010\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007JO\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, m14357d2 = {"Lcom/discord/media/utils/ContentResolverUtils;", "", "()V", "createTempFile", "Ljava/io/File;", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "prefix", "", "extension", "isHeif", "", "isImage", "isJpeg", "isPng", "isVideo", "queryCompat", "Landroid/database/Cursor;", "queryUri", "queryProjection", "", "queryLimit", "", "querySort", "querySelection", "queryOffset", "(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Landroid/database/Cursor;", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class ContentResolverUtils {
    public static final ContentResolverUtils INSTANCE = new ContentResolverUtils();

    private ContentResolverUtils() {
    }

    public static /* synthetic */ File createTempFile$default(ContentResolverUtils contentResolverUtils, ContentResolver contentResolver, Uri uri, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "temp_";
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return contentResolverUtils.createTempFile(contentResolver, uri, str, str2);
    }

    public final File createTempFile(ContentResolver contentResolver, Uri uri, String prefix, String str) {
        C9612q.m13917h(contentResolver, "<this>");
        C9612q.m13917h(uri, "uri");
        C9612q.m13917h(prefix, "prefix");
        if (str == null) {
            str = MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(uri));
        }
        File createTempFile = File.createTempFile(prefix, "." + str);
        createTempFile.deleteOnExit();
        C9612q.m13918g(createTempFile, "createTempFile(prefix, \"….deleteOnExit()\n        }");
        return createTempFile;
    }

    public final boolean isHeif(ContentResolver contentResolver, Uri uri) {
        C9612q.m13917h(contentResolver, "<this>");
        C9612q.m13917h(uri, "uri");
        if (!C9612q.m13922c(contentResolver.getType(uri), "image/heif") && !C9612q.m13922c(contentResolver.getType(uri), "image/heic")) {
            return false;
        }
        return true;
    }

    public final boolean isImage(ContentResolver contentResolver, Uri uri) {
        boolean m13758H;
        C9612q.m13917h(contentResolver, "<this>");
        C9612q.m13917h(uri, "uri");
        String type = contentResolver.getType(uri);
        if (type == null) {
            return false;
        }
        m13758H = C9653o.m13758H(type, "image", false, 2, null);
        if (!m13758H) {
            return false;
        }
        return true;
    }

    public final boolean isJpeg(ContentResolver contentResolver, Uri uri) {
        C9612q.m13917h(contentResolver, "<this>");
        C9612q.m13917h(uri, "uri");
        if (!C9612q.m13922c(contentResolver.getType(uri), "image/jpeg") && !C9612q.m13922c(contentResolver.getType(uri), "image/jpg")) {
            return false;
        }
        return true;
    }

    public final boolean isPng(ContentResolver contentResolver, Uri uri) {
        C9612q.m13917h(contentResolver, "<this>");
        C9612q.m13917h(uri, "uri");
        return C9612q.m13922c(contentResolver.getType(uri), "image/png");
    }

    public final boolean isVideo(ContentResolver contentResolver, Uri uri) {
        boolean m13758H;
        C9612q.m13917h(contentResolver, "<this>");
        C9612q.m13917h(uri, "uri");
        String type = contentResolver.getType(uri);
        if (type == null) {
            return false;
        }
        m13758H = C9653o.m13758H(type, MediaStreamTrack.VIDEO_TRACK_KIND, false, 2, null);
        if (!m13758H) {
            return false;
        }
        return true;
    }

    public final Cursor queryCompat(ContentResolver contentResolver, Uri queryUri, String[] queryProjection, int i, String querySort, String str, Integer num) {
        int i2;
        Cursor query;
        C9612q.m13917h(contentResolver, "<this>");
        C9612q.m13917h(queryUri, "queryUri");
        C9612q.m13917h(queryProjection, "queryProjection");
        C9612q.m13917h(querySort, "querySort");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 > 29) {
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-limit", i);
            bundle.putString("android:query-arg-sql-sort-order", querySort);
            if (str != null) {
                bundle.putString("android:query-arg-sql-selection", str);
            }
            if (num != null) {
                bundle.putInt("android:query-arg-offset", num.intValue());
            }
            Unit unit = Unit.f25302a;
            query = contentResolver.query(queryUri, queryProjection, bundle, null);
            return query;
        } else if (i3 >= 26) {
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            return contentResolver.query(queryUri, queryProjection, str, null, querySort + " LIMIT " + i + " OFFSET " + i2, null);
        } else {
            Uri.Builder buildUpon = queryUri.buildUpon();
            Uri.Builder encodedQuery = buildUpon.encodedQuery("limit=" + i);
            if (num != null) {
                encodedQuery.appendQueryParameter("offset", String.valueOf(num.intValue()));
            }
            return contentResolver.query(encodedQuery.build(), queryProjection, str, null, querySort);
        }
    }
}