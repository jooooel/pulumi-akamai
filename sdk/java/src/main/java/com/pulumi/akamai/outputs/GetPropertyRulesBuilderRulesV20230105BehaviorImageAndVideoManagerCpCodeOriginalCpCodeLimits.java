// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeOriginalCpCodeLimits {
    private @Nullable Integer currentCapacity;
    private @Nullable Integer limit;
    private @Nullable String limitType;

    private GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeOriginalCpCodeLimits() {}
    public Optional<Integer> currentCapacity() {
        return Optional.ofNullable(this.currentCapacity);
    }
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }
    public Optional<String> limitType() {
        return Optional.ofNullable(this.limitType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeOriginalCpCodeLimits defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer currentCapacity;
        private @Nullable Integer limit;
        private @Nullable String limitType;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeOriginalCpCodeLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentCapacity = defaults.currentCapacity;
    	      this.limit = defaults.limit;
    	      this.limitType = defaults.limitType;
        }

        @CustomType.Setter
        public Builder currentCapacity(@Nullable Integer currentCapacity) {
            this.currentCapacity = currentCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable Integer limit) {
            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder limitType(@Nullable String limitType) {
            this.limitType = limitType;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeOriginalCpCodeLimits build() {
            final var o = new GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeOriginalCpCodeLimits();
            o.currentCapacity = currentCapacity;
            o.limit = limit;
            o.limitType = limitType;
            return o;
        }
    }
}