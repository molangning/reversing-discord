package com.discord.file_downloader;

import android.app.DownloadManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/discord/file_downloader/DownloadState;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.file_downloader.PublicFileDownloader$downloadFile$1", m13986f = "PublicFileDownloader.kt", m13985l = {29, 37, 62}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class PublicFileDownloader$downloadFile$1 extends AbstractC9578k implements Function2<ProducerScope<? super DownloadState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $description;
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.file_downloader.PublicFileDownloader$downloadFile$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C31731 extends AbstractC9614s implements Function0<Unit> {
        final /* synthetic */ ProducerScope<DownloadState> $$this$callbackFlow;
        final /* synthetic */ Ref$LongRef $downloadId;
        final /* synthetic */ String $fileName;
        final /* synthetic */ DownloadManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C31731(Ref$LongRef ref$LongRef, ProducerScope<? super DownloadState> producerScope, DownloadManager downloadManager, String str) {
            super(0);
            this.$downloadId = ref$LongRef;
            this.$$this$callbackFlow = producerScope;
            this.$manager = downloadManager;
            this.$fileName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f25302a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PublicFileDownloader.onDownloadListeners.remove(Long.valueOf(this.$downloadId.f25328j));
            PublicFileDownloader.INSTANCE.onFileDownloaded(this.$$this$callbackFlow, this.$manager, this.$downloadId.f25328j, this.$fileName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.file_downloader.PublicFileDownloader$downloadFile$1$2 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C31742 extends AbstractC9614s implements Function0<Unit> {
        final /* synthetic */ Ref$LongRef $downloadId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31742(Ref$LongRef ref$LongRef) {
            super(0);
            this.$downloadId = ref$LongRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f25302a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PublicFileDownloader.onDownloadListeners.remove(Long.valueOf(this.$downloadId.f25328j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublicFileDownloader$downloadFile$1(Context context, String str, String str2, String str3, Continuation<? super PublicFileDownloader$downloadFile$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$url = str;
        this.$fileName = str2;
        this.$description = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PublicFileDownloader$downloadFile$1 publicFileDownloader$downloadFile$1 = new PublicFileDownloader$downloadFile$1(this.$context, this.$url, this.$fileName, this.$description, continuation);
        publicFileDownloader$downloadFile$1.L$0 = obj;
        return publicFileDownloader$downloadFile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super DownloadState> producerScope, Continuation<? super Unit> continuation) {
        return ((PublicFileDownloader$downloadFile$1) create(producerScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:(1:(1:(3:6|7|8)(2:10|11))(9:12|13|14|15|16|17|(1:19)|7|8))(1:23))(2:41|(1:43))|24|25|26|(2:38|(2:30|(1:32)(7:33|15|16|17|(0)|7|8))(5:34|17|(0)|7|8))|28|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bd, code lost:
        r3 = r12;
        r12 = r1;
        r1 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[Catch: Exception -> 0x00bc, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bc, blocks: (B:20:0x0064, B:28:0x0088, B:34:0x00a7), top: B:45:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[Catch: Exception -> 0x00bc, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bc, blocks: (B:20:0x0064, B:28:0x0088, B:34:0x00a7), top: B:45:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.file_downloader.PublicFileDownloader$downloadFile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
