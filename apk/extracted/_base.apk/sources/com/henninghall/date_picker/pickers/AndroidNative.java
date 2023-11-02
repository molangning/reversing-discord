package com.henninghall.date_picker.pickers;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import com.henninghall.date_picker.C5153k;
import com.henninghall.date_picker.pickers.InterfaceC5161a;
import java.lang.reflect.Field;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AndroidNative extends NumberPicker implements InterfaceC5161a {

    /* renamed from: j */
    private InterfaceC5161a.InterfaceC5162a f14511j;

    /* renamed from: k */
    private int f14512k;

    /* renamed from: l */
    private InterfaceC5161a.InterfaceC5163b f14513l;

    /* renamed from: m */
    private boolean f14514m;

    /* renamed from: n */
    private final Handler f14515n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.pickers.AndroidNative$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC5154a implements Runnable {
        RunnableC5154a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.f14514m = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.pickers.AndroidNative$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC5155b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ AndroidNative f14517j;

        /* renamed from: k */
        final /* synthetic */ boolean f14518k;

        /* renamed from: l */
        final /* synthetic */ boolean f14519l;

        RunnableC5155b(AndroidNative androidNative, boolean z, boolean z2) {
            this.f14517j = androidNative;
            this.f14518k = z;
            this.f14519l = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.m26011l(this.f14517j, this.f14518k);
            if (this.f14519l) {
                AndroidNative.this.m26008o();
            }
        }
    }

    /* renamed from: com.henninghall.date_picker.pickers.AndroidNative$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5156c implements NumberPicker.OnValueChangeListener {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5161a f14521a;

        C5156c(InterfaceC5161a interfaceC5161a) {
            this.f14521a = interfaceC5161a;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            if (AndroidNative.this.f14513l != null) {
                AndroidNative.this.f14513l.mo21961a(this.f14521a, i, i2);
            }
            if (AndroidNative.this.f14512k == 0) {
                AndroidNative.this.m26008o();
            }
        }
    }

    /* renamed from: com.henninghall.date_picker.pickers.AndroidNative$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5157d implements NumberPicker.OnScrollListener {
        C5157d() {
        }

        @Override // android.widget.NumberPicker.OnScrollListener
        public void onScrollStateChange(NumberPicker numberPicker, int i) {
            AndroidNative.this.m26009n(i);
            AndroidNative.this.f14512k = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.pickers.AndroidNative$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC5158e implements Runnable {
        RunnableC5158e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.f14511j.mo21450a();
        }
    }

    public AndroidNative(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14512k = 0;
        this.f14515n = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r9 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r9 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r9 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        if (r9 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        setValue((r8 + r1) % getMaxValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
        return;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m26011l(android.widget.NumberPicker r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "changeValueByOne"
            r1 = -1
            r2 = 1
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r0, r4)     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            r4[r6] = r5     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            r3.invoke(r8, r4)     // Catch: java.lang.Throwable -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L33 java.lang.IllegalArgumentException -> L3e java.lang.NoSuchMethodException -> L49
            goto L5d
        L26:
            r8 = move-exception
            goto L5e
        L28:
            r8 = move-exception
            android.util.Log.w(r0, r8)     // Catch: java.lang.Throwable -> L26
            int r8 = r7.getValue()
            if (r9 == 0) goto L54
            goto L53
        L33:
            r8 = move-exception
            android.util.Log.w(r0, r8)     // Catch: java.lang.Throwable -> L26
            int r8 = r7.getValue()
            if (r9 == 0) goto L54
            goto L53
        L3e:
            r8 = move-exception
            android.util.Log.w(r0, r8)     // Catch: java.lang.Throwable -> L26
            int r8 = r7.getValue()
            if (r9 == 0) goto L54
            goto L53
        L49:
            r8 = move-exception
            android.util.Log.w(r0, r8)     // Catch: java.lang.Throwable -> L26
            int r8 = r7.getValue()
            if (r9 == 0) goto L54
        L53:
            r1 = r2
        L54:
            int r8 = r8 + r1
            int r9 = r7.getMaxValue()
            int r8 = r8 % r9
            r7.setValue(r8)
        L5d:
            return
        L5e:
            int r0 = r7.getValue()
            if (r9 == 0) goto L65
            r1 = r2
        L65:
            int r0 = r0 + r1
            int r9 = r7.getMaxValue()
            int r0 = r0 % r9
            r7.setValue(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.henninghall.date_picker.pickers.AndroidNative.m26011l(android.widget.NumberPicker, boolean):void");
    }

    /* renamed from: m */
    private void m26010m(boolean z, int i, boolean z2) {
        this.f14515n.postDelayed(new RunnableC5155b(this, z, z2), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m26009n(int i) {
        boolean z;
        if (this.f14512k != 0 && i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m26008o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m26008o() {
        this.f14515n.postDelayed(new RunnableC5158e(), 500L);
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    /* renamed from: a */
    public void mo26003a(int i, boolean z) {
        mo26002b(i);
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    /* renamed from: b */
    public void mo26002b(int i) {
        boolean z;
        boolean z2;
        int value = getValue();
        if (i == value) {
            return;
        }
        int m26026f = C5153k.m26026f(value, i, getMaxValue(), getWrapSelectorWheel());
        int abs = Math.abs(m26026f);
        this.f14514m = true;
        this.f14515n.postDelayed(new RunnableC5154a(), abs * 100);
        for (int i2 = 0; i2 < abs; i2++) {
            if (m26026f > 0) {
                z = true;
            } else {
                z = false;
            }
            int i3 = i2 * 100;
            if (i2 == abs - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            m26010m(z, i3, z2);
        }
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    /* renamed from: c */
    public boolean mo26001c() {
        return this.f14512k == 2 || this.f14514m;
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    public View getView() {
        return this;
    }

    @Override // android.widget.NumberPicker, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14515n.removeCallbacksAndMessages(null);
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    public void setDividerHeight(int i) {
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    public void setItemPaddingHorizontal(int i) {
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    public void setOnValueChangeListenerInScrolling(InterfaceC5161a.InterfaceC5163b interfaceC5163b) {
        this.f14513l = interfaceC5163b;
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    public void setOnValueChangedListener(InterfaceC5161a.InterfaceC5162a interfaceC5162a) {
        this.f14511j = interfaceC5162a;
        super.setOnValueChangedListener(new C5156c(this));
        super.setOnScrollListener(new C5157d());
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    public void setShownCount(int i) {
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    public void setTextAlign(Paint.Align align) {
    }

    @Override // com.henninghall.date_picker.pickers.InterfaceC5161a
    public void setTextColor(String str) {
        int parseColor = Color.parseColor(str);
        if (Build.VERSION.SDK_INT >= 29) {
            super.setTextColor(parseColor);
            return;
        }
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField("mSelectorWheelPaint");
            declaredField.setAccessible(true);
            ((Paint) declaredField.get(this)).setColor(parseColor);
        } catch (IllegalAccessException e) {
            Log.w("setSelectedTextColor", e);
        } catch (IllegalArgumentException e2) {
            Log.w("setSelectedTextColor", e2);
        } catch (NoSuchFieldException e3) {
            Log.w("setSelectedTextColor", e3);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof EditText) {
                ((EditText) childAt).setTextColor(parseColor);
            }
        }
        invalidate();
    }
}
