/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.neuron.election;
/**
 * 服务器心跳数据包
 *
 * @version : 2016年09月10日
 * @author 赵永春(zyc@hasor.net)
 */
public class LeaderBeatData {
    private String serverID    = null; //候选人 ServerID
    private String term        = null; //候选人当前 term 值
    private String commitIndex = null; //候选人最后日志条目的任期号
    //
    //
    public String getServerID() {
        return serverID;
    }
    public void setServerID(String serverID) {
        this.serverID = serverID;
    }
    public String getTerm() {
        return term;
    }
    public void setTerm(String term) {
        this.term = term;
    }
    public String getCommitIndex() {
        return commitIndex;
    }
    public void setCommitIndex(String commitIndex) {
        this.commitIndex = commitIndex;
    }
}