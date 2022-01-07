/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.ahc.ws.WsComponent;

/**
 * Exchange data with external Websocket servers using Async Http Client.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AhcWsComponentBuilderFactory {

    /**
     * Async HTTP Client (AHC) Websocket (camel-ahc-ws)
     * Exchange data with external Websocket servers using Async Http Client.
     * 
     * Category: websocket
     * Since: 2.14
     * Maven coordinates: org.apache.camel:camel-ahc-ws
     * 
     * @return the dsl builder
     */
    static AhcWsComponentBuilder ahcWs() {
        return new AhcWsComponentBuilderImpl();
    }

    /**
     * Builder for the Async HTTP Client (AHC) Websocket component.
     */
    interface AhcWsComponentBuilder extends ComponentBuilder<WsComponent> {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AhcWsComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AhcWsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether to allow java serialization when a request uses
         * context-type=application/x-java-serialized-object This is by default
         * turned off. If you enable this then be aware that Java will
         * deserialize the incoming data from the request to Java and that can
         * be a potential security risk.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param allowJavaSerializedObject the value to set
         * @return the dsl builder
         */
        default AhcWsComponentBuilder allowJavaSerializedObject(
                boolean allowJavaSerializedObject) {
            doSetProperty("allowJavaSerializedObject", allowJavaSerializedObject);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default AhcWsComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To use a custom AhcBinding which allows to control how to bind
         * between AHC and Camel.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.ahc.AhcBinding&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param binding the value to set
         * @return the dsl builder
         */
        default AhcWsComponentBuilder binding(
                org.apache.camel.component.ahc.AhcBinding binding) {
            doSetProperty("binding", binding);
            return this;
        }
        /**
         * To use a custom AsyncHttpClient.
         * 
         * The option is a:
         * &lt;code&gt;org.asynchttpclient.AsyncHttpClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default AhcWsComponentBuilder client(
                org.asynchttpclient.AsyncHttpClient client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * To configure the AsyncHttpClient to use a custom
         * com.ning.http.client.AsyncHttpClientConfig instance.
         * 
         * The option is a:
         * &lt;code&gt;org.asynchttpclient.AsyncHttpClientConfig&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param clientConfig the value to set
         * @return the dsl builder
         */
        default AhcWsComponentBuilder clientConfig(
                org.asynchttpclient.AsyncHttpClientConfig clientConfig) {
            doSetProperty("clientConfig", clientConfig);
            return this;
        }
        /**
         * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
         * header to and from Camel message.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.HeaderFilterStrategy&lt;/code&gt;
         * type.
         * 
         * Group: filter
         * 
         * @param headerFilterStrategy the value to set
         * @return the dsl builder
         */
        default AhcWsComponentBuilder headerFilterStrategy(
                org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * Reference to a org.apache.camel.support.jsse.SSLContextParameters in
         * the Registry. Note that configuring this option will override any
         * SSL/TLS configuration options provided through the clientConfig
         * option at the endpoint or component level.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default AhcWsComponentBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useGlobalSslContextParameters the value to set
         * @return the dsl builder
         */
        default AhcWsComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
    }

    class AhcWsComponentBuilderImpl
            extends
                AbstractComponentBuilder<WsComponent>
            implements
                AhcWsComponentBuilder {
        @Override
        protected WsComponent buildConcreteComponent() {
            return new WsComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((WsComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((WsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "allowJavaSerializedObject": ((WsComponent) component).setAllowJavaSerializedObject((boolean) value); return true;
            case "autowiredEnabled": ((WsComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "binding": ((WsComponent) component).setBinding((org.apache.camel.component.ahc.AhcBinding) value); return true;
            case "client": ((WsComponent) component).setClient((org.asynchttpclient.AsyncHttpClient) value); return true;
            case "clientConfig": ((WsComponent) component).setClientConfig((org.asynchttpclient.AsyncHttpClientConfig) value); return true;
            case "headerFilterStrategy": ((WsComponent) component).setHeaderFilterStrategy((org.apache.camel.spi.HeaderFilterStrategy) value); return true;
            case "sslContextParameters": ((WsComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "useGlobalSslContextParameters": ((WsComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            default: return false;
            }
        }
    }
}