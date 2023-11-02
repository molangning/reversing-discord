package com.imagepicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.imagepicker.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5260g extends AbstractC5257d {

    /* renamed from: d */
    private int f14917d;

    /* renamed from: e */
    private int f14918e;

    public C5260g(Uri uri, Context context) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        Bitmap m25613b = m25613b(uri, context, mediaMetadataRetriever);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
        String extractMetadata3 = mediaMetadataRetriever.extractMetadata(5);
        if (extractMetadata != null) {
            this.f14917d = Math.round(Float.parseFloat(extractMetadata)) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        }
        if (extractMetadata2 != null) {
            this.f14918e = Integer.parseInt(extractMetadata2);
        }
        if (extractMetadata3 != null) {
            this.f14894a = m25647a(extractMetadata3.substring(0, extractMetadata3.indexOf(".")).replace("T", " "), "yyyyMMdd HHmmss");
        }
        if (m25613b != null) {
            this.f14896c = m25613b.getWidth();
            this.f14895b = m25613b.getHeight();
        }
        try {
            mediaMetadataRetriever.release();
        } catch (IOException e) {
            Log.e("RNIP", "Could not release metadata retriever: " + e.getMessage());
        }
    }

    /* renamed from: b */
    private Bitmap m25613b(Uri uri, Context context, MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            mediaMetadataRetriever.setDataSource(new FileInputStream(context.getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor()).getFD());
            return mediaMetadataRetriever.getFrameAtTime();
        } catch (IOException | RuntimeException e) {
            Log.e("RNIP", "Could not retrieve width and height from video: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public int m25612c() {
        return this.f14918e;
    }

    /* renamed from: d */
    public String m25611d() {
        return this.f14894a;
    }

    /* renamed from: e */
    public int m25610e() {
        return this.f14917d;
    }

    /* renamed from: f */
    public int m25609f() {
        return this.f14895b;
    }

    /* renamed from: g */
    public int m25608g() {
        return this.f14896c;
    }
}