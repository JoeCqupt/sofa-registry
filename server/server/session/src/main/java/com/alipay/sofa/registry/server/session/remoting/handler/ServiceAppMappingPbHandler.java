/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.registry.server.session.remoting.handler;

import com.alipay.sofa.registry.common.model.Node;
import com.alipay.sofa.registry.common.model.Node.NodeType;
import com.alipay.sofa.registry.common.model.client.pb.ServiceAppMappingRequest;
import com.alipay.sofa.registry.common.model.client.pb.ServiceAppMappingResponse;
import com.alipay.sofa.registry.remoting.Channel;
import com.alipay.sofa.registry.server.session.strategy.AppRevisionHandlerStrategy;
import com.alipay.sofa.registry.server.shared.remoting.AbstractServerHandler;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 *
 * @author xiaojian.xj
 * @version $Id: ServiceAppMappingPbHandler.java, v 0.1 2021年02月04日 20:18 xiaojian.xj Exp $
 */
public class ServiceAppMappingPbHandler extends AbstractServerHandler<ServiceAppMappingRequest> {

    @Autowired
    private AppRevisionHandlerStrategy appRevisionHandlerStrategy;

    @Override
    protected NodeType getConnectNodeType() {
        return Node.NodeType.CLIENT;
    }

    @Override
    public Object doHandle(Channel channel, ServiceAppMappingRequest request) {

        List<String> services = request.getServiceIdsList()
            .subList(0, request.getServiceIdsCount());
        ServiceAppMappingResponse response = appRevisionHandlerStrategy.queryApps(services);
        return response;
    }

    @Override
    public Class interest() {
        return ServiceAppMappingRequest.class;
    }
}