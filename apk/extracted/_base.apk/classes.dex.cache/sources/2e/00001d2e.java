package com.discord.p048qr.scanner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.InterfaceC2801d;
import com.budiyev.android.codescanner.InterfaceC2808h;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.p048qr.scanner.databinding.QrScannerBinding;
import com.discord.theme.utils.ColorUtilsKt;
import com.google.zxing.Result;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R.\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006."}, m14357d2 = {"Lcom/discord/qr/scanner/QRScanner;", "Landroid/widget/FrameLayout;", "Lcom/budiyev/android/codescanner/d;", "Lcom/budiyev/android/codescanner/h;", "", "requestLayout", "onDetachedFromWindow", "onAttachedToWindow", "Lcom/google/zxing/Result;", "result", "onDecoded", "", "thrown", "onError", "Lcom/discord/qr/scanner/databinding/QrScannerBinding;", "binding", "Lcom/discord/qr/scanner/databinding/QrScannerBinding;", "Lcom/budiyev/android/codescanner/CodeScanner;", "codeScanner", "Lcom/budiyev/android/codescanner/CodeScanner;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "Lkotlin/Function1;", "", "onCodeFound", "Lkotlin/jvm/functions/Function1;", "getOnCodeFound", "()Lkotlin/jvm/functions/Function1;", "setOnCodeFound", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onCodeNotFound", "Lkotlin/jvm/functions/Function0;", "getOnCodeNotFound", "()Lkotlin/jvm/functions/Function0;", "setOnCodeNotFound", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "qr_scanner_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.discord.qr.scanner.QRScanner */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class QRScanner extends FrameLayout implements InterfaceC2801d, InterfaceC2808h {
    private final QrScannerBinding binding;
    private final CodeScanner codeScanner;
    private Function1<? super String, Unit> onCodeFound;
    private Function0<Unit> onCodeNotFound;
    private final Runnable runnable;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRScanner(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRScanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ QRScanner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final void runnable$lambda$0(QRScanner this$0) {
        C9612q.m13917h(this$0, "this$0");
        ViewMeasureExtensionsKt.measureAndLayout(this$0);
    }

    public final Function1<String, Unit> getOnCodeFound() {
        return this.onCodeFound;
    }

    public final Function0<Unit> getOnCodeNotFound() {
        return this.onCodeNotFound;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.codeScanner.m32248g0();
    }

    @Override // com.budiyev.android.codescanner.InterfaceC2801d
    public void onDecoded(Result result) {
        C9612q.m13917h(result, "result");
        String m26109f = result.m26109f();
        if (m26109f != null && URLUtil.isValidUrl(m26109f)) {
            this.onCodeFound.invoke(m26109f);
        } else {
            this.onCodeNotFound.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.codeScanner.m32267U();
    }

    @Override // com.budiyev.android.codescanner.InterfaceC2808h
    public void onError(Throwable thrown) {
        C9612q.m13917h(thrown, "thrown");
        CrashReporting.INSTANCE.captureException(thrown);
        this.onCodeNotFound.invoke();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.runnable);
    }

    public final void setOnCodeFound(Function1<? super String, Unit> function1) {
        C9612q.m13917h(function1, "<set-?>");
        this.onCodeFound = function1;
    }

    public final void setOnCodeNotFound(Function0<Unit> function0) {
        C9612q.m13917h(function0, "<set-?>");
        this.onCodeNotFound = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRScanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        QrScannerBinding inflate = QrScannerBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        CodeScanner codeScanner = new CodeScanner(context, inflate.qrScanner);
        this.codeScanner = codeScanner;
        this.runnable = new Runnable() { // from class: com.discord.qr.scanner.a
            @Override // java.lang.Runnable
            public final void run() {
                QRScanner.runnable$lambda$0(QRScanner.this);
            }
        };
        this.onCodeFound = QRScanner$onCodeFound$1.INSTANCE;
        this.onCodeNotFound = QRScanner$onCodeNotFound$1.INSTANCE;
        inflate.getRoot().setBackgroundColor(-16777216);
        CodeScannerView codeScannerView = inflate.qrScanner;
        C9612q.m13918g(codeScannerView, "binding.qrScanner");
        codeScannerView.setVisibility(0);
        inflate.qrScanner.setFrameColor(ColorUtilsKt.getColorCompat(context, C3388R.color.brand));
        codeScanner.m32260a0(-1);
        codeScanner.m32250f0(CodeScanner.f7518K);
        codeScanner.m32258b0(this);
        codeScanner.m32256c0(this);
    }
}