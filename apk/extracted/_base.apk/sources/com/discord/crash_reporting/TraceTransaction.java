package com.discord.crash_reporting;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\t¨\u0006\n"}, m14357d2 = {"Lcom/discord/crash_reporting/TraceTransaction;", "", "transactionName", "", "operation", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getOperation", "()Ljava/lang/String;", "getTransactionName", "NativeModuleInit", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public enum TraceTransaction {
    NativeModuleInit("Content Appeared", "ui");
    
    private final String operation;
    private final String transactionName;

    TraceTransaction(String str, String str2) {
        this.transactionName = str;
        this.operation = str2;
    }

    public final String getOperation() {
        return this.operation;
    }

    public final String getTransactionName() {
        return this.transactionName;
    }
}
