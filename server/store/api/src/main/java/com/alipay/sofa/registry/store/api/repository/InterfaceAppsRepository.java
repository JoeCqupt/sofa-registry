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
package com.alipay.sofa.registry.store.api.repository;

import com.alipay.sofa.registry.common.model.Tuple;
import com.alipay.sofa.registry.store.api.driver.RegistryRepository;

import java.util.Set;

/**
 *
 * @author xiaojian.xj
 * @version $Id: InterfaceAppsRepository.java, v 0.1 2021年01月24日 19:33 xiaojian.xj Exp $
 */
public interface InterfaceAppsRepository extends RegistryRepository {

    @Override
    default Class<?> getInterfaceClass() {
        return InterfaceAppsRepository.class;
    }

    /**
     * get revisions by interfaceName
     * @param dataInfoId
     * @return return <appName, revisions>
     */
    public Tuple<Long, Set<String>> getAppNames(String dataCenter, String dataInfoId);
    /**
     * insert
     * @param dataCenter
     * @param appName
     * @param revision
     * @return
     */
    default int batchSave(String dataCenter, String appName, Set<String> interfaceName) {return 0;}

    /**
     * refresh when startup
     * @param dataCenter
     */
    void loadMetadata(String dataCenter);
}