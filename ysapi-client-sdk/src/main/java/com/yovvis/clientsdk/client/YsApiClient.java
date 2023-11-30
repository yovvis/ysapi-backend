package com.yovvis.clientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.yovvis.clientsdk.model.User;
import com.yovvis.clientsdk.utils.SignUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 第三方调用api
 *
 * @author yovvis
 * @date 2023/11/16
 */
public class YsApiClient {

    private String accessKey;
    private String secretKey;

    public YsApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    private Map<String, String> getHeaderMap(String body) {
        Map<String, String> map = new HashMap<>();
        map.put("accessKey", accessKey);
        map.put("body", body);
        map.put("sign", SignUtils.genSign(body, secretKey));
        map.put("nonce", RandomUtil.randomNumbers(4));
        map.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));

        return map;
    }

    public String getNameByGet(String name) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.get("http://localhost:8088/api/name/get/", paramMap);
        System.out.println(result);
        return result;
    }

    public String getNameByPost(String name) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.post("http://localhost:8088/api/name/post/", paramMap);
        System.out.println(result);
        return result;
    }

    public String getUsernameByPost(User user) {
        String userJson = JSONUtil.toJsonStr(user);
        HttpResponse response = HttpRequest.post("http://localhost:8088/api/name/user")
            .addHeaders(getHeaderMap(userJson)).body(userJson).execute();
        System.out.println(response.body());
        return response.body();
    }
}
