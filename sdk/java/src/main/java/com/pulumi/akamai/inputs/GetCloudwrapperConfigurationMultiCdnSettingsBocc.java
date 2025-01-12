// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetCloudwrapperConfigurationMultiCdnSettingsBocc extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudwrapperConfigurationMultiCdnSettingsBocc Empty = new GetCloudwrapperConfigurationMultiCdnSettingsBocc();

    @Import(name="conditionalSamplingFrequency", required=true)
    private String conditionalSamplingFrequency;

    public String conditionalSamplingFrequency() {
        return this.conditionalSamplingFrequency;
    }

    @Import(name="enabled", required=true)
    private Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    @Import(name="forwardType", required=true)
    private String forwardType;

    public String forwardType() {
        return this.forwardType;
    }

    @Import(name="requestType", required=true)
    private String requestType;

    public String requestType() {
        return this.requestType;
    }

    @Import(name="samplingFrequency", required=true)
    private String samplingFrequency;

    public String samplingFrequency() {
        return this.samplingFrequency;
    }

    private GetCloudwrapperConfigurationMultiCdnSettingsBocc() {}

    private GetCloudwrapperConfigurationMultiCdnSettingsBocc(GetCloudwrapperConfigurationMultiCdnSettingsBocc $) {
        this.conditionalSamplingFrequency = $.conditionalSamplingFrequency;
        this.enabled = $.enabled;
        this.forwardType = $.forwardType;
        this.requestType = $.requestType;
        this.samplingFrequency = $.samplingFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperConfigurationMultiCdnSettingsBocc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperConfigurationMultiCdnSettingsBocc $;

        public Builder() {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsBocc();
        }

        public Builder(GetCloudwrapperConfigurationMultiCdnSettingsBocc defaults) {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsBocc(Objects.requireNonNull(defaults));
        }

        public Builder conditionalSamplingFrequency(String conditionalSamplingFrequency) {
            $.conditionalSamplingFrequency = conditionalSamplingFrequency;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder forwardType(String forwardType) {
            $.forwardType = forwardType;
            return this;
        }

        public Builder requestType(String requestType) {
            $.requestType = requestType;
            return this;
        }

        public Builder samplingFrequency(String samplingFrequency) {
            $.samplingFrequency = samplingFrequency;
            return this;
        }

        public GetCloudwrapperConfigurationMultiCdnSettingsBocc build() {
            $.conditionalSamplingFrequency = Objects.requireNonNull($.conditionalSamplingFrequency, "expected parameter 'conditionalSamplingFrequency' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.forwardType = Objects.requireNonNull($.forwardType, "expected parameter 'forwardType' to be non-null");
            $.requestType = Objects.requireNonNull($.requestType, "expected parameter 'requestType' to be non-null");
            $.samplingFrequency = Objects.requireNonNull($.samplingFrequency, "expected parameter 'samplingFrequency' to be non-null");
            return $;
        }
    }

}
