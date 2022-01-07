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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Perform operations on Hazelcast distributed set.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HazelcastSetEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Hazelcast Set component.
     */
    public interface HazelcastSetEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedHazelcastSetEndpointConsumerBuilder advanced() {
            return (AdvancedHazelcastSetEndpointConsumerBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointConsumerBuilder defaultOperation(
                HazelcastOperation defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointConsumerBuilder defaultOperation(
                String defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a:
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointConsumerBuilder hazelcastInstance(
                Object hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointConsumerBuilder hazelcastInstance(
                String hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstanceName the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointConsumerBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            doSetProperty("hazelcastInstanceName", hazelcastInstanceName);
            return this;
        }
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
        default HazelcastSetEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Hazelcast Set component.
     */
    public interface AdvancedHazelcastSetEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default HazelcastSetEndpointConsumerBuilder basic() {
            return (HazelcastSetEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Hazelcast Set component.
     */
    public interface HazelcastSetEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedHazelcastSetEndpointProducerBuilder advanced() {
            return (AdvancedHazelcastSetEndpointProducerBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointProducerBuilder defaultOperation(
                HazelcastOperation defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointProducerBuilder defaultOperation(
                String defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a:
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointProducerBuilder hazelcastInstance(
                Object hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointProducerBuilder hazelcastInstance(
                String hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstanceName the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointProducerBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            doSetProperty("hazelcastInstanceName", hazelcastInstanceName);
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
        default HazelcastSetEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Hazelcast Set component.
     */
    public interface AdvancedHazelcastSetEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default HazelcastSetEndpointProducerBuilder basic() {
            return (HazelcastSetEndpointProducerBuilder) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastSetEndpointProducerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastSetEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Hazelcast Set component.
     */
    public interface HazelcastSetEndpointBuilder
            extends
                HazelcastSetEndpointConsumerBuilder,
                HazelcastSetEndpointProducerBuilder {
        default AdvancedHazelcastSetEndpointBuilder advanced() {
            return (AdvancedHazelcastSetEndpointBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointBuilder defaultOperation(
                HazelcastOperation defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointBuilder defaultOperation(
                String defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a:
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointBuilder hazelcastInstance(
                Object hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointBuilder hazelcastInstance(
                String hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstanceName the value to set
         * @return the dsl builder
         */
        default HazelcastSetEndpointBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            doSetProperty("hazelcastInstanceName", hazelcastInstanceName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Hazelcast Set component.
     */
    public interface AdvancedHazelcastSetEndpointBuilder
            extends
                AdvancedHazelcastSetEndpointConsumerBuilder,
                AdvancedHazelcastSetEndpointProducerBuilder {
        default HazelcastSetEndpointBuilder basic() {
            return (HazelcastSetEndpointBuilder) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastSetEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastSetEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
     * enum.
     */
    enum HazelcastOperation {
        PUT,
        DELETE,
        GET,
        UPDATE,
        QUERY,
        GET_ALL,
        CLEAR,
        PUT_IF_ABSENT,
        ADD_ALL,
        REMOVE_ALL,
        RETAIN_ALL,
        EVICT,
        EVICT_ALL,
        VALUE_COUNT,
        CONTAINS_KEY,
        CONTAINS_VALUE,
        GET_KEYS,
        REMOVE_VALUE,
        INCREMENT,
        DECREMENT,
        SET_VALUE,
        DESTROY,
        COMPARE_AND_SET,
        GET_AND_ADD,
        ADD,
        OFFER,
        PEEK,
        POLL,
        REMAINING_CAPACITY,
        DRAIN_TO,
        REMOVE_IF,
        TAKE,
        PUBLISH,
        READ_ONCE_HEAD,
        READ_ONCE_TAIL,
        CAPACITY;
    }

    public interface HazelcastSetBuilders {
        /**
         * Hazelcast Set (camel-hazelcast)
         * Perform operations on Hazelcast distributed set.
         * 
         * Category: cache,datagrid
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * Syntax: <code>hazelcast-set:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * The name of the cache
         * 
         * @param path cacheName
         * @return the dsl builder
         */
        default HazelcastSetEndpointBuilder hazelcastSet(String path) {
            return HazelcastSetEndpointBuilderFactory.endpointBuilder("hazelcast-set", path);
        }
        /**
         * Hazelcast Set (camel-hazelcast)
         * Perform operations on Hazelcast distributed set.
         * 
         * Category: cache,datagrid
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * Syntax: <code>hazelcast-set:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * The name of the cache
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path cacheName
         * @return the dsl builder
         */
        default HazelcastSetEndpointBuilder hazelcastSet(
                String componentName,
                String path) {
            return HazelcastSetEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static HazelcastSetEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class HazelcastSetEndpointBuilderImpl extends AbstractEndpointBuilder implements HazelcastSetEndpointBuilder, AdvancedHazelcastSetEndpointBuilder {
            public HazelcastSetEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new HazelcastSetEndpointBuilderImpl(path);
    }
}