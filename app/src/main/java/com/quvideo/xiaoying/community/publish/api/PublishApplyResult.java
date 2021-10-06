package com.quvideo.xiaoying.community.publish.api;

import java.util.List;

public class PublishApplyResult {
    public String code;
    public PublishApplyResultData data;
    public String message;
    public boolean status;

    public String getCode() {
        return this.code;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean z) {
        this.status = z;
    }

    public PublishApplyResultData getData() {
        return this.data;
    }

    public void setData(PublishApplyResultData publishApplyResultData) {
        this.data = publishApplyResultData;
    }

    public static class PublishApplyResultData {
        public String puiddigest;
        public List<UploadDetial> upload;
        public String viewUrl;

        public String getPuiddigest() {
            return this.puiddigest;
        }

        public void setPuiddigest(String str) {
            this.puiddigest = str;
        }

        public String getViewUrl() {
            return this.viewUrl;
        }

        public void setViewUrl(String str) {
            this.viewUrl = str;
        }

        public List<UploadDetial> getUpload() {
            return this.upload;
        }

        public void setUpload(List<UploadDetial> list) {
            this.upload = list;
        }
    }

    public static class UploadDetial {
        public String accessKey;
        public String accessSecret;
        public String bucketName;
        public String cloudFilePath;
        public int cloudType;
        public String destUrl;
        public int expire;
        public String expireTime;
        public String fileType;
        public int flag;
        public String localFile;
        public int recvSize;
        public String region;
        public String uploadKey;
        public String uploadToken;

        public String getLocalFile() {
            return this.localFile;
        }

        public void setLocalFile(String str) {
            this.localFile = str;
        }

        public String getBucketName() {
            return this.bucketName;
        }

        public void setBucketName(String str) {
            this.bucketName = str;
        }

        public int getFlag() {
            return this.flag;
        }

        public void setFlag(int i) {
            this.flag = i;
        }

        public String getUploadKey() {
            return this.uploadKey;
        }

        public void setUploadKey(String str) {
            this.uploadKey = str;
        }

        public String getUploadToken() {
            return this.uploadToken;
        }

        public void setUploadToken(String str) {
            this.uploadToken = str;
        }

        public String getCloudFilePath() {
            return this.cloudFilePath;
        }

        public void setCloudFilePath(String str) {
            this.cloudFilePath = str;
        }

        public String getAccessSecret() {
            return this.accessSecret;
        }

        public void setAccessSecret(String str) {
            this.accessSecret = str;
        }

        public String getExpireTime() {
            return this.expireTime;
        }

        public void setExpireTime(String str) {
            this.expireTime = str;
        }

        public String getAccessKey() {
            return this.accessKey;
        }

        public void setAccessKey(String str) {
            this.accessKey = str;
        }

        public int getCloudType() {
            return this.cloudType;
        }

        public void setCloudType(int i) {
            this.cloudType = i;
        }

        public int getRecvSize() {
            return this.recvSize;
        }

        public void setRecvSize(int i) {
            this.recvSize = i;
        }

        public int getExpire() {
            return this.expire;
        }

        public void setExpire(int i) {
            this.expire = i;
        }

        public String getFileType() {
            return this.fileType;
        }

        public void setFileType(String str) {
            this.fileType = str;
        }

        public String getDestUrl() {
            return this.destUrl;
        }

        public void setDestUrl(String str) {
            this.destUrl = str;
        }
    }
}