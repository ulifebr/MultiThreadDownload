package com.aspsine.multithreaddownload;

import android.support.annotation.Nullable;

import java.io.File;
import java.io.Serializable;
import java.util.Map;

/**
 * Created by aspsine on 15-4-19.
 */
public class DownloadInfo {
    private String name;
    private String uri;
    private File dir;
    private int progress;
    private long length;
    private long finished;
    private boolean acceptRanges;
    private Map<String,String> headers;

    private int status;

    public DownloadInfo() {
    }

    public DownloadInfo(String name, String uri, File dir, @Nullable Map<String,String> headers) {
        this.name = name;
        this.uri = uri;
        this.dir = dir;
        this.headers = headers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public File getDir() {
        return dir;
    }

    public void setDir(File dir) {
        this.dir = dir;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getFinished() {
        return finished;
    }

    public void setFinished(long finished) {
        this.finished = finished;
    }

    public boolean isAcceptRanges() {
        return acceptRanges;
    }

    public void setAcceptRanges(boolean acceptRanges) {
        this.acceptRanges = acceptRanges;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
}
