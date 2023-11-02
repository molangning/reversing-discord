package com.discord.misc.utilities.keyboard;

import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.C9568b;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import pf.C11586t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.misc.utilities.keyboard.KeyboardExtensionsKt$showKeyboard$1", m13986f = "KeyboardExtensions.kt", m13985l = {}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class KeyboardExtensionsKt$showKeyboard$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $self;
    final /* synthetic */ Window $window;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardExtensionsKt$showKeyboard$1(Window window, View view, Continuation<? super KeyboardExtensionsKt$showKeyboard$1> continuation) {
        super(2, continuation);
        this.$window = window;
        this.$self = view;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KeyboardExtensionsKt$showKeyboard$1(this.$window, this.$self, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KeyboardExtensionsKt$showKeyboard$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Object invokeSuspend(Object obj) {
        WindowInsetsControllerCompat insetsController;
        EditText editText;
        C13277d.m2869d();
        if (this.label == 0) {
            C11586t.m7586b(obj);
            insetsController = KeyboardExtensionsKt.getInsetsController(this.$window, this.$self);
            insetsController.m37669e(WindowInsetsCompat.C1163m.m37680b());
            View view = this.$self;
            if (view instanceof EditText) {
                editText = (EditText) view;
            } else {
                editText = null;
            }
            if (editText != null) {
                C9568b.m13991a(editText.requestFocus());
            }
            return Unit.f25302a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
