package com.budiyev.android.codescanner;

import android.hardware.Camera;

/* renamed from: com.budiyev.android.codescanner.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2807g {

    /* renamed from: a */
    private final Camera f7629a;

    /* renamed from: b */
    private final Camera.CameraInfo f7630b;

    /* renamed from: c */
    private final C2803f f7631c;

    /* renamed from: d */
    private final C2809i f7632d;

    /* renamed from: e */
    private final C2809i f7633e;

    /* renamed from: f */
    private final C2809i f7634f;

    /* renamed from: g */
    private final int f7635g;

    /* renamed from: h */
    private final boolean f7636h;

    /* renamed from: i */
    private final boolean f7637i;

    /* renamed from: j */
    private final boolean f7638j;

    public C2807g(Camera camera, Camera.CameraInfo cameraInfo, C2803f c2803f, C2809i c2809i, C2809i c2809i2, C2809i c2809i3, int i, boolean z, boolean z2) {
        this.f7629a = camera;
        this.f7630b = cameraInfo;
        this.f7631c = c2803f;
        this.f7632d = c2809i;
        this.f7633e = c2809i2;
        this.f7634f = c2809i3;
        this.f7635g = i;
        this.f7636h = cameraInfo.facing == 1;
        this.f7637i = z;
        this.f7638j = z2;
    }

    /* renamed from: a */
    public Camera m32198a() {
        return this.f7629a;
    }

    /* renamed from: b */
    public C2803f m32197b() {
        return this.f7631c;
    }

    /* renamed from: c */
    public int m32196c() {
        return this.f7635g;
    }

    /* renamed from: d */
    public C2809i m32195d() {
        return this.f7632d;
    }

    /* renamed from: e */
    public C2809i m32194e() {
        return this.f7633e;
    }

    /* renamed from: f */
    public C2809i m32193f() {
        return this.f7634f;
    }

    /* renamed from: g */
    public boolean m32192g() {
        return this.f7637i;
    }

    /* renamed from: h */
    public boolean m32191h() {
        return this.f7638j;
    }

    /* renamed from: i */
    public void m32190i() {
        this.f7629a.release();
        this.f7631c.m32201l();
    }

    /* renamed from: j */
    public boolean m32189j() {
        return this.f7636h;
    }
}