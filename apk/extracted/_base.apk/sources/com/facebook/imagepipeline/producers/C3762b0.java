package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.C3877c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import p075e3.C6104f;
import p380v4.C13065e;
import p394w2.C13379j;
import p414x2.C13677a;
import p455z2.InterfaceC14080h;

/* renamed from: com.facebook.imagepipeline.producers.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3762b0 extends AbstractC3767c0 implements InterfaceC3869z0<C13065e> {

    /* renamed from: d */
    private static final Class<?> f10564d = C3762b0.class;

    /* renamed from: e */
    private static final String[] f10565e = {"_id", "_data"};

    /* renamed from: f */
    private static final String[] f10566f = {"_data"};

    /* renamed from: g */
    private static final Rect f10567g = new Rect(0, 0, 512, 384);

    /* renamed from: h */
    private static final Rect f10568h = new Rect(0, 0, 96, 96);

    /* renamed from: c */
    private final ContentResolver f10569c;

    public C3762b0(Executor executor, InterfaceC14080h interfaceC14080h, ContentResolver contentResolver) {
        super(executor, interfaceC14080h);
        this.f10569c = contentResolver;
    }

    /* renamed from: g */
    private C13065e m30882g(Uri uri, ResizeOptions resizeOptions) {
        Cursor query;
        C13065e m30879j;
        if (resizeOptions == null || (query = this.f10569c.query(uri, f10565e, null, null, null)) == null) {
            return null;
        }
        try {
            if (!query.moveToFirst() || (m30879j = m30879j(resizeOptions, query.getLong(query.getColumnIndex("_id")))) == null) {
                return null;
            }
            m30879j.m3350G0(m30880i(query.getString(query.getColumnIndex("_data"))));
            return m30879j;
        } finally {
            query.close();
        }
    }

    /* renamed from: h */
    private static int m30881h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    /* renamed from: i */
    private static int m30880i(String str) {
        if (str != null) {
            try {
                return C3877c.m30549a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e) {
                C13677a.m1855i(f10564d, e, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    /* renamed from: j */
    private C13065e m30879j(ResizeOptions resizeOptions, long j) {
        Cursor queryMiniThumbnail;
        int m30878k = m30878k(resizeOptions);
        if (m30878k == 0 || (queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f10569c, j, m30878k, f10566f)) == null) {
            return null;
        }
        try {
            if (queryMiniThumbnail.moveToFirst()) {
                String str = (String) C13379j.m2677g(queryMiniThumbnail.getString(queryMiniThumbnail.getColumnIndex("_data")));
                if (new File(str).exists()) {
                    return m30865e(new FileInputStream(str), m30881h(str));
                }
            }
            return null;
        } finally {
            queryMiniThumbnail.close();
        }
    }

    /* renamed from: k */
    private static int m30878k(ResizeOptions resizeOptions) {
        Rect rect = f10568h;
        if (C3760a1.m30894b(rect.width(), rect.height(), resizeOptions)) {
            return 3;
        }
        Rect rect2 = f10567g;
        if (C3760a1.m30894b(rect2.width(), rect2.height(), resizeOptions)) {
            return 1;
        }
        return 0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3869z0
    /* renamed from: a */
    public boolean mo30599a(ResizeOptions resizeOptions) {
        Rect rect = f10567g;
        return C3760a1.m30894b(rect.width(), rect.height(), resizeOptions);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: d */
    protected C13065e mo30603d(ImageRequest imageRequest) {
        Uri sourceUri = imageRequest.getSourceUri();
        if (C6104f.m23565h(sourceUri)) {
            return m30882g(sourceUri, imageRequest.getResizeOptions());
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: f */
    protected String mo30602f() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}
