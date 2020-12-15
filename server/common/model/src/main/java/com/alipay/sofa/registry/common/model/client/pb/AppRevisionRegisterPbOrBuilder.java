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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AppRevisionRegisterPb.proto

package com.alipay.sofa.registry.common.model.client.pb;

public interface AppRevisionRegisterPbOrBuilder extends
// @@protoc_insertion_point(interface_extends:AppRevisionRegisterPb)
                                               com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string appname = 1;</code>
     */
    java.lang.String getAppname();

    /**
     * <code>string appname = 1;</code>
     */
    com.google.protobuf.ByteString getAppnameBytes();

    /**
     * <code>string revision = 2;</code>
     */
    java.lang.String getRevision();

    /**
     * <code>string revision = 2;</code>
     */
    com.google.protobuf.ByteString getRevisionBytes();

    /**
     * <code>map&lt;string, .QueryValues&gt; baseParams = 4;</code>
     */
    int getBaseParamsCount();

    /**
     * <code>map&lt;string, .QueryValues&gt; baseParams = 4;</code>
     */
    boolean containsBaseParams(java.lang.String key);

    /**
     * Use {@link #getBaseParamsMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, com.alipay.sofa.registry.common.model.client.pb.QueryValues> getBaseParams();

    /**
     * <code>map&lt;string, .QueryValues&gt; baseParams = 4;</code>
     */
    java.util.Map<java.lang.String, com.alipay.sofa.registry.common.model.client.pb.QueryValues> getBaseParamsMap();

    /**
     * <code>map&lt;string, .QueryValues&gt; baseParams = 4;</code>
     */

    com.alipay.sofa.registry.common.model.client.pb.QueryValues getBaseParamsOrDefault(java.lang.String key,
                                                                                       com.alipay.sofa.registry.common.model.client.pb.QueryValues defaultValue);

    /**
     * <code>map&lt;string, .QueryValues&gt; baseParams = 4;</code>
     */

    com.alipay.sofa.registry.common.model.client.pb.QueryValues getBaseParamsOrThrow(java.lang.String key);

    /**
     * <code>repeated .AppRevisionInterfacePb interfaces = 5;</code>
     */
    java.util.List<com.alipay.sofa.registry.common.model.client.pb.AppRevisionInterfacePb> getInterfacesList();

    /**
     * <code>repeated .AppRevisionInterfacePb interfaces = 5;</code>
     */
    com.alipay.sofa.registry.common.model.client.pb.AppRevisionInterfacePb getInterfaces(int index);

    /**
     * <code>repeated .AppRevisionInterfacePb interfaces = 5;</code>
     */
    int getInterfacesCount();

    /**
     * <code>repeated .AppRevisionInterfacePb interfaces = 5;</code>
     */
    java.util.List<? extends com.alipay.sofa.registry.common.model.client.pb.AppRevisionInterfacePbOrBuilder> getInterfacesOrBuilderList();

    /**
     * <code>repeated .AppRevisionInterfacePb interfaces = 5;</code>
     */
    com.alipay.sofa.registry.common.model.client.pb.AppRevisionInterfacePbOrBuilder getInterfacesOrBuilder(int index);
}