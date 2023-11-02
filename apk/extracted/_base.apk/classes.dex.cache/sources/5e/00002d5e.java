package com.henninghall.date_picker.pickers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.henninghall.date_picker.pickers.InterfaceC5161a;
import gd.C6728a;
import p453z0.C14061a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class IosClone extends C14061a implements InterfaceC5161a {

    /* renamed from: O0 */
    private InterfaceC5161a.InterfaceC5163b f14525O0;

    /* renamed from: com.henninghall.date_picker.pickers.IosClone$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5159a implements C14061a.InterfaceC14066e {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5161a f14526a;

        C5159a(InterfaceC5161a interfaceC5161a) {
            IosClone.this = r1;
            this.f14526a = interfaceC5161a;
        }

        @Override // p453z0.C14061a.InterfaceC14066e
        /* renamed from: a */
        public void mo730a(C14061a c14061a, int i, int i2) {
            C6728a.m22021g(this.f14526a, i2);
            if (IosClone.this.f14525O0 != null) {
                IosClone.this.f14525O0.mo21961a(this.f14526a, i, i2);
            }
        }
    }

    /* renamed from: com.henninghall.date_picker.pickers.IosClone$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5160b implements C14061a.InterfaceC14065d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5161a.InterfaceC5162a f14528a;

        C5160b(InterfaceC5161a.InterfaceC5162a interfaceC5162a) {
            IosClone.this = r1;
            this.f14528a = interfaceC5162a;
        }

        @Override // p453z0.C14061a.InterfaceC14065d
        /* renamed from: a */
        public void mo731a(C14061a c14061a, int i, int i2) {
            this.f14528a.mo21450a();
        }
    }

    public IosClone(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26006q0();
    }

    /* renamed from: q0 */
    private void m26006q0() {
        m26005r0();
        m26004s0();
    }

    /* renamed from: r0 */
    private void m26005r0() {
        C6728a.m22017k(this);
    }

    /* renamed from: s0 */
    private void m26004s0() {
        super.setOnValueChangeListenerInScrolling(new C5159a(this));
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    /* renamed from: c */
    public boolean mo26001c() {
        return super.m783O();
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C6728a.m22019i(this, accessibilityNodeInfo);
    }

    @Override // p453z0.C14061a, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (C6728a.m22018j(this)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    public void setOnValueChangeListenerInScrolling(InterfaceC5161a.InterfaceC5163b interfaceC5163b) {
        this.f14525O0 = interfaceC5163b;
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    public void setOnValueChangedListener(InterfaceC5161a.InterfaceC5162a interfaceC5162a) {
        super.setOnValueChangedListener(new C5160b(interfaceC5162a));
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    public void setTextColor(String str) {
        int parseColor = Color.parseColor(str);
        setNormalTextColor(Color.parseColor("#70" + str.substring(1)));
        setSelectedTextColor(parseColor);
    }
}