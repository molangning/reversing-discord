package me;

import com.facebook.react.uimanager.ViewDefaults;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bR\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\"\u0010#\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\"\u0010&\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR\"\u0010)\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0016\u001a\u0004\b \u0010\u0018\"\u0004\b(\u0010\u001aR\"\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b*\u0010\u001aR\"\u0010-\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b'\u0010\u0018\"\u0004\b,\u0010\u001aR\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0016R\u0016\u0010/\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016¨\u00062"}, m14357d2 = {"Lme/a;", "", "Lme/c;", "cell", "", "g", "", "sortedItems", "", "a", "([Lme/c;)V", "", "actualScrollOffset", "distanceFromWindowStart", "distanceFromWindowEnd", "b", "Z", "e", "()Z", "h", "(Z)V", "horizontal", "I", "getScrollOffset", "()I", "l", "(I)V", "scrollOffset", "c", "getOffsetFromStart", "j", "offsetFromStart", "d", "getWindowSize", "m", "windowSize", "getRenderOffset", "k", "renderOffset", "f", "setBlankOffsetAtStart", "blankOffsetAtStart", "setBlankOffsetAtEnd", "blankOffsetAtEnd", "i", "lastMaxBoundOverall", "lastMaxBound", "lastMinBound", "<init>", "()V", "shopify_flash-list_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: me.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10441a {

    /* renamed from: a */
    private boolean f27271a;

    /* renamed from: b */
    private int f27272b;

    /* renamed from: c */
    private int f27273c;

    /* renamed from: d */
    private int f27274d;

    /* renamed from: e */
    private int f27275e;

    /* renamed from: f */
    private int f27276f;

    /* renamed from: g */
    private int f27277g;

    /* renamed from: h */
    private int f27278h;

    /* renamed from: i */
    private int f27279i;

    /* renamed from: j */
    private int f27280j;

    /* renamed from: g */
    private final boolean m11540g(InterfaceC10444c interfaceC10444c) {
        int i = this.f27272b - this.f27273c;
        if (!this.f27271a) {
            if (interfaceC10444c.getTop() < i - this.f27275e && interfaceC10444c.getBottom() < i - this.f27275e) {
                return false;
            }
            if (interfaceC10444c.getTop() > this.f27274d + i && interfaceC10444c.getBottom() > i + this.f27274d) {
                return false;
            }
        } else if (interfaceC10444c.getLeft() < i - this.f27275e && interfaceC10444c.getRight() < i - this.f27275e) {
            return false;
        } else {
            if (interfaceC10444c.getLeft() > this.f27274d + i && interfaceC10444c.getRight() > i + this.f27274d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void m11546a(InterfaceC10444c[] sortedItems) {
        boolean z;
        int bottom;
        int bottom2;
        int max;
        C9612q.m13917h(sortedItems, "sortedItems");
        this.f27278h = 0;
        int length = sortedItems.length - 1;
        int i = ViewDefaults.NUMBER_OF_LINES;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            InterfaceC10444c interfaceC10444c = sortedItems[i2];
            i2++;
            InterfaceC10444c interfaceC10444c2 = sortedItems[i2];
            if (interfaceC10444c2.getIndex() == interfaceC10444c.getIndex() + 1) {
                z = true;
            } else {
                z = false;
            }
            if (m11540g(interfaceC10444c)) {
                if (!this.f27271a) {
                    i3 = Math.max(i4, interfaceC10444c.getBottom());
                    i = Math.min(i, interfaceC10444c.getTop());
                    if (z) {
                        if (interfaceC10444c.getLeft() < interfaceC10444c2.getLeft()) {
                            if (interfaceC10444c.getRight() != interfaceC10444c2.getLeft()) {
                                interfaceC10444c2.setRight(interfaceC10444c.getRight() + interfaceC10444c2.getWidth());
                                interfaceC10444c2.setLeft(interfaceC10444c.getRight());
                            }
                            if (interfaceC10444c.getTop() != interfaceC10444c2.getTop()) {
                                interfaceC10444c2.setBottom(interfaceC10444c.getTop() + interfaceC10444c2.getHeight());
                                interfaceC10444c2.setTop(interfaceC10444c.getTop());
                            }
                        } else {
                            interfaceC10444c2.setBottom(interfaceC10444c2.getHeight() + i3);
                            interfaceC10444c2.setTop(i3);
                        }
                    }
                    if (m11540g(interfaceC10444c2)) {
                        max = Math.max(i3, interfaceC10444c2.getBottom());
                        int i5 = max;
                        i4 = i3;
                        i3 = i5;
                    }
                    i4 = i3;
                } else {
                    i3 = Math.max(i4, interfaceC10444c.getRight());
                    i = Math.min(i, interfaceC10444c.getLeft());
                    if (z) {
                        if (interfaceC10444c.getTop() < interfaceC10444c2.getTop()) {
                            if (interfaceC10444c.getBottom() != interfaceC10444c2.getTop()) {
                                interfaceC10444c2.setBottom(interfaceC10444c.getBottom() + interfaceC10444c2.getHeight());
                                interfaceC10444c2.setTop(interfaceC10444c.getBottom());
                            }
                            if (interfaceC10444c.getLeft() != interfaceC10444c2.getLeft()) {
                                interfaceC10444c2.setRight(interfaceC10444c.getLeft() + interfaceC10444c2.getWidth());
                                interfaceC10444c2.setLeft(interfaceC10444c.getLeft());
                            }
                        } else {
                            interfaceC10444c2.setRight(interfaceC10444c2.getWidth() + i3);
                            interfaceC10444c2.setLeft(i3);
                        }
                    }
                    if (m11540g(interfaceC10444c2)) {
                        max = Math.max(i3, interfaceC10444c2.getRight());
                        int i52 = max;
                        i4 = i3;
                        i3 = i52;
                    }
                    i4 = i3;
                }
            }
            int i6 = this.f27278h;
            if (this.f27271a) {
                bottom = interfaceC10444c.getRight();
            } else {
                bottom = interfaceC10444c.getBottom();
            }
            int max2 = Math.max(i6, bottom);
            this.f27278h = max2;
            if (this.f27271a) {
                bottom2 = interfaceC10444c2.getRight();
            } else {
                bottom2 = interfaceC10444c2.getBottom();
            }
            this.f27278h = Math.max(max2, bottom2);
        }
        this.f27279i = i3;
        this.f27280j = i;
    }

    /* renamed from: b */
    public final int m11545b(int i, int i2, int i3) {
        int i4 = i - this.f27273c;
        int i5 = (this.f27280j - i4) - i2;
        this.f27276f = i5;
        int i6 = (((i4 + this.f27274d) - this.f27275e) - this.f27279i) - i3;
        this.f27277g = i6;
        return Math.max(i5, i6);
    }

    /* renamed from: c */
    public final int m11544c() {
        return this.f27277g;
    }

    /* renamed from: d */
    public final int m11543d() {
        return this.f27276f;
    }

    /* renamed from: e */
    public final boolean m11542e() {
        return this.f27271a;
    }

    /* renamed from: f */
    public final int m11541f() {
        return this.f27278h;
    }

    /* renamed from: h */
    public final void m11539h(boolean z) {
        this.f27271a = z;
    }

    /* renamed from: i */
    public final void m11538i(int i) {
        this.f27278h = i;
    }

    /* renamed from: j */
    public final void m11537j(int i) {
        this.f27273c = i;
    }

    /* renamed from: k */
    public final void m11536k(int i) {
        this.f27275e = i;
    }

    /* renamed from: l */
    public final void m11535l(int i) {
        this.f27272b = i;
    }

    /* renamed from: m */
    public final void m11534m(int i) {
        this.f27274d = i;
    }
}