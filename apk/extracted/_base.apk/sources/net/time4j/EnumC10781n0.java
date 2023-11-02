package net.time4j;

import p162ij.InterfaceC7671w;

/* renamed from: net.time4j.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC10781n0 implements InterfaceC7671w {
    SECONDS(1.0d),
    NANOSECONDS(1.0E-9d);
    
    private final double length;

    EnumC10781n0(double d) {
        this.length = d;
    }

    @Override // p162ij.InterfaceC7671w
    public double getLength() {
        return this.length;
    }
}
