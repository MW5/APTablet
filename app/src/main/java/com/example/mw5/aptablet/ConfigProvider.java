package com.example.mw5.aptablet;

class ConfigProvider {
    private String apiUrl = "http://10.0.2.2:8000/api";
    private String credentialsApi = "/credentialsApi";

    private String getResourcesApi = "/getResources";
    private String releaseResourceApi = "/releaseResource";

    private String getConditionTasksApi = "/getConditionTasks";

    private String getPolishingTasksApi = "/getPolishingTasks";

    private String getAutodetailingTasksApi = "/getAutodetailingTasks";

    private String serveTaskApi = "/serveTask";

    private String startTask = "startTask";
    private String endTask = "endTask";


    public String getApiUrl() {
        return apiUrl;
    }

    public String getCredentialsApi() {
        return credentialsApi;
    }

    public String getGetResourcesApi() {
        return getResourcesApi;
    }

    public String getReleaseResourceApi() {
        return releaseResourceApi;
    }

    public String getGetConditionTasksApi() {
        return getConditionTasksApi;
    }

    public String getGetPolishingTasksApi() {
        return getPolishingTasksApi;
    }

    public String getGetAutodetailingTasksApi() {
        return getAutodetailingTasksApi;
    }

    public String getServeTaskApi() {
        return serveTaskApi;
    }

    public String getStartTask() {
        return startTask;
    }

    public String getEndTask() {
        return endTask;
    }
}
