// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings Empty = new GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings();

    /**
     * (Required) The ID of the new origin requests are forwarded to. This type of origin is known as a Conditional Origin. See Property requirements for Cloudlets that forward requests to learn more.
     * 
     */
    @Import(name="originId", required=true)
    private String originId;

    /**
     * @return (Required) The ID of the new origin requests are forwarded to. This type of origin is known as a Conditional Origin. See Property requirements for Cloudlets that forward requests to learn more.
     * 
     */
    public String originId() {
        return this.originId;
    }

    /**
     * (Required)
     * 
     */
    @Import(name="percent", required=true)
    private Integer percent;

    /**
     * @return (Required)
     * 
     */
    public Integer percent() {
        return this.percent;
    }

    private GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings() {}

    private GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings(GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings $) {
        this.originId = $.originId;
        this.percent = $.percent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings $;

        public Builder() {
            $ = new GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings();
        }

        public Builder(GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings defaults) {
            $ = new GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings(Objects.requireNonNull(defaults));
        }

        /**
         * @param originId (Required) The ID of the new origin requests are forwarded to. This type of origin is known as a Conditional Origin. See Property requirements for Cloudlets that forward requests to learn more.
         * 
         * @return builder
         * 
         */
        public Builder originId(String originId) {
            $.originId = originId;
            return this;
        }

        /**
         * @param percent (Required)
         * 
         * @return builder
         * 
         */
        public Builder percent(Integer percent) {
            $.percent = percent;
            return this;
        }

        public GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings build() {
            $.originId = Objects.requireNonNull($.originId, "expected parameter 'originId' to be non-null");
            $.percent = Objects.requireNonNull($.percent, "expected parameter 'percent' to be non-null");
            return $;
        }
    }

}