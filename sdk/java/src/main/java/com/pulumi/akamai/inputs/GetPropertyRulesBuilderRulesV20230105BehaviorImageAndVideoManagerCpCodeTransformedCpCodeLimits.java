// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimits extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimits Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimits();

    @Import(name="currentCapacity")
    private @Nullable Integer currentCapacity;

    public Optional<Integer> currentCapacity() {
        return Optional.ofNullable(this.currentCapacity);
    }

    @Import(name="limit")
    private @Nullable Integer limit;

    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }

    @Import(name="limitType")
    private @Nullable String limitType;

    public Optional<String> limitType() {
        return Optional.ofNullable(this.limitType);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimits() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimits(GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimits $) {
        this.currentCapacity = $.currentCapacity;
        this.limit = $.limit;
        this.limitType = $.limitType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimits defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimits $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimits();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimits defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimits(Objects.requireNonNull(defaults));
        }

        public Builder currentCapacity(@Nullable Integer currentCapacity) {
            $.currentCapacity = currentCapacity;
            return this;
        }

        public Builder limit(@Nullable Integer limit) {
            $.limit = limit;
            return this;
        }

        public Builder limitType(@Nullable String limitType) {
            $.limitType = limitType;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimits build() {
            return $;
        }
    }

}
