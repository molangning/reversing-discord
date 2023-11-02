package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.widget.ProgressBar;
import com.discord.chat.databinding.FileAttachmentViewBinding;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.PublicFileDownloader;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9810j;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p388vf.C13277d;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1", m13986f = "FileAttachmentView.kt", m13985l = {97}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class FileAttachmentView$setContent$2$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $attachmentDescription;
    final /* synthetic */ String $attachmentName;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ FileAttachmentView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAttachmentView$setContent$2$1(FileAttachmentView fileAttachmentView, String str, String str2, String str3, Continuation<? super FileAttachmentView$setContent$2$1> continuation) {
        super(2, continuation);
        this.this$0 = fileAttachmentView;
        this.$url = str;
        this.$attachmentName = str2;
        this.$attachmentDescription = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileAttachmentView$setContent$2$1(this.this$0, this.$url, this.$attachmentName, this.$attachmentDescription, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileAttachmentView$setContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
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
            PublicFileDownloader publicFileDownloader = PublicFileDownloader.INSTANCE;
            Context context = this.this$0.getContext();
            C9612q.m13918g(context, "context");
            Flow<DownloadState> downloadFile = publicFileDownloader.downloadFile(context, this.$url, this.$attachmentName, this.$attachmentDescription);
            final FileAttachmentView fileAttachmentView = this.this$0;
            FlowCollector<? super DownloadState> flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1.1

                /* JADX INFO: Access modifiers changed from: package-private */
                @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
                @InterfaceC9571e(m13987c = "com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1$1$1", m13986f = "FileAttachmentView.kt", m13985l = {}, m13984m = "invokeSuspend")
                /* renamed from: com.discord.chat.presentation.message.view.FileAttachmentView$setContent$2$1$1$1 */
                /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
                public static final class C30081 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ DownloadState $downloadState;
                    int label;
                    final /* synthetic */ FileAttachmentView this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C30081(DownloadState downloadState, FileAttachmentView fileAttachmentView, Continuation<? super C30081> continuation) {
                        super(2, continuation);
                        this.$downloadState = downloadState;
                        this.this$0 = fileAttachmentView;
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C30081(this.$downloadState, this.this$0, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C30081) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
                    public final Object invokeSuspend(Object obj) {
                        FileAttachmentViewBinding fileAttachmentViewBinding;
                        int i;
                        FileAttachmentViewBinding fileAttachmentViewBinding2;
                        C13277d.m2869d();
                        if (this.label == 0) {
                            C11586t.m7586b(obj);
                            boolean z = this.$downloadState instanceof DownloadState.InProgress;
                            fileAttachmentViewBinding = this.this$0.binding;
                            ProgressBar progressBar = fileAttachmentViewBinding.fileAttachmentDownloadProgressBar;
                            C9612q.m13918g(progressBar, "binding.fileAttachmentDownloadProgressBar");
                            int i2 = 0;
                            if (z) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                            progressBar.setVisibility(i);
                            fileAttachmentViewBinding2 = this.this$0.binding;
                            SimpleDraweeView simpleDraweeView = fileAttachmentViewBinding2.fileAttachmentDownload;
                            C9612q.m13918g(simpleDraweeView, "binding.fileAttachmentDownload");
                            if (!(!z)) {
                                i2 = 8;
                            }
                            simpleDraweeView.setVisibility(i2);
                            return Unit.f25302a;
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
                    Object m13190g = C9810j.m13190g(C9677b1.m13568c(), new C30081(downloadState, FileAttachmentView.this, null), continuation);
                    m2869d2 = C13277d.m2869d();
                    return m13190g == m2869d2 ? m13190g : Unit.f25302a;
                }
            };
            this.label = 1;
            if (downloadFile.collect(flowCollector, this) == m2869d) {
                return m2869d;
            }
        }
        return Unit.f25302a;
    }
}
