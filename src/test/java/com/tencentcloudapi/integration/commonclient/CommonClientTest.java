package com.tencentcloudapi.integration.commonclient;

import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Stack;

import com.tencentcloudapi.apigateway.v20180808.ApigatewayClient;
import com.tencentcloudapi.apigateway.v20180808.models.CreateApiRequest;
import com.tencentcloudapi.apigateway.v20180808.models.ModifyApiRequest;
import com.tencentcloudapi.apigateway.v20180808.models.RequestConfig;
import org.junit.Assert;
import org.junit.Test;

import com.tencentcloudapi.common.CommonClient;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

public class CommonClientTest {

  @Test
  public void testJson() {
    Credential cred =
        new Credential(
            System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
    CommonClient client = new CommonClient("cvm", "2017-03-12", cred, "ap-guangzhou");
    try {
      String resp =
          client.call(
              "DescribeInstances",
              "{\"Filters\":" + "[{\"Name\":\"zone\"," + "\"Values\":[\"ap-guangzhou-1\"]}]" + "}");
    } catch (Exception e) {
      fail(e.toString());
    }
  }

  @Test
  public void testOctetStream() throws TencentCloudSDKException {

    Stack<Integer> st = new Stack<>();
    Credential cred =
        new Credential(
            System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
    ApigatewayClient apigatewayClient = new ApigatewayClient(cred,"chongqing");
    ModifyApiRequest createApiRequest = new ModifyApiRequest();
    createApiRequest.setServiceId("service-94oeznhy");
    createApiRequest.setApiId("api-5hv2mcgm");
    createApiRequest.setServiceScfIsIntegratedResponse(true);
    createApiRequest.setServiceScfFunctionQualifier("$DEFAULT");
    createApiRequest.setSCf
    createApiRequest.setProtocol("HTTP");
    RequestConfig requestConfig = new RequestConfig();
    requestConfig.setMethod("GET");

}
