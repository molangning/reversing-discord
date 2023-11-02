package com.google.android.exoplayer2.trackselection;

import java.util.Arrays;
import p099f8.InterfaceC6343k;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class TrackSelectionArray {

    /* renamed from: a */
    public final int f11998a;

    /* renamed from: b */
    private final InterfaceC6343k[] f11999b;

    /* renamed from: c */
    private int f12000c;

    public TrackSelectionArray(InterfaceC6343k... interfaceC6343kArr) {
        this.f11999b = interfaceC6343kArr;
        this.f11998a = interfaceC6343kArr.length;
    }

    /* renamed from: a */
    public InterfaceC6343k m28969a(int i) {
        return this.f11999b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackSelectionArray.class == obj.getClass()) {
            return Arrays.equals(this.f11999b, ((TrackSelectionArray) obj).f11999b);
        }
        return false;
    }

    public int hashCode() {
        if (this.f12000c == 0) {
            this.f12000c = 527 + Arrays.hashCode(this.f11999b);
        }
        return this.f12000c;
    }
}