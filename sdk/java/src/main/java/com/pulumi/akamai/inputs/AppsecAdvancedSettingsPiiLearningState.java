// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppsecAdvancedSettingsPiiLearningState extends com.pulumi.resources.ResourceArgs {

    public static final AppsecAdvancedSettingsPiiLearningState Empty = new AppsecAdvancedSettingsPiiLearningState();

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
     * Whether to enable the PII learning advanced setting
     * 
     */
    @Import(name="enablePiiLearning")
    private @Nullable Output<Boolean> enablePiiLearning;

    /**
     * @return Whether to enable the PII learning advanced setting
     * 
     */
    public Optional<Output<Boolean>> enablePiiLearning() {
        return Optional.ofNullable(this.enablePiiLearning);
    }

    private AppsecAdvancedSettingsPiiLearningState() {}

    private AppsecAdvancedSettingsPiiLearningState(AppsecAdvancedSettingsPiiLearningState $) {
        this.configId = $.configId;
        this.enablePiiLearning = $.enablePiiLearning;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppsecAdvancedSettingsPiiLearningState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppsecAdvancedSettingsPiiLearningState $;

        public Builder() {
            $ = new AppsecAdvancedSettingsPiiLearningState();
        }

        public Builder(AppsecAdvancedSettingsPiiLearningState defaults) {
            $ = new AppsecAdvancedSettingsPiiLearningState(Objects.requireNonNull(defaults));
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
         * @param enablePiiLearning Whether to enable the PII learning advanced setting
         * 
         * @return builder
         * 
         */
        public Builder enablePiiLearning(@Nullable Output<Boolean> enablePiiLearning) {
            $.enablePiiLearning = enablePiiLearning;
            return this;
        }

        /**
         * @param enablePiiLearning Whether to enable the PII learning advanced setting
         * 
         * @return builder
         * 
         */
        public Builder enablePiiLearning(Boolean enablePiiLearning) {
            return enablePiiLearning(Output.of(enablePiiLearning));
        }

        public AppsecAdvancedSettingsPiiLearningState build() {
            return $;
        }
    }

}