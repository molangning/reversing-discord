package com.discord.simpleast.code;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, m14357d2 = {"<anonymous>", "Lcom/discord/simpleast/code/CodeNode;", "R", "S", "codeNode", "startsWithNewline", "", "state", "invoke", "(Lcom/discord/simpleast/code/CodeNode;ZLjava/lang/Object;)Lcom/discord/simpleast/code/CodeNode;"}, m14356k = 3, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class CodeRules$createCodeRule$1 extends AbstractC9614s implements Function3 {
    public static final CodeRules$createCodeRule$1 INSTANCE = new CodeRules$createCodeRule$1();

    CodeRules$createCodeRule$1() {
        super(3);
    }

    public final CodeNode invoke(CodeNode codeNode, boolean z, Object obj) {
        C9612q.m13917h(codeNode, "codeNode");
        return codeNode;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((CodeNode) obj, ((Boolean) obj2).booleanValue(), obj3);
    }
}
