package com.discord.p048qr.scanner;

import com.discord.p048qr.scanner.events.OnQRCodeFoundEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "code", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* renamed from: com.discord.qr.scanner.QRScannerViewManager$createViewInstance$1$1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class QRScannerViewManager$createViewInstance$1$1 extends AbstractC9614s implements Function1<String, Unit> {
    final /* synthetic */ QRScanner $scanner;
    final /* synthetic */ QRScannerViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRScannerViewManager$createViewInstance$1$1(QRScannerViewManager qRScannerViewManager, QRScanner qRScanner) {
        super(1);
        this.this$0 = qRScannerViewManager;
        this.$scanner = qRScanner;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(String code) {
        ReactEvents reactEvents;
        C9612q.m13917h(code, "code");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitEvent(this.$scanner, new OnQRCodeFoundEvent("SUCCEEDED", code));
    }
}