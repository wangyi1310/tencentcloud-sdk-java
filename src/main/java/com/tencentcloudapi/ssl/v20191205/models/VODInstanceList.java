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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VODInstanceList extends AbstractModel {

    /**
    * vod实例详情	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceList")
    @Expose
    private VodInstanceDetail [] InstanceList;

    /**
    * 该地域下vod实例总数	
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get vod实例详情	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceList vod实例详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VodInstanceDetail [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set vod实例详情	
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceList vod实例详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceList(VodInstanceDetail [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get 该地域下vod实例总数	 
     * @return TotalCount 该地域下vod实例总数	
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 该地域下vod实例总数	
     * @param TotalCount 该地域下vod实例总数	
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public VODInstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VODInstanceList(VODInstanceList source) {
        if (source.InstanceList != null) {
            this.InstanceList = new VodInstanceDetail[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new VodInstanceDetail(source.InstanceList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

