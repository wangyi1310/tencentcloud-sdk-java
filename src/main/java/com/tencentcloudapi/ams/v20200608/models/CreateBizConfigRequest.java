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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBizConfigRequest extends AbstractModel{

    /**
    * 业务类型，仅限英文字母、数字和下划线（_）组成，长度不超过8位
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 配置信息，
    */
    @SerializedName("MediaModeration")
    @Expose
    private MediaModerationConfig MediaModeration;

    /**
    * 业务名称，用于标识业务场景，长度不超过32位
    */
    @SerializedName("BizName")
    @Expose
    private String BizName;

    /**
    * 审核内容，可选：Polity (政治); Porn (色情); Illegal(违法);Abuse (谩骂); Terror (暴恐); Ad (广告);
    */
    @SerializedName("ModerationCategories")
    @Expose
    private String [] ModerationCategories;

    /**
     * Get 业务类型，仅限英文字母、数字和下划线（_）组成，长度不超过8位 
     * @return BizType 业务类型，仅限英文字母、数字和下划线（_）组成，长度不超过8位
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 业务类型，仅限英文字母、数字和下划线（_）组成，长度不超过8位
     * @param BizType 业务类型，仅限英文字母、数字和下划线（_）组成，长度不超过8位
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 配置信息， 
     * @return MediaModeration 配置信息，
     */
    public MediaModerationConfig getMediaModeration() {
        return this.MediaModeration;
    }

    /**
     * Set 配置信息，
     * @param MediaModeration 配置信息，
     */
    public void setMediaModeration(MediaModerationConfig MediaModeration) {
        this.MediaModeration = MediaModeration;
    }

    /**
     * Get 业务名称，用于标识业务场景，长度不超过32位 
     * @return BizName 业务名称，用于标识业务场景，长度不超过32位
     */
    public String getBizName() {
        return this.BizName;
    }

    /**
     * Set 业务名称，用于标识业务场景，长度不超过32位
     * @param BizName 业务名称，用于标识业务场景，长度不超过32位
     */
    public void setBizName(String BizName) {
        this.BizName = BizName;
    }

    /**
     * Get 审核内容，可选：Polity (政治); Porn (色情); Illegal(违法);Abuse (谩骂); Terror (暴恐); Ad (广告); 
     * @return ModerationCategories 审核内容，可选：Polity (政治); Porn (色情); Illegal(违法);Abuse (谩骂); Terror (暴恐); Ad (广告);
     */
    public String [] getModerationCategories() {
        return this.ModerationCategories;
    }

    /**
     * Set 审核内容，可选：Polity (政治); Porn (色情); Illegal(违法);Abuse (谩骂); Terror (暴恐); Ad (广告);
     * @param ModerationCategories 审核内容，可选：Polity (政治); Porn (色情); Illegal(违法);Abuse (谩骂); Terror (暴恐); Ad (广告);
     */
    public void setModerationCategories(String [] ModerationCategories) {
        this.ModerationCategories = ModerationCategories;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamObj(map, prefix + "MediaModeration.", this.MediaModeration);
        this.setParamSimple(map, prefix + "BizName", this.BizName);
        this.setParamArraySimple(map, prefix + "ModerationCategories.", this.ModerationCategories);

    }
}
