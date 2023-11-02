package com.discord.sticker.sticker_types;

import android.content.Context;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.FileDownloader;
import com.discord.image.animated_image.animated_image_utils.AnimatedImageStateManager;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.rlottie.RLottieDrawable;
import com.discord.sticker.sticker_types.RLottieImageView;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.C9568b;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.AbstractC9760i2;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9810j;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p388vf.C13277d;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1", m13986f = "RLottieImageView.kt", m13985l = {73, 82}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class RLottieImageView$fetchSticker$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RLottieImageView.Config $config;
    int label;
    final /* synthetic */ RLottieImageView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$1", m13986f = "RLottieImageView.kt", m13985l = {}, m13984m = "invokeSuspend")
    /* renamed from: com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class C35021 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RLottieImageView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35021(RLottieImageView rLottieImageView, Continuation<? super C35021> continuation) {
            super(2, continuation);
            this.this$0 = rLottieImageView;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C35021(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35021) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            C13277d.m2869d();
            if (this.label == 0) {
                C11586t.m7586b(obj);
                this.this$0.clearAnimation();
                return Unit.f25302a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RLottieImageView$fetchSticker$1(RLottieImageView rLottieImageView, RLottieImageView.Config config, Continuation<? super RLottieImageView$fetchSticker$1> continuation) {
        super(2, continuation);
        this.this$0 = rLottieImageView;
        this.$config = config;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RLottieImageView$fetchSticker$1(this.this$0, this.$config, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RLottieImageView$fetchSticker$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        Object m2869d;
        m2869d = C13277d.m2869d();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C11586t.m7586b(obj);
                    return Unit.f25302a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C11586t.m7586b(obj);
        } else {
            C11586t.m7586b(obj);
            AbstractC9760i2 m13568c = C9677b1.m13568c();
            C35021 c35021 = new C35021(this.this$0, null);
            this.label = 1;
            if (C9810j.m13190g(m13568c, c35021, this) == m2869d) {
                return m2869d;
            }
        }
        FileDownloader fileDownloader = FileDownloader.INSTANCE;
        Context context = this.this$0.getContext();
        C9612q.m13918g(context, "context");
        String url = this.$config.getUrl();
        String asset = this.$config.getAsset();
        Flow downloadFile$default = FileDownloader.downloadFile$default(fileDownloader, context, url, asset + ".json", new File(this.this$0.getContext().getCacheDir(), "stickers"), false, 16, null);
        final RLottieImageView rLottieImageView = this.this$0;
        final RLottieImageView.Config config = this.$config;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1.2

            /* JADX INFO: Access modifiers changed from: package-private */
            @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
            @InterfaceC9571e(m13987c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$2$1", m13986f = "RLottieImageView.kt", m13985l = {}, m13984m = "invokeSuspend")
            /* renamed from: com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$2$1 */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
            public static final class C35041 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
                final /* synthetic */ RLottieImageView.Config $config;
                final /* synthetic */ DownloadState $downloadState;
                int label;
                final /* synthetic */ RLottieImageView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C35041(RLottieImageView rLottieImageView, DownloadState downloadState, RLottieImageView.Config config, Continuation<? super C35041> continuation) {
                    super(2, continuation);
                    this.this$0 = rLottieImageView;
                    this.$downloadState = downloadState;
                    this.$config = config;
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C35041(this.this$0, this.$downloadState, this.$config, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                    return ((C35041) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
                public final Object invokeSuspend(Object obj) {
                    RLottieDrawable.PlaybackMode playbackMode;
                    AnimatedImageStateManager animatedImageStateManager;
                    C13277d.m2869d();
                    if (this.label == 0) {
                        C11586t.m7586b(obj);
                        this.this$0.setImageDrawable(null);
                        RLottieImageView rLottieImageView = this.this$0;
                        Context context = rLottieImageView.getContext();
                        C9612q.m13918g(context, "context");
                        File file = ((DownloadState.Completed) this.$downloadState).getFile();
                        int dpToPx = SizeUtilsKt.getDpToPx(this.$config.getWidthDp());
                        int dpToPx2 = SizeUtilsKt.getDpToPx(this.$config.getHeightDp());
                        int renderMode = this.$config.getRenderMode();
                        if (renderMode != 0) {
                            if (renderMode != 1) {
                                playbackMode = RLottieDrawable.PlaybackMode.ONCE;
                            } else {
                                playbackMode = RLottieDrawable.PlaybackMode.FREEZE;
                            }
                        } else {
                            playbackMode = RLottieDrawable.PlaybackMode.LOOP;
                        }
                        rLottieImageView.setAnimation(context, file, dpToPx, dpToPx2, playbackMode);
                        this.this$0.setBackground(null);
                        animatedImageStateManager = this.this$0.rLottieStateManager;
                        return C9568b.m13991a(animatedImageStateManager.onFetchFinished(true, this.$config.getAnimate()));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
            @InterfaceC9571e(m13987c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$2$2", m13986f = "RLottieImageView.kt", m13985l = {}, m13984m = "invokeSuspend")
            /* renamed from: com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$2$2 */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
            public static final class C35052 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
                int label;
                final /* synthetic */ RLottieImageView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C35052(RLottieImageView rLottieImageView, Continuation<? super C35052> continuation) {
                    super(2, continuation);
                    this.this$0 = rLottieImageView;
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C35052(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                    return ((C35052) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
                public final Object invokeSuspend(Object obj) {
                    AnimatedImageStateManager animatedImageStateManager;
                    C13277d.m2869d();
                    if (this.label == 0) {
                        C11586t.m7586b(obj);
                        animatedImageStateManager = this.this$0.rLottieStateManager;
                        return C9568b.m13991a(AnimatedImageStateManager.onFetchFinished$default(animatedImageStateManager, false, false, 2, null));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((DownloadState) obj2, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(DownloadState downloadState, Continuation<? super Unit> continuation) {
                Object m2869d2;
                Object m2869d3;
                if (downloadState instanceof DownloadState.Completed) {
                    Object m13190g = C9810j.m13190g(C9677b1.m13568c(), new C35041(RLottieImageView.this, downloadState, config, null), continuation);
                    m2869d3 = C13277d.m2869d();
                    return m13190g == m2869d3 ? m13190g : Unit.f25302a;
                } else if (downloadState instanceof DownloadState.Failure) {
                    Object m13190g2 = C9810j.m13190g(C9677b1.m13568c(), new C35052(RLottieImageView.this, null), continuation);
                    m2869d2 = C13277d.m2869d();
                    return m13190g2 == m2869d2 ? m13190g2 : Unit.f25302a;
                } else {
                    return Unit.f25302a;
                }
            }
        };
        this.label = 2;
        if (downloadFile$default.collect(flowCollector, this) == m2869d) {
            return m2869d;
        }
        return Unit.f25302a;
    }
}
