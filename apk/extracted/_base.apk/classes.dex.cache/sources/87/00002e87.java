package com.otaliastudios.zoom;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H&J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H&¨\u0006\r"}, m14357d2 = {"Lcom/otaliastudios/zoom/c;", "", "", "transformation", "gravity", "", "setTransformation", "", "maxZoom", "type", "setMaxZoom", "minZoom", "setMinZoom", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* renamed from: com.otaliastudios.zoom.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC5367c {

    @Metadata(m14356k = 3, m14355mv = {1, 5, 1}, m14353xi = 48)
    /* renamed from: com.otaliastudios.zoom.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5368a {
        /* renamed from: a */
        public static void m25348a(InterfaceC5367c interfaceC5367c, float f) {
            C9612q.m13917h(interfaceC5367c, "this");
            interfaceC5367c.setMaxZoom(f, 0);
        }

        /* renamed from: b */
        public static void m25347b(InterfaceC5367c interfaceC5367c, float f) {
            C9612q.m13917h(interfaceC5367c, "this");
            interfaceC5367c.setMinZoom(f, 0);
        }

        /* renamed from: c */
        public static void m25346c(InterfaceC5367c interfaceC5367c, int i) {
            C9612q.m13917h(interfaceC5367c, "this");
            interfaceC5367c.setTransformation(i, 0);
        }
    }

    void setMaxZoom(float f, int i);

    void setMinZoom(float f, int i);

    void setTransformation(int i, int i2);
}