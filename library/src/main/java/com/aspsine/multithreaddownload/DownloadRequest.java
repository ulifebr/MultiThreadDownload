package com.aspsine.multithreaddownload;


import android.support.annotation.Nullable;

import java.io.File;
import java.util.Map;

/**
 * Created by Aspsine on 2015/4/20.
 */
public class DownloadRequest {
    private String mUri;

    private File mFolder;

    private CharSequence mTitle;

    private CharSequence mDescription;

    private boolean mScannable;

    private Map<String, String> headers;

    private DownloadRequest() {
    }

    public DownloadRequest(String mUri, File mFolder, CharSequence mTitle, CharSequence mDescription, boolean mScannable,@Nullable Map<String, String> headers) {
        this.mUri = mUri;
        this.mFolder = mFolder;
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mScannable = mScannable;
        this.headers = headers;
    }

    public String getUri() {
        return mUri;
    }

    public File getFolder() {
        return mFolder;
    }

    public CharSequence getTitle() {
        return mTitle;
    }

    public CharSequence getDescription() {
        return mDescription;
    }

    public boolean isScannable() {
        return mScannable;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public static class Builder {

        private String mUri;

        private File mFolder;

        private CharSequence mTitle;

        private CharSequence mDescription;

        private boolean mScannable;

        private Map<String, String> headers;

        public Builder() {
        }

        public Builder setUri(String uri) {
            this.mUri = uri;
            return this;
        }

        public Builder setFolder(File folder) {
            this.mFolder = folder;
            return this;
        }

        public Builder setTitle(CharSequence title) {
            this.mTitle = title;
            return this;
        }

        public Builder setDescription(CharSequence description) {
            this.mDescription = description;
            return this;
        }

        public Builder setScannable(boolean scannable) {
            this.mScannable = scannable;
            return this;
        }

        public Builder setHeaders (Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public DownloadRequest build() {
            DownloadRequest request = new DownloadRequest(mUri, mFolder, mTitle, mDescription, mScannable, headers);
            return request;
        }
    }
}
