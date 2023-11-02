package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.internal.C4896g;
import com.google.android.material.internal.C4908m;
import p064db.C5810a;
import p155ia.C7480b;
import p155ia.C7488j;
import p155ia.C7489k;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: j */
    private final Rect f13926j;

    /* renamed from: k */
    private boolean f13927k;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20111n);
    }

    /* renamed from: a */
    private boolean m26765a(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f13927k;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (m26765a(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.f13926j);
            rect.bottom = this.f13926j.bottom;
        }
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (m26765a(textInputLayout)) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m26745O()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m26745O() && super.getHint() == null && C4896g.m26975a()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (m26765a(textInputLayout) && rect != null) {
            this.f13926j.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.f13926j);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f13927k = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(C5810a.m24498c(context, attributeSet, i, 0), attributeSet, i);
        this.f13926j = new Rect();
        TypedArray m26945h = C4908m.m26945h(context, attributeSet, C7489k.f20648t5, i, C7488j.f20270g, new int[0]);
        setTextInputLayoutFocusedRectEnabled(m26945h.getBoolean(C7489k.f20656u5, false));
        m26945h.recycle();
    }
}
