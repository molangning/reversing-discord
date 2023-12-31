package com.discord.image.animated_image.apng;

import android.content.Context;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.FileDownloader;
import com.discord.image.animated_image.animated_image_utils.AnimatedImageStateManager;
import com.discord.image.animated_image.apng.APNGView;
import com.linecorp.apng.ApngDrawable;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.C9568b;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p388vf.C13277d;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1", m13986f = "APNGView.kt", m13985l = {83}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class APNGView$fetchAPNG$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ APNGView.Config $config;
    int label;
    final /* synthetic */ APNGView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APNGView$fetchAPNG$1(APNGView aPNGView, APNGView.Config config, Continuation<? super APNGView$fetchAPNG$1> continuation) {
        super(2, continuation);
        this.this$0 = aPNGView;
        this.$config = config;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new APNGView$fetchAPNG$1(this.this$0, this.$config, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((APNGView$fetchAPNG$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        String filename;
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
            FileDownloader fileDownloader = FileDownloader.INSTANCE;
            Context context = this.this$0.getContext();
            C9612q.m13918g(context, "context");
            String url = this.$config.getUrl();
            filename = APNGView.Companion.getFilename(this.$config.getUrl());
            Flow downloadFile$default = FileDownloader.downloadFile$default(fileDownloader, context, url, filename, new File(this.this$0.getContext().getCacheDir(), this.$config.getCacheDirectory()), false, 16, null);
            C32071 c32071 = new C32071(this.this$0, this.$config);
            this.label = 1;
            if (downloadFile$default.collect(c32071, this) == m2869d) {
                return m2869d;
            }
        }
        return Unit.f25302a;
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "downloadState", "Lcom/discord/file_downloader/DownloadState;", "emit", "(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C32071<T> implements FlowCollector {
        final /* synthetic */ APNGView.Config $config;
        final /* synthetic */ APNGView this$0;

        @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        @InterfaceC9571e(m13987c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1", m13986f = "APNGView.kt", m13985l = {}, m13984m = "invokeSuspend")
        /* renamed from: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1 */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C32081 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            final /* synthetic */ APNGView.Config $config;
            final /* synthetic */ ApngDrawable $drawable;
            int label;
            final /* synthetic */ APNGView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32081(APNGView aPNGView, ApngDrawable apngDrawable, APNGView.Config config, Continuation<? super C32081> continuation) {
                super(2, continuation);
                this.this$0 = aPNGView;
                this.$drawable = apngDrawable;
                this.$config = config;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C32081(this.this$0, this.$drawable, this.$config, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return ((C32081) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Object invokeSuspend(Object obj) {
                AnimatedImageStateManager animatedImageStateManager;
                C13277d.m2869d();
                if (this.label == 0) {
                    C11586t.m7586b(obj);
                    this.this$0.setImageDrawable(null);
                    this.this$0.setImageDrawable(this.$drawable);
                    this.this$0.setBackground(null);
                    animatedImageStateManager = this.this$0.apngStateManager;
                    return C9568b.m13991a(animatedImageStateManager.onFetchFinished(true, this.$config.getAnimate()));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        @InterfaceC9571e(m13987c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$2", m13986f = "APNGView.kt", m13985l = {}, m13984m = "invokeSuspend")
        /* renamed from: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$2 */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C32092 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            int label;
            final /* synthetic */ APNGView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32092(APNGView aPNGView, Continuation<? super C32092> continuation) {
                super(2, continuation);
                this.this$0 = aPNGView;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C32092(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return ((C32092) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Object invokeSuspend(Object obj) {
                AnimatedImageStateManager animatedImageStateManager;
                C13277d.m2869d();
                if (this.label == 0) {
                    C11586t.m7586b(obj);
                    animatedImageStateManager = this.this$0.apngStateManager;
                    return C9568b.m13991a(AnimatedImageStateManager.onFetchFinished$default(animatedImageStateManager, false, false, 2, null));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        @InterfaceC9571e(m13987c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$3", m13986f = "APNGView.kt", m13985l = {}, m13984m = "invokeSuspend")
        /* renamed from: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$3 */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C32103 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            int label;
            final /* synthetic */ APNGView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32103(APNGView aPNGView, Continuation<? super C32103> continuation) {
                super(2, continuation);
                this.this$0 = aPNGView;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C32103(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return ((C32103) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
            public final Object invokeSuspend(Object obj) {
                AnimatedImageStateManager animatedImageStateManager;
                C13277d.m2869d();
                if (this.label == 0) {
                    C11586t.m7586b(obj);
                    animatedImageStateManager = this.this$0.apngStateManager;
                    return C9568b.m13991a(AnimatedImageStateManager.onFetchFinished$default(animatedImageStateManager, false, false, 2, null));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C32071(APNGView aPNGView, APNGView.Config config) {
            this.this$0 = aPNGView;
            this.$config = config;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x008a A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(com.discord.file_downloader.DownloadState r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r15
                com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1 r0 = (com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1 r0 = new com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1
                r0.<init>(r13, r15)
            L18:
                java.lang.Object r15 = r0.result
                java.lang.Object r1 = p388vf.C13271b.m2873d()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L45
                if (r2 == r5) goto L3d
                if (r2 == r4) goto L39
                if (r2 != r3) goto L31
                pf.C11586t.m7586b(r15)
                goto La3
            L31:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L39:
                pf.C11586t.m7586b(r15)
                goto La6
            L3d:
                java.lang.Object r14 = r0.L$0
                com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1 r14 = (com.discord.image.animated_image.apng.APNGView$fetchAPNG$1.C32071) r14
                pf.C11586t.m7586b(r15)     // Catch: java.lang.Exception -> L75
                goto La6
            L45:
                pf.C11586t.m7586b(r15)
                boolean r15 = r14 instanceof com.discord.file_downloader.DownloadState.Completed
                if (r15 == 0) goto L8b
                com.linecorp.apng.ApngDrawable$b r7 = com.linecorp.apng.ApngDrawable.f14919B     // Catch: java.lang.Exception -> L74
                com.discord.file_downloader.DownloadState$Completed r14 = (com.discord.file_downloader.DownloadState.Completed) r14     // Catch: java.lang.Exception -> L74
                java.io.File r8 = r14.getFile()     // Catch: java.lang.Exception -> L74
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                com.linecorp.apng.ApngDrawable r14 = com.linecorp.apng.ApngDrawable.C5263b.m25587c(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L74
                kotlinx.coroutines.i2 r15 = kotlinx.coroutines.C9677b1.m13568c()     // Catch: java.lang.Exception -> L74
                com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1 r2 = new com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1     // Catch: java.lang.Exception -> L74
                com.discord.image.animated_image.apng.APNGView r3 = r13.this$0     // Catch: java.lang.Exception -> L74
                com.discord.image.animated_image.apng.APNGView$Config r7 = r13.$config     // Catch: java.lang.Exception -> L74
                r2.<init>(r3, r14, r7, r6)     // Catch: java.lang.Exception -> L74
                r0.L$0 = r13     // Catch: java.lang.Exception -> L74
                r0.label = r5     // Catch: java.lang.Exception -> L74
                java.lang.Object r14 = kotlinx.coroutines.C9810j.m13190g(r15, r2, r0)     // Catch: java.lang.Exception -> L74
                if (r14 != r1) goto La6
                return r1
            L74:
                r14 = r13
            L75:
                kotlinx.coroutines.i2 r15 = kotlinx.coroutines.C9677b1.m13568c()
                com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$2 r2 = new com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$2
                com.discord.image.animated_image.apng.APNGView r14 = r14.this$0
                r2.<init>(r14, r6)
                r0.L$0 = r6
                r0.label = r4
                java.lang.Object r14 = kotlinx.coroutines.C9810j.m13190g(r15, r2, r0)
                if (r14 != r1) goto La6
                return r1
            L8b:
                boolean r14 = r14 instanceof com.discord.file_downloader.DownloadState.Failure
                if (r14 == 0) goto La6
                kotlinx.coroutines.i2 r14 = kotlinx.coroutines.C9677b1.m13568c()
                com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$3 r15 = new com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$3
                com.discord.image.animated_image.apng.APNGView r2 = r13.this$0
                r15.<init>(r2, r6)
                r0.label = r3
                java.lang.Object r14 = kotlinx.coroutines.C9810j.m13190g(r14, r15, r0)
                if (r14 != r1) goto La3
                return r1
            La3:
                kotlin.Unit r14 = kotlin.Unit.f25302a
                return r14
            La6:
                kotlin.Unit r14 = kotlin.Unit.f25302a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1.C32071.emit(com.discord.file_downloader.DownloadState, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((DownloadState) obj, (Continuation<? super Unit>) continuation);
        }
    }
}