package com.yalantis.ucrop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: com.yalantis.ucrop.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5691a {

    /* renamed from: a */
    private Intent f15905a = new Intent();

    /* renamed from: b */
    private Bundle f15906b;

    /* renamed from: com.yalantis.ucrop.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5692a {

        /* renamed from: a */
        private final Bundle f15907a = new Bundle();

        /* renamed from: a */
        public Bundle m24705a() {
            return this.f15907a;
        }

        /* renamed from: b */
        public void m24704b(int i) {
            this.f15907a.putInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", i);
        }

        /* renamed from: c */
        public void m24703c(int i, int i2, int i3) {
            this.f15907a.putIntArray("com.yalantis.ucrop.AllowedGestures", new int[]{i, i2, i3});
        }

        /* renamed from: d */
        public void m24702d(boolean z) {
            this.f15907a.putBoolean("com.yalantis.ucrop.CircleDimmedLayer", z);
        }

        /* renamed from: e */
        public void m24701e(Bitmap.CompressFormat compressFormat) {
            this.f15907a.putString("com.yalantis.ucrop.CompressionFormatName", compressFormat.name());
        }

        /* renamed from: f */
        public void m24700f(int i) {
            this.f15907a.putInt("com.yalantis.ucrop.CompressionQuality", i);
        }

        /* renamed from: g */
        public void m24699g(boolean z) {
            this.f15907a.putBoolean("com.yalantis.ucrop.FreeStyleCrop", z);
        }

        /* renamed from: h */
        public void m24698h(boolean z) {
            this.f15907a.putBoolean("com.yalantis.ucrop.HideBottomControls", z);
        }

        /* renamed from: i */
        public void m24697i(boolean z) {
            this.f15907a.putBoolean("com.yalantis.ucrop.ShowCropFrame", z);
        }

        /* renamed from: j */
        public void m24696j(boolean z) {
            this.f15907a.putBoolean("com.yalantis.ucrop.ShowCropGrid", z);
        }

        /* renamed from: k */
        public void m24695k(int i) {
            this.f15907a.putInt("com.yalantis.ucrop.StatusBarColor", i);
        }

        /* renamed from: l */
        public void m24694l(int i) {
            this.f15907a.putInt("com.yalantis.ucrop.ToolbarColor", i);
        }

        /* renamed from: m */
        public void m24693m(String str) {
            this.f15907a.putString("com.yalantis.ucrop.UcropToolbarTitleText", str);
        }

        /* renamed from: n */
        public void m24692n(int i) {
            this.f15907a.putInt("com.yalantis.ucrop.UcropToolbarWidgetColor", i);
        }
    }

    private C5691a(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.f15906b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.f15906b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    /* renamed from: b */
    public static Uri m24711b(Intent intent) {
        return (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
    }

    /* renamed from: c */
    public static C5691a m24710c(Uri uri, Uri uri2) {
        return new C5691a(uri, uri2);
    }

    /* renamed from: a */
    public Intent m24712a(Context context) {
        this.f15905a.setClass(context, UCropActivity.class);
        this.f15905a.putExtras(this.f15906b);
        return this.f15905a;
    }

    /* renamed from: d */
    public void m24709d(Activity activity) {
        m24708e(activity, 69);
    }

    /* renamed from: e */
    public void m24708e(Activity activity, int i) {
        activity.startActivityForResult(m24712a(activity), i);
    }

    /* renamed from: f */
    public C5691a m24707f(float f, float f2) {
        this.f15906b.putFloat("com.yalantis.ucrop.AspectRatioX", f);
        this.f15906b.putFloat("com.yalantis.ucrop.AspectRatioY", f2);
        return this;
    }

    /* renamed from: g */
    public C5691a m24706g(C5692a c5692a) {
        this.f15906b.putAll(c5692a.m24705a());
        return this;
    }
}