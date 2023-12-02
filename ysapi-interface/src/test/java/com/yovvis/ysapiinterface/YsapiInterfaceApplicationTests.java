package com.yovvis.ysapiinterface;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yovvis.clientsdk.client.YsApiClient;
import com.yovvis.clientsdk.model.User;

@SpringBootTest
class YsapiInterfaceApplicationTests {

    @Autowired
    private YsApiClient ysApiClient;

    @Test
    void contextLoads() {
        String result = ysApiClient.getNameByGet("yovvis");
        User user = new User();
        user.setName("yovvis");
        String usernameByPost = ysApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println();
        System.out.println(usernameByPost);
    }
}
