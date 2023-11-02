package com.discord.p048qr.scanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.budiyev.android.codescanner.CodeScannerView;
import com.discord.p048qr.scanner.C3388R;
import p357u0.C12815a;

/* renamed from: com.discord.qr.scanner.databinding.QrScannerBinding */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class QrScannerBinding implements ViewBinding {
    public final CodeScannerView qrScanner;
    private final View rootView;

    private QrScannerBinding(View view, CodeScannerView codeScannerView) {
        this.rootView = view;
        this.qrScanner = codeScannerView;
    }

    public static QrScannerBinding bind(View view) {
        int i = C3388R.C3390id.qr_scanner;
        CodeScannerView codeScannerView = (CodeScannerView) C12815a.m3875a(view, i);
        if (codeScannerView != null) {
            return new QrScannerBinding(view, codeScannerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static QrScannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3388R.layout.qr_scanner, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
