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
package net.hasor.rsf.filters.thread;
import net.hasor.rsf.RsfResponse;
import net.hasor.rsf.domain.warp.AbstractRsfResponseWarp;
/**
 * {@link RsfResponse}接口包装器（当前线程绑定）。
 * @version : 2014年10月25日
 * @author 赵永春 (zyc@hasor.net)
 */
public class RsfResponseLocal extends AbstractRsfResponseWarp {
    private static final ThreadLocal<RsfResponse> LOCAL_RESPONSE = new ThreadLocal<RsfResponse>();
    @Override
    protected final RsfResponse getRsfResponse() {
        return LOCAL_RESPONSE.get();
    }
    //
    static void removeLocal() {
        if (LOCAL_RESPONSE.get() != null) {
            LOCAL_RESPONSE.remove();
        }
    }
    static void updateLocal(RsfResponse rsfResponse) {
        removeLocal();
        if (rsfResponse != null) {
            LOCAL_RESPONSE.set(rsfResponse);
        }
    }
}