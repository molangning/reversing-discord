package com.discord.sounds.utils;

import android.content.Context;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.FileDownloader;
import com.discord.logging.Log;
import com.discord.sounds.SoundManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1", m13986f = "SoundExtensions.kt", m13985l = {42}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class SoundExtensionsKt$fetchSound$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fileName;
    final /* synthetic */ int $key;
    final /* synthetic */ File $soundDirectory;
    final /* synthetic */ SoundManager $soundManager;
    final /* synthetic */ Function1<Integer, Unit> $soundResIdPrepared;
    final /* synthetic */ String $url;
    final /* synthetic */ int $usage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SoundExtensionsKt$fetchSound$1(Context context, String str, String str2, File file, SoundManager soundManager, int i, int i2, Function1<? super Integer, Unit> function1, Continuation<? super SoundExtensionsKt$fetchSound$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$url = str;
        this.$fileName = str2;
        this.$soundDirectory = file;
        this.$soundManager = soundManager;
        this.$key = i;
        this.$usage = i2;
        this.$soundResIdPrepared = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SoundExtensionsKt$fetchSound$1(this.$context, this.$url, this.$fileName, this.$soundDirectory, this.$soundManager, this.$key, this.$usage, this.$soundResIdPrepared, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SoundExtensionsKt$fetchSound$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        m2869d = C13277d.m2869d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C11586t.m7586b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C11586t.m7586b(obj);
            Flow downloadFile$default = FileDownloader.downloadFile$default(FileDownloader.INSTANCE, this.$context, this.$url, this.$fileName, this.$soundDirectory, false, 16, null);
            C34911 c34911 = new C34911(this.$soundManager, this.$key, this.$usage, this.$soundResIdPrepared);
            this.label = 1;
            if (downloadFile$default.collect(c34911, this) == m2869d) {
                return m2869d;
            }
        }
        return Unit.f25302a;
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "downloadState", "Lcom/discord/file_downloader/DownloadState;", "emit", "(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class C34911<T> implements FlowCollector {
        final /* synthetic */ int $key;
        final /* synthetic */ SoundManager $soundManager;
        final /* synthetic */ Function1<Integer, Unit> $soundResIdPrepared;
        final /* synthetic */ int $usage;

        @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        @InterfaceC9571e(m13987c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1", m13986f = "SoundExtensions.kt", m13985l = {}, m13984m = "invokeSuspend")
        /* renamed from: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1 */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class C34921 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ DownloadState $downloadState;
            final /* synthetic */ int $key;
            final /* synthetic */ SoundManager $soundManager;
            final /* synthetic */ Function1<Integer, Unit> $soundResIdPrepared;
            final /* synthetic */ int $usage;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C34921(SoundManager soundManager, int i, int i2, DownloadState downloadState, Function1<? super Integer, Unit> function1, Continuation<? super C34921> continuation) {
                super(2, continuation);
                this.$soundManager = soundManager;
                this.$key = i;
                this.$usage = i2;
                this.$downloadState = downloadState;
                this.$soundResIdPrepared = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C34921(this.$soundManager, this.$key, this.$usage, this.$downloadState, this.$soundResIdPrepared, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C34921) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Object invokeSuspend(Object obj) {
                C13277d.m2869d();
                if (this.label == 0) {
                    C11586t.m7586b(obj);
                    this.$soundManager.prepare(this.$key, this.$usage, null, ((DownloadState.Completed) this.$downloadState).getFile().getAbsolutePath(), this.$soundResIdPrepared);
                    return Unit.f25302a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        @InterfaceC9571e(m13987c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$2", m13986f = "SoundExtensions.kt", m13985l = {}, m13984m = "invokeSuspend")
        /* renamed from: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$2 */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class C34932 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f9450$e;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C34932(Exception exc, Continuation<? super C34932> continuation) {
                super(2, continuation);
                this.f9450$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C34932(this.f9450$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C34932) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Object invokeSuspend(Object obj) {
                C13277d.m2869d();
                if (this.label == 0) {
                    C11586t.m7586b(obj);
                    Log.INSTANCE.m31908w(SoundManager.Companion.getLogTag(), "Failed to download sound.", this.f9450$e);
                    return Unit.f25302a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        @InterfaceC9571e(m13987c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$3", m13986f = "SoundExtensions.kt", m13985l = {}, m13984m = "invokeSuspend")
        /* renamed from: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$3 */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class C34943 extends AbstractC9578k implements Function2<CoroutineScope, Continuation, Object> {
            int label;

            C34943(Continuation<? super C34943> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C34943(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C34943) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Object invokeSuspend(Object obj) {
                C13277d.m2869d();
                if (this.label == 0) {
                    C11586t.m7586b(obj);
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C34911(SoundManager soundManager, int i, int i2, Function1<? super Integer, Unit> function1) {
            this.$soundManager = soundManager;
            this.$key = i;
            this.$usage = i2;
            this.$soundResIdPrepared = function1;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(3:17|18|19))(4:20|21|18|19))(2:23|(5:25|(1:27)|21|18|19)(2:28|(1:30)(1:13)))|31|32|(1:34)|18|19))|35|6|7|(0)(0)|31|32|(0)|18|19) */
        /* JADX WARN: Removed duplicated region for block: B:48:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x007e A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(com.discord.file_downloader.DownloadState r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
            /*
                r16 = this;
                r1 = r16
                r0 = r18
                boolean r2 = r0 instanceof com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1
                if (r2 == 0) goto L17
                r2 = r0
                com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1 r2 = (com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1) r2
                int r3 = r2.label
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L17
                int r3 = r3 - r4
                r2.label = r3
                goto L1c
            L17:
                com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1 r2 = new com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1
                r2.<init>(r1, r0)
            L1c:
                java.lang.Object r0 = r2.result
                java.lang.Object r3 = p388vf.C13271b.m2873d()
                int r4 = r2.label
                r5 = 0
                r6 = 3
                r7 = 2
                r8 = 1
                if (r4 == 0) goto L46
                if (r4 == r8) goto L40
                if (r4 == r7) goto L3c
                if (r4 != r6) goto L34
                pf.C11586t.m7586b(r0)
                goto L94
            L34:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L3c:
                pf.C11586t.m7586b(r0)
                goto L7f
            L40:
                pf.C11586t.m7586b(r0)     // Catch: java.lang.Exception -> L44
                goto L7f
            L44:
                r0 = move-exception
                goto L6d
            L46:
                pf.C11586t.m7586b(r0)
                r0 = r17
                boolean r4 = r0 instanceof com.discord.file_downloader.DownloadState.Completed
                if (r4 == 0) goto L82
                kotlinx.coroutines.i2 r4 = kotlinx.coroutines.C9677b1.m13568c()     // Catch: java.lang.Exception -> L44
                com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1 r6 = new com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1     // Catch: java.lang.Exception -> L44
                com.discord.sounds.SoundManager r10 = r1.$soundManager     // Catch: java.lang.Exception -> L44
                int r11 = r1.$key     // Catch: java.lang.Exception -> L44
                int r12 = r1.$usage     // Catch: java.lang.Exception -> L44
                kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r14 = r1.$soundResIdPrepared     // Catch: java.lang.Exception -> L44
                r15 = 0
                r9 = r6
                r13 = r17
                r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L44
                r2.label = r8     // Catch: java.lang.Exception -> L44
                java.lang.Object r0 = kotlinx.coroutines.C9810j.m13190g(r4, r6, r2)     // Catch: java.lang.Exception -> L44
                if (r0 != r3) goto L7f
                return r3
            L6d:
                kotlinx.coroutines.i2 r4 = kotlinx.coroutines.C9677b1.m13568c()
                com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$2 r6 = new com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$2
                r6.<init>(r0, r5)
                r2.label = r7
                java.lang.Object r0 = kotlinx.coroutines.C9810j.m13190g(r4, r6, r2)
                if (r0 != r3) goto L7f
                return r3
            L7f:
                kotlin.Unit r0 = kotlin.Unit.f25302a
                return r0
            L82:
                kotlinx.coroutines.i2 r0 = kotlinx.coroutines.C9677b1.m13568c()
                com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$3 r4 = new com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$3
                r4.<init>(r5)
                r2.label = r6
                java.lang.Object r0 = kotlinx.coroutines.C9810j.m13190g(r0, r4, r2)
                if (r0 != r3) goto L94
                return r3
            L94:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1.C34911.emit(com.discord.file_downloader.DownloadState, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((DownloadState) obj, (Continuation<? super Unit>) continuation);
        }
    }
}