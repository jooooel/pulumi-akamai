// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudletsForwardRewriteMatchRuleMatchRuleMatchObjectMatchValue;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudletsForwardRewriteMatchRuleMatchRuleMatch extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudletsForwardRewriteMatchRuleMatchRuleMatch Empty = new GetCloudletsForwardRewriteMatchRuleMatchRuleMatch();

    @Import(name="caseSensitive")
    private @Nullable Boolean caseSensitive;

    public Optional<Boolean> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }

    @Import(name="checkIps")
    private @Nullable String checkIps;

    public Optional<String> checkIps() {
        return Optional.ofNullable(this.checkIps);
    }

    @Import(name="matchOperator")
    private @Nullable String matchOperator;

    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    @Import(name="matchType")
    private @Nullable String matchType;

    public Optional<String> matchType() {
        return Optional.ofNullable(this.matchType);
    }

    @Import(name="matchValue")
    private @Nullable String matchValue;

    public Optional<String> matchValue() {
        return Optional.ofNullable(this.matchValue);
    }

    @Import(name="negate")
    private @Nullable Boolean negate;

    public Optional<Boolean> negate() {
        return Optional.ofNullable(this.negate);
    }

    @Import(name="objectMatchValues")
    private @Nullable List<GetCloudletsForwardRewriteMatchRuleMatchRuleMatchObjectMatchValue> objectMatchValues;

    public Optional<List<GetCloudletsForwardRewriteMatchRuleMatchRuleMatchObjectMatchValue>> objectMatchValues() {
        return Optional.ofNullable(this.objectMatchValues);
    }

    private GetCloudletsForwardRewriteMatchRuleMatchRuleMatch() {}

    private GetCloudletsForwardRewriteMatchRuleMatchRuleMatch(GetCloudletsForwardRewriteMatchRuleMatchRuleMatch $) {
        this.caseSensitive = $.caseSensitive;
        this.checkIps = $.checkIps;
        this.matchOperator = $.matchOperator;
        this.matchType = $.matchType;
        this.matchValue = $.matchValue;
        this.negate = $.negate;
        this.objectMatchValues = $.objectMatchValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsForwardRewriteMatchRuleMatchRuleMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsForwardRewriteMatchRuleMatchRuleMatch $;

        public Builder() {
            $ = new GetCloudletsForwardRewriteMatchRuleMatchRuleMatch();
        }

        public Builder(GetCloudletsForwardRewriteMatchRuleMatchRuleMatch defaults) {
            $ = new GetCloudletsForwardRewriteMatchRuleMatchRuleMatch(Objects.requireNonNull(defaults));
        }

        public Builder caseSensitive(@Nullable Boolean caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        public Builder checkIps(@Nullable String checkIps) {
            $.checkIps = checkIps;
            return this;
        }

        public Builder matchOperator(@Nullable String matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        public Builder matchType(@Nullable String matchType) {
            $.matchType = matchType;
            return this;
        }

        public Builder matchValue(@Nullable String matchValue) {
            $.matchValue = matchValue;
            return this;
        }

        public Builder negate(@Nullable Boolean negate) {
            $.negate = negate;
            return this;
        }

        public Builder objectMatchValues(@Nullable List<GetCloudletsForwardRewriteMatchRuleMatchRuleMatchObjectMatchValue> objectMatchValues) {
            $.objectMatchValues = objectMatchValues;
            return this;
        }

        public Builder objectMatchValues(GetCloudletsForwardRewriteMatchRuleMatchRuleMatchObjectMatchValue... objectMatchValues) {
            return objectMatchValues(List.of(objectMatchValues));
        }

        public GetCloudletsForwardRewriteMatchRuleMatchRuleMatch build() {
            return $;
        }
    }

}
