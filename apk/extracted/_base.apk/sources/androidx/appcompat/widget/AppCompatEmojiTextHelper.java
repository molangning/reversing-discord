package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import p052d.C5715j;
import p091f0.C6296f;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class AppCompatEmojiTextHelper {

    /* renamed from: a */
    private final TextView f1532a;

    /* renamed from: b */
    private final C6296f f1533b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatEmojiTextHelper(TextView textView) {
        this.f1532a = textView;
        this.f1533b = new C6296f(textView, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public InputFilter[] m40209a(InputFilter[] inputFilterArr) {
        return this.f1533b.m23037a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean m40208b() {
        return this.f1533b.m23036b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m40207c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1532a.getContext().obtainStyledAttributes(attributeSet, C5715j.f16376g0, i, 0);
        try {
            int i2 = C5715j.f16446u0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            m40205e(z);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m40206d(boolean z) {
        this.f1533b.m23035c(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m40205e(boolean z) {
        this.f1533b.m23034d(z);
    }

    /* renamed from: f */
    public TransformationMethod m40204f(TransformationMethod transformationMethod) {
        return this.f1533b.m23033e(transformationMethod);
    }
}
