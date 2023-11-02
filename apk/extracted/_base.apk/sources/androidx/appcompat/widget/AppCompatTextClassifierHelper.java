package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.C1138f;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class AppCompatTextClassifierHelper {

    /* renamed from: a */
    private TextView f1539a;

    /* renamed from: b */
    private TextClassifier f1540b;

    /* renamed from: androidx.appcompat.widget.AppCompatTextClassifierHelper$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C0428a {
        /* renamed from: a */
        static TextClassifier m40189a(TextView textView) {
            TextClassifier textClassifier;
            TextClassifier textClassifier2;
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                textClassifier2 = textClassificationManager.getTextClassifier();
                return textClassifier2;
            }
            textClassifier = TextClassifier.NO_OP;
            return textClassifier;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatTextClassifierHelper(TextView textView) {
        this.f1539a = (TextView) C1138f.m37824f(textView);
    }

    /* renamed from: a */
    public TextClassifier m40191a() {
        TextClassifier textClassifier = this.f1540b;
        if (textClassifier == null) {
            return C0428a.m40189a(this.f1539a);
        }
        return textClassifier;
    }

    /* renamed from: b */
    public void m40190b(TextClassifier textClassifier) {
        this.f1540b = textClassifier;
    }
}
