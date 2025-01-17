/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.smpn.v20190822.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSmpnMhmRequest extends AbstractModel {

    /**
    * 号码营销监控请求内容
    */
    @SerializedName("RequestData")
    @Expose
    private MHMRequest RequestData;

    /**
    * 用于计费的资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 号码营销监控请求内容 
     * @return RequestData 号码营销监控请求内容
     */
    public MHMRequest getRequestData() {
        return this.RequestData;
    }

    /**
     * Set 号码营销监控请求内容
     * @param RequestData 号码营销监控请求内容
     */
    public void setRequestData(MHMRequest RequestData) {
        this.RequestData = RequestData;
    }

    /**
     * Get 用于计费的资源ID 
     * @return ResourceId 用于计费的资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 用于计费的资源ID
     * @param ResourceId 用于计费的资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public DescribeSmpnMhmRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSmpnMhmRequest(DescribeSmpnMhmRequest source) {
        if (source.RequestData != null) {
            this.RequestData = new MHMRequest(source.RequestData);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RequestData.", this.RequestData);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

