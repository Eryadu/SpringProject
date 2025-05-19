package io.pragra.feb2025ioc.PropertySourceAndValue;

public class AppInfo {
    private final String appName;
    private final String appVersion;

    public AppInfo(String appName, String appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;
    }

    public String getAppName() {
        return appName;
    }
    public String getAppVersion() {
        return appVersion;
    }

    @Override
    public String toString() {
        return "AppInfo{" +
                "appName='" + appName + '\'' +
                ", appVersion='" + appVersion + '\'' +
                '}';
    }
}
