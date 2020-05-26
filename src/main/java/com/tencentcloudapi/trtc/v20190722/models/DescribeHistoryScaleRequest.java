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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHistoryScaleRequest extends AbstractModel{

    /**
    * 用户sdkappid
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * 查询开始时间，5天内。本地unix时间戳（1588031999s）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询结束时间，本地unix时间戳（1588031999s）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 用户sdkappid 
     * @return SdkAppId 用户sdkappid
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 用户sdkappid
     * @param SdkAppId 用户sdkappid
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 查询开始时间，5天内。本地unix时间戳（1588031999s） 
     * @return StartTime 查询开始时间，5天内。本地unix时间戳（1588031999s）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间，5天内。本地unix时间戳（1588031999s）
     * @param StartTime 查询开始时间，5天内。本地unix时间戳（1588031999s）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，本地unix时间戳（1588031999s） 
     * @return EndTime 查询结束时间，本地unix时间戳（1588031999s）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，本地unix时间戳（1588031999s）
     * @param EndTime 查询结束时间，本地unix时间戳（1588031999s）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}
