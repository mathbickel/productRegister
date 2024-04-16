package Http.router;

import Http.router.HttpClient.HttpClient;

public class Router {
    protected HttpClient httpClient;

    public Router(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    void init() {
        HttpClient.setPort(8080);
    }
}
