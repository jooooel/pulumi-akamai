// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSecSlowPostArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSecSlowPostArgs Empty = new AppSecSlowPostArgs();

    /**
     * . Unique identifier of the security configuration associated with the slow POST settings being modified.
     * 
     */
    @Import(name="configId", required=true)
    private Output<Integer> configId;

    /**
     * @return . Unique identifier of the security configuration associated with the slow POST settings being modified.
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }

    /**
     * . Maximum amount of time (in seconds) that the first eight kilobytes of the POST body must be received in to avoid triggering the specified action.
     * 
     */
    @Import(name="durationThresholdTimeout")
    private @Nullable Output<Integer> durationThresholdTimeout;

    /**
     * @return . Maximum amount of time (in seconds) that the first eight kilobytes of the POST body must be received in to avoid triggering the specified action.
     * 
     */
    public Optional<Output<Integer>> durationThresholdTimeout() {
        return Optional.ofNullable(this.durationThresholdTimeout);
    }

    /**
     * . Unique identifier of the security policy associated with the slow POST settings being modified.
     * 
     */
    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    /**
     * @return . Unique identifier of the security policy associated with the slow POST settings being modified.
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     * . Action to be taken if slow POST protection is triggered. Allowed values are:
     * - **alert**. Record the event.
     * - **abort**. Block the request.
     * 
     */
    @Import(name="slowRateAction", required=true)
    private Output<String> slowRateAction;

    /**
     * @return . Action to be taken if slow POST protection is triggered. Allowed values are:
     * - **alert**. Record the event.
     * - **abort**. Block the request.
     * 
     */
    public Output<String> slowRateAction() {
        return this.slowRateAction;
    }

    /**
     * . Amount of time (in seconds) that the server should allow a request before marking the request as being too slow.
     * 
     */
    @Import(name="slowRateThresholdPeriod")
    private @Nullable Output<Integer> slowRateThresholdPeriod;

    /**
     * @return . Amount of time (in seconds) that the server should allow a request before marking the request as being too slow.
     * 
     */
    public Optional<Output<Integer>> slowRateThresholdPeriod() {
        return Optional.ofNullable(this.slowRateThresholdPeriod);
    }

    /**
     * . Average rate (in bytes per second over the specified time period) allowed before the specified action is triggered.
     * 
     */
    @Import(name="slowRateThresholdRate")
    private @Nullable Output<Integer> slowRateThresholdRate;

    /**
     * @return . Average rate (in bytes per second over the specified time period) allowed before the specified action is triggered.
     * 
     */
    public Optional<Output<Integer>> slowRateThresholdRate() {
        return Optional.ofNullable(this.slowRateThresholdRate);
    }

    private AppSecSlowPostArgs() {}

    private AppSecSlowPostArgs(AppSecSlowPostArgs $) {
        this.configId = $.configId;
        this.durationThresholdTimeout = $.durationThresholdTimeout;
        this.securityPolicyId = $.securityPolicyId;
        this.slowRateAction = $.slowRateAction;
        this.slowRateThresholdPeriod = $.slowRateThresholdPeriod;
        this.slowRateThresholdRate = $.slowRateThresholdRate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecSlowPostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecSlowPostArgs $;

        public Builder() {
            $ = new AppSecSlowPostArgs();
        }

        public Builder(AppSecSlowPostArgs defaults) {
            $ = new AppSecSlowPostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId . Unique identifier of the security configuration associated with the slow POST settings being modified.
         * 
         * @return builder
         * 
         */
        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId . Unique identifier of the security configuration associated with the slow POST settings being modified.
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param durationThresholdTimeout . Maximum amount of time (in seconds) that the first eight kilobytes of the POST body must be received in to avoid triggering the specified action.
         * 
         * @return builder
         * 
         */
        public Builder durationThresholdTimeout(@Nullable Output<Integer> durationThresholdTimeout) {
            $.durationThresholdTimeout = durationThresholdTimeout;
            return this;
        }

        /**
         * @param durationThresholdTimeout . Maximum amount of time (in seconds) that the first eight kilobytes of the POST body must be received in to avoid triggering the specified action.
         * 
         * @return builder
         * 
         */
        public Builder durationThresholdTimeout(Integer durationThresholdTimeout) {
            return durationThresholdTimeout(Output.of(durationThresholdTimeout));
        }

        /**
         * @param securityPolicyId . Unique identifier of the security policy associated with the slow POST settings being modified.
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * @param securityPolicyId . Unique identifier of the security policy associated with the slow POST settings being modified.
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        /**
         * @param slowRateAction . Action to be taken if slow POST protection is triggered. Allowed values are:
         * - **alert**. Record the event.
         * - **abort**. Block the request.
         * 
         * @return builder
         * 
         */
        public Builder slowRateAction(Output<String> slowRateAction) {
            $.slowRateAction = slowRateAction;
            return this;
        }

        /**
         * @param slowRateAction . Action to be taken if slow POST protection is triggered. Allowed values are:
         * - **alert**. Record the event.
         * - **abort**. Block the request.
         * 
         * @return builder
         * 
         */
        public Builder slowRateAction(String slowRateAction) {
            return slowRateAction(Output.of(slowRateAction));
        }

        /**
         * @param slowRateThresholdPeriod . Amount of time (in seconds) that the server should allow a request before marking the request as being too slow.
         * 
         * @return builder
         * 
         */
        public Builder slowRateThresholdPeriod(@Nullable Output<Integer> slowRateThresholdPeriod) {
            $.slowRateThresholdPeriod = slowRateThresholdPeriod;
            return this;
        }

        /**
         * @param slowRateThresholdPeriod . Amount of time (in seconds) that the server should allow a request before marking the request as being too slow.
         * 
         * @return builder
         * 
         */
        public Builder slowRateThresholdPeriod(Integer slowRateThresholdPeriod) {
            return slowRateThresholdPeriod(Output.of(slowRateThresholdPeriod));
        }

        /**
         * @param slowRateThresholdRate . Average rate (in bytes per second over the specified time period) allowed before the specified action is triggered.
         * 
         * @return builder
         * 
         */
        public Builder slowRateThresholdRate(@Nullable Output<Integer> slowRateThresholdRate) {
            $.slowRateThresholdRate = slowRateThresholdRate;
            return this;
        }

        /**
         * @param slowRateThresholdRate . Average rate (in bytes per second over the specified time period) allowed before the specified action is triggered.
         * 
         * @return builder
         * 
         */
        public Builder slowRateThresholdRate(Integer slowRateThresholdRate) {
            return slowRateThresholdRate(Output.of(slowRateThresholdRate));
        }

        public AppSecSlowPostArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            $.slowRateAction = Objects.requireNonNull($.slowRateAction, "expected parameter 'slowRateAction' to be non-null");
            return $;
        }
    }

}