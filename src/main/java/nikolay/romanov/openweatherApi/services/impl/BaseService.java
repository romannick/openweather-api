package nikolay.romanov.openweatherApi.services.impl;

import com.google.gson.Gson;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;

public abstract class BaseService {
    @Value("${openWeather.baseUrl}")
    protected String baseUrl;

    @Value("${openWeather.apiKey}")
    private String apiKey;

    private final Gson gson = new Gson();
    private final Logger logger = LoggerFactory.getLogger(BaseService.class);
    private final OkHttpClient httpClient = new OkHttpClient.Builder().build();

    protected Object executeRequest(String path, Map<String, String> queryParams, Type responseType) {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(this.baseUrl + path).newBuilder();
        urlBuilder.addQueryParameter("appid", this.apiKey);
        queryParams.forEach(urlBuilder::addQueryParameter);
        String url = urlBuilder.build().toString();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Object response = null;

        try {
            ResponseBody responseBody = this.httpClient.newCall(request).execute().body();
            response = gson.fromJson(responseBody.string(), responseType);
        } catch (Exception exception) {
            logger.warn("Request to url: " + url + "failed!");
        }

        return response;
    }

    protected Map<String, String> getCityParam(String city) {
        return Collections.singletonMap("q", city);
    }
}
