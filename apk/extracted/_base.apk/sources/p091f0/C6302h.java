package p091f0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C1500e;

/* renamed from: f0.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C6302h implements TransformationMethod {

    /* renamed from: j */
    private final TransformationMethod f17808j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6302h(TransformationMethod transformationMethod) {
        this.f17808j = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod m23012a() {
        return this.f17808j;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f17808j;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && C1500e.m36656b().m36654d() == 1) {
            return C1500e.m36656b().m36643o(charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f17808j;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
