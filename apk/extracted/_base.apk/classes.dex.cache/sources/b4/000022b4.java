package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p075e3.C6104f;
import p380v4.C13065e;
import p455z2.InterfaceC14080h;

/* renamed from: com.facebook.imagepipeline.producers.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3759a0 extends AbstractC3767c0 {

    /* renamed from: d */
    private static final String[] f10561d = {"_id", "_data"};

    /* renamed from: c */
    private final ContentResolver f10562c;

    public C3759a0(Executor executor, InterfaceC14080h interfaceC14080h, ContentResolver contentResolver) {
        super(executor, interfaceC14080h);
        this.f10562c = contentResolver;
    }

    /* renamed from: g */
    private C13065e m30896g(Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = this.f10562c.openFileDescriptor(uri, "r");
            return m30865e(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: d */
    protected C13065e mo30603d(ImageRequest imageRequest) {
        C13065e m30896g;
        InputStream createInputStream;
        Uri sourceUri = imageRequest.getSourceUri();
        if (C6104f.m23564i(sourceUri)) {
            if (sourceUri.toString().endsWith("/photo")) {
                createInputStream = this.f10562c.openInputStream(sourceUri);
            } else if (sourceUri.toString().endsWith("/display_photo")) {
                try {
                    createInputStream = this.f10562c.openAssetFileDescriptor(sourceUri, "r").createInputStream();
                } catch (IOException unused) {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
            } else {
                InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f10562c, sourceUri);
                if (openContactPhotoInputStream != null) {
                    createInputStream = openContactPhotoInputStream;
                } else {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
            }
            return m30865e(createInputStream, -1);
        } else if (C6104f.m23565h(sourceUri) && (m30896g = m30896g(sourceUri)) != null) {
            return m30896g;
        } else {
            return m30865e(this.f10562c.openInputStream(sourceUri), -1);
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: f */
    protected String mo30602f() {
        return "LocalContentUriFetchProducer";
    }
}