package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.C0536l;
import androidx.core.view.C1170a;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import p020b0.AbstractC1964a;
import p052d.C5706a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class CheckableImageButton extends C0536l implements Checkable {

    /* renamed from: p */
    private static final int[] f13639p = {16842912};

    /* renamed from: m */
    private boolean f13640m;

    /* renamed from: n */
    private boolean f13641n;

    /* renamed from: o */
    private boolean f13642o;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4883a extends C1170a {
        C4883a() {
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.m37594e0(CheckableImageButton.this.m27080a());
            accessibilityNodeInfoCompat.m37592f0(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4884b extends AbstractC1964a {
        public static final Parcelable.Creator<C4884b> CREATOR = new C4885a();

        /* renamed from: l */
        boolean f13644l;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C4885a implements Parcelable.ClassLoaderCreator<C4884b> {
            C4885a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4884b createFromParcel(Parcel parcel) {
                return new C4884b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C4884b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4884b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C4884b[] newArray(int i) {
                return new C4884b[i];
            }
        }

        public C4884b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m27079b(Parcel parcel) {
            this.f13644l = parcel.readInt() == 1;
        }

        @Override // p020b0.AbstractC1964a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13644l ? 1 : 0);
        }

        public C4884b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m27079b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5706a.f16034C);
    }

    /* renamed from: a */
    public boolean m27080a() {
        return this.f13641n;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f13640m;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f13640m) {
            int[] iArr = f13639p;
            return View.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4884b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4884b c4884b = (C4884b) parcelable;
        super.onRestoreInstanceState(c4884b.m34884a());
        setChecked(c4884b.f13644l);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C4884b c4884b = new C4884b(super.onSaveInstanceState());
        c4884b.f13644l = this.f13640m;
        return c4884b;
    }

    public void setCheckable(boolean z) {
        if (this.f13641n != z) {
            this.f13641n = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f13641n && this.f13640m != z) {
            this.f13640m = z;
            refreshDrawableState();
            sendAccessibilityEvent(RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    public void setPressable(boolean z) {
        this.f13642o = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f13642o) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f13640m);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13641n = true;
        this.f13642o = true;
        C1365w0.m37185q0(this, new C4883a());
    }
}
