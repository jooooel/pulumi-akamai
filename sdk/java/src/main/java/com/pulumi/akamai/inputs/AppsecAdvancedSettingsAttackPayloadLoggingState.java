// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppsecAdvancedSettingsAttackPayloadLoggingState extends com.pulumi.resources.ResourceArgs {

    public static final AppsecAdvancedSettingsAttackPayloadLoggingState Empty = new AppsecAdvancedSettingsAttackPayloadLoggingState();

    /**
     * Whether to enable, disable, or update attack payload logging settings
     * 
     */
    @Import(name="attackPayloadLogging")
    private @Nullable Output<String> attackPayloadLogging;

    /**
     * @return Whether to enable, disable, or update attack payload logging settings
     * 
     */
    public Optional<Output<String>> attackPayloadLogging() {
        return Optional.ofNullable(this.attackPayloadLogging);
    }

    /**
     * Unique identifier of the security configuration
     * 
     */
    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    /**
     * Unique identifier of the security policy
     * 
     */
    @Import(name="securityPolicyId")
    private @Nullable Output<String> securityPolicyId;

    /**
     * @return Unique identifier of the security policy
     * 
     */
    public Optional<Output<String>> securityPolicyId() {
        return Optional.ofNullable(this.securityPolicyId);
    }

    private AppsecAdvancedSettingsAttackPayloadLoggingState() {}

    private AppsecAdvancedSettingsAttackPayloadLoggingState(AppsecAdvancedSettingsAttackPayloadLoggingState $) {
        this.attackPayloadLogging = $.attackPayloadLogging;
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppsecAdvancedSettingsAttackPayloadLoggingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppsecAdvancedSettingsAttackPayloadLoggingState $;

        public Builder() {
            $ = new AppsecAdvancedSettingsAttackPayloadLoggingState();
        }

        public Builder(AppsecAdvancedSettingsAttackPayloadLoggingState defaults) {
            $ = new AppsecAdvancedSettingsAttackPayloadLoggingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param attackPayloadLogging Whether to enable, disable, or update attack payload logging settings
         * 
         * @return builder
         * 
         */
        public Builder attackPayloadLogging(@Nullable Output<String> attackPayloadLogging) {
            $.attackPayloadLogging = attackPayloadLogging;
            return this;
        }

        /**
         * @param attackPayloadLogging Whether to enable, disable, or update attack payload logging settings
         * 
         * @return builder
         * 
         */
        public Builder attackPayloadLogging(String attackPayloadLogging) {
            return attackPayloadLogging(Output.of(attackPayloadLogging));
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param securityPolicyId Unique identifier of the security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(@Nullable Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * @param securityPolicyId Unique identifier of the security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public AppsecAdvancedSettingsAttackPayloadLoggingState build() {
            return $;
        }
    }

}