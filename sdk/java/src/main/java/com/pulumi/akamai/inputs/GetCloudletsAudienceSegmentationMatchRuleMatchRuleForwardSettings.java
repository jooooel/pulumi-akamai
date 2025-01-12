// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettings extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettings Empty = new GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettings();

    @Import(name="originId")
    private @Nullable String originId;

    public Optional<String> originId() {
        return Optional.ofNullable(this.originId);
    }

    @Import(name="pathAndQs")
    private @Nullable String pathAndQs;

    public Optional<String> pathAndQs() {
        return Optional.ofNullable(this.pathAndQs);
    }

    @Import(name="useIncomingQueryString")
    private @Nullable Boolean useIncomingQueryString;

    public Optional<Boolean> useIncomingQueryString() {
        return Optional.ofNullable(this.useIncomingQueryString);
    }

    private GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettings() {}

    private GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettings(GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettings $) {
        this.originId = $.originId;
        this.pathAndQs = $.pathAndQs;
        this.useIncomingQueryString = $.useIncomingQueryString;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettings $;

        public Builder() {
            $ = new GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettings();
        }

        public Builder(GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettings defaults) {
            $ = new GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettings(Objects.requireNonNull(defaults));
        }

        public Builder originId(@Nullable String originId) {
            $.originId = originId;
            return this;
        }

        public Builder pathAndQs(@Nullable String pathAndQs) {
            $.pathAndQs = pathAndQs;
            return this;
        }

        public Builder useIncomingQueryString(@Nullable Boolean useIncomingQueryString) {
            $.useIncomingQueryString = useIncomingQueryString;
            return this;
        }

        public GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettings build() {
            return $;
        }
    }

}
