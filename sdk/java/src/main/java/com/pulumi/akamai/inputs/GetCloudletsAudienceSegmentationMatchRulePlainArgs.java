// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudletsAudienceSegmentationMatchRuleMatchRule;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudletsAudienceSegmentationMatchRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudletsAudienceSegmentationMatchRulePlainArgs Empty = new GetCloudletsAudienceSegmentationMatchRulePlainArgs();

    /**
     * (Optional) A list of Cloudlet-specific match rules for a policy.
     * 
     */
    @Import(name="matchRules")
    private @Nullable List<GetCloudletsAudienceSegmentationMatchRuleMatchRule> matchRules;

    /**
     * @return (Optional) A list of Cloudlet-specific match rules for a policy.
     * 
     */
    public Optional<List<GetCloudletsAudienceSegmentationMatchRuleMatchRule>> matchRules() {
        return Optional.ofNullable(this.matchRules);
    }

    private GetCloudletsAudienceSegmentationMatchRulePlainArgs() {}

    private GetCloudletsAudienceSegmentationMatchRulePlainArgs(GetCloudletsAudienceSegmentationMatchRulePlainArgs $) {
        this.matchRules = $.matchRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsAudienceSegmentationMatchRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsAudienceSegmentationMatchRulePlainArgs $;

        public Builder() {
            $ = new GetCloudletsAudienceSegmentationMatchRulePlainArgs();
        }

        public Builder(GetCloudletsAudienceSegmentationMatchRulePlainArgs defaults) {
            $ = new GetCloudletsAudienceSegmentationMatchRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchRules (Optional) A list of Cloudlet-specific match rules for a policy.
         * 
         * @return builder
         * 
         */
        public Builder matchRules(@Nullable List<GetCloudletsAudienceSegmentationMatchRuleMatchRule> matchRules) {
            $.matchRules = matchRules;
            return this;
        }

        /**
         * @param matchRules (Optional) A list of Cloudlet-specific match rules for a policy.
         * 
         * @return builder
         * 
         */
        public Builder matchRules(GetCloudletsAudienceSegmentationMatchRuleMatchRule... matchRules) {
            return matchRules(List.of(matchRules));
        }

        public GetCloudletsAudienceSegmentationMatchRulePlainArgs build() {
            return $;
        }
    }

}